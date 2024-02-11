package ex_04_HospitalDatabase;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Entity
@Table(name = "diagnoses")
public class Diagnose {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, updatable = false)
    private String name;

    @Column(nullable = false, updatable = false, length = 2000)
    private String comment;

    @OneToMany(mappedBy = "diagnose", targetEntity = Medicament.class,
            cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Medicament> medicaments;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "patient_id", referencedColumnName = "id", nullable = false, updatable = false)
    private Patient patient;


    protected Diagnose(){}

    public Diagnose (String name, String comment) {
        this.name = name;
        this.comment = comment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<Medicament> getMedicaments() {
        return Collections.unmodifiableList(this.medicaments) ;
    }

    public void setMedicaments(List<Medicament> medicaments) {
        this.medicaments = medicaments;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}

