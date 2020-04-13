import java.awt.*;
class First2{
First2(){
Frame f=new Frame();
Button b=new Button("click me");
b.setBounds(30,50,80,30);
f.add(b);
f.setSize(300,300); 
f.setLayout(null);
f.setVisible(true);
f.setTitle("First Frame");// run this program with and without statements in red colour
f.setBackground(Color.green);
f.setForeground(Color.white);
}
public static void main(String args[]){
First2 f=new First2();
}}
