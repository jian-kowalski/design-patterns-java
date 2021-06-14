package br.com.jiankowalsi.loja.orcamento;

import java.util.Map;

import br.com.jiankowalsi.loja.exception.DomainException;
import br.com.jiankowalsi.loja.http.HttpAdapter;

public class RegistroDeOrcamento {

    private HttpAdapter httpAdapter;

    public RegistroDeOrcamento(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    public void registrar(Orcamento orcamento) {
        if (!orcamento.isFinalizado()){
            throw new DomainException("Orcamento não finalizado!");
        }
        var url = "http://api.externa/orcamento";
        Map<String, Object> dados = Map.of("valor", orcamento.getValor(), "situacao", orcamento.getSituacao(),
                "quantidade", orcamento.getQuantidadeItens());
        httpAdapter.post(url, dados);
    }

}
