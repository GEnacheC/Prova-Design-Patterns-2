

public class ContratoPassagemAerea extends ContratoPassagem{
    private String passageiro;
    private Double vlTarifa;

    public ContratoPassagemAerea(String passageiro, Double vlTarifa){
        this.passageiro = passageiro;
        this.vlTarifa = vlTarifa;
    }

    @Override
    protected Passagem criarPassagem(){
        System.out.println("Teste 2");
        return new PassagemAerea(passageiro, vlTarifa);
    }

}
