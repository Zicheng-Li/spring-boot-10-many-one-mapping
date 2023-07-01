package lzc.com.example.modemo.dao;

import lzc.com.example.modemo.entity.Instructor;
import lzc.com.example.modemo.entity.InstructorDetail;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findById(int theId);

    void deleteById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorDetailById(int theId);
}
