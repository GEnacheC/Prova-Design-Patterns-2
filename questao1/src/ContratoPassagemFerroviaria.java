

public class ContratoPassagemFerroviaria extends ContratoPassagem{ // ConcreteCreator
    private String passageiro;
    private Double vlTarifa;

    public ContratoPassagemFerroviaria(String passageiro, Double vlTarifa){
        this.passageiro = passageiro;
        this.vlTarifa = vlTarifa;
    }

    @Override
    protected Passagem criarPassagem(){
        return new PassagemFerroviaria(passageiro, vlTarifa);
    }
}
