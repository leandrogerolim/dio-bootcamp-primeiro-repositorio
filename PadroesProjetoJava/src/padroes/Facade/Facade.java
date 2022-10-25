package padroes.Facade;

import padroes.Facade.Subsistema2.CepApi;
import padroes.Facade.subSistema1.CrmService;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);


        CrmService.gravarCliente(nome,cep,cidade,estado);
    }

}
