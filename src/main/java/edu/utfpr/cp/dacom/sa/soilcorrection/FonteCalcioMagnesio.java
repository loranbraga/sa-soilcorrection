package edu.utfpr.cp.dacom.sa.soilcorrection;

import java.util.Set;

public enum FonteCalcioMagnesio implements IFonteNutriente {
    CALCARIO_DOLOMITICO( 1.0),
    CALCARIO_CALCITICO( 1),
    CALCARIO_CONCHA(1),
    GESSO_AGRICOLA(1),
    HIDROXIDO_CÁLCIO( 1),
    CALCARIO_MAGNESIANO(1);


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
