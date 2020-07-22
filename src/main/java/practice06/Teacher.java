package practice06;

public class Teacher extends Person{
    private Integer klass;
    public Teacher(String name,int age,Integer klass){
        super(name,age);
        this.klass=klass;
    }
    public Teacher(String name,int age){
        super(name,age);
        this.klass=klass;
    }
    public int getKlass() {
        return klass;
    }
    public String introduce(){
        if(klass==null){
            return super.introduce()+" I am a Teacher. I teacher No Class.";
        }
        return super.introduce()+" I am a Teacher. I teacher Class "+this.klass+".";
    }
}
