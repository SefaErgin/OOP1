package odev;

public class Main {

	public static void main(String[] args) {
	
			
			Course course1 = new Course(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� ", "Engin Demiro�","C# + Angular" );

			Course course2 = new Course(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� ", "Engin Demiro�","Java + React" );

			Course course3 = new Course(3, "Programlamaya Giri� ��in Temel Kurs", "Engin Demiro�","Yeni ba�layanlar i�in" );

			
			Course[] courses = {course1,course2,course3};
			
			for(Course course :courses) {
				System.out.println("Kurs Ad�: "+ course.name + " / " + "E�itmen Ad�: "  + course.teacher + " / " + "Kurs Detay�: " + " / " + course.courseDetail  );
			}
			
			
			
			CourseManager courseManager = new CourseManager();
			courseManager.addToCart(course1);
			courseManager.addToCart(course2);
			courseManager.addToCart(course3);
			
			
		}

	}


