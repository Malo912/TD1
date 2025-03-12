package com.example.td1

class Library (var bookList: MutableList<Book>){

    fun addBook(title: String){

        for (book in bookList){
            if (book.title==title){
                bookList.add(book)
                println("The book $book has been haded")
            }
        }


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

        println("What is the title of the book ?")
        val title = readLine()
        println("Who is the Author of the book ?")
        val author = readLine()

        for (book in bookList){
            if (book.title == title && book.author==author){
                addBook()
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