package com.example.books;

import java.util.ArrayList;

public class Util {
    private static ArrayList<Books> currently_book;
    private static ArrayList<Books> want_to_books;
    private static ArrayList<Books> all_books;
    private static ArrayList<Books> blogs;
    private static ArrayList<Books> stories;
    private static int id = 0;

    public Util () {

        if (null == all_books) {
            all_books = new ArrayList<>();
            intiallBooks();
        }
        if (null == blogs) {
            blogs = new ArrayList<>();
            //intiallBlogs();
        }
        if (null == stories) {
            stories = new ArrayList<>();
            intiallStories();
        }
        if (null == currently_book) {
            currently_book = new ArrayList<>();
        }
        if (null == want_to_books) {
            want_to_books = new ArrayList<>();
        }
    }

    public ArrayList<Books> getCurrently_book() {
        return currently_book;
    }

    public ArrayList<Books> getWant_to_books() {
        return want_to_books;
    }

    public ArrayList<Books> getAll_books() {
        return all_books;
    }
    public ArrayList<Books> get_blogs() {
        return blogs;
    }
    public ArrayList<Books> get_stories() {
        return stories;
    }


    public boolean add_Blog(Books books){
        return blogs.add(books);
    }
    public boolean add_Stories(Books books){
        return stories.add(books);
    }

    public boolean addCurrentlyBooks(Books books){
        return currently_book.add(books);
    }
    public boolean addWantBooks(Books books){
        return want_to_books.add(books);
    }

    public boolean removeCurrentBooks(Books book){
        return currently_book.remove(book);
    }
    public boolean removeWantBooks(Books book){
        return want_to_books.remove(book);
    }


