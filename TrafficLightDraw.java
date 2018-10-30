import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class TrafficLightDraw extends JComponent{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    String activeLight = "red";
    Color go = Color.green;
    Color slow = Color.orange;
    Color stop = Color.red;

    public void paintComponent(Graphics g){

        /*draw a filled rectangle */
        g.setColor(Color.gray);
        g.fillRect(0, 0, 150, 250);
        
        /* draw a border */
        g.setColor(Color.black);
        g.drawRect(0, 0, 150, 250);
        
        g.setColor(stop);
        g.fillOval(50, 30, 50, 50);
        
        g.setColor(slow);
        g.fillOval(50, 100, 50, 50);
        
        g.setColor(go);
        g.fillOval(50, 170, 50, 50);
    }
    
public void changeColour(){
    
    /* set all to grey before change */
    go = slow = stop = Color.black;
    
        
         if (activeLight.equals("red")){
             activeLight = "green";
             go = Color.green;
         }else if (activeLight.equals("green")){
             activeLight = "yellow";
             slow = Color.orange;           
         }else{
             activeLight = "red";
             stop = Color.red;
         }
         
         repaint();

    }

    
}