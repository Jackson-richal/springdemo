package com.jk.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Administrator on 2017/11/14.
 */
public class Purchase implements Serializable {
    private static final long serialVersionUID = -8831865266930595468L;
    private Integer id;
    private String supplier;

    private Date purchaseDate;

    private BigDecimal purchaseMoney;

    private Integer registStatus;

    private Integer status;

    private BigDecimal payAmount;

    private Date payDate;

    private Date arrivalDate;

    private Integer salesmae;

    private String remarks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public BigDecimal getPurchaseMoney() {
        return purchaseMoney;
    }

    public void setPurchaseMoney(BigDecimal purchaseMoney) {
        this.purchaseMoney = purchaseMoney;
    }

    public Integer getRegistStatus() {
        return registStatus;
    }

    public void setRegistStatus(Integer registStatus) {
        this.registStatus = registStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Integer getSalesmae() {
        return salesmae;
    }

    public void setSalesmae(Integer salesmae) {
        this.salesmae = salesmae;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Purchase purchase = (Purchase) o;

        return id.equals(purchase.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", supplier='" + supplier + '\'' +
                ", purchaseDate=" + purchaseDate +
                ", purchaseMoney=" + purchaseMoney +
                ", registStatus=" + registStatus +
                ", status=" + status +
                ", payAmount=" + payAmount +
                ", payDate=" + payDate +
                ", arrivalDate=" + arrivalDate +
                ", salesmae=" + salesmae +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
