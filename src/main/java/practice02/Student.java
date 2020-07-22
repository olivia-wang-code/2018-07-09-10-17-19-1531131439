package practice02;

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
        return "My name is Tom. I am "+this.age+" years old.";
    }
    
}
