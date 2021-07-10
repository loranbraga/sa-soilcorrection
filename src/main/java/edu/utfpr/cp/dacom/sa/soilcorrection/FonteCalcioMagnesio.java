package edu.utfpr.cp.dacom.sa.soilcorrection;

import java.util.Set;

public enum FonteCalcioMagnesio implements IFonteNutriente {
    CALCARIO_DOLOMITICO(1.0, 1.0),
    CALCARIO_CALCITICO(1, 1),
    CALCARIO_CONCHA(1, 1),
    GESSO_AGRICOLA(1, 1),
    HIDROXIDO_CÁLCIO(1, 1),
    CALCARIO_MAGNESIANO(1, 1);


    private final double teorFonteCalcio;
    private final double teorFonteMagnesio;

    FonteCalcioMagnesio(
        double teorFonteCalcio,
        double teorFonteMagnesio){

        this.teorFonteCalcio = teorFonteCalcio;
        this.teorFonteMagnesio= teorFonteMagnesio;
    }

    public double getTeorFonteCalcio() {
        return this.teorFonteCalcio;
    }

    public double getTeorFonteMagnesio() {
        return this.teorFonteMagnesio;
    }

    @Override
    public Set<NutrienteAdicional> getNutrientesAdicionais() {
        return null;
    }

    @Override
    public double getTeorFonte() {
        return this.teorFonteCalcio;
    }
}
