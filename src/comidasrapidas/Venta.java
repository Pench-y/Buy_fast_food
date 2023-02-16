package comidasrapidas;

public class Venta {
    int id;
    String descripcion;
    int amount;
    double price;
    double priceT;

    public Venta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int cantidad) {
        this.amount = cantidad;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPriceT() {
        return priceT;
    }

    public void setPriceT(double priceT) {
        this.priceT = priceT;
    }
    
    
}
