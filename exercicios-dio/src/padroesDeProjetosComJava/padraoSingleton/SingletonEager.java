package padroesDeProjetosComJava.padraoSingleton;

/**
 * Singleton Eager = apressado
 */

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();//instancia é atribuida na chamada

    //garantir que ninguém vai instaciar
    private SingletonEager() {
        super();
    }

    //expõe
    public static SingletonEager getInstance(){
        return instancia;
    }
}
