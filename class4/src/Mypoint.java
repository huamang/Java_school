public class Mypoint {
    double x;
    double y;

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public Mypoint(){;}
    public Mypoint(double x,double y){
        this.x = x;
        this.y = y;
    }

    public double distance(double a,double b){
        return Math.sqrt((a-x)*(a-x)+(b-y)*(b-y));
    }

    public static void main(String[] args){
        Mypoint p = new Mypoint(10.0,20.0);
        System.out.printf("与点（%.2f,%.2f）的距离为%.2f",p.getX(),p.getY(),p.distance(15.2,38.6));
    }


}



