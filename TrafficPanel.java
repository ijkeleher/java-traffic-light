import java.awt.Dimension;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.JButton;


public class TrafficPanel extends JPanel{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    /*global that we'll be using to change the light colour */
    TrafficLightDraw light = new TrafficLightDraw();


    public TrafficPanel(){

    /* creating a new Jbutton called changebutton with the text "Switch" */
    JButton changeButton = new JButton("Switch");
    
    ButtonListener l = new ButtonListener();
    changeButton.addActionListener(l);

    /*set size of light */
    light.setPreferredSize(new Dimension(160,260));

    /* add changebutton to the panel */
    this.add(changeButton);
    this.add(light);
    
    }
    
    class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            light.changeColour();
            
        }
        
    }
    
    
}
