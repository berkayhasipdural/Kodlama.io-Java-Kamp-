

import business.CategoryManager;
import business.CourseManager;
import business.İntructerManager;
import core.logging.ConsoleLogger;
import core.logging.DatabaseLogger;
import core.logging.EmailLogger;
import core.logging.Logger;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateCourseDao;
import dataAccess.JdbcCategoryDao;
import dataAccess.JdbcCourseDao;
import dataAccess.JdbcİnstructerDao;
import entities.Category;
import entities.Course;
import entities.İnstructer;

public class Main {

	public static void main(String[] args) throws Exception {
		Category category1 = new Category();
		category1.setName("Software Languages");
		Category category2 = new Category();
		category2.setName("Programing");
		Logger[] loggers = new Logger[] { new EmailLogger(), new DatabaseLogger(), new ConsoleLogger() };

		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);// we write which dao we
																								// want to add
		categoryManager.add(category1);
		categoryManager.add(category2);

		Course course1 = new Course();
		course1.setName("Java programing");
		course1.setPrice(79.99);
		Course course2 = new Course();
		course2.setName("Python programing");
		course2.setPrice(89.99);
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course2);
		courseManager.add(course1);
		
		İnstructer instructer1 = new İnstructer();
		instructer1.setFirstName("Berkay");
		instructer1.setLastName("Dural");
		instructer1.setAge(16);
		
		İnstructer instructer2 = new İnstructer();
		instructer2.setFirstName("Elon");
		instructer2.setLastName("Musk");
		instructer2.setAge(51);
		
		İntructerManager instructerManager = new İntructerManager(new JdbcİnstructerDao(), loggers);
		instructerManager.add(instructer1);
		instructerManager.add(instructer2);
	
	
	}


}
