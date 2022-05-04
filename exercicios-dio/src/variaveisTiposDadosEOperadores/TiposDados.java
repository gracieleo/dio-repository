package variaveisTiposDadosEOperadores;
/** tipos de dado - aula 02 */

public class TiposDados {

    public static void main(String[] args) {

        // numericos:

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000; excedeu tamanho máximo, deveria ser int

        //int i1 = -10000000000; muito infeerior ao que int suporta
        int i2 = 28500;

        long l1 = 1000000000000000000L;
        long l2 = 2004005000500055000L;

        //float f1 = 4.5; é double
        float f2 = 10.68F;

        double d1 = 85.69; //pode ou não ser seguido de 'D' ou 'd'
        double d2 = 99.04D;

        //textual:

        char c1 = 'W'; //usa aspas simples
        //char c2 = 'Tw'; aceita apenas 1 valor
        char c3 = '\u0057'; //unicode para W

        String st1 = "Fulano"; //usa aspas duplas
        String st2 = "Cicrano";
        String st3 = "ag dgb se  se et t KNBJBJBB &*¨&%& 75894389";

        //String dt1 = "09/02/1981";

        //logicos:

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(b1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);
    }
}
