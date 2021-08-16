package edu.utfpr.cp.dacom.sa.soilcorrection.interfaces;

import java.util.Set;
import edu.utfpr.cp.dacom.sa.soilcorrection.*;

public interface IFonteNutriente {
    
    public double getTeorFonte();
    public Set<NutrienteAdicional> getNutrientesAdicionais();
}
