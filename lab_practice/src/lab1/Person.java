package lab1;

import java.util.Scanner;
import java.util.Vector;

enum GENDER{
    B,
    G
}


public class Person {
    GENDER gender;

    public Person(GENDER gender) {
        this.gender = gender;
    }

    public GENDER getGender() {
        return gender;
    }

    public String toString() {
        return gender.toString();
    }



}