public class QuadraticEquation {
    double a;
    double b;
    double c;

    public QuadraticEquation(){;}
    public QuadraticEquation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant(){
        return b*b-4*a*c;
    }

    public double getRoot1(){
        if (this.getDiscriminant() < 0){
            return 0;
        }
        else{
            //利用求根公式
            return (-b+Math.sqrt(this.getDiscriminant()))/(2*a);
        }
    }

    public double getRoot2(){
        if (this.getDiscriminant() < 0){
            return 0;
        }
        else{
            //利用求根公式
            return (-b-Math.sqrt(this.getDiscriminant()))/(2*a);
        }
    }

    public static void main(String[] args){
        QuadraticEquation a = new QuadraticEquation(2,3,1);
        System.out.println(a.getDiscriminant());
        System.out.printf("方程的两个根为%.2f和%.2f",a.getRoot1(),a.getRoot2());
    }



}
