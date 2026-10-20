

public class ContratoPassagemRodoviaria extends ContratoPassagem{ // ConcreteCreator
    private String passageiro;
    private Double vlTarifa;

    public ContratoPassagemRodoviaria(String passageiro, Double vlTarifa){
        this.passageiro = passageiro;
        this.vlTarifa = vlTarifa;
    }

    @Override
    protected Passagem criarPassagem(){
        return new PassagemRodoviaria(passageiro, vlTarifa);
    }
}
