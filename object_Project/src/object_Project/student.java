package object_Project;

public class student {
	int roll;
	String name;
	int marks;
	

	  void m1 () {
		  System.out.println("m1 method of Student class");
		  student s1 = new student();
		  System.out.println(s1);
		  s1.m2();
	  }
      void m2 () {
    	  System.out.println("m2 method of Student class");
    	  student s1 = new student();
    	  System.out.println(s1);
    	  s1.m1();
      }
}
