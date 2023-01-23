public class TestIR {
    public static void main(String[] args) {
        double salario = 3300.0;
        if(salario >= 1900.0 && salario <= 2800.0){
            System.out.println("Su IR es de 7.5% y puede deducir de la declaración el monto de 142.");
        }
        if(salario >= 2800.01 && salario <= 3751.0){
            System.out.println("Su IR es de 15% y puede deducir de la declaración el monto de 350.");
        }
        if(salario >= 3751.01 && salario <= 4664.0){
            System.out.println("Su IR es de 22.5% y puede deducir de la declaración el monto de 636.");
        }
    }
}
