import java.util.Scanner;
import java.lang.Math;
public class Conversion{
    static void ptoc(float r,float a){
        double x,y;
        x=r*Math.cos(a);
        y=r*Math.sin(a);
        System.out.println("x = "+x+"\ny = "+y);
    }
    static void ctop(float x,float y){
        double r;
        double a;
        r=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        a=Math.atan(y/x);
        System.out.println("value of r = "+r+"\nvalue of angle = "+a);
    }
	public static void main(String[] args) {
        float x;
        float r;
        float a;
        float y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the x and y cordinates :");
        x=sc.nextFloat();
        y=sc.nextFloat();
        ctop(x,y);
        System.out.println("Enter the value of r and angle :");
        r=sc.nextFloat();
        a=sc.nextFloat();
        ptoc(r,a);
	}
} 