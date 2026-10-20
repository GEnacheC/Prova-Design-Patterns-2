

public class ContratoMatriculaBrasil extends ContratoMatricula{
    private String comprovante;
    private Double vlPagamento;

    public ContratoMatriculaBrasil(String comprovante, Double vlPagamento){
        this.comprovante = comprovante;
        this.vlPagamento = vlPagamento;
    }

    @Override
    protected Matricula criarMatricula(){
        return new MatriculaBrasil(comprovante, vlPagamento);
    }

}
