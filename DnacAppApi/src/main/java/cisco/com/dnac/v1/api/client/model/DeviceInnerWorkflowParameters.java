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
import cisco.com.dnac.v1.api.client.model.ResetRequestConfigList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DeviceInnerWorkflowParameters
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class DeviceInnerWorkflowParameters {
  @SerializedName("configList")
  private List<ResetRequestConfigList> configList = null;

  @SerializedName("licenseLevel")
  private String licenseLevel = null;

  @SerializedName("licenseType")
  private String licenseType = null;

  @SerializedName("topOfStackSerialNumber")
  private String topOfStackSerialNumber = null;

  public DeviceInnerWorkflowParameters configList(List<ResetRequestConfigList> configList) {
    this.configList = configList;
    return this;
  }

  public DeviceInnerWorkflowParameters addConfigListItem(ResetRequestConfigList configListItem) {
    if (this.configList == null) {
      this.configList = new ArrayList<>();
    }
    this.configList.add(configListItem);
    return this;
  }

   /**
   * Get configList
   * @return configList
  **/
  @ApiModelProperty(value = "")
  public List<ResetRequestConfigList> getConfigList() {
    return configList;
  }

  public void setConfigList(List<ResetRequestConfigList> configList) {
    this.configList = configList;
  }

  public DeviceInnerWorkflowParameters licenseLevel(String licenseLevel) {
    this.licenseLevel = licenseLevel;
    return this;
  }

   /**
   * Get licenseLevel
   * @return licenseLevel
  **/
  @ApiModelProperty(value = "")
  public String getLicenseLevel() {
    return licenseLevel;
  }

  public void setLicenseLevel(String licenseLevel) {
    this.licenseLevel = licenseLevel;
  }

  public DeviceInnerWorkflowParameters licenseType(String licenseType) {
    this.licenseType = licenseType;
    return this;
  }

   /**
   * Get licenseType
   * @return licenseType
  **/
  @ApiModelProperty(value = "")
  public String getLicenseType() {
    return licenseType;
  }

  public void setLicenseType(String licenseType) {
    this.licenseType = licenseType;
  }

  public DeviceInnerWorkflowParameters topOfStackSerialNumber(String topOfStackSerialNumber) {
    this.topOfStackSerialNumber = topOfStackSerialNumber;
    return this;
  }

   /**
   * Get topOfStackSerialNumber
   * @return topOfStackSerialNumber
  **/
  @ApiModelProperty(value = "")
  public String getTopOfStackSerialNumber() {
    return topOfStackSerialNumber;
  }

  public void setTopOfStackSerialNumber(String topOfStackSerialNumber) {
    this.topOfStackSerialNumber = topOfStackSerialNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceInnerWorkflowParameters deviceInnerWorkflowParameters = (DeviceInnerWorkflowParameters) o;
    return Objects.equals(this.configList, deviceInnerWorkflowParameters.configList) &&
        Objects.equals(this.licenseLevel, deviceInnerWorkflowParameters.licenseLevel) &&
        Objects.equals(this.licenseType, deviceInnerWorkflowParameters.licenseType) &&
        Objects.equals(this.topOfStackSerialNumber, deviceInnerWorkflowParameters.topOfStackSerialNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configList, licenseLevel, licenseType, topOfStackSerialNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceInnerWorkflowParameters {\n");
    
    sb.append("    configList: ").append(toIndentedString(configList)).append("\n");
    sb.append("    licenseLevel: ").append(toIndentedString(licenseLevel)).append("\n");
    sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
    sb.append("    topOfStackSerialNumber: ").append(toIndentedString(topOfStackSerialNumber)).append("\n");
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

