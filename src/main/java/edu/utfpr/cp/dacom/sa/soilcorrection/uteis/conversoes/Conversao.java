package edu.utfpr.cp.dacom.sa.soilcorrection.uteis.conversoes;

public interface Conversao<T, R> {

    public R converte(T valor);
}
