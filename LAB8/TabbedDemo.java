import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TabbedDemo extends JFrame{
     Label l;	
     TabbedDemo(){
     	super("Tabbed Pane");
     	JTabbedPane jtp =new JTabbedPane();
     	jtp.addTab("Tab 1",new Label("Tabbed Pane 1"));
     	jtp.addTab("Tab 2",new Label("Tabbed Pane 2"));	
     	jtp.addTab("Tab 3",new Label("Tabbed Pane 3"));		
     	add(jtp);
     	setVisible(true);
     	setSize(500,500);
     	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
     public static void main(String...args){
     	TabbedDemo td=new TabbedDemo();
     }
}     		
