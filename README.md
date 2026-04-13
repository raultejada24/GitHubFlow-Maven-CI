# CI/CD & DevOps Portfolio: Java + Maven + GitHub Flow

Welcome to my professional DevOps sandbox! This repository is a comprehensive showcase of modern software engineering practices, moving away from slow legacy workflows into a high-velocity **Integración Continua (CI)** environment.

## 🚀 Project Overview
This project implements a Math Suite (Calculator) using **Java 17** and **Apache Maven**. The core focus is not just the code, but the **Automated Lifecycle** that ensures quality at every step.

## 🛠 Technology Stack
- **Build Tool:** Apache Maven (Dependency management & lifecycle automation).
- **CI/CD:** GitHub Actions (Automated testing on every Push/PR).
- **Version Control:** Git using **GitHub Flow** (Trunk-based development).
- **Testing:** JUnit for automated unit testing.

## 🧬 Development Methodology: GitHub Flow
I have strictly followed the **GitHub Flow** pattern to maintain a stable `main` branch:
1. **Feature Branches:** Every new logic (Division, Power, etc.) started in a short-lived branch.
2. **Continuous Integration:** I integrated work multiple times a day, ensuring rapid feedback[cite: 845, 858].
3. **Pull Requests:** Every change was reviewed and validated by the CI pipeline before merging.
4. **Small Batches:** Delivering value in small, frequent chunks to minimize integration errors[cite: 799].

## 📈 Project Evolution (Milestones)
This repository reflects a real-world development timeline:

### Phase 1: Foundation & Initial Release (v1.0.0)
- **Initial Setup:** Standard Maven project structure (`mvn archetype:generate`).
- **Core Features:** Basic calculator logic and repository hygiene (`.gitignore`).
- **Emergency Hotfix:** Identified and resolved a production crash related to negative numbers.

### Phase 2: Automation & Expansion
- **CI Pipeline:** Configured `.github/workflows/maven.yml` to trigger automated builds.
- **Advanced Math:** Added Subtraction, Multiplication, and Division with error handling.
- **Project Governance:** Established a `CHANGELOG.md` and a `SECURITY.md` policy.

### Phase 3: Optimization & v1.2.0 Release
- **Refactoring:** Improved internal documentation and code style for better maintainability.
- **Deployment Ready:** Generated distribution-ready artifacts using `mvn package`.

## ⚙️ Maven Lifecycle Commands
As per professional standards, the following commands are used to manage the project:
- ``mvn clean validate``: Clean previous builds and verify project integrity.
- ``mvn compile``: Compile source code.
- ``mvn test``: Execute the automated unit test suite (Current: **6 Tests Passing**).
- ``mvn package``: Generate the deployable `.jar` file in the `target/` directory.

---
**Verified by Automated CI Pipeline** | Developed by [Raúl Tejada]