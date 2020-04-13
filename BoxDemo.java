import java.util.*;
class Box
{
    int height;
    int width;
    int lenght;
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter height:"); 
    height=sc.nextInt();
    width=sc.nextInt();
    lenght=sc.nextInt();
  static int volume ()
  {
    return (height * width * length);
  }
  static int area ()
  {
    return (width * length);
  }
}

class BoxDemo
{
  public static void main (String[] args)
  {
    Box b1 = new Box ();
    System.out.println ("area =" + b1.area () + "\nVolume=" + b1.volume ());
  }
}

