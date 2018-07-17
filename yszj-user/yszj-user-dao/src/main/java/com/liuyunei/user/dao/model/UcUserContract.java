package com.liuyunei.user.dao.model;

import java.io.Serializable;
import java.util.Date;

public class UcUserContract implements Serializable {
    /**
     * 合同编号
     *
     * @mbg.generated
     */
    private String contractId;

    /**
     * 发送人编号
     *
     * @mbg.generated
     */
    private String userId1;

    /**
     * 接收人编号
     *
     * @mbg.generated
     */
    private String userId2;

    /**
     * 发送人公钥
     *
     * @mbg.generated
     */
    private String key1;

    /**
     * 接收人公钥
     *
     * @mbg.generated
     */
    private String key2;

    /**
     * 合同标题
     *
     * @mbg.generated
     */
    private String contractTitle;

    /**
     * 合同已签署时间
     *
     * @mbg.generated
     */
    private Date contractTime1;

    /**
     * 合同待签署时间
     *
     * @mbg.generated
     */
    private Date contractTime2;

    /**
     * 状态(-1拒绝,0:已签,1:待签)
     *
     * @mbg.generated
     */
    private Integer contractStatus;

    /**
     * 合同内容
     *
     * @mbg.generated
     */
    private String contractCms;

    private static final long serialVersionUID = 1L;

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getUserId1() {
        return userId1;
    }

    public void setUserId1(String userId1) {
        this.userId1 = userId1;
    }

    public String getUserId2() {
        return userId2;
    }

    public void setUserId2(String userId2) {
        this.userId2 = userId2;
    }

    public String getKey1() {
        return key1;
    }

    public void setKey1(String key1) {
        this.key1 = key1;
    }

    public String getKey2() {
        return key2;
    }

    public void setKey2(String key2) {
        this.key2 = key2;
    }

    public String getContractTitle() {
        return contractTitle;
    }

    public void setContractTitle(String contractTitle) {
        this.contractTitle = contractTitle;
    }

    public Date getContractTime1() {
        return contractTime1;
    }

    public void setContractTime1(Date contractTime1) {
        this.contractTime1 = contractTime1;
    }

    public Date getContractTime2() {
        return contractTime2;
    }

    public void setContractTime2(Date contractTime2) {
        this.contractTime2 = contractTime2;
    }

    public Integer getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(Integer contractStatus) {
        this.contractStatus = contractStatus;
    }

    public String getContractCms() {
        return contractCms;
    }

    public void setContractCms(String contractCms) {
        this.contractCms = contractCms;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", contractId=").append(contractId);
        sb.append(", userId1=").append(userId1);
        sb.append(", userId2=").append(userId2);
        sb.append(", key1=").append(key1);
        sb.append(", key2=").append(key2);
        sb.append(", contractTitle=").append(contractTitle);
        sb.append(", contractTime1=").append(contractTime1);
        sb.append(", contractTime2=").append(contractTime2);
        sb.append(", contractStatus=").append(contractStatus);
        sb.append(", contractCms=").append(contractCms);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UcUserContract other = (UcUserContract) that;
        return (this.getContractId() == null ? other.getContractId() == null : this.getContractId().equals(other.getContractId()))
            && (this.getUserId1() == null ? other.getUserId1() == null : this.getUserId1().equals(other.getUserId1()))
            && (this.getUserId2() == null ? other.getUserId2() == null : this.getUserId2().equals(other.getUserId2()))
            && (this.getKey1() == null ? other.getKey1() == null : this.getKey1().equals(other.getKey1()))
            && (this.getKey2() == null ? other.getKey2() == null : this.getKey2().equals(other.getKey2()))
            && (this.getContractTitle() == null ? other.getContractTitle() == null : this.getContractTitle().equals(other.getContractTitle()))
            && (this.getContractTime1() == null ? other.getContractTime1() == null : this.getContractTime1().equals(other.getContractTime1()))
            && (this.getContractTime2() == null ? other.getContractTime2() == null : this.getContractTime2().equals(other.getContractTime2()))
            && (this.getContractStatus() == null ? other.getContractStatus() == null : this.getContractStatus().equals(other.getContractStatus()))
            && (this.getContractCms() == null ? other.getContractCms() == null : this.getContractCms().equals(other.getContractCms()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getContractId() == null) ? 0 : getContractId().hashCode());
        result = prime * result + ((getUserId1() == null) ? 0 : getUserId1().hashCode());
        result = prime * result + ((getUserId2() == null) ? 0 : getUserId2().hashCode());
        result = prime * result + ((getKey1() == null) ? 0 : getKey1().hashCode());
        result = prime * result + ((getKey2() == null) ? 0 : getKey2().hashCode());
        result = prime * result + ((getContractTitle() == null) ? 0 : getContractTitle().hashCode());
        result = prime * result + ((getContractTime1() == null) ? 0 : getContractTime1().hashCode());
        result = prime * result + ((getContractTime2() == null) ? 0 : getContractTime2().hashCode());
        result = prime * result + ((getContractStatus() == null) ? 0 : getContractStatus().hashCode());
        result = prime * result + ((getContractCms() == null) ? 0 : getContractCms().hashCode());
        return result;
    }
}