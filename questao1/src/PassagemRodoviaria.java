

import java.util.ArrayList;
import java.util.List;

public class PassagemRodoviaria extends Passagem{ // ConcreteProduct
    
    public PassagemRodoviaria(String passageiro, Double vlTarifa){
        super(passageiro, vlTarifa);
    }

    @Override
    public Double calcTaxaTarifa(){
        Double totalPassagem = this.getTarifa() * 0.03;
        return totalPassagem;
    }

    @Override
    public List<String> listarDocumentos(){
        return List.of(
            "Documento de identidade com foto"
        );
    }

    @Override
    protected String getPrefixo(){ return "ROD"; }
}
