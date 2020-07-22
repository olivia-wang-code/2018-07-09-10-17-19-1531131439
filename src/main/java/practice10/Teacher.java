package practice10;

import java.util.LinkedList;
import java.util.StringJoiner;

public class Teacher extends Person {

    LinkedList<Klass> linkedList = new LinkedList<>();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        super(id, name, age);
        this.linkedList = linkedList;
    }

    public LinkedList<Klass> getLinkedList() {
        return linkedList;
    }

    public void setLinkedList(LinkedList<Klass> linkedList) {
        this.linkedList = linkedList;
    }

    public LinkedList<Klass> getClasses() {
        return linkedList;
    }

    public boolean isTeaching(Student student) {
        for(Klass klass: this.getClasses()) {
            if(klass.getNumber() == student.getKlass().getNumber()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String introduce() {
        if (this.getClasses().size() == 0) {
            return  super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            StringJoiner stringJoiner = new StringJoiner(", ");
            for (Klass klass : this.getClasses()) {
                stringJoiner.add(String.valueOf(klass.getNumber()));
            }
            return  super.introduce() + " I am a Teacher. I teach Class "+ stringJoiner.toString() +".";
        }
    }

    public String introduceWith(Student student) {
        if (isTeaching(student)) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        } else {
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }

}
