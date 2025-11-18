import java.awt.event.*;
import java.awt.*;
class Lab7P2 implements ActionListener{
        Frame f= new Frame();
        Button b= new Button("Click");
        FlowLayout fl= new FlowLayout();
        TextField tf= new TextField(200);
        Label l=new Label();
        int a=1;
        Lab7P2(){
    	               f.setLayout(fl);
   	               b.setSize(200,200);
   	               l.setPreferredSize(new Dimension(100,100));
                            f.add(tf);
   	               f.add(b);
   	               f.add(l);
   	               f.setSize(400,500);
   	               f.setVisible(true);
   	               b.addActionListener(this);
   	               f.addWindowListener(new WindowAdapter(){
   	               public void windowsClosing(WindowEvent we){     
   	               f.dispose();
   	     }
   	  });          	          
      }
                
      public static void main(String...args){
             Lab7P2 p = new Lab7P2();
      }       	           
             public void actionPerformed(ActionEvent ae){
                    l.setText(tf.getText()+"-"+a);
                    a++;
             }           	          
}

