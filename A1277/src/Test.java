import java.awt.*;
import java.applet.*;
import java.applet.Applet;

public class Test extends Applet{
	String str1 = new String();
	int il = 0;
	Label l1;
	Label l2;
	Label l3;
	public void init(){
		l1 = new Label();
		l2 = new Label("Label 2");
		l3 = new Label("Label 3",Label.CENTER);
		this.add(l1);
		this.add(l2);
		this.add(l3);
	}
	public void start(){
		l1.setText("Label 1");
		str1 = l2.getText();
		il = l3.getAlignment();
		repaint();
	}
	public void paint(Graphics g){
		g.drawString("The test of the second object is: "+str1, 40,60);
		g.drawString("The way of the alignment of the third label is: "+il, 40, 80);
	}
}