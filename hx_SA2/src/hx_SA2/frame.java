package hx_SA2;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class frame extends JFrame{
	public frame (panel Panel)
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 200);
		this.setTitle("Frame Demo");
		this.add(Panel);
		this.setResizable(false);
		this.setVisible(true);
		}
	public static void main(String[] args)
	{
		panel Panel = new panel();
		frame Frame = new frame(Panel);
	}

}
