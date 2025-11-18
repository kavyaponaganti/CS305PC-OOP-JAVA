import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GridBagDemo extends JFrame implements ActionListener{
	JTextField tf;
	String operator = "";
	int n1 = 0, n2 = 0, output = 0;

	GridBagDemo(){
		GridBagLayout gb = new GridBagLayout();
		setLayout(gb);
		GridBagConstraints gc = new GridBagConstraints();
		
		String[] ss = {"7", "8", "9","+","4", "5", "6", "-", "3", "2", "1", "*", "0", "C", "=", "/"};
		
		int x = 0; int y = 0;
		gc.fill = GridBagConstraints.BOTH;
		for(String s : ss){
			JButton b = new JButton(s);
			b.setFont(new Font("Arial", Font.BOLD, 20));
			b.addActionListener(this);
			gc.ipadx = 15;
			gc.ipady = 15;
			gc.gridx = x;
			gc.gridy = y;
			gc.insets = new Insets(10, 10, 10, 10);
			add(b,gc);

			x++;
			if(x == 4){
				x = 0;
				y++;
			}
		}

		tf = new JTextField();
		tf.setFont(new Font("Arial", Font.BOLD, 20));
		gc.fill = GridBagConstraints.BOTH;
		gc.ipadx = 15;
		gc.ipady = 15;
		gc.gridx = 0;
		gc.gridy = y;
		gc.gridwidth = 4;
		gc.insets = new Insets(10, 10, 10, 10);
		add(tf,gc);
				
		setSize(250, 400);
		setVisible(true);
	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		/*addWindowListener(
				new WindowAdapter(){
					public void windowClosing(WindowEvent we){
						dispose();
					}
				}
			);*/
	}

	public void actionPerformed(ActionEvent ae){
			String val = ae.getActionCommand();
			if(val.charAt(0)>= '0' && val.charAt(0) <='9'){
					tf.setText(tf.getText()+val);
			}else if(val.equals("C")){
				tf.setText("");
			}else if(val.equals("=")){
					n2 = Integer.parseInt(tf.getText());
					switch(operator){
						case "+": 
									output = n1 + n2; break;
						case "-": 
									output = n1 - n2; break;
						case "*": 
									output = n1 * n2; break;
						case "/": 
									if(n2 == 0){
										tf.setText("Error : div/zero");
										return;
									}else{
										output = n1 / n2; 
										break;
									}
						default: System.out.println("error"); 
					}
					tf.setText(String.valueOf(output));
			}else{
				n1 = Integer.parseInt(tf.getText());
				operator = ae.getActionCommand();
				tf.setText("");
			}

	}


	public static void main(String...args){
		new GridBagDemo();
	}
}
