/*
 * Swagger
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package cisco.com.dnac.v1.api.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DeviceInnerHistoryTaskInfoWorkItemList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class DeviceInnerHistoryTaskInfoWorkItemList {
  @SerializedName("command")
  private String command = null;

  @SerializedName("endTime")
  private Integer endTime = null;

  @SerializedName("outputStr")
  private String outputStr = null;

  @SerializedName("startTime")
  private Integer startTime = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("timeTaken")
  private Integer timeTaken = null;

  public DeviceInnerHistoryTaskInfoWorkItemList command(String command) {
    this.command = command;
    return this;
  }

   /**
   * Get command
   * @return command
  **/
  @ApiModelProperty(value = "")
  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }

  public DeviceInnerHistoryTaskInfoWorkItemList endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(value = "")
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public DeviceInnerHistoryTaskInfoWorkItemList outputStr(String outputStr) {
    this.outputStr = outputStr;
    return this;
  }

   /**
   * Get outputStr
   * @return outputStr
  **/
  @ApiModelProperty(value = "")
  public String getOutputStr() {
    return outputStr;
  }

  public void setOutputStr(String outputStr) {
    this.outputStr = outputStr;
  }

  public DeviceInnerHistoryTaskInfoWorkItemList startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(value = "")
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public DeviceInnerHistoryTaskInfoWorkItemList state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public DeviceInnerHistoryTaskInfoWorkItemList timeTaken(Integer timeTaken) {
    this.timeTaken = timeTaken;
    return this;
  }

   /**
   * Get timeTaken
   * @return timeTaken
  **/
  @ApiModelProperty(value = "")
  public Integer getTimeTaken() {
    return timeTaken;
  }

  public void setTimeTaken(Integer timeTaken) {
    this.timeTaken = timeTaken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceInnerHistoryTaskInfoWorkItemList deviceInnerHistoryTaskInfoWorkItemList = (DeviceInnerHistoryTaskInfoWorkItemList) o;
    return Objects.equals(this.command, deviceInnerHistoryTaskInfoWorkItemList.command) &&
        Objects.equals(this.endTime, deviceInnerHistoryTaskInfoWorkItemList.endTime) &&
        Objects.equals(this.outputStr, deviceInnerHistoryTaskInfoWorkItemList.outputStr) &&
        Objects.equals(this.startTime, deviceInnerHistoryTaskInfoWorkItemList.startTime) &&
        Objects.equals(this.state, deviceInnerHistoryTaskInfoWorkItemList.state) &&
        Objects.equals(this.timeTaken, deviceInnerHistoryTaskInfoWorkItemList.timeTaken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(command, endTime, outputStr, startTime, state, timeTaken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceInnerHistoryTaskInfoWorkItemList {\n");
    
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    outputStr: ").append(toIndentedString(outputStr)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    timeTaken: ").append(toIndentedString(timeTaken)).append("\n");
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

