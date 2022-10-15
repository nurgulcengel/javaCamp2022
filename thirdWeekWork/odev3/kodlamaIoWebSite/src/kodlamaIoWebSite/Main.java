package kodlamaIoWebSite;

import java.util.ArrayList;
import java.util.List;

import kodlamaIoWebSite.business.CategoryManager;
import kodlamaIoWebSite.business.CourseManager;
import kodlamaIoWebSite.business.InstructorManager;
import kodlamaIoWebSite.core.logging.DatabaseLogger;
import kodlamaIoWebSite.core.logging.FileLogger;
import kodlamaIoWebSite.core.logging.ILogger;
import kodlamaIoWebSite.core.logging.MailLogger;
import kodlamaIoWebSite.dataAccess.HibernateCategoryDao;
import kodlamaIoWebSite.dataAccess.JdbcInstructorDao;
import kodlamaIoWebSite.dataAccess.jdbcCourseDao;
import kodlamaIoWebSite.entities.Category;
import kodlamaIoWebSite.entities.Course;
import kodlamaIoWebSite.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		//Kurslar 
		Course course1 = new Course();
		course1.setId(1);
		course1.setName("2022 Yazılım Geliştirici Yetiştirme Kampı - JAVA ");
		course1.setPrice(15);
		course1.setDescription("Java Yazılım Geliştirici Yetiştirme Kampımızın takip,döküman ve duyurularını buradan yapacağız.");
		
		Course course2= new Course();
		course1.setId(25);
		course1.setName("Yazılım Geliştirici Yetiştirme Kampı - (C# + ANGULAR) ");
		course1.setPrice(15);
		course1.setDescription("2 ay sürecek Kampımızın takip,döküman ve duyurularını buradan yapacağız.");
		
		Course course3= new Course();
		course3.setId(3);
		course3.setName("Senior Yazılım Geliştirici Yetiştirme Kampı - (.NET) ");
		course3.setPrice(35);
		course3.setDescription("Senior Yazılım Geliştirici Yetiştirme Kampımızın takip,döküman ve duyurularını buradan yapacağız.");
		
		Course course4= new Course();
		course4.setId(4);
		course4.setName("Yazılım Geliştirici Yetiştirme Kampı - (JavaScript) ");
		course4.setPrice(45);
		course4.setDescription("1,5 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip,döküman ve duyurularını buradan yapacağız.");
		
		Course course5= new Course();
		course5.setId(5);
		course5.setName("Yazılım Geliştirici Yetiştirme Kampı - (JAVA + REACT) ");
		course5.setPrice(55);
		course5.setDescription("Java ve React kampı");
		
		Course course6= new Course();
		course6.setId(6);
		course6.setName("Programlamaya Giriş İçin Temel Kurs ");
		course6.setPrice(65);
		course6.setDescription("PHYTON,JAVA,C# gibi tüm programlama dilleri için temel programlama mantığı anlaşılır.");
		
		//Kurs List
		
		List<Course> courses = new ArrayList<Course>();
		courses.add(course1);
		courses.add(course2);
		courses.add(course3);
		courses.add(course4);
		courses.add(course5);
		//courses.add(course6);
		
		//loglist
		List<ILogger> loggers = new ArrayList<ILogger>();
		loggers.add(new FileLogger());
		loggers.add(new DatabaseLogger());
		loggers.add(new MailLogger());
	
		
		CourseManager courseManager = new CourseManager(new jdbcCourseDao(),loggers,courses);
		courseManager.add(course6);
		
		//Category
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Programlama");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Programlama-V2");
		
		
		//Category List
		
		List<Category> categories = new ArrayList<Category>();
		categories.add(category1);
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categories);
		categoryManager.add(category2);
		
		//Eğitmen
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setName("Engin Demiroğ");
		
		
		
		InstructorManager instructorManager = new InstructorManager(null, loggers, new JdbcInstructorDao());
        instructorManager.add(instructor1);

	}

}
