/*
 * Contest Service API
 * Contest service is a micro service for checking program output with expected answer. 
 *
 * OpenAPI spec version: 0.1.0
 * Contact: api@t-challenge.t-systems.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ru.tsystems.tchallenge.codemaster.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * status of compilation program
 */
public enum CompileStatus {
  
  OK("OK"),
  
  COMPILATION_ERROR("COMPILATION_ERROR"),
  
  SERVER_ERROR("SERVER_ERROR");

  private String value;

  CompileStatus(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CompileStatus fromValue(String text) {
    for (CompileStatus b : CompileStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
