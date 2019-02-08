
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) {
        Person person1 = new Person("Leon", "Hunter");
        Person person2 = new Person("John", "Doe");
        Person person3 = new Person("Sravani", "Vedam");
        Person[] personArray = new Person[]{person1, person2, person3};

        PersonHandler personHandler = new PersonHandler(personArray);

        String result = personHandler.forEachLoop();
        System.out.println(result);
    }
}
