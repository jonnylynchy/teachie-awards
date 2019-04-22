package com.flux.teachieawards.repository;

import com.flux.teachieawards.model.Role;
import com.flux.teachieawards.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

/**
 * Users
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    default
    User findByUserId(int id) {
        return findById(id).get();
    }

    Optional<User> findByEmail(String email);

    Optional<User> findByUsernameOrEmail(String username, String email);

    List<User> findByIdIn(List<Integer> userIds);

    List<User> findByRolesContains(Optional<Role> role);

    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
