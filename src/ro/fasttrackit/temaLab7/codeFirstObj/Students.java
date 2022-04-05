package ro.fasttrackit.temaLab7.codeFirstObj;

public class Students {
    public static void main(String[] args) {

        Person studentOne = new Person("Marius", 25, false);
        Person studentTwo = new Person("Adrian", 50, true);
        Person studentThree = new Person("Maria", 29, true);

        printPerson(studentOne);
        printPerson(studentTwo);
        printPerson(studentThree);

    }
    public static void printPerson(Person person) {
        System.out.println("Student name is " + person.getName() + ", age is: " + person.getAge() + ", is married: " + person.isMarried());
    }
}
