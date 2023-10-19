package dio.junit.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrdenandoTeste {
  
  @Order(4)
  @Test
  void validaFluxoA() {
    assertTrue(true);
  }
  @Order(2)
  @Test
  void validaFluxoB() {
    assertTrue(true);
  }
  @Order(3)
  @Test
  void validaFluxoC() {
    assertTrue(true);
  }
  @Order(1)
  @Test
  void validaFluxoD() {
    assertTrue(true);
  }
  
}
