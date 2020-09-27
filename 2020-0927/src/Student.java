/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -09 -27
 * Time: 20:28
 */
public class Student {
    private String name;
    private int grade;
    private double score;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", score=" + score +
                '}';
    }

    public Student(String name, int grade, double score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }
    /*public Student(String name,int grade,double score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }*/
}
