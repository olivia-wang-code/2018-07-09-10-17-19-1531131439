package practice09;

public class Student extends Person{
    public Klass klass;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {

        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (this.getKlass().getLeader()!=null && this.getKlass().getLeader().getName().equals(this.getName())) {
            return super.introduce() + " I am a Student. I am Leader of Class "+this.getKlass().getNumber()+".";
        }else {
            return super.introduce() + " I am a Student. I am at Class "+this.getKlass().getNumber()+".";
        }
    }
}
