package contact;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {
    String name;
    String phone;
    String address;
    String mark;

    public Person(String name, String phone, String address, String mark) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(phone, person.phone) &&
                Objects.equals(address, person.address) &&
                Objects.equals(mark, person.mark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, phone, address, mark);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", mark='" + mark + '\'' +

                '}';
    }


}
