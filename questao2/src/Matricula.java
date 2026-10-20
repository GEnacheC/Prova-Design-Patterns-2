

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public abstract class Matricula{ 
    private Double valorPagamento;
    private String comprovante;

    public Matricula(String comprovante, Double valorPagamento){
        this.comprovante = comprovante;
        this.valorPagamento = valorPagamento;
    }

    public abstract Double calcPagamento();
    protected abstract String getPrefixo();
    protected abstract String getMetodoPagamento();
    protected abstract String getDescDocumentoPag();
    protected abstract String getDescComprovante();

    public void emitir(){
        System.out.println(this.gerarResumo());
    }

    public String gerarResumo(){
        StringBuilder resumo = new StringBuilder();

        resumo.append("==========================================\n");
        resumo.append("Comprovante: " + this.comprovante+ "("+ this.getDescComprovante() +")\n");
        resumo.append("Valor Matricula: " + String.format("R$ %.2f", this.valorPagamento) + "\n");
        resumo.append("Método Pagamento: " + this.getMetodoPagamento() + "\n");
        resumo.append("Taxa pagamento: " + String.format("R$ %.2f", this.calcPagamento()) + "("+ this.getDescDocumentoPag() +")\n");
        resumo.append("==========================================");

        return resumo.toString();
    }

    public Double getPagamento(){ return this.valorPagamento; }
}
