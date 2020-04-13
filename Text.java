import java.util.Scanner;
public class Text {
    static void textOperation(String str,String word){
        String temp;
        int count=0;
        String[] arr=str.split(" ");
        int len=arr.length;
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                if(arr[i].compareTo(arr[j])>0){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<len;i++){
            if(arr[i].equals(word)==true)
                count++;
        }
        for(int i=0;i<len;i++)
            System.out.print(arr[i]+" ");
        System.out.println("\nNumber of occurences = "+count);
    }  
	public static void main(String[] args) {
        System.out.print("Enter the text : ");
        Scanner sc=new Scanner(System.in);
        String str,word;
        str=sc.nextLine();
        System.out.print("Enter the word : ");
        word=sc.nextLine();
		textOperation(str,word);
	}
}

