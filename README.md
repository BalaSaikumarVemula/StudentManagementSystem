

# 🎓 Student Management System (Java)

A simple **Java console application** to manage student records with full **CRUD operations** — Create, Read, Update, and Delete.  
It demonstrates **Object-Oriented Programming (OOP)** concepts, **File Handling**, and **Exception Handling** in a clean and structured way.

---

## 🚀 Features

✅ Add new student records  
✅ View all existing student records  
✅ Update existing student information  
✅ Delete a student record  
✅ Prevent duplicate student IDs  
✅ Data persistence using text file (`students.txt`)  
✅ Input validation and error handling  
✅ Encapsulation and abstraction applied using OOP  

---

## 🧠 Tech Stack

- **Language:** Java  
- **Concepts:** OOP (Encapsulation, Abstraction, Inheritance)  
- **Core Topics:** File Handling, Exception Handling  
- **IDE (Optional):** IntelliJ IDEA / VS Code / Eclipse  

---

## 📂 Project Structure

```

StudentManagementSystem/
├── Person.java
├── Student.java
├── StudentManager.java
├── Main.java
├── students.txt           
└── README.md

````

---

## ⚙️ How to Run the Project

### 🧩 Step 1: Clone this repository
```bash
git clone https://github.com/BalaSaikumarVemula/StudentManagementSystem.git
cd StudentManagementSystem
````

### 🧩 Step 2: Compile the project

```bash
javac *.java
```

### 🧩 Step 3: Run the application

```bash
java Main
```

---

## 🖥️ Sample Output

```
===== Student Management System =====
1. Add Student
2. View All Students
3. Update Student
4. Delete Student
5. Exit
Enter choice: 1
Enter ID: 101
Enter Name: Sai
Enter Age: 21
Enter Course: Java
Student added successfully!

===== Student Management System =====
1. Add Student
2. View All Students
3. Update Student
4. Delete Student
5. Exit
Enter choice: 2
ID: 101 | Name: Sai | Age: 21 | Course: Java
```

---

## 🧰 Concepts Implemented

### 🔹 Encapsulation

All class fields are declared **private** and accessed via **getters/setters**.

### 🔹 Abstraction

An abstract class `Person` defines common attributes, and `Student` extends it.

### 🔹 File Handling

All student data is saved to and loaded from `students.txt` using buffered streams.

### 🔹 Exception Handling

Handled I/O exceptions and invalid input gracefully to prevent crashes.

---

## 💡 Future Enhancements

🚀 Add search functionality by name or course  
🚀 Support for sorting students by ID or Name  
🚀 Replace text file with database (MySQL / SQLite)  
🚀 Create a GUI using JavaFX or Swing

---

## 👨‍💻 Author

**Bala Sai Kumar Vemula**
🌐 [LinkedIn](https://www.linkedin.com/in/bala-sai-kumar-vemula-821a49264/) 

---

## 📝 License

This project is open-source and available under the [MIT License](LICENSE).


