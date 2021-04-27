package odev;

public class Main {

	public static void main(String[] args) {
	
			
			Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý ", "Engin Demiroð","C# + Angular" );

			Course course2 = new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý ", "Engin Demiroð","Java + React" );

			Course course3 = new Course(3, "Programlamaya Giriþ Ýçin Temel Kurs", "Engin Demiroð","Yeni baþlayanlar için" );

			
			Course[] courses = {course1,course2,course3};
			
			for(Course course :courses) {
				System.out.println("Kurs Adý: "+ course.name + " / " + "Eðitmen Adý: "  + course.teacher + " / " + "Kurs Detayý: " + " / " + course.courseDetail  );
			}
			
			
			
			CourseManager courseManager = new CourseManager();
			courseManager.addToCart(course1);
			courseManager.addToCart(course2);
			courseManager.addToCart(course3);
			
			
		}

	}


