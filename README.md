# Bank Account CI/CD Project

## Overview

This project demonstrates the implementation of a complete CI/CD pipeline using GitHub Actions for a simple Java-based Bank Account application.

The project was created for educational purposes to understand:

* Java application development
* JUnit testing
* Maven build lifecycle
* Git and GitHub workflows
* Continuous Integration (CI)
* Continuous Deployment (CD)
* Artifact management
* Email notifications using GitHub Actions

---

## Project Structure

```text
bank-account-project
│
├── .github
│   └── workflows
│       └── ci.yml
│
├── src
│   ├── main
│   │   └── java
│   │       └── BankAccount.java
│   │
│   └── test
│       └── java
│           └── BankAccountTest.java
│
├── pom.xml
├── .gitignore
└── README.md
```

---

## Application Features

The BankAccount application supports:

* Account creation with initial balance
* Deposit money
* Withdraw money
* Balance inquiry
* Validation for invalid transactions
* Insufficient funds handling

---

## Unit Testing

JUnit 5 is used for automated testing.

### Implemented Test Cases

1. Verify initial account balance
2. Verify deposit operation
3. Verify withdrawal operation
4. Verify insufficient funds exception
5. Verify negative deposit validation
6. Verify negative withdrawal validation
7. Verify withdrawal of full balance
8. Verify multiple transaction operations

---

## Technologies Used

| Technology     | Purpose                 |
| -------------- | ----------------------- |
| Java 21        | Application Development |
| Maven          | Build Management        |
| JUnit 5        | Unit Testing            |
| Git            | Version Control         |
| GitHub         | Source Code Repository  |
| GitHub Actions | CI/CD Automation        |

---

## CI/CD Pipeline

### Continuous Integration (CI)

The CI process is automatically triggered whenever code is pushed to the main branch.

CI stages:

1. Checkout source code
2. Setup Java environment
3. Build project using Maven
4. Execute JUnit test cases
5. Generate JAR artifact
6. Upload artifact

### Continuous Deployment (CD)

After successful CI execution:

1. Wait for configured deployment delay
2. Execute deployment stage
3. Send deployment notification email

---

## Artifact Management

The build artifact is generated using:

```bash
mvn package
```

Generated artifact:

```text
target/bank-account-project-1.0.jar
```

The artifact is uploaded and stored by GitHub Actions.

---

## Email Notifications

The pipeline sends automated email notifications for:

### Success Notification

Sent when:

* Build succeeds
* Tests pass
* Deployment completes successfully

### Failure Notification

Sent when:

* Build fails
* Tests fail
* Pipeline execution fails

GitHub Secrets are used for secure email credentials management.

Configured secrets:

* EMAIL_USERNAME
* EMAIL_PASSWORD
* EMAIL_TO

---

## Workflow Overview

```text
Developer Push
      ↓
GitHub Actions Triggered
      ↓
Build Project
      ↓
Run JUnit Tests
      ↓
Create Artifact
      ↓
Upload Artifact
      ↓
Wait Before Deployment
      ↓
Deploy Application
      ↓
Send Success / Failure Email
```

---

## Learning Outcomes

Through this project, the following concepts were learned:

* Maven project structure
* Unit testing using JUnit
* Build automation
* Git and GitHub workflows
* Continuous Integration
* Continuous Deployment
* Artifact management
* GitHub Actions workflow development
* Secrets management
* Email notifications in CI/CD pipelines

---

## Author

Educational DevOps CI/CD Project created to understand software delivery automation using GitHub Actions.
