# Employee Management System (Java)

## 📌 Project Overview

The **Employee Management System** is a console-based Java application designed to manage employee records efficiently using **Collections** and **File Handling** concepts. This project demonstrates practical usage of **ArrayList**, **HashMap**, **Serialization**, and **Exception Handling**, making it suitable for **intermediate-level Java learners**, academic submissions, and interview preparation.

The system allows users to **add, view, update, delete, search, and analyze employee data**, with persistent storage using file serialization.

---

## 🎯 Objectives

* Understand and apply Java Collections (`ArrayList`, `HashMap`)
* Implement file persistence using **Object Serialization**
* Practice CRUD (Create, Read, Update, Delete) operations
* Apply exception handling in real-world scenarios
* Build a modular and maintainable Java application

---

## 🛠️ Technologies Used

* **Programming Language:** Java (JDK 8 or above)
* **Concepts:** OOP, Collections Framework, File Handling, Serialization
* **Tools:** Eclipse / STS / IntelliJ / Command Line

---

## 📂 Project Structure

```
EmployeeManagementSystem/
│
├── Employee.java                  // Employee model (Serializable)
├── EmployeeManagementSystem.java  // Main class (Menu-driven)
├── EmployeeFileHandler.java       // File save/load operations
├── EmployeeReportGenerator.java   // Reports & analytics
├── employees.ser                  // Serialized data file (auto-generated)
└── README.md
```

> ⚠️ Note: All classes are kept in the **default package** as per project requirement.

---

## ⚙️ Features

* Add new employee
* View all employees
* Update employee salary
* Delete employee record
* Salary report (total, average, highest, lowest)
* Department-wise employee summary
* File persistence using serialization
* Input validation and exception handling

---

## ▶️ How to Run the Project

### Option 1: Using IDE (Eclipse / STS / IntelliJ)

1. Create a **Java Project**
2. Copy all `.java` files into the `src` folder
3. Ensure all files are in the **default package**
4. Run `EmployeeManagementSystem.java`

### Option 2: Using Command Line

```bash
javac *.java
java EmployeeManagementSystem
```

---

## 💾 Data Storage

* Employee data is stored in a file named **`employees.ser`**
* File is created automatically on first save
* Uses **ObjectOutputStream** and **ObjectInputStream**

---

## 🧪 Sample Operations

* Add employee with ID, name, department, position, salary
* View all employee details in formatted output
* Generate salary and department reports
* Persist data between program runs

---

## 🧠 Key Concepts Demonstrated

* Object-Oriented Programming (Encapsulation, Abstraction)
* Java Collections (`ArrayList`, `HashMap`)
* File Handling with Serialization
* Exception Handling (`try-catch`)
* Modular code design

---

## ✅ Suitable For

* College mini-project / practical submission
* Java OOP & File Handling assignments
* CDAC / campus placement preparation
* Java developer interview discussion

---

## 👩‍💻 Author

**Sayali Shelke**

---

## ⭐ Future Enhancements

* Search by name or department
* Sorting employees by salary or join date
* CSV-based file storage
* GUI using JavaFX or Swing

---

