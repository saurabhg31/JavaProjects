import java.awt.*;
import java.applet.*;
/*<applet code="LineDraw.java" width=300 height=100</applet>*//*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saurabh's
 */
public class LineDraw extends Applet{
    public void paint(Graphics g){
        g.drawLine(10, 10, 50, 50);
        g.drawRect(50, 50, 10, 8);
        g.drawOval(60, 15, 20, 36);
        g.fillRect(5, 50, 10, 8);
        g.fillOval(60, 15, 20, 36);
        setBackground(Color.blue);
        setForeground(Color.white);
        showStatus("Welcome: ");
        g.setFont(new Font("Arial",Font.BOLD,14));
        g.drawString("Welcome: ", 150, 150);
        g.getColor();
        g.getFont();
    }
}
