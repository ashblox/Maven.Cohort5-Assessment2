package rocks.zipcode.assessment2.objectorientation;

import java.util.Objects;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    private Long id;
    private String name;
    private Address address;

    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Person() {
        this.id = Long.MIN_VALUE;
        this.name = "";
        this.address = new Address();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
        return true;
    }

        if (!(o instanceof Person)) {
            return false;
        }

        Person p = (Person) o;
        return Objects.equals(id, p.id) && Objects.equals(name, p.name) && Objects.equals(address, p.address);
    }

    @Override
    public String toString() {
        return String.format("Person{id=%s, name='%s', address=%s}", id, name, address.toString());
    }

}