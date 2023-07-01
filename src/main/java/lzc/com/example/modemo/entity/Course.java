package lzc.com.example.modemo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="course")
public class Course {

    public Course() {
    }
    // define the fields
    private int id;
    private String title;
    private Instructor instructor;

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Course(String title) {
        this.title = title;
    }
}
