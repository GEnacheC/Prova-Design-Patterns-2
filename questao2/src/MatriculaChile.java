

import java.util.ArrayList;
import java.util.List;

public class MatriculaChile extends Matricula{ // ConcreteProduct
    
    public MatriculaChile(String comprovante, Double vlPagamento){
        super(comprovante, vlPagamento);
    }

    @Override
    public Double calcPagamento(){
        Double totalMatricula = this.getPagamento() * 0.05;
        return totalMatricula;
    }

    @Override
    protected String getPrefixo(){ return "CHL"; }

    @Override
    protected String getMetodoPagamento(){ return "WEBPAY"; }

    @Override
    protected String getDescDocumentoPag(){ return "Documento fiscal boleta electrónica com IVA de 19%"; }
   
    @Override
    protected String getDescComprovante(){ return "Comprovante de matrícula com identificação do aluno por RUT"; }

}
