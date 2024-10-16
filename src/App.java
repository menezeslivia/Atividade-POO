import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Candidato candidato = new Candidato("", 000, 0);
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite o nome: ");  
        candidato.setNome(scan.nextLine());

        System.out.println("Digite o numero: ");  
        candidato.setNumero(scan.nextInt());

        System.out.println(candidato.getNome()
        + " - " + candidato.getNumero());

        candidato.incrementarVotos();
        System.out.println(candidato.getVotos());
    }
}
