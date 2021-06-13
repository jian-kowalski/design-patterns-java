package br.com.jiankowalsi.loja.desconto;

import java.math.BigDecimal;

import br.com.jiankowalsi.loja.orcamento.Orcamento;

public abstract class Desconto {

    protected Desconto proximoDesconto;

    protected Desconto(Desconto proximoDesconto) {
        this.proximoDesconto = proximoDesconto;
    }

    public abstract BigDecimal calcular(Orcamento orcamento);
    
}
