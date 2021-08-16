package edu.utfpr.cp.dacom.sa.soilcorrection.uteis.correcoes;

import edu.utfpr.cp.dacom.sa.soilcorrection.FontePotassio;
import edu.utfpr.cp.dacom.sa.soilcorrection.interfaces.ICorrecaoNutriente;
import edu.utfpr.cp.dacom.sa.soilcorrection.interfaces.ICorrecaoNutrienteQuantidadeAplicar;

public class CorrecaoPotassio 
        implements 
            ICorrecaoNutriente<FontePotassio>,
            ICorrecaoNutrienteQuantidadeAplicar<FontePotassio> {

    public double calculaNecessidadeAdicionarCMolcDm3 (
        double teorSolo,
        double participacaoCTCExistente,
        double participacaoCTCDesejada) {

            if (teorSolo <= 0) {
                throw new IllegalArgumentException();
            }

            if (participacaoCTCExistente <= 0) {
                throw new IllegalArgumentException();
            }

            if (participacaoCTCDesejada <= 0) {
                throw new IllegalArgumentException();
            }

            return (teorSolo 
                    * participacaoCTCDesejada 
                    / participacaoCTCExistente) 
                    - teorSolo;
    }

}
