package ex_01_GringottsDatabase;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "wizard_deposits")
public class WizardDeposits {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name", length = 50)
    private String firstName;

    @Column(name = "last_name", length = 60, nullable = false)
    private String lastName;

    @Column(length = 1000)
    private String notes;

    @Column(nullable = false)
    private int age;

    @Column(name = "magic_wand_creator" ,length = 100)
    private String magicWandCreator;

    @Column(name = "magic_wand_size")
    private short magicWandSize;

    @Column(name = "deposit_group", length = 20)
    private String depositGroup;

    @Column(name = "deposit_start_date")
    private LocalDateTime depositStartDate;

    @Column(name = "deposit_amount")
    private BigDecimal depositAmount;

    @Column(name = "deposit_interest")
    private BigDecimal depositInterest;

    @Column(name = "deposit_charge")
    private BigDecimal depositCharge;

    @Column(name = "deposit_expirational_date")
    private LocalDateTime depositExpirationalDate;

    @Column(name = "is_deposit_expired")
    private boolean isDepositExpired;

    private WizardDeposits(){}

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMagicWandCreator(String magicWandCreator) {
        this.magicWandCreator = magicWandCreator;
    }

    public void setMagicWandSize(short magicWandSize) {
        this.magicWandSize = magicWandSize;
    }

    public void setDepositGroup(String depositGroup) {
        this.depositGroup = depositGroup;
    }

    public void setDepositStartDate(LocalDateTime depositStartDate) {
        this.depositStartDate = depositStartDate;
    }

    public void setDepositAmount(BigDecimal depositAmount) {
        this.depositAmount = depositAmount;
    }

    public void setDepositInterest(BigDecimal depositInterest) {
        this.depositInterest = depositInterest;
    }

    public void setDepositCharge(BigDecimal depositCharge) {
        this.depositCharge = depositCharge;
    }

    public void setDepositExpirationalDate(LocalDateTime depositExpirationalDate) {
        this.depositExpirationalDate = depositExpirationalDate;
    }

    public void setDepositExpired(boolean depositExpired) {
        isDepositExpired = depositExpired;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNotes() {
        return notes;
    }

    public int getAge() {
        return age;
    }

    public String getMagicWandCreator() {
        return magicWandCreator;
    }

    public short getMagicWandSize() {
        return magicWandSize;
    }

    public String getDepositGroup() {
        return depositGroup;
    }

    public LocalDateTime getDepositStartDate() {
        return depositStartDate;
    }

    public BigDecimal getDepositAmount() {
        return depositAmount;
    }

    public BigDecimal getDepositInterest() {
        return depositInterest;
    }

    public BigDecimal getDepositCharge() {
        return depositCharge;
    }

    public LocalDateTime getDepositExpirationalDate() {
        return depositExpirationalDate;
    }

    public boolean isDepositExpired() {
        return isDepositExpired;
    }
}