    private static void intiallBooks(){
         String category = "",
                        name ="",
                        author = "",
                        imageUrl = "",
                        dis_author = "";

        id++;
        category = "blog";
        name = "The End With Us";
         author = "Rohit" ;
        imageUrl = "https://firebasestorage.googleapis.com/v0/b/books-f37f1.appspot.com/o/1549386174-514wNQ0vMgL.jpg?alt=media&token=e3fbf95c-9474-40f3-ba64-adc96a9d1408";
        dis_author = "A novel is a relatively long work of narrative fiction, normally written" +
                " in prose form, and which is typically published as a book. ... Works of fiction that include " +
                "marvellous or uncommon incidents are also novels, including The Lord of The Rings, To Kill a " +
                "Mockingbird, and Frankenstein.";
        all_books.add(new Books(id,category,name,author,imageUrl,dis_author));


        id++;
        category = "stories";
        name = "Wole Rain";
        author = "Rohit" ;
        imageUrl = "https://firebasestorage.googleapis.com/v0/b/books-f37f1.appspot.com/o/1566495895-51xdXLbxYlL.jpg?alt=media&token=ba8b2e93-4dc5-4145-9d7c-6e974306e460";
        dis_author = "A novel is a relatively long work of narrative fiction, normally written" +
                " in prose form, and which is typically published as a book. ... Works of fiction that include " +
                "marvellous or uncommon incidents are also novels, including The Lord of The Rings, To Kill a " +
                "Mockingbird, and Frankenstein.";
        all_books.add(new Books(id,category,name,author,imageUrl,dis_author));



        id++;
        category = "blog";
        author = "Rohit" ;
         name ="Long Bright River";
        imageUrl ="https://firebasestorage.googleapis.com/v0/b/books-f37f1.appspot.com/o/1578603226-51dNGcQl4HL.jpg?alt=media&token=1ace01aa-b431-45d4-8fac-89d800c64f75";
        dis_author = "A novel is a relatively long work of narrative fiction, normally written" +
                " in prose form, and which is typically published as a book. ... Works of fiction that include " +
                "marvellous or uncommon incidents are also novels, including The Lord of The Rings, To Kill a " +
                "Mockingbird, and Frankenstein.";
        all_books.add(new Books(id,category,name,author,imageUrl,dis_author));



        id++;
        category = "blog";
        author = "Rohit" ;
        name ="Nicholas Sparks";
        imageUrl = "https://firebasestorage.googleapis.com/v0/b/books-f37f1.appspot.com/o/33648131._SY475_.jpg?alt=media&token=f219fa8b-cb16-40d6-a0c2-cd6fc0dcb209";
        dis_author = "A novel is a relatively long work of narrative fiction, normally written" +
                " in prose form, and which is typically published as a book. ... Works of fiction that include " +
                "marvellous or uncommon incidents are also novels, including The Lord of The Rings, To Kill a " +
                "Mockingbird, and Frankenstein.";
        all_books.add(new Books(id,category,name,author,imageUrl,dis_author));


        id++;
        category = "stories";
        author = "Rohit" ;
        name = "Yashodhara";
        imageUrl ="https://firebasestorage.googleapis.com/v0/b/books-f37f1.appspot.com/o/4100xetlUQL._SX324_BO1%2C204%2C203%2C200_.jpg?alt=media&token=13fcfed8-80b9-4248-a415-d504dcc898ac";
        dis_author = "A novel is a relatively long work of narrative fiction, normally written" +
                " in prose form, and which is typically published as a book. ... Works of fiction that include " +
                "marvellous or uncommon incidents are also novels, including The Lord of The Rings, To Kill a " +
                "Mockingbird, and Frankenstein.";
        all_books.add(new Books(id,category,name,author,imageUrl,dis_author));


        id++;
        category = "blog";
        author = "Rohit" ;
        name ="Psycho";
        imageUrl = "https://firebasestorage.googleapis.com/v0/b/books-f37f1.appspot.com/o/41sDxDurvzL._SX335_BO1%2C204%2C203%2C200_.jpg?alt=media&token=e708189d-d2e2-44f6-b4db-d059662439e8";
        dis_author = "A novel is a relatively long work of narrative fiction, normally written" +
                " in prose form, and which is typically published as a book. ... Works of fiction that include " +
                "marvellous or uncommon incidents are also novels, including The Lord of The Rings, To Kill a " +
                "Mockingbird, and Frankenstein.";
        all_books.add(new Books(id,category,name,author,imageUrl,dis_author));


        id++;
        category = "stories";
        author = "Rohit" ;
        name="The Great India Novel";
        imageUrl = "https://firebasestorage.googleapis.com/v0/b/books-f37f1.appspot.com/o/51OleTwuSIL._SX325_BO1%2C204%2C203%2C200_.jpg?alt=media&token=802edfce-a2b7-4ad4-b3c7-155ebd4ccf41";

        dis_author = "A novel is a relatively long work of narrative fiction, normally written" +
                " in prose form, and which is typically published as a book. ... Works of fiction that include " +
                "marvellous or uncommon incidents are also novels, including The Lord of The Rings, To Kill a " +
                "Mockingbird, and Frankenstein.";
        all_books.add(new Books(id,category,name,author,imageUrl,dis_author));


        id++;
        category = "blog";
        author = "Rohit" ;
        name ="Me Before You";
        imageUrl ="https://firebasestorage.googleapis.com/v0/b/books-f37f1.appspot.com/o/81COeJEEL7L.jpg?alt=media&token=8a79cc0a-c862-4db3-9ed9-b59e01f77331";
        dis_author = "A novel is a relatively long work of narrative fiction, normally written" +
                " in prose form, and which is typically published as a book. ... Works of fiction that include " +
                "marvellous or uncommon incidents are also novels, including The Lord of The Rings, To Kill a " +
                "Mockingbird, and Frankenstein.";
        all_books.add(new Books(id,category,name,author,imageUrl,dis_author));


        id++;
        category = "stories";
        author = "Rohit" ;
        name="The Gone World";
        imageUrl = "https://firebasestorage.googleapis.com/v0/b/books-f37f1.appspot.com/o/960x0.jpg?alt=media&token=5ddde499-0009-49a8-b4e0-a328e72129c8";
        dis_author = "A novel is a relatively long work of narrative fiction, normally written" +
                " in prose form, and which is typically published as a book. ... Works of fiction that include " +
                "marvellous or uncommon incidents are also novels, including The Lord of The Rings, To Kill a " +
                "Mockingbird, and Frankenstein.";
        all_books.add(new Books(id,category,name,author,imageUrl,dis_author));


        id++;
        category = "blog";
        author = "Rohit" ;
        name = "The Book Of God";
        imageUrl = "https://firebasestorage.googleapis.com/v0/b/books-f37f1.appspot.com/o/965733.jpg?alt=media&token=be518da5-231c-4a39-bac2-5e538c55788d";
        dis_author = "A novel is a relatively long work of narrative fiction, normally written" +
                " in prose form, and which is typically published as a book. ... Works of fiction that include " +
                "marvellous or uncommon incidents are also novels, including The Lord of The Rings, To Kill a " +
                "Mockingbird, and Frankenstein.";
        all_books.add(new Books(id,category,name,author,imageUrl,dis_author));


        id++;
        category = "blog";
        author = "Rohit" ;
        name = "The Paying Guuests";
        imageUrl = "http://cdn.playbuzz.com/cdn/62b7af36-65b7-41aa-8db2-e34fd8a76acf/1e93e32c-7662-4de7-a441-59d4c29d6faf.jpg";
        dis_author = "A novel is a relatively long work of narrative fiction, normally written" +
                " in prose form, and which is typically published as a book. ... Works of fiction that include " +
                "marvellous or uncommon incidents are also novels, including The Lord of The Rings, To Kill a " +
                "Mockingbird, and Frankenstein.";
        all_books.add(new Books(id,category,name,author,imageUrl,dis_author));


        id++;
        category = "stories";
        author = "Rohit" ;
        name ="The Girl In Room 105";
        imageUrl = "https://firebasestorage.googleapis.com/v0/b/books-f37f1.appspot.com/o/Paying%20Guests.jpg?alt=media&token=2d8821f6-a4c0-41a7-b166-8a3b78b4e638";
        dis_author = "A novel is a relatively long work of narrative fiction, normally written" +
                " in prose form, and which is typically published as a book. ... Works of fiction that include " +
                "marvellous or uncommon incidents are also novels, including The Lord of The Rings, To Kill a " +
                "Mockingbird, and Frankenstein.";
        all_books.add(new Books(id,category,name,author,imageUrl,dis_author));


        id++;
        category = "stories";
        author = "Rohit" ;
        name ="Hobbit";
        imageUrl = "https://firebasestorage.googleapis.com/v0/b/books-f37f1.appspot.com/o/images.jpg?alt=media&token=91e9699e-f109-4855-9474-ac30f61a09b8";
        dis_author = "A novel is a relatively long work of narrative fiction, normally written" +
                " in prose form, and which is typically published as a book. ... Works of fiction that include " +
                "marvellous or uncommon incidents are also novels, including The Lord of The Rings, To Kill a " +
                "Mockingbird, and Frankenstein.";
        all_books.add(new Books(id,category,name,author,imageUrl,dis_author));


        id++;
        category = "blog";
        author = "Rohit" ;
        name = "Witness The Night";
        imageUrl = "https://firebasestorage.googleapis.com/v0/b/books-f37f1.appspot.com/o/jhjka.jpg?alt=media&token=fccb6bb6-716e-4165-8890-21f6f2b98bd1";
        dis_author = "A novel is a relatively long work of narrative fiction, normally written" +
                " in prose form, and which is typically published as a book. ... Works of fiction that include " +
                "marvellous or uncommon incidents are also novels, including The Lord of The Rings, To Kill a " +
                "Mockingbird, and Frankenstein.";
        all_books.add(new Books(id,category,name,author,imageUrl,dis_author));



    }

