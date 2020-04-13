import java.awt.*;
class First extends Frame{
    First(){
        Button b=new Button("click me");
        b.setBounds(100,100,100,100);// setting button position
        add(b);//adding button into frame
        setSize(200,200);//frame size 300 width and 300 height
        setLayout(null);//no layout manager
        setTitle("First Frame");// run this program with and without statements in red colour
        setBackground(Color.cyan);
        setForeground(Color.white);
        setVisible(true);//now frame will be visible, by default not visible
}
public static void main(String args[]){
First f=new First();
}}

