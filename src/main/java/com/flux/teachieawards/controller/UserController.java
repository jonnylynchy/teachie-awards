package com.flux.teachieawards.controller;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.flux.teachieawards.exception.ResourceNotFoundException;
import com.flux.teachieawards.model.*;
import com.flux.teachieawards.payload.*;
import com.flux.teachieawards.repository.EventEducatorVoteRepository;
import com.flux.teachieawards.repository.EventRepository;
import com.flux.teachieawards.repository.RoleRepository;
import com.flux.teachieawards.repository.UserRepository;
import com.flux.teachieawards.security.UserPrincipal;
import com.flux.teachieawards.security.CurrentUser;
import com.flux.teachieawards.util.AppConstants;
import net.bytebuddy.asm.Advice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private EventEducatorVoteRepository voteRepository;

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public UserSummary getCurrentUser(@CurrentUser UserPrincipal currentUser) {
        UserSummary userSummary = new UserSummary(currentUser.getId(), currentUser.getUsername(),
                currentUser.getFirstName(), currentUser.getLastName());
        return userSummary;
    }

    @GetMapping("/user/checkUsernameAvailability")
    public UserIdentityAvailability checkUsernameAvailability(@RequestParam(value = "username") String username) {
        Boolean isAvailable = !userRepository.existsByUsername(username);
        return new UserIdentityAvailability(isAvailable);
    }

    @GetMapping("/user/checkEmailAvailability")
    public UserIdentityAvailability checkEmailAvailability(@RequestParam(value = "email") String email) {
        Boolean isAvailable = !userRepository.existsByEmail(email);
        return new UserIdentityAvailability(isAvailable);
    }

    @GetMapping("/users/{username}")
    public UserProfile getUserProfile(@PathVariable(value = "username") String username) {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new ResourceNotFoundException("User", "username", username));

        // long pollCount = pollRepository.countByCreatedBy(user.getId());
        // long voteCount = voteRepository.countByUserId(user.getId());

        UserProfile userProfile = new UserProfile(user.getId(), user.getUsername(), user.getFirstName(),
                user.getLastName(), user.getCreatedAt());

        return userProfile;
    }

    @GetMapping("/user/educators")
    public List<EducatorSummary> getEducators() {
        Optional<Role> educatorRole = roleRepository.findByName(RoleName.ROLE_EDUCATOR);

        List<User> users =  userRepository.findByRolesContains(educatorRole);
        List<EducatorSummary> educatorSummaries = new ArrayList<>();

        users.forEach(user -> educatorSummaries.add(new EducatorSummary(user.getId(), user.getUsername(),
                user.getFirstName(), user.getLastName(), voteRepository.findEventEducatorVotesByEducator(user))
        ));

        return educatorSummaries;
    }

    @GetMapping("/user/educator/vote")
    public EventEducatorVote addEducatorVote(@RequestParam("eventId") int eventId, @RequestParam("userId") int userId, @RequestParam("educatorId") int educatorId) {
        System.out.printf("Event: {%d}, User: {%d}, Educator: {%d}", eventId, userId, educatorId);
        Event event = eventRepository.findByEventId(eventId);
        User user = userRepository.findByUserId(userId);
        User educator = userRepository.findByUserId(educatorId);

        EventEducatorVote vote = new EventEducatorVote(event, user, educator);

        // Save vote and return
        return voteRepository.save(vote);
    }

    @GetMapping("/user/votesByUser/{userId}")
    public List<EventEducatorVote> getUserVotes(@PathVariable(value = "userId") int userId) {
        User user = userRepository.findByUserId(userId);
        return voteRepository.findEventEducatorVotesByUser(user);
    }

    @GetMapping("/user/votesByEducator/{educatorId}")
    public List<EventEducatorVote> getEducatorVotes(@PathVariable(value = "educatorId") int educatorId) {
        User user = userRepository.findByUserId(educatorId);
        return voteRepository.findEventEducatorVotesByEducator(user);
    }

}