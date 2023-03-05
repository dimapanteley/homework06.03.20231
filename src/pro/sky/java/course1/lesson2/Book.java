package pro.sky.java.course1.lesson2;

import java.util.Objects;

public class Book{
    private String name;// Объявили свойство name (имя)
    private pro.sky.java.course1.lesson2.Author author;
    private int age; // Объявили свойство age (год выпуска)
    public Book (String name, pro.sky.java.course1.lesson2.Author author, int age) {
        this.name=name;
        this.author=author;
        this.age=age;
    }
    public String getBookName (){
        return this.name;
    }
    public int getBookAge () {
        return this.age;
    }
    public void setAge (int age) {
        this.age= age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return age == book.age && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, age);
    }

    public String toString() {
        return "Название книги  - " + name + ", автор книги - " + author +", возраст автора - " + age;


    }
}


