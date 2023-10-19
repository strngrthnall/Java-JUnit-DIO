package dio.junit.learning;

public class Transferencia {

  public static void transfere(Conta contaOrigem, Conta contaDestino, double valor) {
    if(valor <= 0) {
      throw new IllegalArgumentException("Valor deve ser maior que zero");
    }
  }
  
}
