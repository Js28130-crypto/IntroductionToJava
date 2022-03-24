import java.util.*;

public class Test1 {
    String name;
    String lastname;

    public Test1(String name, String lastname, int age, char gender, String address, String phone) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    int getBorn() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int year = calendar.get(Calendar.YEAR);
        return year - age;
    }

    @Override
    public String toString() {
        return "Test1{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' + "ne vitin" + getBorn();
    }

    int age;
    char gender;
    String address;
    String phone;

    public static void main(String[] args) {
        List<Test1> personat = new ArrayList<>();

        Test1 firstPerson = new Test1("Jakup", "Sinani", 22, 'M', "sellarc", "4561648");
        personat.add(firstPerson);
        Test1 secondPerson = new Test1("Albin", "Sinani", 31, 'M', "sellarc", "4561648");
        personat.add(secondPerson);

        for (Test1 personi : personat) {
            System.out.println(personi);
        }


        //System.out.println((int)(Math.random()*4+1));
        //System.out.println((-24)%(-5));
        //    System.out.println(Math.pow(4,1.double x = 5.5;
        //int y = (int)x;
        //System.out.println("x is " + x + " and y is " + y);0/2));
        //System.out.println((int)(76.0252175 * 100) / 100);

        // long millis = System.currentTimeMillis();
        //System.out.println(millis); // prints a Unix timestamp in milliseconds
        //System.out.println(millis / 1000);

        //Calendar calendar = Calendar.getInstance();
        //calendar.setTimeInMillis(millis);
        //System.out.println(calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE));
    }
}
