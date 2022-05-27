package padroesDeProjetosComJava.padraoFacade;

import padroesDeProjetosComJava.subsistemaCep.CepApi;
import padroesDeProjetosComJava.subsistemaCrm.CrmService;

/**
 * Facade - prover uma interface que reduza a complexidade nas integrações com subsistemas.
 */

public class Facade {

    public void migrarCliente(String nome, String cep){

        //recuperar os dados a partir da CepApi
       String cidade = CepApi.getInstance().recuperarCidade(cep);
       String estado = CepApi.getInstance().recuperarEstado(cep);

        //preciso gravar estado e cidade mas não tenho então vamos usar a CepApi
        CrmService.gravarCliente(nome, cep, estado, cidade);
    }
}
