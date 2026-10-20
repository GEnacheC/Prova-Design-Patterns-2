import java.util.*;

public class Main{
    public static void main(String[] args){
        List<Passagem> passagens = new ArrayList<Passagem>();
        System.out.println("Teste");
        Passagem a = new ContratoPassagemAerea("Teste 1", 100.00).processarContratacao();
        Passagem b = new ContratoPassagemFerroviaria("Teste 2", 100.00).processarContratacao();
        Passagem c = new ContratoPassagemRodoviaria("Teste 3", 100.00).processarContratacao();

        passagens.add(a);
        passagens.add(b);
        passagens.add(c);
        for(Passagem p : passagens) {
            p.emitir();
        }
    }
}
