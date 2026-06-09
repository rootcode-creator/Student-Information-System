<p align="center">
	<a href="https://www.flaticon.com/free-icon/systems_11443881?term=information+system&page=1&position=9&origin=tag&related_id=11443881" title="Systems icon (attribution)">
		<img src="systems.png" alt="Systems icon" width="96" />
	</a>
</p>

<h1 align="center">Student Information System</h1>

<p align="center"><i>Desktop-based Java application for managing students, courses, and academic records.</i></p>

<p align="center">
	<img src="https://img.shields.io/badge/VERSION-1.0.0-E11D48?style=for-the-badge&logo=semanticrelease&logoColor=white&labelColor=7F1D1D" alt="Version 1.0.0" />
	<img src="https://img.shields.io/badge/LICENSE-MIT-84CC16?style=for-the-badge&logo=opensourceinitiative&logoColor=white&labelColor=14532D" alt="MIT License" />
	<img src="https://img.shields.io/badge/TYPE-DESKTOP%20APP-8B5CF6?style=for-the-badge&labelColor=4C1D95" alt="Desktop app" />
</p>

<p align="center">
	<img src="https://img.shields.io/badge/JAVA-8%2B-14B8A6?style=for-the-badge&logo=openjdk&logoColor=white&labelColor=0F766E" alt="Java 8+" />
	<img src="https://img.shields.io/badge/SWING-UI-06B6D4?style=for-the-badge&logo=java&logoColor=white&labelColor=155E75" alt="Swing UI" />
	<img src="https://img.shields.io/badge/NETBEANS-IDE-3B82F6?style=for-the-badge&logo=apachenetbeanside&logoColor=white&labelColor=1E3A8A" alt="NetBeans" />
	<img src="https://img.shields.io/badge/MYSQL-DATABASE-0EA5E9?style=for-the-badge&logo=mysql&logoColor=white&labelColor=1E40AF" alt="MySQL" />
</p>

<p align="center">
	<a href="#-project-intro"><img src="https://img.shields.io/badge/EXPLORE-PROJECT%20INTRO-6366F1?style=for-the-badge&logo=gitbook&logoColor=white&labelColor=4F46E5" alt="Project intro" /></a>
	<a href="#-project-structure"><img src="https://img.shields.io/badge/VIEW-PROJECT%20STRUCTURE-14B8A6?style=for-the-badge&logo=files&logoColor=white&labelColor=0F766E" alt="Project structure" /></a>
	<a href="#-run-the-project"><img src="https://img.shields.io/badge/RUN-SETUP%20GUIDE-A855F7?style=for-the-badge&logo=readme&logoColor=white&labelColor=7E22CE" alt="Setup guide" /></a>
</p>

## Student Information System — README

Student Information System is a Java Swing desktop application focused on academic record management, including student registration, course management, and result tracking.

## Table of Contents

- [🚀 Project intro](#-project-intro)
- [🔧 Features](#-features)
- [📁 Project structure](#-project-structure)
- [🧰 Tech stack](#-tech-stack)
- [⚙️ Prerequisites](#️-prerequisites)
- [▶️ Run the project](#️-run-the-project)
- [📄 License](#-license)

## 🚀 Project intro

This project helps institutions and administrators to:

- Add student records
- Manage and update student records
- Add and manage courses
- View and maintain student result information

The application uses Java Swing forms and a database connection layer through `MyConnection.java`.

## 🔧 Features

- Login screen for system access
- Add new student records
- Manage existing student records
- Add courses and manage course lists
- Basic dashboard and count utilities
- About and navigation forms for desktop workflow

### Core features

| Feature | Status | Notes |
| --- | --- | --- |
| Credentials auth (login) | ✅ Current | Email/password login with basic session handling |
| Add student records | ✅ Current | Form-based entry with validation |
| Manage student records | ✅ Current | Edit, delete, and search existing records |
| Add courses | ✅ Current | Create course entries and metadata |
| Manage courses | ✅ Current | Edit/delete course lists |
| Database connection | ✅ Current | MySQL via `MyConnection.java` |
| Counts & dashboard | ✅ Current | `Count.java` utilities for quick stats |
| About & help screens | ✅ Current | `About.java` and navigation forms |

### Flow diagram

The flow below shows the main desktop application journey from launch through authentication and record management.

```mermaid
flowchart TD
	A[User] --> B[Launch application]
	B --> C{Authenticated?}
	C -- No --> D[Login form]
	C -- No --> E[Register / Add Admin]
	D --> F[Session established]
	F --> G[Main Dashboard]
	G --> H[Add Student Record]
	G --> I[Manage Student Records]
	G --> J[Add Course]
	G --> K[Manage Courses]
	I --> L[View / Edit / Delete Record]
	K --> M[View / Edit / Delete Course]
	G --> N[About / Help]
	G --> O[Exit]
```

## 📁 Project structure

```txt
Student-Information-System/
├── build.xml
├── manifest.mf
├── README.md
├── nbproject/
└── src/
	├── About.java
	├── AddCourse.java
	├── AddStudentRecord.java
	├── Count.java
	├── LoginForm.java
	├── MainForm.java
	├── ManageCourse.java
	├── ManageStudentRecord.java
	├── MyConnection.java
	├── Student.java
	└── Image/
```

## 🧰 Tech stack

- **Language:** Java
- **UI:** Java Swing
- **Build Tool:** Apache Ant (`build.xml`)
- **Project Format:** NetBeans project (`nbproject`)
- **Database:** MySQL (via `MyConnection.java`)

## ⚙️ Prerequisites

- JDK 8 or newer
- NetBeans IDE (recommended)
- MySQL Server
- Proper database configuration in `src/MyConnection.java`

## ▶️ Run the project

### Option 1: NetBeans (recommended)

1. Open NetBeans.
2. Import/open the `Student-Information-System` project folder.
3. Configure the database connection values in `src/MyConnection.java`.
4. Build and run the project from the IDE.

### Option 2: Command line (Ant)

```bash
ant clean
ant
```

Then run the generated application from your build output using your Java runtime.

## 📄 License

This project is licensed under the MIT License.
See `LICENSE` for details.
