
package mothersday;
import valentinesday.Heart;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import sun.audio.*;    //import the sun.audio package
import  java.io.*;
import java.net.*;
import java.io.*;
import java.util.*;



public class MothersDay {  
    
        
  /* public void actionPerformed(ActionEvent e){
  MothersDay();
    
   }*/
         public void MothersDay(){
             
             try{
                 
InputStream in = new FileInputStream("C:\\Users\\Teon\\Documents\\NetBeansProjects\\MothersDay\\DearMama.mp3.mp3");
// Create an AudioStream object from the input stream.
AudioStream as = new AudioStream(in);         
// Use the static class member "player" from class AudioPlayer to play
AudioPlayer.player.start(as);            
// Similarly, to stop the audio.
AudioPlayer.player.stop(as); 
  
    }catch(Exception e){
        System.out.println(e);
    }
             
         }

   public static void main (String [] args){
      JFrame frame = new JFrame();
      
      //JPanel panel = new JPanel();
      JLabel label = new JLabel("I Love You!");   
      frame.setTitle("Happy Mother's Day"); // setting the title
      frame.setSize(700,600);
      frame.setLayout(null);
      frame.add(label);
      label.setBounds(265,150,200,200);
      label.setForeground(Color.RED);
      label.setFont(new Font("Serif", Font.PLAIN, 35));
      Heart heart = new Heart();
     
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      
      heart.setBounds(100,50,600,600);
      frame.getContentPane().add(heart);
    //  Beginning go = new Beginning();
            
   
   }
}

 class Heart extends JPanel{
     
     @Override
    public void paint(Graphics g){
        super.paint(g);
       //  int [] xPos = {160, 160,180 ,180};
        //int [] yPos = {0, 20, 20,0};

        Graphics2D g2D = (Graphics2D)g;
      
        g2D.setColor(Color.GREEN);
        
       // g2D.fillPolygon(getXPos(), getYPos(),4);
              //  g.fillPolygon(xPos, yPos,4);

       // Graphics2D g2D = (Graphics2D)g;
        g2D.setColor(Color.pink); 
        g2D.fillOval(107,80,150, 150);
     g2D.fillOval(230,80,150,150);
        g2D.setColor(Color.white);
        g2D.setColor(Color.PINK);
        int [] xPos = {245, 118, 365};
        int [] yPos = {395, 192, 200};
        g2D.setColor(Color.pink);
        g.fillPolygon(xPos, yPos,3);
        
    }
 }
