
public class ApplicationDriver {

    boolean enrolled = true;
    public static void main(String[] args) {
        Person tania = new Person();

        tania.setAge(21);
        tania.setPersonAddress(" 11 ");
        System.out.println("Tania is " + tania.getAge() + " years old.");
        System.out.println("Tania's address is " + tania.getPersonAddress() );
        System.out.println("abcd".compareTo("abCd"));
        System.out.println((double) (24/5));
//        System.out.println(0<=20<30);
    }
}


