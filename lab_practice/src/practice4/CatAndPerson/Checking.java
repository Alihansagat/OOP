package practice4.CatAndPerson;

public class Checking {
    public static void main(String[] args) {
        Restaurant delpapa = new Restaurant();

        Cat cat = new Cat();
        Person person = new Person("Alikhan");

        delpapa.servePizza(cat);
        delpapa.servePizza(person);

        Person st = new Student("Kanagat");
        delpapa.servePizza(st);
        st.dance();
        st.retakeExam();
        st.move();

    }

}