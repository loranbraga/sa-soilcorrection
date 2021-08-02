package edu.utfpr.cp.dacom.sa.soilcorrection;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.NonNull;

@RequiredArgsConstructor
@Setter
@Getter
public class NutrienteAdicional {

    @NonNull
    private final NomeNutrienteAdicional nome;

    @NonNull
    private final double teorNutriente;

    private double correcaoAdicional;    
}
