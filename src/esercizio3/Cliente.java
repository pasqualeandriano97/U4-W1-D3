package esercizio3;
import java.time.LocalDate;
import java.util.Random;

public class Cliente {
  private int id;
  private String nome;
  private String cognome;
  private String email;
  private String dataIscrizione;

    public Cliente(String nome, String cognome, String email, String dataIscrizione) {
      Random rndm = new Random();
      this.id = rndm.nextInt(1, 10000) ;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

  @Override
  public String toString() {
    return "Cliente{" +
            "id=" + id +
            ", nome='" + nome + '\'' +
            ", cognome='" + cognome + '\'' +
            ", email='" + email + '\'' +
            ", dataIscrizione='" + dataIscrizione + '\'' +
            '}';
  }
}
