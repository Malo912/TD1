# Library Management System in Kotlin

This project is a command-line application built using the **Kotlin** programming language. It allows users to manage a library through an interactive terminal menu. The system provides various features such as adding books, searching for books, borrowing books, and returning books. All functionalities are executed directly in the terminal without a graphical user interface (GUI).

## Features

- **Add Books**: Users can add new books to the library by providing necessary details.
- **Search Books**: Allows users to search for books by title, author, or genre.
- **Borrow Books**: Users can borrow available books from the library.
- **Return Books**: Provides functionality to return borrowed books and update the inventory.
- **Interactive Menu**: Users interact with the application through a simple text-based menu in the terminal.

## How to Run

1. **Clone the Repository**:
   ```bash
   git clone git clone https://github.com/Malo912/TD1.git

2. **Navigate to the Project Folder:**:
    ```bash
    cd TD1
3.**Build and Run the Application**:
If you have IntelliJ IDEA, open the project and run it.
  -Alternatively, use the Kotlin command line tools to compile and run the project.
  -For compiling and running via terminal:
  ```bash
  kotlinc main.kt -include-runtime -d LibraryManagement.jar
  java -jar LibraryManagement.jar
