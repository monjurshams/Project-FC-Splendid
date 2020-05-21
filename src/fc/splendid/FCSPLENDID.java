package JavaDB_001;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class FCSPLENDID extends JFrame{
    JLabel pic;
    Timer tm;
    int x = 0;


    //Images Path In Array
    String[] list = {
                      "C:/Users/Eternity/Documents/NetBeansProjects/FC SPLENDID/src/fc/splendid/images/f19.jpg",//0
                      "C:/Users/Eternity/Documents/NetBeansProjects/FC SPLENDID/src/fc/splendid/images/f1.jpg",//1
                      "C:/Users/Eternity/Documents/NetBeansProjects/FC SPLENDID/src/fc/splendid/images/f2.jpg",//2
                      "C:/Users/Eternity/Documents/NetBeansProjects/FC SPLENDID/src/fc/splendid/images/f3.jpg",//3
                      "C:/Users/Eternity/Documents/NetBeansProjects/FC SPLENDID/src/fc/splendid/images/f4.jpg",//4
                      "C:/Users/Eternity/Documents/NetBeansProjects/FC SPLENDID/src/fc/splendid/images/f5.jpg",//5
                      "C:/Users/Eternity/Documents/NetBeansProjects/FC SPLENDID/src/fc/splendid/images/1.jpg"//6
                    };
    
    public FCSPLENDID(){
        super("Java SlideShow");
        pic = new JLabel();
        pic.setBounds(100,90, 700, 300);



        //Call The Function SetImageSize
        SetImageSize(6);
        

       //set a timer
        tm = new Timer(1500,new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SetImageSize(x);
                x += 1;
                if(x >= list.length )
                    x = 0; 
            }
        });
        add(pic);
        tm.start();
        setLayout(null);
        setSize(1200, 800);
       
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    //create a function to resize the image 
    public void SetImageSize(int i){
        ImageIcon icon = new ImageIcon(list[i]);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        pic.setIcon(newImc);
    }

public static void main(String[] args){ 
      
    new FCSPLENDID();
}
}