    private static void intiallBlogs(){

        String category = "",
                name ="",
                author = "",
                imageUrl = "",
                dis_author = "";
        id++;
        category = "blog";
        author = "Rohit" ;
        name = "Witness The Night";
        imageUrl = "https://firebasestorage.googleapis.com/v0/b/books-f37f1.appspot.com/o/jhjka.jpg?alt=media&token=fccb6bb6-716e-4165-8890-21f6f2b98bd1";
        dis_author = "A novel is a relatively long work of narrative fiction, normally written" +
                " in prose form, and which is typically published as a book. ... Works of fiction that include " +
                "marvellous or uncommon incidents are also novels, including The Lord of The Rings, To Kill a " +
                "Mockingbird, and Frankenstein.";
        blogs.add(new Books(id,category,name,author,imageUrl,dis_author));
        id++;
        category = "blog";
        author = "Rohit" ;
        name = "The Paying Guuests";
        imageUrl = "http://cdn.playbuzz.com/cdn/62b7af36-65b7-41aa-8db2-e34fd8a76acf/1e93e32c-7662-4de7-a441-59d4c29d6faf.jpg";
        dis_author = "A novel is a relatively long work of narrative fiction, normally written" +
                " in prose form, and which is typically published as a book. ... Works of fiction that include " +
                "marvellous or uncommon incidents are also novels, including The Lord of The Rings, To Kill a " +
                "Mockingbird, and Frankenstein.";
        blogs.add(new Books(id,category,name,author,imageUrl,dis_author));
        id++;
        category = "blog";
        author = "Rohit" ;
        name = "The Book Of God";
        imageUrl = "https://firebasestorage.googleapis.com/v0/b/books-f37f1.appspot.com/o/965733.jpg?alt=media&token=be518da5-231c-4a39-bac2-5e538c55788d";
        dis_author = "A novel is a relatively long work of narrative fiction, normally written" +
                " in prose form, and which is typically published as a book. ... Works of fiction that include " +
                "marvellous or uncommon incidents are also novels, including The Lord of The Rings, To Kill a " +
                "Mockingbird, and Frankenstein.";
        blogs.add(new Books(id,category,name,author,imageUrl,dis_author));
        id++;
        category = "blog";
        author = "Rohit" ;
        name ="Me Before You";
        imageUrl ="https://firebasestorage.googleapis.com/v0/b/books-f37f1.appspot.com/o/81COeJEEL7L.jpg?alt=media&token=8a79cc0a-c862-4db3-9ed9-b59e01f77331";
        dis_author = "A novel is a relatively long work of narrative fiction, normally written" +
                " in prose form, and which is typically published as a book. ... Works of fiction that include " +
                "marvellous or uncommon incidents are also novels, including The Lord of The Rings, To Kill a " +
                "Mockingbird, and Frankenstein.";
        blogs.add(new Books(id,category,name,author,imageUrl,dis_author));
        id++;
        category = "blog";
        author = "Rohit" ;
        name ="Long Bright River";
        imageUrl ="https://firebasestorage.googleapis.com/v0/b/books-f37f1.appspot.com/o/1578603226-51dNGcQl4HL.jpg?alt=media&token=1ace01aa-b431-45d4-8fac-89d800c64f75";
        dis_author = "A novel is a relatively long work of narrative fiction, normally written" +
                " in prose form, and which is typically published as a book. ... Works of fiction that include " +
                "marvellous or uncommon incidents are also novels, including The Lord of The Rings, To Kill a " +
                "Mockingbird, and Frankenstein.";
        blogs.add(new Books(id,category,name,author,imageUrl,dis_author));



        id++;
        category = "blog";
        author = "Rohit" ;
        name ="Nicholas Sparks";
        imageUrl = "https://firebasestorage.googleapis.com/v0/b/books-f37f1.appspot.com/o/33648131._SY475_.jpg?alt=media&token=f219fa8b-cb16-40d6-a0c2-cd6fc0dcb209";
        dis_author = "A novel is a relatively long work of narrative fiction, normally written" +
                " in prose form, and which is typically published as a book. ... Works of fiction that include " +
                "marvellous or uncommon incidents are also novels, including The Lord of The Rings, To Kill a " +
                "Mockingbird, and Frankenstein.";
        blogs.add(new Books(id,category,name,author,imageUrl,dis_author));
    }

