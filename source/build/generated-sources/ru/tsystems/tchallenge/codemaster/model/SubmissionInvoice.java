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
import ru.tsystems.tchallenge.codemaster.model.CompileInvoice;
import ru.tsystems.tchallenge.codemaster.model.Contest;

/**
 * Invoice to create submission (run tests)
 */
@ApiModel(description = "Invoice to create submission (run tests)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-27T17:05:56.813+03:00")
public class SubmissionInvoice {
  @JsonProperty("submission")
  private CompileInvoice submission = null;

  @JsonProperty("contest")
  private Contest contest = null;

  public SubmissionInvoice submission(CompileInvoice submission) {
    this.submission = submission;
    return this;
  }

   /**
   * Get submission
   * @return submission
  **/
  @ApiModelProperty(required = true, value = "")
  public CompileInvoice getSubmission() {
    return submission;
  }

  public void setSubmission(CompileInvoice submission) {
    this.submission = submission;
  }

  public SubmissionInvoice contest(Contest contest) {
    this.contest = contest;
    return this;
  }

   /**
   * Get contest
   * @return contest
  **/
  @ApiModelProperty(required = true, value = "")
  public Contest getContest() {
    return contest;
  }

  public void setContest(Contest contest) {
    this.contest = contest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionInvoice submissionInvoice = (SubmissionInvoice) o;
    return Objects.equals(this.submission, submissionInvoice.submission) &&
        Objects.equals(this.contest, submissionInvoice.contest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submission, contest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionInvoice {\n");
    
    sb.append("    submission: ").append(toIndentedString(submission)).append("\n");
    sb.append("    contest: ").append(toIndentedString(contest)).append("\n");
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

