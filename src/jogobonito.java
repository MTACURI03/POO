public class jogobonito {
    //ATRIBUTOS
    public int añofundacion;
    public String tipo;
    public String nombrejuego;

    public int numjugadores;
    public int nombreusuario;
    //METODO CONSTRUCTOR
    public jogobonito(int numjugadores, String tipo, int añofunacion, String nombrejuego) {
        this.nombrejuego = nombrejuego;
        this.numjugadores = numjugadores;
        this.añofundacion = añofunacion;
        this.tipo = tipo;
    }
    //METODO SALUDAR
    public void saludar() {
        System.out.println("Hola Usuario estas en la consola Play Station");
    }
    //METODO NOMINACION
    public void nominacion() {
        System.out.println("El juego de tu preferencia ha sido nominado al GOTY ");
    }
    //METODO NO NOMINADO
    public void nonominado() {
        System.out.println("El juego de tu preferencia no ha sido nominado al GOTY ");
    }
    //MAIN
    public static void main(String[] args) {
        //CREACION DE OBJETOS
        jogobonito juego1 = new jogobonito(1, "Survival Horror", 2013, "The last of Us");
        jogobonito juego2 = new jogobonito(1, "Survival Horror", 2005, "Resident Evil");
        jogobonito juego3 = new jogobonito(4, "Futbol", 2023, "FIFA 23");
        //IMPRESION DE OBJETOS
        System.out.println("El nombre del juego es :" + juego1.nombrejuego);
        System.out.println("El tipo de juego es :" + juego1.tipo);
        System.out.println("El año de fundacion del juego es :" + juego1.añofundacion);
        System.out.println("El numero de jugadores para el juego es :" + juego1.numjugadores);
        //LLAMADA DE LOS METODOS
        juego1.saludar();
        juego1.nominacion();
        System.out.println("El nombre del juego es :" + juego2.nombrejuego);
        System.out.println("El tipo de juego es :" + juego2.tipo);
        System.out.println("El año de fundacion del juego es :" + juego2.añofundacion);
        System.out.println("El numero de jugadores para el juego es :" + juego2.numjugadores);
        juego2.saludar();
        juego2.nominacion();
        System.out.println("El nombre del juego es :" + juego3.nombrejuego);
        System.out.println("El tipo de juego es :" + juego3.tipo);
        System.out.println("El año de fundacion del juego es :" + juego3.añofundacion);
        System.out.println("El numero de jugadores para el juego es :" + juego3.numjugadores);
        juego3.saludar();
        juego3.nonominado();
    }
}