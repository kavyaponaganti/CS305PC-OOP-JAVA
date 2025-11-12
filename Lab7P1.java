import java.awt.event.*;
import java.awt.*;
class Lab7P1{
         public static void main(String...args){
                 final int[] count={0};  
    	    Frame f= new Frame();
    	    FlowLayout fl= new FlowLayout();
    	    f.setLayout(fl);
   	    TextField tf= new TextField(200);
   	    Button b= new Button("Click");
   	    b.setSize(200,200);
   	    Label l= new Label();
   	    l.setPreferredSize(new Dimension(100,100));
                 f.add(tf);
   	    f.add(b);
   	    f.add(l);
   	    f.setSize(400,500);
   	    f.setVisible(true);
   	    f.addWindowListener(new WindowAdapter(){
   		@Override
   		public void windowClosing(WindowEvent we){
   			f.dispose();
   		}
                });
                b.addActionListener(new ActionListener(){
                	@Override
                	        public void actionPerformed(ActionEvent ae){
                	               System.out.println(tf.getText()+"-"+count[0]);
                	               count[0]++;
                	        }       
                	});                	       
       }   
}
