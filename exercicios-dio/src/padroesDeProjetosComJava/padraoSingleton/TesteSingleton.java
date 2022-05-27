package padroesDeProjetosComJava.padraoSingleton;

public class TesteSingleton {
    public static void main(String[] args) {

        System.out.println("*** Singleton Lazy ***");
        SingletonLazy lazy = SingletonLazy.getInstance();       //acesso pela classe
        System.out.println(lazy);                              //devolve o endereço de memória
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        System.out.println("*** Singleton Eager ***");
        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        System.out.println("*** Singleton LazyHolder ***");
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);


    }
}
