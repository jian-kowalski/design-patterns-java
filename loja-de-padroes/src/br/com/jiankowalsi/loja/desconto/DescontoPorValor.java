package br.com.jiankowalsi.loja.desconto;

import java.math.BigDecimal;

import br.com.jiankowalsi.loja.orcamento.Orcamento;

public class DescontoPorValor extends Desconto {

    protected DescontoPorValor(Desconto proximoDesconto) {
        super(proximoDesconto);
    }

    private static final BigDecimal VALOR_DESCONTO = new BigDecimal("0.05");
    private static final BigDecimal VALOR_MINIMO_PARA_DESCONTO = new BigDecimal("500");

    public BigDecimal calcular(Orcamento orcamento) {

        if (orcamento.getValor().compareTo(VALOR_MINIMO_PARA_DESCONTO) > 0) {
            return orcamento.getValor().multiply(VALOR_DESCONTO);
        }
        return proximoDesconto.calcular(orcamento);
    }
}
