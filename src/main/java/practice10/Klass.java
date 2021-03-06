package practice10;

public class Klass {
    public int number;

    public Student leader;

    public Student student;

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public Student getStudent() {
        return student;
    }

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
        if (this.getStudent()!=null && this.getStudent().equals(student)) {
            this.leader = student;
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        this.student = student;
    }
}
