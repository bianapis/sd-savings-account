package org.bian.dto;

import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * iso-link : [click_here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/codesets/_ar_mp9p-Ed-ak6NoX_4Aeg_1946817553) general-info: Specifies the regularity of an event. 
 */
public enum Frequency1Code {
  
  YEAR("YEAR"),
  
  MNTH("MNTH"),
  
  QURT("QURT"),
  
  MIAN("MIAN"),
  
  WEEK("WEEK"),
  
  DAIL("DAIL"),
  
  ADHO("ADHO"),
  
  INDA("INDA");

  private String value;

  Frequency1Code(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Frequency1Code fromValue(String text) {
    for (Frequency1Code b : Frequency1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

