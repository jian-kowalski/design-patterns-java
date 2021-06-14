package br.com.jiankowalsi.loja.orcamento;

import java.math.BigDecimal;

public class ItemOrcamento implements Orsavel {

    private BigDecimal valor;

    public BigDecimal getValor() {
        return valor;
    }

    public ItemOrcamento(BigDecimal valor) {
        this.valor = valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    
}
