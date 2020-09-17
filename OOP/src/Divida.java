import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Divida {


    private double total;
    private String credor;
    private String cnjCredor;
    private Cnpj cnpjCredor = new Cnpj();
    private Pagamentos pagamentos = new Pagamentos();

    public Pagamentos getPagamentos() {
        return pagamentos;
    }

    public Cnpj getCnpjCredor() {
        return cnpjCredor;
    }

    public void setCnpjCredor(Cnpj cnpjCredor) {
        this.cnpjCredor = cnpjCredor;
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




}
