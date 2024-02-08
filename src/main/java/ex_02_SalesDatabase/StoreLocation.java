package ex_02_SalesDatabase;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "store_locations")
public class StoreLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "location_name")
    private String locationName;

    protected StoreLocation(){}

    public StoreLocation(String locationName) {
        this.locationName = locationName;
    }

    @OneToMany(mappedBy = "storeLocation", targetEntity = Sale.class)
    private Set<Sale> sales;

    public void setId(int id) {
        this.id = id;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationName() {
        return locationName;
    }

    public int getId() {
        return id;
    }
}
