

public abstract class ContratoPassagem{ 
    protected abstract Passagem criarPassagem(); 

    public final Passagem processarContratacao(){
        Passagem passagem = this.criarPassagem();
        return passagem;
    }
}
