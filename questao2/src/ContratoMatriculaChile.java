

public class ContratoMatriculaChile extends ContratoMatricula{ // ConcreteCreator
    private String comprovante;
    private Double vlPagamento;

    public ContratoMatriculaChile(String comprovante, Double vlPagamento){
        this.comprovante = comprovante;
        this.vlPagamento = vlPagamento;
    }

    @Override
    protected Matricula criarMatricula(){
        return new MatriculaChile(comprovante, vlPagamento);
    }
}
