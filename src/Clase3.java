public class Clase3 {
    //ATRIBUTOS
    public int cedula;
    public String nombre;
    public int edad ;
    //METODO CONTRUCTOR
    public Clase3(int cedula,String nombre, int edad){
        this.nombre = nombre;
        this.cedula=cedula;
        this.edad=edad;
    }
    //METODO SALUDAR
    public void saludar() {
        System.out.println("Hola " + nombre);
    }
    public static void main(String[] args) {
        //CREACION DE LOS OBJETOS
        Clase3 persona1 = new Clase3(123456789,"Mateo",20);
        Clase3 persona2=new Clase3(987456321,"Juan",18);
        System.out.println("el nombre es "+persona1.nombre);
        System.out.println("la cedula es "+persona1.cedula);
        System.out.println("la edad  es "+persona1.edad);
        //LLAMADA  A LOS METODOS
        persona1.saludar();
        System.out.println("la segunda persona es :");
        System.out.println("el nombre es "+persona2.nombre);
        System.out.println("la cedula es "+persona2.cedula);
        System.out.println("la edad  es "+persona2.edad);
        persona2.saludar();
    }
}
