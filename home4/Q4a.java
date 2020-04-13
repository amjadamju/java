 class Poe extends Kylo {
    static void method2() {
        //super.method2();
        System.out.print("Poe 2   ");
    }
    public String toString() {
        return "Poe "; //+ super.toString();
    }
}
  class Kylo extends Finn {
    static void method1() {
        System.out.print("Kylo 1   ");
    }
    public String toString() {
        return "Kylo";
    }
}
  class Finn extends Rey {
    static void method2() {
        System.out.print("Finn 2   ");
        method1();
    }
}
  class Rey {
    public String toString() {
        return "Rey";
    }
    static void method1() {
        System.out.print("Rey 1   ");
    }
    static void method2() {
        System.out.print("Rey 2   ");
    }
}
public class Q4a
{
  public static void main(String[] args) {
Rey[] elements = { new Finn(), new Rey(), new Poe(), new Kylo() };
for (int i = 0; i < elements.length; i++) {
    System.out.println(elements[i]);
    elements[i].method1();
    System.out.println();
    elements[i].method2();
   System.out. println();
    System.out.println();
  System.out.println("=========================");

} 
}
}

