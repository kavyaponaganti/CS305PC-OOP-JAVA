import java.awt.*;
import java.awt.event.*;

class Demo extends Frame implements ActionListener{
	MenuBar mb;
	Label l;
	//MenuItem mi;
	Demo(){
		super("Demonstration of Menubar");
		BorderLayout bl=new BorderLayout();		
		setLayout(bl);
		l=new Label();
		add(l);
		l.setAlignment(l.CENTER);
		l.setFont(new Font("Arial",Font.BOLD,20));
		mb=new MenuBar();
		setMenuBar(mb);
		
		String[] menu={"File","Edit","Help"};
		String[][] mi={{"Open","Save","Close"},
					{"Cut","Copy","Paste"},
					{"About","Update","Licence"}};
		
		int x=0,y=0;
		for(String s:menu){
			y=0;
			Menu m=new Menu(s);
			s=s.toLowerCase();
			for(int i=0;i<3;i++){
				MenuItem mmi=new MenuItem(mi[x][y]);
				mmi.addActionListener(this);
				m.add(mmi);
				y++;
			}
			x++;
			mb.add(m);
		}
		
		setSize(400,400);
		setVisible(true);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				dispose();
			}
		});
	}
	public void actionPerformed(ActionEvent ae){
		String mstr=ae.getActionCommand();
		if(mstr.equals("Close")){
			System.exit(0);
		}else{
			l.setText(mstr);
		}
	}
	public static void main(String...args){
		new Demo();
	}
}