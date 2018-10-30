import javax.swing.*;

public class TrafficLight{

public static void main(String args[]){

    SwingUtilities.invokeLater(new Runnable(){
        @Override
        public void run() {
            TrafficFrame frame = new TrafficFrame();
            
        }
    });


}


}