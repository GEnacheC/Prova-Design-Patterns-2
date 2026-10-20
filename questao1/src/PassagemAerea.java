

import java.util.List;

public class PassagemAerea extends Passagem {


    public PassagemAerea(String passageiro, Double vlTarifa){
        super(passageiro, vlTarifa);
    }

    @Override
    public Double calcTaxaTarifa(){
        Double totalPassagem = this.getTarifa() * 0.08;
        return totalPassagem;
    }

    @Override
    public List<String> listarDocumentos(){
        return List.of(
            "Documento de identidade com foto",
            "Bilhete eletrônico (e-ticket)"
        );
    }

    @Override
    protected String getPrefixo(){ return "AER"; }
}
