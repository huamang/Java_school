import java.sql.SQLOutput;

public class Student {
    public String id;
    public String name;
    public double score;

    public Student(){;}
    public Student(String id,String name){
        this.id = id;
        this.name = name;
    }

    public void setScore(double score){
        this.score = score;
    }
    public double getScore(){
        return score;
    }

    public static void main(String[] args) {
        Student s1 = new Student("10001", "San Zhang");
        Student s2 = new Student("10002", "Si Li");
        s1.setScore(65);
        s2.setScore(56);
        System.out.printf("%s的学号为%s,成绩为：%.2f\n",s1.name,s1.id,s1.getScore());
        System.out.printf("%s的学号为%s,成绩为：%.2f",s2.name,s2.id,s2.getScore());
    }
}