    private static void intiallStories(){

        String category = "",
                name ="",
                author = "",
                imageUrl = "",
                dis_author = "";

        id++;
        category = "stories";
        author = "Rohit" ;
        name ="The Girl In Room 105";
        imageUrl = "https://firebasestorage.googleapis.com/v0/b/books-f37f1.appspot.com/o/Paying%20Guests.jpg?alt=media&token=2d8821f6-a4c0-41a7-b166-8a3b78b4e638";
        dis_author = "A novel is a relatively long work of narrative fiction, normally written" +
                " in prose form, and which is typically published as a book. ... Works of fiction that include " +
                "marvellous or uncommon incidents are also novels, including The Lord of The Rings, To Kill a " +
                "Mockingbird, and Frankenstein.";
        stories.add(new Books(id,category,name,author,imageUrl,dis_author));


        id++;
        category = "stories";
        author = "Rohit" ;
        name ="Hobbit";
        imageUrl = "https://firebasestorage.googleapis.com/v0/b/books-f37f1.appspot.com/o/images.jpg?alt=media&token=91e9699e-f109-4855-9474-ac30f61a09b8";
        dis_author = "A novel is a relatively long work of narrative fiction, normally written" +
                " in prose form, and which is typically published as a book. ... Works of fiction that include " +
                "marvellous or uncommon incidents are also novels, including The Lord of The Rings, To Kill a " +
                "Mockingbird, and Frankenstein.";
        stories.add(new Books(id,category,name,author,imageUrl,dis_author));
        id++;
        category = "blog";
        name = "The End With Us";
        author = "Rohit" ;
        imageUrl = "https://firebasestorage.googleapis.com/v0/b/books-f37f1.appspot.com/o/1549386174-514wNQ0vMgL.jpg?alt=media&token=e3fbf95c-9474-40f3-ba64-adc96a9d1408";
        dis_author = "A novel is a relatively long work of narrative fiction, normally written" +
                " in prose form, and which is typically published as a book. ... Works of fiction that include " +
                "marvellous or uncommon incidents are also novels, including The Lord of The Rings, To Kill a " +
                "Mockingbird, and Frankenstein.";
        stories.add(new Books(id,category,name,author,imageUrl,dis_author));


        id++;
        category = "stories";
        name = "Wole Rain";
        author = "Rohit" ;
        imageUrl = "https://firebasestorage.googleapis.com/v0/b/books-f37f1.appspot.com/o/1566495895-51xdXLbxYlL.jpg?alt=media&token=ba8b2e93-4dc5-4145-9d7c-6e974306e460";
        dis_author = "A novel is a relatively long work of narrative fiction, normally written" +
                " in prose form, and which is typically published as a book. ... Works of fiction that include " +
                "marvellous or uncommon incidents are also novels, including The Lord of The Rings, To Kill a " +
                "Mockingbird, and Frankenstein.";
        stories.add(new Books(id,category,name,author,imageUrl,dis_author));
    }

}
