class Point2D{
    int x;
    int y;
    public Point2D(){;}
    public Point2D(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance(int a,int b){
        return Math.sqrt((x-a)*(x-a)+(y-b)*(y-b));
    }
}

class Point3D extends Point2D{
    int z;
    public Point3D(){;}
    public Point3D(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
    public double distance(int a,int b,int c){
        return Math.sqrt((x-a)*(x-a)+(y-b)*(y-b)+(z-c)*(z-c));
    }
}


public class Work2 {
    public static void main(String[] args){
        Point2D a1 = new Point2D(1,1);
        System.out.println(a1);
        System.out.println(a1.distance(2,2));

        Point3D a2 = new Point3D(1,1,1);
        System.out.println(a2);
        System.out.println(a2.distance(2,2,2));
    }
}
