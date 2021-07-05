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


}
