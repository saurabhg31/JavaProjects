import java.util.Scanner;
class circle{
    double side;
    void initialization(double r){
        side=r;
    }
        double area(){
            return Math.PI*Math.pow(side, 2);
    }
}
public class SaCircle{
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        double r=s.nextDouble();
        circle c=new circle();
        c.initialization(r);
        double ar=c.area();
        System.out.println("Area of the circle is: "+ar);
    }
}
