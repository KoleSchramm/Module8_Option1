public class Person {
    String firstName;
    String lastName;
    String age;

    public Person(){
        firstName = "";
        lastName = "";
        age = "";
    }

    public Person(String firstName, String lastName, String age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(String age){
        this.age = age;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getAge(){
        return age;
    }
}
