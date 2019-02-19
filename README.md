# Teachie Awards
> Virtual awards for teachers.

[![CircleCI](https://circleci.com/gh/jonnylynchy/teachie-awards.svg?style=svg)](https://circleci.com/gh/jonnylynchy/teachie-awards)

This project is a website that gives teachers recognition in the form of a virtual award, the "Teachie". In the future users will be able to donate or solicit donations in the form of a gift card, or some form of small compensation in electronic format. 
Users could discreetly nominate a teacher and solicit others for votes. If the teacher acquires a certain number of votes, they will be selected to receive a “Teachie”. The award would be some simple artwork of an award or trophy with the teacher's name and a relevant category. It would be deliverable via email, Twitter, and Facebook.

## Installation

OS X & Linux:

```sh
mvn clean install
```

Windows:

```sh
mvn clean install
```

## Development setup

This project requires Java 8 and Maven as well as NPM and Node for the front-end.

To run both Spring Boot project and development server (webpack development server):
```sh
mvn spring-boot:run
```

## Release History

* 0.0.1
    * CHANGE: Create intitial repo
    * CHANGE: Add automated deployment with CircleCI

## Meta

Jon Lynch – [@jonlynch](https://twitter.com/jonlynch)

[https://github.com/jonnylynchy/](https://github.com/jonnylynchy/)

## Contributing

1. Fork it (<https://github.com/jonnylynchy/teachie-awards/fork>)
2. Create your feature branch (`git checkout -b feature/fooBar`)
3. Commit your changes (`git commit -am 'Add some fooBar'`)
4. Push to the branch (`git push origin feature/fooBar`)
5. Create a new Pull Request
