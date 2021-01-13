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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * OperationResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-27T17:05:56.813+03:00")
public class OperationResult {
  @JsonProperty("statusCode")
  private Integer statusCode = null;

  @JsonProperty("description")
  private String description = null;

  public OperationResult statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * the status code of this operation result
   * @return statusCode
  **/
  @ApiModelProperty(required = true, value = "the status code of this operation result")
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public OperationResult description(String description) {
    this.description = description;
    return this;
  }

   /**
   * a brief description of this operation result
   * @return description
  **/
  @ApiModelProperty(value = "a brief description of this operation result")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationResult operationResult = (OperationResult) o;
    return Objects.equals(this.statusCode, operationResult.statusCode) &&
        Objects.equals(this.description, operationResult.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationResult {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

