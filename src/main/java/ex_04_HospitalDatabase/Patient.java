package ex_04_HospitalDatabase;

import javax.persistence.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.sql.Blob;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name", updatable = false, nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false, updatable = false)
    private String lastName;

    @Column(nullable = false, length = 500)
    private String address;

    @Column(nullable = false)
    private String email;

    @Column(name = "date_of_birth", nullable = false, updatable = false)
    private LocalDate dateOfBirth;

    @Column(nullable = false)
    @Lob
    private BufferedImage picture;

    @Column(name = "medical_insurance", nullable = false)
    private boolean medicalInsurance;

    /////////////////////////////////////

    @OneToMany(mappedBy = "patient", targetEntity = Visitation.class,
            cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Visitation> visitations;

    @OneToMany(mappedBy = "patient", targetEntity = Diagnose.class, fetch = FetchType.LAZY)
    private List<Diagnose> diagnoses;


    protected Patient(){}

    public Patient(String firstName, String lastName, String address, String email, LocalDate dateOfBirth,
                   BufferedImage picture, boolean medicalInsurance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.picture = picture;
        this.medicalInsurance = medicalInsurance;
        this.visitations = new ArrayList<>();

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public BufferedImage getPicture() {
        return picture;
    }

    public void setPicture(BufferedImage picture) {
        this.picture = picture;
    }

    public boolean isMedicalInsurance() {
        return medicalInsurance;
    }

    public void setMedicalInsurance(boolean medicalInsurance) {
        this.medicalInsurance = medicalInsurance;
    }

    public List<Visitation> getVisitations() {
        return Collections.unmodifiableList(this.visitations);
    }

    public void setVisitations(Visitation visitation) {
        this.visitations.add(visitation);
    }

    public void setVisitations(List<Visitation> visitations) {
        this.visitations = visitations;
    }

    public List<Diagnose> getDiagnoses() {
        return diagnoses;
    }

    public void setDiagnoses(List<Diagnose> diagnoses) {
        this.diagnoses = diagnoses;
    }
}
