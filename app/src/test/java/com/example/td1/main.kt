package com.example.td1

class main {

    fun main(){

        val book1 = Book("1984", "George Orwell", 1, true)
        val book2 = Book("Germinal", "Emile Zola", 2, true )
        val book3 = Book("Le petit prince", "Antoine de saint exupery", 3, true)

        // Créer une liste mutable de books
        val bookList = mutableListOf(book1, book2)

        val library = Library(bookList)

        println("1. Add a book")
        println("2. Delete a book")
        println("3. Search a book by title")
        println("4. Search a book by author")
        println("5. Borrow a book")
        println("6. Return a book")
        println("7. Display the list of books")
        println("8. Exit the programm")
        println("Choose the option :")

        val choice = readLine()?.toIntOrNull()

        if (choice != null) {
            when (choice) {
                1 -> {

                    println("What is the title of the book ?")
                    val title = readLine()
                    library.addBook(title)
                }
                2 -> {
                    library.removeBook()
                }
                3 -> {
                    println("What is the title of the book?")
                    val title = readLine() ?: "" // Si l'utilisateur n'entre rien, "title" sera une chaîne vide
                    library.searchBookByTitle(title)

                }
                4 -> {
                    print("What author do you want ? ")
                    val author = readLine() ?:""
                    library.searchBookByAuthor(author)
                }
                5 -> {
                    library.borrowBook()
                }
                6 ->{
                    library.returnBook()
                }

            }


        }


    }


}