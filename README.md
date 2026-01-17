# 📚 Digital Library Management System

### Java Console Application

A menu-driven Digital Library Management System developed using Java as part of the **Oasis Infobyte Java Development Internship (OIBSIP) – Task 5**.

---

## 📌 Project Overview

The **Digital Library Management System** is a console-based Java application designed to automate basic library operations such as managing books, issuing books, and maintaining records using file-based storage.

This project follows a clean MVC architecture and demonstrates real-world backend development concepts using Java.

---

## 🎯 Objective

The main objective of this project is to build a simple yet effective digital library system that allows:

- Admins to manage books
- Users to view and issue books
- Persistent storage using file handling
- Clean and modular code structure

---

## ✨ Features

### Admin Panel
- Add new books
- View all books
- Prevent duplicate book IDs

### User Panel
- View available books
- Issue books

### System Features
- File-based data storage
- Menu-driven console UI
- MVC architecture
- Persistent data handling

---

## 🛠 Technologies Used

- Java 17
- File Handling (TXT)
- Object-Oriented Programming (OOP)
- MVC Architecture
- Console UI

---

## 📁 Project Structure

DigitalLibraryManagement/
│
├── src/
│ ├── App.java
│ ├── controller/
│ │ └── LibraryController.java
│ ├── model/
│ │ └── Book.java
│ ├── service/
│ │ └── LibraryService.java
│ ├── util/
│ │ └── FileUtil.java
│
├── data/
│ └── books.txt
│
├── bin/
└── README.md

---

## ▶ How to Run the Project

### Step 1 — Open Terminal in Project Folder
Make sure you are inside:
DigitalLibraryManagement

### Step 2 — Compile the Project
javac -d bin src\App.java src\controller\LibraryController.java src\service\LibraryService.java src\model\Book.java src\util\FileUtil.java

### Step 3 — Run the Project
java -cp bin App

---

## 🔐 Default Login / Details

This project does not use authentication.
Users can directly access Admin and User panels via the menu.

---

## 📚 Learning Outcomes

- Java Object-Oriented Programming
- MVC Design Pattern
- File Handling and Persistent Storage
- Menu-driven application development
- Real-world backend project structure
- Classpath and package management

---

## 🚀 Future Enhancements

- Admin authentication system
- Return book feature
- Search books by title or author
- Fine calculation system
- Database integration (MySQL)
- GUI using JavaFX or Swing

---

## 👩‍💻 Author

**Delfie Deril**  
Aspiring Java Developer  

🔗 **LinkedIn:**  
https://www.linkedin.com/in/delfie-deril-752b36357  


---

## 📂 Project Type

Java Console-Based Application  
Oasis Infobyte Internship Project (OIBSIP – Task 5)

---

⭐ If you like this project, feel free to give it a star and connect with me on LinkedIn!
