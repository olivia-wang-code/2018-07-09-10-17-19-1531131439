package practice11;

public class Klass {
    private int number;
    private Student leader;
    public Klass(int number){
        this.number=number;
    }

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student student){
        this.leader=student;
    }
}
