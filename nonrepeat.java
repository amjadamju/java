public class nonrepeat
{
    static void NonRepeatedChar(String str){
        char ch;
        int flag,i,j,last;
        char[] chars=new char[str.length()];
        int[] index=new int[str.length()];
        chars[0]=str.charAt(0);
        index[0]=1;
        last=1;
        for(i=1;i<str.length();i++){
            ch=str.charAt(i);
            flag=0;
            for(j=0;j<i;j++){
                if(ch==chars[j]){
                    index[j]++;
                    flag=1;
                    break;
                }
                else
                    j++;
            }
            if(flag==0){
                chars[i]=str.charAt(i);
                index[i]=1;
                last++;
            }
        }
        for (int k=0;k<chars.length;k++) {
            if(index[k]==1){
                System.out.println(chars[k]);
                break;
            }
        }
    }
	public static void main(String[] args) {
		NonRepeatedChar("hello");
	}
}
