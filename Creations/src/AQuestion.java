
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saurabh
 */
//Book Question Solved and corrected. Page Number :- 250, Question Number :- 5
public class AQuestion {
public void method(StringBuffer sb){
    System.out.println("StringBuffer Version");
}
public void method(String s){
    System.out.println("String Version");
}
public static void main(String args[]){
    AQuestion q=new AQuestion();
    System.out.println(q);
    JOptionPane.showMessageDialog(null, q);
}
}
