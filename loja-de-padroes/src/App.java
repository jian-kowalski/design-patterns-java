import java.math.BigDecimal;

import br.com.jiankowalsi.loja.imposto.CalculadoraDeImpostos;
import br.com.jiankowalsi.loja.imposto.ICMS;
import br.com.jiankowalsi.loja.imposto.ISS;
import br.com.jiankowalsi.loja.orcamento.Orcamento;

public class App {
    public static void main(String[] args) {
        var orcamento = new Orcamento(new BigDecimal("100"));
        var calculadora = new CalculadoraDeImpostos();

        System.out.println(calculadora.calcular(orcamento, new ISS()));
        System.out.println(calculadora.calcular(orcamento, new ICMS()));
    }
}
