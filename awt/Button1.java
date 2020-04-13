import java.awt.*;
import java.awt.event.*;
class Button1 extends Frame implements ActionListener {
	TextField tf;
	Button1(){
		//create components
		tf=new TextField();
		tf.setBounds(60,100,150,60);
		Button b=new Button("ithaathaa..click here");
		b.setBounds(30,50,80,30);//register listener
		b.addActionListener(this);//passing current instance
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
			System.out.println("Window Closing");
			dispose();
			}
		});
		//add components and set size, layout and visibility
		add(b); 
		add(tf);
		setSize(600,600);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		tf.setText("I love u ithaathaa");
	}
	public static void main(String args[]){
		//create container
		new Button1();
	}
}
