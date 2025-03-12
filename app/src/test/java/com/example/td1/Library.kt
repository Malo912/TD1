package com.example.td1

class Library (var bookList: MutableList<Book>){

    fun addBook(title: String, author: String, id: Int, available: Boolean) {
        // Vérifier si le livre existe déjà
        for (book in bookList) {
            if (book.title == title) {
                println("The book '$title' already exists in the library.")
                return
            }
        }

        // Créer et ajouter le nouveau livre
        val newBook = Book(title, author, id, available)
        bookList.add(newBook)
        println("The book '$title' by $author has been added to the library.")
    }


    fun removeBook(){

        println("What is the title of the book ?")
        val title = readLine()
        println("Who is the Author of the book ?")
        val author = readLine()

        for (book in bookList){
            if (book.title == title && book.author==author){
                bookList.remove(book)
                println("The book $book has been removed")

            }
        }
    }

    fun searchBookByTitle(title: String):Book?{

        for (book in bookList){
            if (book.title == title){
                return book
            }
        }
        return null
    }

    fun searchBookByAuthor(author : String):Book?{

        for (book in bookList){
            if (book.author==author){
                return book
            }
        }
        return null
    }

    fun borrowBook(){

        println("What is the title of the book ?")
        val title = readLine()
        println("Who is the Author of the book ?")
        val author = readLine()


        for (book in bookList){
            if (book.title == title && book.author==author){
                println("the book $title has been borrowed")
                if (!book.available){

                    book.available= true
                }
            }
        }
    }

    fun returnBook(){


        println("What is the title of the book?")
        val title = readLine() ?: ""
        println("Who is the author of the book?")
        val author = readLine() ?: ""
        val id = bookList.size + 1  // Générer un nouvel ID automatiquement
        val available = true  // Livre disponible par défaut


        for (book in bookList){
            if (book.title == title && book.author==author){
                addBook(title, author, id, available)
                println("the book $title has been returned")
            }
        }
    }

    fun displayBooks(){
        for (book in bookList){
            println("Title : ${book.title}")
            println("Author : ${book.author}")
        }
    }


}