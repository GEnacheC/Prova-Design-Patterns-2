

import java.util.List;

public class MatriculaBrasil extends Matricula {


    public MatriculaBrasil(String comprovante, Double vlPagamento){
        super(comprovante, vlPagamento);
    }

    @Override
    public Double calcPagamento(){
        Double totalMatricula = this.getPagamento() * 0.05;
        return totalMatricula;
    }

    @Override
    protected String getPrefixo(){ return "BRA"; }

    @Override
    protected String getMetodoPagamento(){ return "PIX"; }

    @Override
    protected String getDescDocumentoPag(){ return "Documento fiscal NFS-e com ISS de 5%"; }
   
    @Override
    protected String getDescComprovante(){ return "Comprovante de matrícula com identificação do aluno por CPF"; }
    
}
