

public abstract class ContratoMatricula{ 
    protected abstract Matricula criarMatricula(); 

    public final Matricula processarContratacao(){
        Matricula Matricula = this.criarMatricula();
        return Matricula;
    }
}
