package edu.utfpr.cp.dacom.sa.soilcorrection.enums;

import edu.utfpr.cp.dacom.sa.soilcorrection.records.NutrientesCTC;

public enum TexturaSolo {
    
    ARGILOSO {
        public NutrientesCTC calculaValorIdeal() {
            return new NutrientesCTC(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0);
        }
        public boolean ehParticipacaoIdealMagnesio(double participacao) {
            if(participacao >= 10 && participacao <=15){
                return true;
            }
            return false;
        }
        public boolean ehParticipacaoIdealCalcio(double participacao) {
            if(participacao >= 45 && participacao <=55){
                return true;
            }
            return false;
        }
        public boolean vIdeal(double v) {
            if(v >= 60 && v <=70){
                return true;
            }
            return false;
        }
    },
    TEXTURA_MEDIA{
        public NutrientesCTC calculaValorIdeal() {
            return new NutrientesCTC(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0);
        }
        public boolean ehParticipacaoIdealMagnesio(double participacao) {
            if(participacao >= 8 && participacao <=12){
                return true;
            }
            return false;
        }
        public boolean ehParticipacaoIdealCalcio(double participacao) {
            if(participacao >= 35 && participacao <=40){
                return true;
            }
            return false;
        }
        public boolean vIdeal(double v) {
            if(v >= 47.5 && v <=52.5){
                return true;
            }
            return false;
        }
    };
    
    public abstract NutrientesCTC calculaValorIdeal();
    public abstract boolean ehParticipacaoIdealMagnesio(double participacao);
    public abstract boolean ehParticipacaoIdealCalcio(double participacao);
    public abstract boolean vIdeal(double v);
}
