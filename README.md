# CI/CD & DevOps Portfolio: Java + Maven + GitHub Flow

Welcome to my professional DevOps sandbox! This repository is a comprehensive showcase of modern software engineering practices, moving away from slow legacy workflows into a high-velocity **Integración Continua (CI)** environment.

## Project Overview
This project implements a Math Suite (Calculator) using **Java 17** and **Apache Maven**. The core focus is not just the code, but the **Automated Lifecycle** that ensures quality at every step.

## Technology Stack
- **Build Tool:** Apache Maven (Dependency management & lifecycle automation).
- **CI/CD:** GitHub Actions (Automated testing on every Push/PR).
- **Version Control:** Git using **GitHub Flow** (Trunk-based development).
- **Testing:** JUnit for automated unit testing.

## Development Methodology: GitHub Flow
I have strictly followed the **GitHub Flow** pattern to maintain a stable `main` branch:
1. **Feature Branches:** Every new logic (Division, Power, etc.) started in a short-lived branch.
2. **Continuous Integration:** I integrated work multiple times a day, ensuring rapid feedback.
3. **Pull Requests:** Every change was reviewed and validated by the CI pipeline before merging.
4. **Small Batches:** Delivering value in small, frequent chunks to minimize integration errors.

## Maven Lifecycle Commands
As per professional standards, the following commands are used to manage the project:
- ``mvn clean validate``: Clean previous builds and verify project integrity.
- ``mvn compile``: Compile source code.
- ``mvn test``: Execute the automated unit test suite (Current: **6 Tests Passing**).
- ``mvn package``: Generate the deployable `.jar` file in the `target/` directory.
