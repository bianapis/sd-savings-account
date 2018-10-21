package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.DateTimePeriod;

import javax.validation.Valid;
  
/**
 * SavingsAccountStatementWithIdAndRoot
 */
public class SavingsAccountStatementWithIdAndRoot   {
  private String productInstanceReference = null;

  private String balanceType = null;

  private String balance = null;

  private String statementInstanceReference = null;

  private String statementType = null;

  private String statementTrasactionType = null;

  private DateTimePeriod statementPeriod = null;

  private String transactionRecordReference = null;

  private String transactionType = null;

  private String transactionPrincipleAmount = null;

  private String transactionCounterparty = null;

  private String transactionObligation = null;

  private String transactionDateTime = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 'savings account number' 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: 'e.g. booked, available, closing, pending block' 
   * @return balanceType
  **/

  public String getBalanceType() {
    return balanceType;
  }

  public void setBalanceType(String balanceType) {
    this.balanceType = balanceType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount 
   * @return balance
  **/

  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return statementInstanceReference
  **/

  public String getStatementInstanceReference() {
    return statementInstanceReference;
  }

  public void setStatementInstanceReference(String statementInstanceReference) {
    this.statementInstanceReference = statementInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: 'e.g. balance/mini-statement/annual' 
   * @return statementType
  **/

  public String getStatementType() {
    return statementType;
  }

  public void setStatementType(String statementType) {
    this.statementType = statementType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return statementTrasactionType
  **/

  public String getStatementTrasactionType() {
    return statementTrasactionType;
  }

  public void setStatementTrasactionType(String statementTrasactionType) {
    this.statementTrasactionType = statementTrasactionType;
  }


  /**
   * Get statementPeriod
   * @return statementPeriod
  **/

  public DateTimePeriod getStatementPeriod() {
    return statementPeriod;
  }

  public void setStatementPeriod(DateTimePeriod statementPeriod) {
    this.statementPeriod = statementPeriod;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return transactionRecordReference
  **/

  public String getTransactionRecordReference() {
    return transactionRecordReference;
  }

  public void setTransactionRecordReference(String transactionRecordReference) {
    this.transactionRecordReference = transactionRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return transactionType
  **/

  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount 
   * @return transactionPrincipleAmount
  **/

  public String getTransactionPrincipleAmount() {
    return transactionPrincipleAmount;
  }

  public void setTransactionPrincipleAmount(String transactionPrincipleAmount) {
    this.transactionPrincipleAmount = transactionPrincipleAmount;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: 'e.g. payee, merchant' 
   * @return transactionCounterparty
  **/

  public String getTransactionCounterparty() {
    return transactionCounterparty;
  }

  public void setTransactionCounterparty(String transactionCounterparty) {
    this.transactionCounterparty = transactionCounterparty;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return transactionObligation
  **/

  public String getTransactionObligation() {
    return transactionObligation;
  }

  public void setTransactionObligation(String transactionObligation) {
    this.transactionObligation = transactionObligation;
  }


  /**
   * Get transactionDateTime
   * @return transactionDateTime
  **/

  public String getTransactionDateTime() {
    return transactionDateTime;
  }

  public void setTransactionDateTime(String transactionDateTime) {
    this.transactionDateTime = transactionDateTime;
  }


}

