package ArrayOfObject;

public class ArrayOfObject {
    public static void main(String[] args) {
        student[] arr;
        arr = new student[2];
        arr[0] = new student(52203111,"Joko Yuliyanto");
        arr[1] = new student(52203111,"Dhani Triyoga");

        System.out.println("Student data in student array 0 :");
        arr[0].display();

        System.out.println("Student data in studente array 1 :");
        arr[1].display();

    }
}

class student{
    public int id;
    public String name;

    student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void display(){
        System.out.println("Id siswa adalah : "+id+"\nDan nama siswa adalah : "+name);
        System.out.println();
    }
}

