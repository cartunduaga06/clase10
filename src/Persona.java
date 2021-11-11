import java.util.Objects;

public class Persona {


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return name.equals(persona.name) && surname.equals(persona.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    private String name;
    private String surname;

    public Persona(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
