package padroesDeProjetosComJava.subsistemaCep;


//modelo Singleton Eager

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "São Vicente";       //passando os dados mocados
    }

    public String recuperarEstado(String cep){
        return "São Paulo";        //passando os dados mocados
    }


}
