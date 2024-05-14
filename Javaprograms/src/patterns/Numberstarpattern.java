package patterns;

public class Numberstarpattern {
public static void main(String[] args) {
	 for (int i=1;i<=5;i++) {//i=1   //i=2
		 for(int j=1;j<=i;j++) {//j=1//
			 System.out.print("1");
		 }
	 
		 System.out.println( );
		 }
	 starpattren();
	 patter1n(5);
	 numberpattren();
}

public  static void starpattren()
{
	for(int i=1;i<=5;i++) {
for(int j=1;j<=i;j++)
{
System.out.print("*");	
}
System.out.println("");
}
	
	
	}

 public static int patter1n( int a) {
	 
	 for(int i=1;i<=5;i++)
	 {
		 for(int j=1;j<=i;j++)
		 {
			 System.out.print(a);
			 
		 }
		 System.out.println(" ");
	 }
	return a;
	 
 } 
 
 public static  void numberpattren()
 /* print 
1
22
333
4444
55555
  */
 {
	 for (int i=1;i<=5;i++)
	 {
		 for(int j=1;j<=i;j++)
		 {
			 System.out.print(i);
		 }
		 System.out.println("");
	 }
	 
	 
	 
	 
 }
 
 
 
 

 

}
