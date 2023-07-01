package lzc.com.example.modemo;

import lzc.com.example.modemo.dao.AppDAO;
import lzc.com.example.modemo.entity.Course;
import lzc.com.example.modemo.entity.Instructor;
import lzc.com.example.modemo.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MODemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MODemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO) {
		return runner -> {
//			 createInstructor(appDAO);
			// findInstructor(appDAO);
			//deleteInstructor(appDAO);
//			findInstructorDetail(appDAO);
//			deleteInstructorDetail(appDAO);
//			createInstructorWithCourse(appDAO);
			findInstructorWithCourse(appDAO);

		};
	}

	private void findInstructorWithCourse(AppDAO appDAO) {
		Instructor instructor = appDAO.findById(1);
		System.out.println("finding the instructor");
        System.out.println(instructor);
		System.out.println("the course" + instructor.getCourses());
		System.out.println("done!");
	}

	private void createInstructorWithCourse(AppDAO appDAO) {
// create instructor detail
		Instructor tempInstructor = new Instructor("HHHH", "lplplplp", "hhhh@rbc.com");

		InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.youtube.com", "code");

		// associate the objects
		tempInstructor.setInstructorDetail(tempInstructorDetail);

		// create the courses
		Course tempCourse1 = new Course("C++");
		Course tempCourse2 = new Course("Java");

		// add courses to instructor
		tempInstructor.add(tempCourse1);
		tempInstructor.add(tempCourse2);

		// save the instructor
		// note: this will ALSO save the course because of CascadeType.ALL
		System.out.println("Saving instructor: " + tempInstructor);
		System.out.println("Saving the course " + tempInstructor.getCourses() );
		appDAO.save(tempInstructor);

		System.out.println("Done!");
	}
}
