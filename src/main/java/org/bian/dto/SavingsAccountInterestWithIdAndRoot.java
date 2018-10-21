package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.Frequency1Code;

import javax.validation.Valid;
  
/**
 * SavingsAccountInterestWithIdAndRoot
 */
public class SavingsAccountInterestWithIdAndRoot   {
  private String productInstanceReference = null;

  private String interestRateTransactionReference = null;

  private Object rateRateConfiguration = null;

  private String applicableInterestRate = null;

  private Frequency1Code rateApplicationSchedule = null;

  private String accuredInterestAmount = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return interestRateTransactionReference
  **/

  public String getInterestRateTransactionReference() {
    return interestRateTransactionReference;
  }

  public void setInterestRateTransactionReference(String interestRateTransactionReference) {
    this.interestRateTransactionReference = interestRateTransactionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: 'service domain level structure' 
   * @return rateRateConfiguration
  **/

  public Object getRateRateConfiguration() {
    return rateRateConfiguration;
  }

  public void setRateRateConfiguration(Object rateRateConfiguration) {
    this.rateRateConfiguration = rateRateConfiguration;
  }


  /**
   * Get applicableInterestRate
   * @return applicableInterestRate
  **/

  public String getApplicableInterestRate() {
    return applicableInterestRate;
  }

  public void setApplicableInterestRate(String applicableInterestRate) {
    this.applicableInterestRate = applicableInterestRate;
  }


  /**
   * Get rateApplicationSchedule
   * @return rateApplicationSchedule
  **/

  public Frequency1Code getRateApplicationSchedule() {
    return rateApplicationSchedule;
  }

  public void setRateApplicationSchedule(Frequency1Code rateApplicationSchedule) {
    this.rateApplicationSchedule = rateApplicationSchedule;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount 
   * @return accuredInterestAmount
  **/

  public String getAccuredInterestAmount() {
    return accuredInterestAmount;
  }

  public void setAccuredInterestAmount(String accuredInterestAmount) {
    this.accuredInterestAmount = accuredInterestAmount;
  }


}

