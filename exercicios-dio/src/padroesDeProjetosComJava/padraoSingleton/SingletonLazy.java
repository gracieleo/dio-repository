package padroesDeProjetosComJava.padraoSingleton;

/**
 * Singleton - permite a criação de uma única instância de uma classe e fornece um modo
 * para recuperá-la.
 */

public class SingletonLazy {

    private static SingletonLazy instancia;

    //garantir que ninguém vai instaciar
    private SingletonLazy() {
        super();
    }

    //expõe
    //1ª verifica
    public static SingletonLazy getInstance(){
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
