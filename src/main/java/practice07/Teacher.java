package practice07;

import practice06.Person;

public class Teacher extends Person {
    private Klass klass;
    public Teacher(String name,int age,Klass klass){
        super(name,age);
        this.klass=klass;
    }
    public Teacher(String name,int age){
        super(name,age);
        this.klass=klass;
    }
    public Klass getKlass() {
        return klass;
    }
    public String introduce(){
        if(klass==null){
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
        return super.introduce()+" I am a Teacher. I teacher Class ."+this.klass;
    }
    public String introduceWith(Student student){
        if(student.getKlass().getNumber()==this.klass.getNumber()){
            return super.introduce()+" I am a Teacher. I teach "+student.getName()+".";
        }
        return super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
    }
}