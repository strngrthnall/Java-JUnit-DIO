package dio.junit.learning;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTeste {

  @Test
  void deveCalcularIdadeCorretamente() {
    Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
    Assertions.assertEquals(23, jessica.getIdade());
  }

  @Test
  void deveRetornarSeEMaiorDeIdade() {
    Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
    Assertions.assertTrue(jessica.maiorIdade());

    Pessoa joao = new Pessoa("Joao", LocalDateTime.now());
    Assertions.assertFalse(joao.maiorIdade());
  }

  public static void main(String[] args) {
    
  }
  
}
