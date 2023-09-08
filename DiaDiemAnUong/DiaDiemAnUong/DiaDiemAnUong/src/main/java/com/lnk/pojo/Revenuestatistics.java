/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lnk.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jackie's PC
 */
@Entity
@Table(name = "revenuestatistics")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Revenuestatistics.findAll", query = "SELECT r FROM Revenuestatistics r"),
    @NamedQuery(name = "Revenuestatistics.findByStatId", query = "SELECT r FROM Revenuestatistics r WHERE r.statId = :statId"),
    @NamedQuery(name = "Revenuestatistics.findByYear", query = "SELECT r FROM Revenuestatistics r WHERE r.year = :year"),
    @NamedQuery(name = "Revenuestatistics.findByMonth", query = "SELECT r FROM Revenuestatistics r WHERE r.month = :month"),
    @NamedQuery(name = "Revenuestatistics.findByRevenue", query = "SELECT r FROM Revenuestatistics r WHERE r.revenue = :revenue")})
public class Revenuestatistics implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "stat_id")
    private Integer statId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "year")
    private int year;
    @Basic(optional = false)
    @NotNull
    @Column(name = "month")
    private int month;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "revenue")
    private BigDecimal revenue;
    @JoinColumn(name = "store_id", referencedColumnName = "store_id")
    @ManyToOne
    private Stores storeId;

    public Revenuestatistics() {
    }

    public Revenuestatistics(Integer statId) {
        this.statId = statId;
    }

    public Revenuestatistics(Integer statId, int year, int month, BigDecimal revenue) {
        this.statId = statId;
        this.year = year;
        this.month = month;
        this.revenue = revenue;
    }

    public Integer getStatId() {
        return statId;
    }

    public void setStatId(Integer statId) {
        this.statId = statId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public BigDecimal getRevenue() {
        return revenue;
    }

    public void setRevenue(BigDecimal revenue) {
        this.revenue = revenue;
    }

    public Stores getStoreId() {
        return storeId;
    }

    public void setStoreId(Stores storeId) {
        this.storeId = storeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (statId != null ? statId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Revenuestatistics)) {
            return false;
        }
        Revenuestatistics other = (Revenuestatistics) object;
        if ((this.statId == null && other.statId != null) || (this.statId != null && !this.statId.equals(other.statId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lnk.pojo.Revenuestatistics[ statId=" + statId + " ]";
    }
    
}
