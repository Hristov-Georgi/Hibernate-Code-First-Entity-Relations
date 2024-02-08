package ex_03_UniversitySystem;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "students")
public class Student extends Person {

    @Column(name = "average_grade")
    private Double averageGrade;

    @Basic
    private int attendance;

    protected Student(){
        super();
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "students_courses",
            joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "course_id", referencedColumnName = "id"))
    private List<Course> coursesList;

    public List<Course> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(List<Course> coursesList) {
        this.coursesList = coursesList;
    }

    public Student(String firstName, String lastName, int phoneNumber, Double averageGrade, int attendance) {
        super(firstName, lastName, phoneNumber);
        this.averageGrade = averageGrade;
        this.attendance = attendance;
        this.coursesList = new ArrayList<>();
    }

    public void setAverageGrade(Double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public Double getAverageGrade() {
        return averageGrade;
    }

    public int getAttendance() {
        return attendance;
    }



}
