package br.com.jiankowalsi.loja.orcamento.situacao;

import br.com.jiankowalsi.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
    
}
