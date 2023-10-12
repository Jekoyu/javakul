package Enkapsulasi;

public class EncapTest {
    private String name,IdNum;
    private int age;

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getIdNum(){
        return IdNum;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setIdNum(String newId){
        IdNum = newId;
    }

}
