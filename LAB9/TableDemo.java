import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TableDemo extends JFrame{
     Label l;	
     TableDemo(){
     	super("Table Pane");
     	String[] heading={"Pin","Name","Subject"};
     	String[][]data={
     		     {"519","kavya","java"},
     		     {"518","sony","cosm"},
     		     {"520","nithya","de"}
     		     };
     	JTable jt=new JTable(data,heading);
     	JScrollPane jsp=new JScrollPane(jt);
     	add(jsp);
     	setVisible(true);
     	setSize(500,500);
     	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
     public static void main(String...args){
     	new TableDemo();
     }
}     		
