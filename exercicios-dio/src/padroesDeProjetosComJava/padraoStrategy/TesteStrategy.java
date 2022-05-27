package padroesDeProjetosComJava.padraoStrategy;

public class TesteStrategy {

    public static void main(String[] args) {

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        System.out.println("*** Caminhando ***");
        robo.setComportamentoStrategy(normal);
        robo.mover();
        robo.mover();
        System.out.println("*** Acho que vi alguma coisa estranha ***");
        robo.setComportamentoStrategy(defensivo);
        robo.mover();
        System.out.println("*** Correr..... ***");
        robo.setComportamentoStrategy(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.mover();
        robo.mover();
    }
}
