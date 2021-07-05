package edu.utfpr.cp.dacom.sa.soilcorrection;

public class CorrecaoCalcioMagnesio {
  public static double getParticipacaoAtualCtcCalcio(double ctcCmol, double calcio){
    return calcio/ctcCmol * 100;
  } 

  public static double getParticipacaoAtualCtcMagnesio(double ctcCmol, double magnesio){
    return magnesio/ctcCmol * 100;
  }

  public static double getQtdAplicar(double prnt, double qtdCorretivo){
    return qtdCorretivo*100/prnt;
  }

  public static double getTeorCaOAdicionar(double calcio, double participacaoCTCDesejada, double participacaoCTCAtual){
    return (calcio*participacaoCTCDesejada/participacaoCTCAtual)-calcio;
  }

  public static double getQtdTotalCalcioAplicada(double teor){
    return teor*0.01783;
  }

  public static double getQtdCorretivo(double caOAdicionado, double caOAdicionar){
    return caOAdicionar/caOAdicionado;
  }

}
