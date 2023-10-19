package dio.junit.learning;

import java.util.logging.Logger;

public class BancoDeDados {
  
  public static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

  public static void iniciarConexao() {
    LOGGER.info("Iniciou Conexão");
  }

  public static void finalizarConexao() {
    LOGGER.info("Finalizou Conexão");
  }
}
