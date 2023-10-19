package dio.junit.learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {
  @Test
  void validarCenarioDeExcecaoNaTransferencia() {
    Conta contaOrigem = new Conta();
    Conta contaDestino = new Conta();

    Assertions.assertThrows(IllegalArgumentException.class, () ->
            Transferencia.transfere(contaOrigem, contaDestino, 0));
  }
}
