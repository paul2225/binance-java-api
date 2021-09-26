package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * A withdraw that was done to a Binance account.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Withdraw {

    /**
     * Destination address.
     */
    private String address;

    /**
     * Amount withdrawn.
     */
    private String amount;

    private String applyTime;

    /**
     * Symbol.
     */
    private String coin;

    /**
     * Id.
     */
    private String id;

    /**
     * Id.
     */
    private String withdrawOrderid;

    private String network;

    private Integer transferType;

    private Integer status;

    private String transactionField;

    private String confirmNo;

    /**
     * Transaction id.
     */
    private String txId;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public String getTxId() {
        return txId;
    }

    public void setTxId(String txId) {
        this.txId = txId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getWithdrawOrderid() {
        return withdrawOrderid;
    }

    public void setWithdrawOrderid(String withdrawOrderid) {
        this.withdrawOrderid = withdrawOrderid;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public Integer getTransferType() {
        return transferType;
    }

    public void setTransferType(Integer transferType) {
        this.transferType = transferType;
    }

    public String getTransactionField() {
        return transactionField;
    }

    public void setTransactionField(String transactionField) {
        this.transactionField = transactionField;
    }

    public String getConfirmNo() {
        return confirmNo;
    }

    public void setConfirmNo(String confirmNo) {
        this.confirmNo = confirmNo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("amount", amount)
                .append("address", address)
                .append("coin", coin)
                .append("applyTime", applyTime)
                .append("txId", txId)
                .append("id", id)
                .append("status", status)
                .toString();
    }
}


