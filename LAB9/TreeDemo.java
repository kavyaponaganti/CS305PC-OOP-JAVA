import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
class TreeDemo extends JFrame{
      TreeDemo(){
      	super("TreeDemo");
      	DefaultMutableTreeNode dmtn=new DefaultMutableTreeNode("Fruits");
          dmtn.add(new DefaultMutableTreeNode("Apple"));
          dmtn.add(new DefaultMutableTreeNode("kivi"));
          dmtn.add(new DefaultMutableTreeNode("Mango"));
          dmtn.add(new DefaultMutableTreeNode("Pine Apple"));
          JTree jt=new JTree(dmtn);
      	add(jt);
      	setVisible(true);
      	setSize(500,500);
      	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }	
     public static void main(String...args){
     	new TreeDemo();
     }
}     		
