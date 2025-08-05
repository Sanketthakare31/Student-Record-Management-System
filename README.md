# Student-Record-Management-System

# StudentManagement (Java Console CRUD)

A simple console-based Java application to manage student records in memory using `ArrayList<Student>` and Scanner for user interaction.

---

## 🚀 Project Overview

Provides basic **CRUD** operations:
- **Add Student**: create new student entries with ID, name, and marks.
- **Read/View**: list all existing student records.
- **Update**: modify the name or marks of a student by ID.
- **Delete**: remove a student by ID.

All data is held in-memory (no database), implemented via:
- A `Student` class holding `id`, `name`, and `marks`.
- `StudentManagement` class that handles menu-driven CLI with `ArrayList<Student>`.

---

## 🧩 Features

- Adds new students with unique numeric IDs.
- View all student entries.
- Update student (change name and/or marks) by entering ID.
- Delete student by ID.
- Input validation for numeric and blank inputs.
- Duplicate‑ID prevention before adding (optional logic).
- Graceful exit and resource cleanup (`in.close()`).

---

## 🛠️ Prerequisites

Make sure you have:

- Java Development Kit (JDK) 8 or above installed.
- A CLI environment or IDE (e.g. IntelliJ IDEA, Eclipse, VS Code).

---

--- Student Management Menu ---
1. Add Student
2. View All Students
3. Update Student
4. Delete Student
5. Exit
Enter ID: 101
Enter Name: Alice
Enter Marks: 89.5
Student added successfully.

List of students:
ID: 101, Name: Alice, Marks: 89.5

Enter ID to update: 101
Enter new name (leave blank to keep "Alice"):
Enter new marks (leave blank to keep 89.5):
Student updated.

Enter ID to delete: 101
Student removed.

