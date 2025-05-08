import pl.pp.Person;

public class mojaSiodmaAplikacja {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.hiToAll();

        person1.forename = "Name";
        person1.surname = "Surname";
        person1.age = 24;
        person1.address = "Cityname";
        person1.birthYear = 2001;

        person1.hiToAll();

        Person person2 = new Person("Name", "Surname", 42);
        person2.address = "cityname2";
        person2.birthYear = 1983;

        person2.hiToAll();

        person1.growOld(10);
        person2.growOld(10);

        person1.hiToAll();
        person2.hiToAll();

        person2.beYounger();
        person2.hiToAll();

        System.out.println(person1.getName());
        person1.setName("Person_1_aged");
        System.out.println(person1.getName());
        person1.hiToAll();
    }
}
