
public class A {
 int b = 20;
 
 void m1() {
	 int c = 78;//c varible is not accessible in the another local.
    System.out.println(b);//b 
 }
   void m2() {
	   System.out.print(b);
		 //System.out.println(c);
   }
}
