package practice03;

public class Student {
    private String name;
    private int age;
    private int classNUmber;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getKlass() {
        return classNUmber;
    }

    public Student(String name, int age, int classNUmber){
        this.name=name;
        this.age=age;
        this.classNUmber=classNUmber;
    }
    public String introduce(){
        return "I am a Student. I am at Class "+this.classNUmber+".";
    }
    
}
