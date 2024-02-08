package ex_03_UniversitySystem;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "teachers")
public class Teacher extends Person {

    @Column(nullable = false)
    private String email;

    @Column(name = "salary_per_hour", nullable = false)
    private double salaryPerHour;

    @OneToMany(mappedBy = "teacher", targetEntity = Course.class, fetch = FetchType.LAZY)
    private List<Course> courses;


    public Teacher() {
        super();
    }

    public Teacher(String firstName, String lastName, int phoneNumber, String email, double salaryPerHour) {
        super(firstName, lastName, phoneNumber);
        this.email = email;
        this.salaryPerHour = salaryPerHour;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }
}
