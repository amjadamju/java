import java.util.Scanner;

public class reverse {
    static void reverseStr(String str){
        String word[]=str.split(" ");
        for(int i=word.length-1;i>=0;i--){
            System.out.println(word[i]);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the string : ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        reverseStr(str);
    }
}