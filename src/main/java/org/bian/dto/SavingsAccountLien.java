package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SavingsAccountLien
 */
public class SavingsAccountLien   {
  private String lienType = null;

  private String lienOriginator = null;

  private String lienStartDate = null;

  private String lienExpiryDate = null;

  private String lienStatus = null;

  private Object lienServiceConfiguration = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return lienType
  **/

  public String getLienType() {
    return lienType;
  }

  public void setLienType(String lienType) {
    this.lienType = lienType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return lienOriginator
  **/

  public String getLienOriginator() {
    return lienOriginator;
  }

  public void setLienOriginator(String lienOriginator) {
    this.lienOriginator = lienOriginator;
  }


  /**
   * Get lienStartDate
   * @return lienStartDate
  **/

  public String getLienStartDate() {
    return lienStartDate;
  }

  public void setLienStartDate(String lienStartDate) {
    this.lienStartDate = lienStartDate;
  }


  /**
   * Get lienExpiryDate
   * @return lienExpiryDate
  **/

  public String getLienExpiryDate() {
    return lienExpiryDate;
  }

  public void setLienExpiryDate(String lienExpiryDate) {
    this.lienExpiryDate = lienExpiryDate;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return lienStatus
  **/

  public String getLienStatus() {
    return lienStatus;
  }

  public void setLienStatus(String lienStatus) {
    this.lienStatus = lienStatus;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return lienServiceConfiguration
  **/

  public Object getLienServiceConfiguration() {
    return lienServiceConfiguration;
  }

  public void setLienServiceConfiguration(Object lienServiceConfiguration) {
    this.lienServiceConfiguration = lienServiceConfiguration;
  }


}

