package practice08;


public class Teacher extends Person{
    public Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (this.klass == null) {
            return  super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            return  super.introduce() + " I am a Teacher. I teach Class "+this.getKlass().getNumber()+".";
        }
    }

    public String introduceWith(Student student) {
        if (this.klass.getNumber() == student.getKlass().getNumber()) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        } else {
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }

}
