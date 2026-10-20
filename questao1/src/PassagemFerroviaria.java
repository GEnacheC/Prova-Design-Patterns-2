

import java.util.ArrayList;
import java.util.List;

public class PassagemFerroviaria extends Passagem{ // ConcreteProduct
    public PassagemFerroviaria(String passageiro, Double vlTarifa){
        super(passageiro, vlTarifa);
    }

    @Override
    public Double calcTaxaTarifa(){
        Double totalPassagem = this.getTarifa() * 0.05;
        return totalPassagem;
    }

    @Override
    public List<String> listarDocumentos(){
        return List.of(
            "Documento de identidade com foto",
            "Comprovante de reserva"
        );
    }

    @Override
    protected String getPrefixo(){ return "FER"; }
}
