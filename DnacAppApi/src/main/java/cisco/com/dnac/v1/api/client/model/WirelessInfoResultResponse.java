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
import java.util.ArrayList;
import java.util.List;

/**
 * WirelessInfoResultResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class WirelessInfoResultResponse {
  @SerializedName("adminEnabledPorts")
  private List<Integer> adminEnabledPorts = null;

  @SerializedName("apGroupName")
  private String apGroupName = null;

  @SerializedName("deviceId")
  private String deviceId = null;

  @SerializedName("ethMacAddress")
  private String ethMacAddress = null;

  @SerializedName("flexGroupName")
  private String flexGroupName = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("instanceTenantId")
  private String instanceTenantId = null;

  @SerializedName("instanceUuid")
  private String instanceUuid = null;

  @SerializedName("lagModeEnabled")
  private Boolean lagModeEnabled = null;

  @SerializedName("netconfEnabled")
  private Boolean netconfEnabled = null;

  /**
   * Gets or Sets wirelessLicenseInfo
   */
  @JsonAdapter(WirelessLicenseInfoEnum.Adapter.class)
  public enum WirelessLicenseInfoEnum {
    ADVANTAGE("ADVANTAGE"),
    
    ESSENTIALS("ESSENTIALS");

    private String value;

    WirelessLicenseInfoEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WirelessLicenseInfoEnum fromValue(String text) {
      for (WirelessLicenseInfoEnum b : WirelessLicenseInfoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<WirelessLicenseInfoEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WirelessLicenseInfoEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WirelessLicenseInfoEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return WirelessLicenseInfoEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("wirelessLicenseInfo")
  private WirelessLicenseInfoEnum wirelessLicenseInfo = null;

  @SerializedName("wirelessPackageInstalled")
  private Boolean wirelessPackageInstalled = null;

  public WirelessInfoResultResponse adminEnabledPorts(List<Integer> adminEnabledPorts) {
    this.adminEnabledPorts = adminEnabledPorts;
    return this;
  }

  public WirelessInfoResultResponse addAdminEnabledPortsItem(Integer adminEnabledPortsItem) {
    if (this.adminEnabledPorts == null) {
      this.adminEnabledPorts = new ArrayList<>();
    }
    this.adminEnabledPorts.add(adminEnabledPortsItem);
    return this;
  }

   /**
   * Get adminEnabledPorts
   * @return adminEnabledPorts
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getAdminEnabledPorts() {
    return adminEnabledPorts;
  }

  public void setAdminEnabledPorts(List<Integer> adminEnabledPorts) {
    this.adminEnabledPorts = adminEnabledPorts;
  }

  public WirelessInfoResultResponse apGroupName(String apGroupName) {
    this.apGroupName = apGroupName;
    return this;
  }

   /**
   * Get apGroupName
   * @return apGroupName
  **/
  @ApiModelProperty(value = "")
  public String getApGroupName() {
    return apGroupName;
  }

  public void setApGroupName(String apGroupName) {
    this.apGroupName = apGroupName;
  }

  public WirelessInfoResultResponse deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Get deviceId
   * @return deviceId
  **/
  @ApiModelProperty(value = "")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public WirelessInfoResultResponse ethMacAddress(String ethMacAddress) {
    this.ethMacAddress = ethMacAddress;
    return this;
  }

   /**
   * Get ethMacAddress
   * @return ethMacAddress
  **/
  @ApiModelProperty(value = "")
  public String getEthMacAddress() {
    return ethMacAddress;
  }

  public void setEthMacAddress(String ethMacAddress) {
    this.ethMacAddress = ethMacAddress;
  }

  public WirelessInfoResultResponse flexGroupName(String flexGroupName) {
    this.flexGroupName = flexGroupName;
    return this;
  }

   /**
   * Get flexGroupName
   * @return flexGroupName
  **/
  @ApiModelProperty(value = "")
  public String getFlexGroupName() {
    return flexGroupName;
  }

  public void setFlexGroupName(String flexGroupName) {
    this.flexGroupName = flexGroupName;
  }

  public WirelessInfoResultResponse id(String id) {
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

  public WirelessInfoResultResponse instanceTenantId(String instanceTenantId) {
    this.instanceTenantId = instanceTenantId;
    return this;
  }

   /**
   * Get instanceTenantId
   * @return instanceTenantId
  **/
  @ApiModelProperty(value = "")
  public String getInstanceTenantId() {
    return instanceTenantId;
  }

  public void setInstanceTenantId(String instanceTenantId) {
    this.instanceTenantId = instanceTenantId;
  }

  public WirelessInfoResultResponse instanceUuid(String instanceUuid) {
    this.instanceUuid = instanceUuid;
    return this;
  }

   /**
   * Get instanceUuid
   * @return instanceUuid
  **/
  @ApiModelProperty(value = "")
  public String getInstanceUuid() {
    return instanceUuid;
  }

  public void setInstanceUuid(String instanceUuid) {
    this.instanceUuid = instanceUuid;
  }

  public WirelessInfoResultResponse lagModeEnabled(Boolean lagModeEnabled) {
    this.lagModeEnabled = lagModeEnabled;
    return this;
  }

   /**
   * Get lagModeEnabled
   * @return lagModeEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isLagModeEnabled() {
    return lagModeEnabled;
  }

  public void setLagModeEnabled(Boolean lagModeEnabled) {
    this.lagModeEnabled = lagModeEnabled;
  }

  public WirelessInfoResultResponse netconfEnabled(Boolean netconfEnabled) {
    this.netconfEnabled = netconfEnabled;
    return this;
  }

   /**
   * Get netconfEnabled
   * @return netconfEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isNetconfEnabled() {
    return netconfEnabled;
  }

  public void setNetconfEnabled(Boolean netconfEnabled) {
    this.netconfEnabled = netconfEnabled;
  }

  public WirelessInfoResultResponse wirelessLicenseInfo(WirelessLicenseInfoEnum wirelessLicenseInfo) {
    this.wirelessLicenseInfo = wirelessLicenseInfo;
    return this;
  }

   /**
   * Get wirelessLicenseInfo
   * @return wirelessLicenseInfo
  **/
  @ApiModelProperty(value = "")
  public WirelessLicenseInfoEnum getWirelessLicenseInfo() {
    return wirelessLicenseInfo;
  }

  public void setWirelessLicenseInfo(WirelessLicenseInfoEnum wirelessLicenseInfo) {
    this.wirelessLicenseInfo = wirelessLicenseInfo;
  }

  public WirelessInfoResultResponse wirelessPackageInstalled(Boolean wirelessPackageInstalled) {
    this.wirelessPackageInstalled = wirelessPackageInstalled;
    return this;
  }

   /**
   * Get wirelessPackageInstalled
   * @return wirelessPackageInstalled
  **/
  @ApiModelProperty(value = "")
  public Boolean isWirelessPackageInstalled() {
    return wirelessPackageInstalled;
  }

  public void setWirelessPackageInstalled(Boolean wirelessPackageInstalled) {
    this.wirelessPackageInstalled = wirelessPackageInstalled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WirelessInfoResultResponse wirelessInfoResultResponse = (WirelessInfoResultResponse) o;
    return Objects.equals(this.adminEnabledPorts, wirelessInfoResultResponse.adminEnabledPorts) &&
        Objects.equals(this.apGroupName, wirelessInfoResultResponse.apGroupName) &&
        Objects.equals(this.deviceId, wirelessInfoResultResponse.deviceId) &&
        Objects.equals(this.ethMacAddress, wirelessInfoResultResponse.ethMacAddress) &&
        Objects.equals(this.flexGroupName, wirelessInfoResultResponse.flexGroupName) &&
        Objects.equals(this.id, wirelessInfoResultResponse.id) &&
        Objects.equals(this.instanceTenantId, wirelessInfoResultResponse.instanceTenantId) &&
        Objects.equals(this.instanceUuid, wirelessInfoResultResponse.instanceUuid) &&
        Objects.equals(this.lagModeEnabled, wirelessInfoResultResponse.lagModeEnabled) &&
        Objects.equals(this.netconfEnabled, wirelessInfoResultResponse.netconfEnabled) &&
        Objects.equals(this.wirelessLicenseInfo, wirelessInfoResultResponse.wirelessLicenseInfo) &&
        Objects.equals(this.wirelessPackageInstalled, wirelessInfoResultResponse.wirelessPackageInstalled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminEnabledPorts, apGroupName, deviceId, ethMacAddress, flexGroupName, id, instanceTenantId, instanceUuid, lagModeEnabled, netconfEnabled, wirelessLicenseInfo, wirelessPackageInstalled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WirelessInfoResultResponse {\n");
    
    sb.append("    adminEnabledPorts: ").append(toIndentedString(adminEnabledPorts)).append("\n");
    sb.append("    apGroupName: ").append(toIndentedString(apGroupName)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    ethMacAddress: ").append(toIndentedString(ethMacAddress)).append("\n");
    sb.append("    flexGroupName: ").append(toIndentedString(flexGroupName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instanceTenantId: ").append(toIndentedString(instanceTenantId)).append("\n");
    sb.append("    instanceUuid: ").append(toIndentedString(instanceUuid)).append("\n");
    sb.append("    lagModeEnabled: ").append(toIndentedString(lagModeEnabled)).append("\n");
    sb.append("    netconfEnabled: ").append(toIndentedString(netconfEnabled)).append("\n");
    sb.append("    wirelessLicenseInfo: ").append(toIndentedString(wirelessLicenseInfo)).append("\n");
    sb.append("    wirelessPackageInstalled: ").append(toIndentedString(wirelessPackageInstalled)).append("\n");
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

