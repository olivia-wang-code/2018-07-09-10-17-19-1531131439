package practice04;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String basicIntroduce(){
        return "My name is "+this.name+". I am "+this.age+" years old.";
    }
    public String introduce(){
        return basicIntroduce();
    }
}
