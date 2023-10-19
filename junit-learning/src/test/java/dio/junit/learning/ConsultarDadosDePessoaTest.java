package dio.junit.learning;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ConsultarDadosDePessoaTest {
  @BeforeAll
  static void configuraConexao() {
    BancoDeDados.iniciarConexao();
    System.out.println("Configurou conexão");
  }

  @Test
  void validarDadosDeRetorno() {
    Assertions.assertTrue(true);
    System.out.println("Rodou");
  }

  @AfterAll
  static void encerraConexao() {
    BancoDeDados.finalizarConexao();
    System.out.println("Finalizou conexao");
  }
}
