package Chapter9;

public class Person {
    //Constructor
    public Person(){
        System.out.println("Person Constructor ");

    }

    public Person(String name){
        System.out.println("Name is set ");
    }
    private String name ;
    private int age ;
    private String gender ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
