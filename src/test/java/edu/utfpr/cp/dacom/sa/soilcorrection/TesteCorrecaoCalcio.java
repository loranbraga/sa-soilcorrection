package edu.utfpr.cp.dacom.sa.soilcorrection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteCorrecaoCalcio {
  @Test
  public void testaParticipacaoAtualCalcioCTC(){
    assertEquals(44.68580294802172, CorrecaoCalcioMagnesio.getParticipacaoAtualCtcCalcio(12.89, 5.76));
  }

  @Test
  public void testaParticipacaoAtualMagnesioCTC(){
    assertEquals(12.645461598138091, CorrecaoCalcioMagnesio.getParticipacaoAtualCtcCalcio(12.89, 1.63));
  }

  @Test
  public void testaQuantidadeAplicar(){
    assertEquals(73.5,CorrecaoCalcioMagnesio.getQtdAplicar(12, 8.82));
  }

  @Test
  public void testaTeorCaOAdicionar(){
    assertEquals(1.5720805369127504,CorrecaoCalcioMagnesio.getTeorCaOAdicionar(5.76, 56.9, 44.7));
  }

  @Test
  public void testaQtdTotalCalcioAplicada(){
    assertEquals(0.1783,CorrecaoCalcioMagnesio.getQtdTotalCalcioAplicada(10));
  }

  @Test
  public void testaQtdCorretivo(){
    assertEquals(8.827818283791364,CorrecaoCalcioMagnesio.getQtdCorretivo(0.1783, 1.574));
  }


  @Test
  public void testValorPorHectare(){
    assertEquals(36750,CorrecaoCalcioMagnesio.getValorPorHectare(73.5, 500));
  }


}
