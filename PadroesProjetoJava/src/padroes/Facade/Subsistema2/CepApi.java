package padroes.Facade.Subsistema2;



public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi()    {
        super(); //chamada da classe pai
    }

    public static CepApi getInstance(){
        return instancia;

    }
    public String recuperarCidade(String cep){
        return "Campo Grande";

    }
    public String recuperarEstado(String cep){
        return "MS";
    }
}
