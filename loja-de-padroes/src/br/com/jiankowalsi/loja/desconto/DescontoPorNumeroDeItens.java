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

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(VALOR_DESCONTO);
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return (orcamento.getQuantidadeItens() > NUMERO_MINIMO_PARA_DESCONTO);
    }

}
