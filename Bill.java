import javax.lang.model.util.ElementScanner6;

class Elecbill{
	int cno;
	String cname;
	String cadd;
	long NOU;
	long bill=0;
	Elecbill( int no,  String name,  String add,  long nou) {
		cno = no;
		cname = name;
		cadd = add;
		NOU = nou;
	}

	void Display() {
		System.out.println("Customer number=" + cno + "\nCustomer name=" + cname+"\nCustomer Address="+cadd+"\nUnits consumed="+NOU);
	}
	void calculate(){
		if((NOU<100)&(NOU>1))
			bill=500;
		else if((NOU>100)&(NOU<200))
			bill+=NOU;
		else if((NOU>200)&(NOU<300))
			bill+=(1.2*NOU);
		else 
			bill+=1.5*NOU;
		System.out.println("Bill Amount = "+bill);
	}

}

public class Bill{
	public static void main(final String[] args) {
		Elecbill e=new Elecbill(5, "abc", "ABC", 50);
		e.Display();
		e.calculate();
	}
} 