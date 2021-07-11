package edu.utfpr.cp.dacom.sa.soilcorrection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteCorrecaoCalcio {
  @Test
  public void testaNecessidadeAdicionarCMol() {
    CorrecaoCalcioMagnesio correcao = new CorrecaoCalcioMagnesio();
    assertEquals(73.47544105967238,correcao.calculaNecessidadeAplicar(5.76,44.7,56.9,10.0,12.0));
  }

  @Test
  public void testaCustoReaisHa() {
    CorrecaoCalcioMagnesio correcao = new CorrecaoCalcioMagnesio();
    assertEquals(36737.5,correcao.calculaCusto(500, 73.475));
  }

  @Test
  public void testaV() {
    CorrecaoCalcioMagnesio correcao = new CorrecaoCalcioMagnesio();
    assertEquals(58.494957331264544, correcao.calculaPercentualV(0.15,5.76,1.63, 5.35));
  }

}
