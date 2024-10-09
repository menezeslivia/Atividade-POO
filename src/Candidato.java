public class Candidato {

    private  String nome;
    private  int numero;
    private  int votos;
    
    Candidato (String nome, int numero, int votos){
        this.nome = nome;
        this.numero = numero;
        this.votos = 0;
    }

    public void incrementarVotos() {
        this.votos++;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getVotos() {
        return votos;
    }
    public void setVotos(int votos) {
        this.votos = votos;
    }

}
