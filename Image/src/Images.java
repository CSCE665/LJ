import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Images extends JFrame{
	public static void main(String[] args){
		DisplayMode dm = new DisplayMode(800,600,16,DisplayMode.REFRESH_RATE_UNKNOWN);
		Images i = new Images();
		i.run(dm);
	}
	
	private Screen s;
	private Image bg;
	private Image pic;
	private boolean loaded;
	
	public void run(DisplayMode dm){
		setBackground(Color.PINK);
		setForeground(Color.WHITE);
		setFont(new Font("Arial",Font.PLAIN,24));
		loaded = false;
		
		Screen s = new Screen();
		try{
			s.setFullScreen(dm, this);
			loadpics();
			try{
				Thread.sleep(5000);
			}catch(Exception ex){}
		}finally{
			s.restoreScreen();
		}
		
	}
	public void loadpics(){
		bg = new ImageIcon("C:\\1277_Java\\IMG_0009.JPG").getImage();
		pic = new ImageIcon("C:\\1277_Java\\xlj.png").getImage();
		loaded = true;
		repaint();
	}
	
	public void paint(Graphics g){
	  if(g instanceof Graphics2D){
			Graphics2D g2 = (Graphics2D) g;
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		}
		if(loaded){
			g.drawImage(bg, 0,0,null);
			g.drawImage(pic,170,180,null);
		}
	}
}


