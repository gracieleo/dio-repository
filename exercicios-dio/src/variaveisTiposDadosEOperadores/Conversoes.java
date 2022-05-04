package variaveisTiposDadosEOperadores;

/** conversões(casting) - aula 04
 *
 * Upcast (implicito) - não precisar dizer o tipo
 * Downcast (explicito) - dizer para qual tipo vai rebaixar
 *
 * */

public class Conversoes {

    public static void main(String[] args) {

        byte b1;
        short s1 = 1000;  // > que byte
        b1 = (byte) s1;   //downcast

        long l1;
        int i1 = 10; // < que long
        l1 = i1;   //upcast

        int i2;
        long l2 = 1000000000000000000L; // > que int
        i2 = (int) l2;  //downcast

        int i3;
        long l3 = 10000L; // > que int
        i3 = (int) l3;  //downcast

        double d1;
        float f1 = 10.5f; // < que double
        d1 = f1;  //upcast

        float f2;
        float f3;
        double d2 = 10000.58d; // > que float
        f2 = (float) d2;  //downcast
        double d3 = 10000.588888888888888888888888888888888888888888888888888888888888888888888888888888888888d;
        f3 = (float) d3;   //downcast

        int i4;
        float f4 = 11.5697f;// > que int
        i4 = (int) f4;  //downcast

        System.out.println("b1:" + b1);
        System.out.println("l1:" + l1);
        System.out.println("i2:" + i2);
        System.out.println("i3:" + i3);
        System.out.println("d1:" + d1);
        System.out.println("f2:" + f2);
        System.out.println("f3:" + f3);
        System.out.println("i4:" + i4);

        b1 = (byte) d3;  //downcast

        System.out.println("b1:" + b1);

        int i = 3;
        int j = 10 - 5 *2 + --i;

        System.out.println(j);

    }
}
