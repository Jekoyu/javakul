package AOB;

public class Person {
    String name;
    int age;

    public Person (String name,int age){
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void tampil(){
        System.out.println("Nama \t: " + getName());
        System.out.println("Age \t: "+ getAge());
    }
}
