import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Divida {

    double valorPago;
    double total;
    String credor;
    String cnjCredor;

    private List<Pagamento> pagamentos = new ArrayList<Pagamento>();

    public List<Pagamento> getPagamentos() {
        return Collections.unmodifiableList(pagamentos);
    }

    public void adicionaPagamento(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCredor() {
        return credor;
    }

    public void setCredor(String credor) {
        this.credor = credor;
    }

    public String getCnjCredor() {
        return cnjCredor;
    }

    public void setCnjCredor(String cnjCredor) {
        this.cnjCredor = cnjCredor;
    }

    private void paga(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor nao pode ser menor do que zero");
        }
        if (valor > 100) {
            valor = valor - 8;
        }
        this.valorPago += valor;
    }

    public void registraPagamento(Pagamento pagamento ) {
       this.adicionaPagamento(pagamento);
       this.paga(pagamento.getValor());
    }


}
