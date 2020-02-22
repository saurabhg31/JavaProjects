import java.util.Scanner;
class cube{
    double side;
    void initialization(double r){
        side=r;
    }
        double volume(){
            return Math.pow(side, 3);
    }
}
public class SaCube{
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        double r=s.nextDouble();
        cube c=new cube();
        c.initialization(r);
        double ar=c.volume();
        System.out.println("Volume of the cube is: "+ar);
    }
}
