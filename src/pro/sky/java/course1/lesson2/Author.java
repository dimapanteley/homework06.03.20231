package pro.sky.java.course1.lesson2;

import java.util.Objects;

public class Author {
    private String authorName; // Объявили свойство имя автора
    private int authorAge;
    public Author (String authorName, int authorAge){
        this.authorName=authorName;
        this.authorAge=authorAge;
    }
    public String getName () {
        return this.authorName;
    }
    public int getAge() {
        return this.authorAge;
    }

    @Override
    public boolean equals(Object o) {
        if (this.getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return authorAge == author.authorAge && Objects.equals(authorName, author.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorAge);
    }

    @Override
    public String toString() {
        return "Имя - " + authorName + ", возраст " + authorAge +  '}';

    }
}
