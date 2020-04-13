import java.util.Stack;
public class SaQ{
    static void Push(Stack s,int a){
        s.push(new Integer(a));
        System.out.println("Stack is : "+s);
    }
    static void Pop(Stack s){
        Integer item=(Integer)s.pop();
        System.out.print("The deleted item is "+item);
        System.out.println("Stack is "+s);
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        Push(s,5);
        Pop(s);
    }
}