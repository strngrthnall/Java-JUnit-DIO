package dio.junit.learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsTeste {
  @Test
  void validarLancamentos() {
    int[] primeirLancamento = {10,20,30,40,50};
    int[] segundolancamento = {10,20,30,40,50};

    Assertions.assertArrayEquals(primeirLancamento, segundolancamento);
  }

  @Test
  void validarObjetoNulo() {
    Pessoa pessoa = null;

    Assertions.assertNull(pessoa);
  }
}
