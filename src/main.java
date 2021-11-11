

public class main {


    public static void main(String[] args) {
        Persona persona =  new Persona("carlos", "artunduaga");
        Persona persona2 =  new Persona("andres", "murillo");

        System.out.println(persona);
        System.out.println(persona.hashCode());
        System.out.println(persona.equals(persona2));
        System.out.println(persona.getClass().getName());
        Empleado empleado = new Empleado();
        System.out.println(empleado.getClass().getName());
    }







}
