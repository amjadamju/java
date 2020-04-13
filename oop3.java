import java.util.*;
class figure{
	int a,b;
	Scanner sc=new Scanner(System.in);
	void area(){
		System.out.println("Area = "+(a*b));
	} 
}
class triangle extends figure{
	triangle(){
		System.out.println("Enter height and base length : ");
		a=sc.nextInt();
		b=sc.nextInt();
		area();
	}
	void area(){
		System.out.println("Area of triangle = "+((a*b)/2));
	}
}
class rectangle extends figure{
	rectangle(){
		System.out.println("Enter height and width : ");
		a=sc.nextInt();
		b=sc.nextInt();
		area();
	}
	void area(){
		System.out.println("Area of rectangle = "+a*b);
	}
}
public class oop3
{
	public static void main(String[] args) {
	figure f1=new triangle();
	figure f2=new rectangle();
	}
}

