package edu.utfpr.cp.dacom.sa.soilcorrection;

public class CorrecaoCalcioMagnesio implements ICorrecaoNutriente<FonteCalcioMagnesio> {
  public double calculaNecessidadeAplicar(
    double calcio,
    double participacaoCTCExistente,
    double participacaoCTCDesejada,
    double teor,
    double prnt ){
        if (teor <= 0) {
            throw new IllegalArgumentException();
        }
        if (prnt <= 0) {
            throw new IllegalArgumentException();
        }
        if (calcio <= 0) {
            throw new IllegalArgumentException();
        }

        if (participacaoCTCExistente <= 0) {
            throw new IllegalArgumentException();
        }

        if (participacaoCTCDesejada <= 0) {
            throw new IllegalArgumentException();
        }
        double caOAdicionar = (calcio*participacaoCTCDesejada/participacaoCTCExistente)-calcio;
        double caOAdicionado = teor*0.01783;
        double qtdCorretivo = caOAdicionar/caOAdicionado;
        return qtdCorretivo*100/prnt;

  }

  public double calculaMagnesioAposCorrecao(
    double calcio,
    double magnesio,
    double participacaoCTCCalcioExistente,
    double participacaoCTCCalcioDesejada,
    double teor,
    FonteCalcioMagnesio fonte,
	double hAL,
	double potassio){
        if (teor <= 0) {
            throw new IllegalArgumentException();
        }
        if (magnesio <= 0) {
            throw new IllegalArgumentException();
        }
        if (calcio <= 0) {
            throw new IllegalArgumentException();
        }
        if (participacaoCTCCalcioExistente <= 0) {
            throw new IllegalArgumentException();
        }
        if (participacaoCTCCalcioDesejada <= 0) {
            throw new IllegalArgumentException();
        }
        double caOAdicionar = (calcio*participacaoCTCCalcioDesejada/participacaoCTCCalcioExistente)-calcio;
        double caOAdicionado = teor*0.01783;
        double qtdCorretivo = caOAdicionar/caOAdicionado;

        return (magnesio + (fonte.getTeorFonteMagnesio()*0.0248*qtdCorretivo))/(calcio+potassio+magnesio+hAL)*100;
  }

  public double calculaCusto(double custoFonte, double qtdeAplicar) {

    if (custoFonte <= 0) {
        throw new IllegalArgumentException();
    }

    if (qtdeAplicar <= 0) {
        throw new IllegalArgumentException();
    }

    return custoFonte * qtdeAplicar ;
  }

  public double calculaPercentualV(
		double potassio,
		double calcio,
		double magnesio,
		double hAL
	) {

		return 100 * (potassio + calcio + magnesio)  / (potassio + calcio + magnesio + hAL);
	}
}