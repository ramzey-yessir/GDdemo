
public class Person {
    private int age;
    private String personAddress;

    public void setPersonAddress(String address){
        if (5 <= address.length() && address.length() <= 25)
            personAddress = address;
    }

    public String getPersonAddress(){
        return personAddress;
    }

    public void setAge(int newAge){
        if (newAge > 0 && newAge <= 120)
            age = newAge;
    }

    public int getAge(){
        return age;
    }

}


