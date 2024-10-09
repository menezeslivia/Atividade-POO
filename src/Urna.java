import java.util.ArrayList;
import java.util.Scanner;

public class Urna {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<Candidato> nomes = new ArrayList<>();

            System.out.println("NUMERO DE CANDIDATOS: ");
            int numCandidato = sc.nextInt();

            for (int index = 0; index < numCandidato; index++) {
                System.out.println("Digite o nome; ");
                String nome = sc.next();
                System.out.println("Digite o numero do candidato; ");
                int numero = sc.nextInt();
                Candidato novoCandidato = new Candidato(nome, numero, 0);
                nomes.add(novoCandidato);
            }

        System.out.println("VOTOS MAXIMOS");
        int votoMax = sc.nextInt();

        for (int i = 0; i < votoMax; i++) {
            System.out.println("INSIRA O NÚMERO DO CANDIDATO");
            int numero = sc.nextInt();

            for (Candidato candidato : nomes) {


                if (candidato.getNumero() == numero) {

                    /* candidato.{numero do candidato = 1010} == 1010 */
                    candidato.setVotos(candidato.getVotos() + 1);
                    break;
                    } else {
                        System.out.println("CANDIDATO NÃO ENCONTRADO, VOTO NULO");
                    }
                    }
        }

        for (Candidato candidato : nomes) {
            System.out.println (candidato.getNome() + candidato.getNumero() + candidato.getVotos());
        }

        }


    }