package br.com.jiankowalsi.loja.imposto;

import java.math.BigDecimal;

import br.com.jiankowalsi.loja.orcamento.Orcamento;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);

}
