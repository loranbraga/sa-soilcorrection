package edu.utfpr.cp.dacom.sa.soilcorrection;

public class CorrecaoCalcioMagnesio {
  public static double getParticipacaoAtualCtcCalcio(double ctcCmol, double calcio){
    return calcio/ctcCmol * 100;
  } 

  public static double getParticipacaoAtualCtcMagnesio(double ctcCmol, double magnesio){
    return magnesio/ctcCmol * 100;
  }

}
