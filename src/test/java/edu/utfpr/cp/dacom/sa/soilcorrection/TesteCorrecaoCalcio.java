package edu.utfpr.cp.dacom.sa.soilcorrection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteCorrecaoCalcio {
  @Test
  public void testaParticipacaoAtualCTC(){
    assertEquals(44.68580294802172, CorrecaoCalcio.getParticipacaoAtualCTC(12.89, 5.76));
  }

  
}
