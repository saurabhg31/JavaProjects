/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saurabh
 */
public class Room {
int l;
int b;
Room(int x,int y)
{
    l=x;
    b=y;
}
int area()
{
    return l*b;
}
}
class bd extends Room
{
    int h;
 bd(int x,int y,int z)
 {
  super(x,y);
  h=z;
 }
 int vol()
 {
     return(l*b*h);
}

  public static void main(String args[]){
  bd b=new bd(33,76,98);
  int a=b.area();
  int v=b.vol();
  System.out.println("Area = "+a);
  System.out.println("Volume = "+v);
 }
}