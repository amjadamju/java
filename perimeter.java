import java.util.Scanner;

interface perimeters {
    void perimeter();
}

class circle implements perimeters {
    float r;
    public circle(float r){
        this.r=r;
    }
    public void perimeter(){
        System.out.println("Perimeter of circle is : " + (2 * 3.14 * r));
    }
}

class rectangle implements perimeters {
    int a,b;
    public rectangle(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void perimeter() {
        System.out.println("Perimeter of circle is : " + (2 * a + 2 * b));
    }
}

class perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the radius : ");
        float r;
        r = sc.nextFloat();
        circle c1 = new circle(r);
        System.out.println("Enter  the length and breadth : ");
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        rectangle r1 = new rectangle(a,b);
        c1.perimeter();
        r1.perimeter();
    }
}