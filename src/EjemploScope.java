public class EjemploScope {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int edad = 18;
        int cantidadPersonas = 2;

        
        boolean esPareja;
        if(cantidadPersonas > 1){
            esPareja = true;
        }else{
            esPareja = false;
        }
        boolean puedeEntrar = edad >= 18 && esPareja;

        if (puedeEntrar) {
            System.out.println("Puede Entrar");
            System.out.println("Bienvenido");
        } else {
            System.out.println("Usted no puede acceder");
        }

    }
}
