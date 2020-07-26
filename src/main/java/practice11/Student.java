package practice11;

public class Student extends Person{
    private Klass klass;
    public Student(String id,String name,int age,Klass klass){
        super(name,id,age);
        this.klass=klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce(){
        if(this.getKlass().getLeader()!=null&&this.getKlass().getLeader().getName().equals(this.getName()){
            return
        }
        return super.introduce()+" I am a Student. I am at Class "+this.klass+" .";
    }
}
//My name is Tom. I am 21 years old. I am a Student. I am Leader of Class 2.
