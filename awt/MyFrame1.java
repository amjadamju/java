/*

Close AWT Window Example 2 : Anonymous class

import java.awt.*;
import java.awt.event.*;
public class MyFrame1 extends Frame{
	MyFrame1(){
		setSize(3000,3000);//frame size 300 width and 300 height try with different values
		setTitle("MyFrame1");
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.out.println("Window Closing");
				dispose();
			}
		});
		setVisible(true);//now frame will be visible, by default not visible
	}
	public static void main(String args[]){
		MyFrame1 f=new MyFrame1();
		}
}

*/



/*Close AWT Window Example 3: extending WindowAdapter*/


import java.awt.*;
import java.awt.event.*;
public class MyFrame1 extends WindowAdapter{
	Frame f;
	MyFrame1(){
		f=new Frame();
		f.addWindowListener(this);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setTitle("MyFrame1");
		Button b1=new Button("click1");
		b1.setBounds(30,100,80,30);
		f.add(b1);
		f.setBackground(Color.green);
		}
	public void windowClosing(WindowEvent e) {
		System.out.println("closing");
		f.dispose();
	}
	public static void main(String[] args) {
		new MyFrame1();
	}
}
