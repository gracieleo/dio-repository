package padroesDeProjetosComJava.padraoStrategy;

public class Robo {

    private Comportamento comportamentoStrategy;

    public void setComportamentoStrategy(Comportamento comportamentoStrategy) {
        this.comportamentoStrategy = comportamentoStrategy;
    }

    public void mover(){
        comportamentoStrategy.mover();
    }
}