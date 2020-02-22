
import java.util.Scanner;

class square{
    double side;
    void initialization(double r){
        side=r;
    }
        double area(){
            return Math.pow(side, 2);
    }
}
public class SaSquare{
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        double r=s.nextDouble();
        square c=new square();
        c.initialization(r);
        double ar=c.area();
        System.out.println("Area of the square is: "+ar);
    }
}
