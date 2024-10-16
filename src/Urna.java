import java.util.ArrayList;
import java.util.Scanner;

public class Urna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Candidato> nomes = new ArrayList<>();

        System.out.println("---------------------CADASTRO DE CANDIDATOS---------------------");

        System.out.println("NUMERO DE CANDIDATOS: ");
        int numCandidato = sc.nextInt();
        sc.nextLine();  // Limpa o buffer do scanner após nextInt()

        for (int index = 0; index < numCandidato; index++) {
            System.out.println("Digite o nome: ");
            String nome = sc.nextLine();  // Usa nextLine() para permitir nomes compostos
            System.out.println("Digite o numero do candidato: ");
            int numero = sc.nextInt();
            sc.nextLine();  // Limpa o buffer após nextInt()

            Candidato novoCandidato = new Candidato(nome, numero, 0);
            nomes.add(novoCandidato);
        }

        System.out.println("VOTOS MAXIMOS");
        int votoMax = sc.nextInt();

        System.out.println("---------------------HORA DE VOTAR---------------------");

        for (int i = 0; i < votoMax; i++) {
            System.out.println("INSIRA O NÚMERO DO CANDIDATO");
            int numero = sc.nextInt();

            boolean candidatoEncontrado = false;  // Variável para verificar se o candidato foi encontrado
            for (Candidato candidato : nomes) {
                if (candidato.getNumero() == numero) {
                    candidato.incrementarVotos();
                    candidatoEncontrado = true;  // Marca que o candidato foi encontrado
                    break;
                }
            }

            if (!candidatoEncontrado) {  // Se nenhum candidato foi encontrado, imprime voto nulo
                System.out.println("CANDIDATO NÃO ENCONTRADO, VOTO NULO");
            }
        }

        System.out.println("---------------------RESULTADO DA VOTAÇÃO---------------------");

        for (Candidato candidato : nomes) {
            System.out.println("Nome do candidato: " + candidato.getNome() +
                    " - Número: " + candidato.getNumero() +
                    " - Votos: " + candidato.getVotos());
        }

        sc.close();  // Fecha o scanner após o uso
    }
}
