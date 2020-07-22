package practice04;

public class Student extends Person{
    private int classNUmber;
    public Student(String name,int age,int classNUmber){
        super(name,age);
        this.classNUmber=classNUmber;
    }
    
    public int getKlass() {
        return classNUmber;
    }
    public String introduce(){
        return super.introduce()+" I am a Student. I am at Class "+this.classNUmber+".";
    }
}
