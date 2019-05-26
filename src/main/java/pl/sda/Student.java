package pl.sda;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Student extends Person {

    private Integer indexNumber;

    @Override
    public String toString() {
        return this.getClass().getName() +" " + getFirstName() + " " + getLastName() + " " + getIndexNumber();
    }
}
