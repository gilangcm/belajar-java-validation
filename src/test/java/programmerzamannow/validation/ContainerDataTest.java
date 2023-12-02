package programmerzamannow.validation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ContainerDataTest extends AbstractValidatorTest{

    @Test
    void testContainerData() {

        Person person = new Person();
        person.setFirstName("Gilang");
        person.setLastName("Maulana");
        person.setAddress(new Address());
        person.getAddress().setCity("Bandung");
        person.getAddress().setCountry("Indonesia");
        person.getAddress().setStreet("hiyahiyah");

        person.setHobbies(new ArrayList<>());
        person.getHobbies().add("");
        person.getHobbies().add("   ");
        person.getHobbies().add("Gaming");

        validate(person);

    }
}
