class triangle{
    private int a;
    private int b;
    private int c;
    private static int num = 0;

    private triangle(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
        num++;
    }

    public static triangle creat(int a,int b,int c)	{

        if(limit(a,b,c) && num <3){
            triangle obj = new triangle(a,b,c);
            System.out.println("success!");
            return obj;

        }
        else if(limit(a,b,c) == false){
            System.out.println("Wrong!");
            return null;
        }
        else{
            System.out.println("Only 3 triangles");
            return null;
        }
    }

    static Boolean limit(int a,int b,int c){
        if(a + b > c && a + c > b && b + c > a)
            return true;
        else
            return false;
    }

    Boolean setEdges(int x,int y,int z){
        if(limit(x,y,z)){
            this.a = x;
            this.b = y;
            this.c = z;
            System.out.println("Exchanged");
            return true;
        }
        else{
            System.out.println("Wrong!");
        }
        return false;

    }

}

class Work3{
    public static void main(String[] args){

        triangle one = triangle.creat(3,4,5);
        triangle two = triangle.creat(1,2,3);
        triangle three = triangle.creat(6,8,10);

        System.out.println(three.setEdges(7,8,9));
        System.out.println(three.setEdges(5,15,4));

        triangle four = triangle.creat(6,6,6);
        triangle five = triangle.creat(5,12,13);

    }

}