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
import ru.tsystems.tchallenge.codemaster.model.Language;
import ru.tsystems.tchallenge.codemaster.model.RunStatus;

/**
 * Result of launching program
 */
@ApiModel(description = "Result of launching program")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-27T17:05:56.813+03:00")
public class RunResult {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("language")
  private Language language = null;

  @JsonProperty("languageName")
  private String languageName = null;

  @JsonProperty("status")
  private RunStatus status = null;

  @JsonProperty("input")
  private String input = null;

  @JsonProperty("output")
  private String output = null;

  @JsonProperty("stderr")
  private String stderr = null;

  @JsonProperty("time")
  private Integer time = null;

  public RunResult id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RunResult language(Language language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @ApiModelProperty(value = "")
  public Language getLanguage() {
    return language;
  }

  public void setLanguage(Language language) {
    this.language = language;
  }

  public RunResult languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

   /**
   * Full name of code language, including version
   * @return languageName
  **/
  @ApiModelProperty(value = "Full name of code language, including version")
  public String getLanguageName() {
    return languageName;
  }

  public void setLanguageName(String languageName) {
    this.languageName = languageName;
  }

  public RunResult status(RunStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public RunStatus getStatus() {
    return status;
  }

  public void setStatus(RunStatus status) {
    this.status = status;
  }

  public RunResult input(String input) {
    this.input = input;
    return this;
  }

   /**
   * Input to program
   * @return input
  **/
  @ApiModelProperty(value = "Input to program")
  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }

  public RunResult output(String output) {
    this.output = output;
    return this;
  }

   /**
   * Output of program (from stdout or output.txt file)
   * @return output
  **/
  @ApiModelProperty(value = "Output of program (from stdout or output.txt file)")
  public String getOutput() {
    return output;
  }

  public void setOutput(String output) {
    this.output = output;
  }

  public RunResult stderr(String stderr) {
    this.stderr = stderr;
    return this;
  }

   /**
   * Standart error output of program
   * @return stderr
  **/
  @ApiModelProperty(value = "Standart error output of program")
  public String getStderr() {
    return stderr;
  }

  public void setStderr(String stderr) {
    this.stderr = stderr;
  }

  public RunResult time(Integer time) {
    this.time = time;
    return this;
  }

   /**
   * Program execution time
   * @return time
  **/
  @ApiModelProperty(value = "Program execution time")
  public Integer getTime() {
    return time;
  }

  public void setTime(Integer time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunResult runResult = (RunResult) o;
    return Objects.equals(this.id, runResult.id) &&
        Objects.equals(this.language, runResult.language) &&
        Objects.equals(this.languageName, runResult.languageName) &&
        Objects.equals(this.status, runResult.status) &&
        Objects.equals(this.input, runResult.input) &&
        Objects.equals(this.output, runResult.output) &&
        Objects.equals(this.stderr, runResult.stderr) &&
        Objects.equals(this.time, runResult.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, language, languageName, status, input, output, stderr, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunResult {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    stderr: ").append(toIndentedString(stderr)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

