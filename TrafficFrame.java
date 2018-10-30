import javax.swing.*;

public class TrafficFrame extends JFrame {
    
    private TrafficPanel panel;

 /**
     * 
     */
    private static final long serialVersionUID = 1L;

public TrafficFrame(){
     super();
     /*set up frame properties */
    setTitle("This is a traffic Light");
 

    /* add panel to frame */
    TrafficPanel panel = new TrafficPanel();
    add(panel);

		setSize(250, 350);
		// centered on screen
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

 }

 public void Timer(){
     try{
         Thread.sleep(1000);
     }catch(Exception e){
     }
 }

public TrafficPanel getPanel() {
    return panel;
}

public void setPanel(TrafficPanel panel) {
    this.panel = panel;
}
    
}