package ex_05_BillsPaymentSystem;

import javax.persistence.*;

@Entity
@Table(name = "bank_accounts")
public class BankAccount extends BillingDetail {

    @Column(name = "bank_name", nullable = false)
    private String bankName;

    @Column(name = "SWIFT_code", nullable = false)
    private String SWIFTCode;

    protected BankAccount(){}

    public BankAccount (String number, String owner, String bankName, String SWIFTCode) {
        super(number, owner);
        this.bankName = bankName;
        this.SWIFTCode = SWIFTCode;
    }


    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getSWIFTCode() {
        return SWIFTCode;
    }

    public void setSWIFTCode(String SWIFTCode) {
        this.SWIFTCode = SWIFTCode;
    }
}
