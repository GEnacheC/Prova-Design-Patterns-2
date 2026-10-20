

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public abstract class Passagem{ 
    private Double valorTarifa;
    private String passageiro;

    public Passagem(String passageiro, Double vlTarifa){
        this.passageiro = passageiro;
        this.valorTarifa = vlTarifa;
    }

    public abstract Double calcTaxaTarifa();
    public abstract List<String> listarDocumentos();
    protected abstract String getPrefixo();

    public void emitir(){
        System.out.println(this.gerarResumo());
    }

    public String gerarResumo(){
        StringBuilder resumo = new StringBuilder();

        resumo.append("==========================================\n");
        resumo.append("Passageiro: " + this.passageiro + "\n");
        resumo.append("Tarifa: " + String.format("R$ %.2f", this.valorTarifa) + "\n");
        resumo.append("Taxa de Embarque: " + String.format("R$ %.2f", this.calcTaxaTarifa()) + "\n");
        resumo.append("Documentos exigidos:\n");
        for(String documento : this.listarDocumentos()){ resumo.append("  - " + documento + "\n"); }
        resumo.append("==========================================");

        return resumo.toString();
    }

    public Double getTarifa(){ return this.valorTarifa; }
}
