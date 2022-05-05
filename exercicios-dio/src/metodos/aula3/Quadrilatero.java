package metodos.aula3;

public class Quadrilatero {

    //Retornos de métodos compativeis com os parametros do método

    //quadrado
    public static double area(double lado) {
        return lado * lado;
    }

    //retangulo
    public static double area(double lado1, double lado2) {
        return lado1 * lado2;
    }

    //trapezio
    public static double area(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior+baseMenor)*altura) / 2;
    }

    //void
    public static void xpto() {
        System.out.println("Antes");
        return;
    }

    //compatibilidade
    public static double abc() {
        return 1.6;
    }
}
