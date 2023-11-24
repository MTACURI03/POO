public class Estudiantes {
    //Atributos

    private String nombre;
    private int edad;
    //METODO CONSTRUCTOR
    private Estudiantes(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    //METODO SALUDAR
    private void saludar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    //MAIN
    public static void main(String[] args) {
        //CREACION DE OBJETOS
        Estudiantes estudiante_desarrollo = new Estudiantes("Mateo", 20);
        estudiante_desarrollo.saludar();
        Estudiantes estudiante_Redes = new Estudiantes("JUANITO",25);
        estudiante_Redes.saludar();
    }

}