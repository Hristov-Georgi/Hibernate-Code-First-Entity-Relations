package ex_02_SalesDatabase;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Basic
    private String name;

    @Basic
    private Double quantity;

    @Basic
    private BigDecimal price;

    @OneToMany(mappedBy = "product", targetEntity = Sale.class)
    private Set<Sale> sales;

    protected Product(){}

    public Product(String name, Double quantity, BigDecimal price){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getQuantity() {
        return quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
