package practice11;
public class Person {
    private String name;
    private String id;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name,String id,int age) {
        this.name = name;
        this.age=age;
        this.id=id;
    }


    public String introduce(){
        return "My name is "+this.name+". I am "+this.age+" years old.";
    }

}
