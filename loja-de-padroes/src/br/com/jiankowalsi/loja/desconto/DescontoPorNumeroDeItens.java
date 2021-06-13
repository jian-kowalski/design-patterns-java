package br.com.jiankowalsi.loja.desconto;

import java.math.BigDecimal;

import br.com.jiankowalsi.loja.orcamento.Orcamento;

public class DescontoPorNumeroDeItens extends Desconto {

    protected DescontoPorNumeroDeItens(Desconto proximoDesconto) {
        super(proximoDesconto);
    }

    /**
     *
     */
    private static final int NUMERO_MINIMO_PARA_DESCONTO = 5;
    private static final BigDecimal VALOR_DESCONTO = new BigDecimal("0.1");

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeItens() > NUMERO_MINIMO_PARA_DESCONTO) {
            return orcamento.getValor().multiply(VALOR_DESCONTO);
        }

        return proximoDesconto.calcular(orcamento);

    }

}
