import java.util.*;

public class Main{
    public static void main(String[] args){
        List<Matricula> matriculas = new ArrayList<Matricula>();
        Matricula a = new ContratoMatriculaChile("Teste 1", 100.00).processarContratacao();
        Matricula b = new ContratoMatriculaBrasil("Teste 2", 100.00).processarContratacao();
       
        matriculas.add(a);
        matriculas.add(b);
        for(Matricula m : matriculas) {
            m.emitir();
        }
    }
}
