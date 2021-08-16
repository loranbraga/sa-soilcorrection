package edu.utfpr.cp.dacom.sa.soilcorrection.uteis;

public interface Conversao<T, R> {

    public R converte(T valor);
}
