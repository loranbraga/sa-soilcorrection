package edu.utfpr.cp.dacom.sa.soilcorrection.uteis.correcoes;

import edu.utfpr.cp.dacom.sa.soilcorrection.enums.NomeNutrienteAdicional;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Setter
@Getter
public class NutrienteAdicional {

    private final NomeNutrienteAdicional nome;

    private final double teorNutriente;

    private double correcaoAdicional;    
}
