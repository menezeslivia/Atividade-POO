import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Candidato candidato = new Candidato(null, 11070, 0);
        
        Scanner nome = new Scanner (System.in);
        System.out.println("Digite o nome: ");  
        candidato.setNome(nome.nextLine());

        System.out.println("Digite o numero: ");  
        candidato.setNumero(nome.nextInt());

        System.out.println(candidato.getNome()
        + " - " + candidato.getNumero());

        candidato.incrementarVotos();
        System.out.println(candidato.getVotos());
    }
}
