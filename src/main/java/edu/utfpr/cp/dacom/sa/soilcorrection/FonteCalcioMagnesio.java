package edu.utfpr.cp.dacom.sa.soilcorrection;

import java.util.Set;

public enum FonteCalcioMagnesio implements IFonteNutriente {
    CALCARIO_DOLOMITICO(18),
    CALCARIO_CALCITICO(5),
    CALCARIO_CONCHA(0),
    GESSO_AGRICOLA(0),
    HIDROXIDO_CÁLCIO(0),
    CALCARIO_MAGNESIANO(10);


    private final double teorFonteMagnesio;

    FonteCalcioMagnesio(
        double teorFonteMagnesio){

        this.teorFonteMagnesio= teorFonteMagnesio;
    }

    public double getTeorFonteMagnesio() {
        return this.teorFonteMagnesio;
    }

    @Override
    public Set<NutrienteAdicional> getNutrientesAdicionais() {
        return null;
    }

    public double getTeorMagnesio() {
        return this.teorFonteMagnesio;
    }

    @Override
    public double getTeorFonte() {
        return 0;
    }
}
