import java.util.HashMap;

public class BalancoEmpresa {

    private HashMap<String, Divida> dividas = new HashMap<String, Divida>();

    public void registraDivida(String credor, String cnpjCredor, double valor) {
        Divida divida = new Divida();
        divida.setCredor(credor);
        divida.setCnjCredor(cnpjCredor);
        divida.setTotal(valor);
        divida.getCnpjCredor().setValor(cnpjCredor);
        dividas.put(cnpjCredor, divida);
    }

    public void pagaDivida(String cnpjCredor, double valor, String nomePagador, String cnpjPagador) {
        Divida divida = dividas.get(cnpjCredor);
        if (divida != null) {
            Pagamento pagamento = new Pagamento();
            pagamento.setCnpjPagador(cnpjPagador);
            pagamento.setPagador(nomePagador);
            pagamento.setValor(valor);
            divida.getPagamentos().registraPagamento(pagamento);

        }
    }


}
