package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SavingsAccountInventory
 */
public class SavingsAccountInventory   {
  private String inventoryItemType = null;

  private Object inventoryItemProperties = null;

  private String inventoryItemStatus = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return inventoryItemType
  **/

  public String getInventoryItemType() {
    return inventoryItemType;
  }

  public void setInventoryItemType(String inventoryItemType) {
    this.inventoryItemType = inventoryItemType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: 'e.g. sequence numbers' 
   * @return inventoryItemProperties
  **/

  public Object getInventoryItemProperties() {
    return inventoryItemProperties;
  }

  public void setInventoryItemProperties(Object inventoryItemProperties) {
    this.inventoryItemProperties = inventoryItemProperties;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return inventoryItemStatus
  **/

  public String getInventoryItemStatus() {
    return inventoryItemStatus;
  }

  public void setInventoryItemStatus(String inventoryItemStatus) {
    this.inventoryItemStatus = inventoryItemStatus;
  }


}

