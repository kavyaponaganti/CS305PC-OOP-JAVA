import java.awt.*;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class LayoutDemo extends Frame{

		LayoutDemo(){
			super("BorderLayout Demo");
			setLayout(new BorderLayout());
			
			// Components
			Button bn = new Button("NORTH");
			add(bn,new BorderLayout().NORTH);

			Button bs = new Button("SOUTH");
			add(bs,new BorderLayout().SOUTH);

			Button be = new Button("EAST");
			add(be,new BorderLayout().EAST);

			Button bw = new Button("WEST");
			add(bw,new BorderLayout().WEST);

			Button bc = new Button("CENTER");
			bc.setBackground(Color.BLUE);
			bc.setForeground(Color.WHITE);

			add(bc,new BorderLayout().CENTER);

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
		
		public static void main(String...args){
			new LayoutDemo();
		}

}