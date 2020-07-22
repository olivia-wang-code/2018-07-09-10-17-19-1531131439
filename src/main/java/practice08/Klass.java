package practice08;

public class Klass {
    public int number;

    public Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {

        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public void setStudent(Student leader) {
        this.leader = leader;
    }

    public String getDisplayName() {
        return "Class "+this.number;
    }

    public void assignLeader(Student student) {
        this.leader = student;
    }
}
