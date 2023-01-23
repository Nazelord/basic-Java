public class EjemploCondicionales {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int edad = 8;
        int cantidad = 1;

        if(edad >= 18){
            System.out.println("Puede Entrar");
            System.out.println("Bienvenido");
        }
        else{
            if(cantidad >= 2)
                System.out.println("Es Menor de edad pero esta acompañado");
            else
                System.out.println("Usted no puede acceder");
        }

    }
}
