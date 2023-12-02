package programmerzamannow.validation;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

public class Person {


    private List<@NotBlank(message = "hobby cannot blank") String> hobbies;

    @NotBlank(message = "First name cannot blank")
    @Size(max = 20, message = "First name length max must 20 characters")
    private String firstName;

    @NotBlank(message = "Last name cannot blank")
    @Size(max = 20, message = "Last name length max must 20 characters")
    private String lastName;
    @NotNull(message = "Address cannot null")
    @Valid
    private Address address;

    @Valid
    public Person() {
    }

    @Valid
    public Person(@NotBlank(message = "First name cannot blank") String firstName,
                  @NotBlank(message = "Last name cannot blank")String lastName,@NotNull(message = "Address cannot null") @Valid  Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public void sayHello(@NotBlank(message = "name cannot blank") String name) {
        System.out.println("Hello " + name + ", my name is " + firstName);
    }

    @NotBlank(message = "fullname cannot blank")
    public String fullName() {
        return firstName + " " + lastName;
    }
}
