package practice4.CatAndPerson;

public class Restaurant{
    boolean servePizza(CanHavePizza eater) {

        if (eater instanceof Person || eater instanceof Cat) {
            System.out.println("Processing payment...");
            eater.eatPizza();
        }

        return true;
    }
}
