import java.awt.*;
import java.awt.event.*;

class GridDemo extends Frame implements ActionListener{
	Button b;
	TextField tf;
	Panel p;

	GridDemo(){
		// Super Constructor Call
		super("GridLayout Demonstration");
		BorderLayout bl = new BorderLayout();
		setLayout(bl);
		tf = new TextField();
		tf.setEditable(false);
		tf.setFont(new Font("Arial", Font.BOLD, 20));
		add(tf, bl.NORTH);
		p = new Panel();
		add(p, bl.CENTER);
		GridLayout gl = new GridLayout();
		p.setLayout(gl);


		gl.setRows(2);
		gl.setColumns(3);
		gl.setHgap(5);
		gl.setVgap(5);

		String[] s = {"RED", "GREEN", "BLUE", "CYAN", "BLACK", "YELLOW"};
		
		for(String ss : s){
			b = new Button(ss);
			b.addActionListener(this);
			p.add(b);
		}

		setSize(400, 400);
		setVisible(true);
		addWindowListener(
				new WindowAdapter(){
					public void windowClosing(WindowEvent we){
						dispose();
					}
				}
			);
	}
	
	public void actionPerformed(ActionEvent ae){
		String t = ae.getActionCommand();
		switch(t){
			case "YELLOW": p.setBackground(Color.YELLOW); 
							break;
			case "BLACK": p.setBackground(Color.BLACK); break;
			case "CYAN": p.setBackground(Color.CYAN); break;
			case "RED": p.setBackground(Color.RED); break;
			case "BLUE": p.setBackground(Color.BLUE); break;
			case "GREEN": p.setBackground(Color.GREEN); break;
			default: setBackground(Color.WHITE);
		}
		tf.setText("COLOR IS: "+t);
	}
		


	public static void main(String...args){
		new GridDemo();
	}
}