package lzc.com.example.modemo.dao;

import lzc.com.example.modemo.entity.Course;
import lzc.com.example.modemo.entity.Instructor;
import lzc.com.example.modemo.entity.InstructorDetail;

import java.util.List;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findById(int theId);

    void deleteById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorDetailById(int theId);

    List<Course> findCoursesByInstructorId(int theId);

    Instructor findInstructorByIdJoinFetch(int theId);

    void updateInstructor(Instructor instructor);

    void updateCourse(Course course);

    Course getCourseById(int theId);

    void deleteCourseById(int theId);
}
