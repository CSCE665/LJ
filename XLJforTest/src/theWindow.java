import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class theWindow extends JFrame{
	
	private JSlider slider;
	private test mypanel;
	
	public theWindow(){
		super("The title");
		mypanel = new test();
		mypanel.setBackground(Color.orange);
		
		slider = new JSlider(SwingConstants.HORIZONTAL, 0,200,10);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		
		slider.addChangeListener(
				new ChangeListener(){
					public void stateChanged(ChangeEvent e){
						mypanel.setD(slider.getValue());
					}
				}
				);
		add(slider,BorderLayout.SOUTH);
		add(mypanel,BorderLayout.CENTER);
	}

}

