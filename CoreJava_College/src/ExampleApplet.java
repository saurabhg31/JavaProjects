import java.awt.*;
import java.applet.*;
/*<applet code="example Applet.java" width=30 height=100</applet>*/
public class ExampleApplet extends Applet {
    String text;
    public void init()
    {
        setBackground(Color.white);
        setForeground(Color.red);
        text=("This is an example of applet: ");
        System.out.println("Initialized the applet: ");
    }
    public void start(){
        System.out.println("...Starting of applet: ");
    }
    public void stop(){
        System.out.println("...Stopping applet: ");
    }
    public void destroy(){
        System.out.println("...Exiting the applet: ");
    }
    public void paint(Graphics g){
        System.out.println("...Painting the applet: ");
        g.drawString("Welcome ", 60, 90);
    }
}
