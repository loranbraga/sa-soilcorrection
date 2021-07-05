package edu.utfpr.cp.dacom.sa.soilcorrection;

public class CorrecaoCalcio {
  public static double getParticipacaoAtualCTC(double ctcCmol, double calcio){
    return calcio/ctcCmol * 100;
  } 
}
