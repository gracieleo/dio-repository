package padroesDeProjetosComJava.padraoSingleton;

public class SingletonLazyHolder {

    //acessa a instancia pelo Holder
    private static class IntanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }


    //garantir que ninguém vai instaciar
    private SingletonLazyHolder() {
        super();
    }

    //acesso
    public static SingletonLazyHolder getInstance(){
        return IntanceHolder.instancia;
    }
}
