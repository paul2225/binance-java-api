package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * A deposit that was done to a Binance account.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Deposit {

  /**
   * Amount deposited.
   */
  private String amount;

  /**
   * Symbol.
   * "amount":"0.00999800",
   *         "coin":"PAXG",
   *         "network":"ETH",
   *         "status":1,
   *         "address":"0x788cabe9236ce061e5a892e1a59395a81fc8d62c",
   *         "addressTag":"",
   *         "txId":"0xaad4654a3234aa6118af9b4b335f5ae81c360b2394721c019b5d1e75328b09f3",
   *         "insertTime":1599621997000,
   *         "transferType":0,
   *         "confirmTimes":"12/12"
   */
  private String coin;
  private String network;
  private int status;
  private String address;
  private String addressTag;
  private String txId;
  private long insertTime;
  private int transferType;
  private String confirmTimes;

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public String getCoin() {
    return coin;
  }

  public void setCoin(String coin) {
    this.coin = coin;
  }

  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getAddressTag() {
    return addressTag;
  }

  public void setAddressTag(String addressTag) {
    this.addressTag = addressTag;
  }

  public String getTxId() {
    return txId;
  }

  public void setTxId(String txId) {
    this.txId = txId;
  }

  public long getInsertTime() {
    return insertTime;
  }

  public void setInsertTime(long insertTime) {
    this.insertTime = insertTime;
  }

  public int getTransferType() {
    return transferType;
  }

  public void setTransferType(int transferType) {
    this.transferType = transferType;
  }

  public String getConfirmTimes() {
    return confirmTimes;
  }

  public void setConfirmTimes(String confirmTimes) {
    this.confirmTimes = confirmTimes;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("amount", amount)
        .append("asset", coin)
        .append("insertTime", insertTime)
        .append("txId", txId)
        .append("status", status)
        .toString();
  }
}
