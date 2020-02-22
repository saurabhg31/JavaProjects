/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saurabh
 */
public class My_First {
String b="";
static My_First x;
My_First() //constructor
{b="ONE WORLD";
}
String d() //method
{
    return b;
}
public static void main(String args[])//main function
{
    My_First P=new My_First();
    System.out.println(P.d());
}
}
