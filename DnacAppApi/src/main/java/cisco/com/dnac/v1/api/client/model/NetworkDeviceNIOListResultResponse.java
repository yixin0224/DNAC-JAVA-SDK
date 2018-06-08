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
 * NetworkDeviceNIOListResultResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class NetworkDeviceNIOListResultResponse {
  @SerializedName("anchorWlcForAp")
  private String anchorWlcForAp = null;

  @SerializedName("authModelId")
  private String authModelId = null;

  @SerializedName("avgUpdateFrequency")
  private Integer avgUpdateFrequency = null;

  @SerializedName("bootDateTime")
  private String bootDateTime = null;

  @SerializedName("cliStatus")
  private String cliStatus = null;

  @SerializedName("duplicateDeviceId")
  private String duplicateDeviceId = null;

  @SerializedName("errorCode")
  private String errorCode = null;

  @SerializedName("errorDescription")
  private String errorDescription = null;

  @SerializedName("family")
  private String family = null;

  @SerializedName("hostname")
  private String hostname = null;

  @SerializedName("httpStatus")
  private String httpStatus = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("imageName")
  private String imageName = null;

  @SerializedName("ingressQueueConfig")
  private String ingressQueueConfig = null;

  @SerializedName("interfaceCount")
  private String interfaceCount = null;

  @SerializedName("inventoryCollectionStatus")
  private String inventoryCollectionStatus = null;

  @SerializedName("inventoryReachabilityStatus")
  private String inventoryReachabilityStatus = null;

  @SerializedName("lastUpdated")
  private String lastUpdated = null;

  @SerializedName("lineCardCount")
  private String lineCardCount = null;

  @SerializedName("lineCardId")
  private String lineCardId = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("locationName")
  private String locationName = null;

  @SerializedName("macAddress")
  private String macAddress = null;

  @SerializedName("managementIpAddress")
  private String managementIpAddress = null;

  @SerializedName("memorySize")
  private String memorySize = null;

  @SerializedName("netconfStatus")
  private String netconfStatus = null;

  @SerializedName("numUpdates")
  private Integer numUpdates = null;

  @SerializedName("pingStatus")
  private String pingStatus = null;

  @SerializedName("platformId")
  private String platformId = null;

  @SerializedName("portRange")
  private String portRange = null;

  @SerializedName("qosStatus")
  private String qosStatus = null;

  @SerializedName("reachabilityFailureReason")
  private String reachabilityFailureReason = null;

  @SerializedName("reachabilityStatus")
  private String reachabilityStatus = null;

  @SerializedName("role")
  private String role = null;

  @SerializedName("roleSource")
  private String roleSource = null;

  @SerializedName("serialNumber")
  private String serialNumber = null;

  @SerializedName("snmpContact")
  private String snmpContact = null;

  @SerializedName("snmpLocation")
  private String snmpLocation = null;

  @SerializedName("snmpStatus")
  private String snmpStatus = null;

  @SerializedName("softwareVersion")
  private String softwareVersion = null;

  @SerializedName("tag")
  private String tag = null;

  @SerializedName("tagCount")
  private Integer tagCount = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("upTime")
  private String upTime = null;

  @SerializedName("vendor")
  private String vendor = null;

  @SerializedName("wlcApDeviceStatus")
  private String wlcApDeviceStatus = null;

  public NetworkDeviceNIOListResultResponse anchorWlcForAp(String anchorWlcForAp) {
    this.anchorWlcForAp = anchorWlcForAp;
    return this;
  }

   /**
   * Get anchorWlcForAp
   * @return anchorWlcForAp
  **/
  @ApiModelProperty(value = "")
  public String getAnchorWlcForAp() {
    return anchorWlcForAp;
  }

  public void setAnchorWlcForAp(String anchorWlcForAp) {
    this.anchorWlcForAp = anchorWlcForAp;
  }

  public NetworkDeviceNIOListResultResponse authModelId(String authModelId) {
    this.authModelId = authModelId;
    return this;
  }

   /**
   * Get authModelId
   * @return authModelId
  **/
  @ApiModelProperty(value = "")
  public String getAuthModelId() {
    return authModelId;
  }

  public void setAuthModelId(String authModelId) {
    this.authModelId = authModelId;
  }

  public NetworkDeviceNIOListResultResponse avgUpdateFrequency(Integer avgUpdateFrequency) {
    this.avgUpdateFrequency = avgUpdateFrequency;
    return this;
  }

   /**
   * Get avgUpdateFrequency
   * @return avgUpdateFrequency
  **/
  @ApiModelProperty(value = "")
  public Integer getAvgUpdateFrequency() {
    return avgUpdateFrequency;
  }

  public void setAvgUpdateFrequency(Integer avgUpdateFrequency) {
    this.avgUpdateFrequency = avgUpdateFrequency;
  }

  public NetworkDeviceNIOListResultResponse bootDateTime(String bootDateTime) {
    this.bootDateTime = bootDateTime;
    return this;
  }

   /**
   * Get bootDateTime
   * @return bootDateTime
  **/
  @ApiModelProperty(value = "")
  public String getBootDateTime() {
    return bootDateTime;
  }

  public void setBootDateTime(String bootDateTime) {
    this.bootDateTime = bootDateTime;
  }

  public NetworkDeviceNIOListResultResponse cliStatus(String cliStatus) {
    this.cliStatus = cliStatus;
    return this;
  }

   /**
   * Get cliStatus
   * @return cliStatus
  **/
  @ApiModelProperty(value = "")
  public String getCliStatus() {
    return cliStatus;
  }

  public void setCliStatus(String cliStatus) {
    this.cliStatus = cliStatus;
  }

  public NetworkDeviceNIOListResultResponse duplicateDeviceId(String duplicateDeviceId) {
    this.duplicateDeviceId = duplicateDeviceId;
    return this;
  }

   /**
   * Get duplicateDeviceId
   * @return duplicateDeviceId
  **/
  @ApiModelProperty(value = "")
  public String getDuplicateDeviceId() {
    return duplicateDeviceId;
  }

  public void setDuplicateDeviceId(String duplicateDeviceId) {
    this.duplicateDeviceId = duplicateDeviceId;
  }

  public NetworkDeviceNIOListResultResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @ApiModelProperty(value = "")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public NetworkDeviceNIOListResultResponse errorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

   /**
   * Get errorDescription
   * @return errorDescription
  **/
  @ApiModelProperty(value = "")
  public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }

  public NetworkDeviceNIOListResultResponse family(String family) {
    this.family = family;
    return this;
  }

   /**
   * Get family
   * @return family
  **/
  @ApiModelProperty(value = "")
  public String getFamily() {
    return family;
  }

  public void setFamily(String family) {
    this.family = family;
  }

  public NetworkDeviceNIOListResultResponse hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @ApiModelProperty(value = "")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public NetworkDeviceNIOListResultResponse httpStatus(String httpStatus) {
    this.httpStatus = httpStatus;
    return this;
  }

   /**
   * Get httpStatus
   * @return httpStatus
  **/
  @ApiModelProperty(value = "")
  public String getHttpStatus() {
    return httpStatus;
  }

  public void setHttpStatus(String httpStatus) {
    this.httpStatus = httpStatus;
  }

  public NetworkDeviceNIOListResultResponse id(String id) {
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

  public NetworkDeviceNIOListResultResponse imageName(String imageName) {
    this.imageName = imageName;
    return this;
  }

   /**
   * Get imageName
   * @return imageName
  **/
  @ApiModelProperty(value = "")
  public String getImageName() {
    return imageName;
  }

  public void setImageName(String imageName) {
    this.imageName = imageName;
  }

  public NetworkDeviceNIOListResultResponse ingressQueueConfig(String ingressQueueConfig) {
    this.ingressQueueConfig = ingressQueueConfig;
    return this;
  }

   /**
   * Get ingressQueueConfig
   * @return ingressQueueConfig
  **/
  @ApiModelProperty(value = "")
  public String getIngressQueueConfig() {
    return ingressQueueConfig;
  }

  public void setIngressQueueConfig(String ingressQueueConfig) {
    this.ingressQueueConfig = ingressQueueConfig;
  }

  public NetworkDeviceNIOListResultResponse interfaceCount(String interfaceCount) {
    this.interfaceCount = interfaceCount;
    return this;
  }

   /**
   * Get interfaceCount
   * @return interfaceCount
  **/
  @ApiModelProperty(value = "")
  public String getInterfaceCount() {
    return interfaceCount;
  }

  public void setInterfaceCount(String interfaceCount) {
    this.interfaceCount = interfaceCount;
  }

  public NetworkDeviceNIOListResultResponse inventoryCollectionStatus(String inventoryCollectionStatus) {
    this.inventoryCollectionStatus = inventoryCollectionStatus;
    return this;
  }

   /**
   * Get inventoryCollectionStatus
   * @return inventoryCollectionStatus
  **/
  @ApiModelProperty(value = "")
  public String getInventoryCollectionStatus() {
    return inventoryCollectionStatus;
  }

  public void setInventoryCollectionStatus(String inventoryCollectionStatus) {
    this.inventoryCollectionStatus = inventoryCollectionStatus;
  }

  public NetworkDeviceNIOListResultResponse inventoryReachabilityStatus(String inventoryReachabilityStatus) {
    this.inventoryReachabilityStatus = inventoryReachabilityStatus;
    return this;
  }

   /**
   * Get inventoryReachabilityStatus
   * @return inventoryReachabilityStatus
  **/
  @ApiModelProperty(value = "")
  public String getInventoryReachabilityStatus() {
    return inventoryReachabilityStatus;
  }

  public void setInventoryReachabilityStatus(String inventoryReachabilityStatus) {
    this.inventoryReachabilityStatus = inventoryReachabilityStatus;
  }

  public NetworkDeviceNIOListResultResponse lastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "")
  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public NetworkDeviceNIOListResultResponse lineCardCount(String lineCardCount) {
    this.lineCardCount = lineCardCount;
    return this;
  }

   /**
   * Get lineCardCount
   * @return lineCardCount
  **/
  @ApiModelProperty(value = "")
  public String getLineCardCount() {
    return lineCardCount;
  }

  public void setLineCardCount(String lineCardCount) {
    this.lineCardCount = lineCardCount;
  }

  public NetworkDeviceNIOListResultResponse lineCardId(String lineCardId) {
    this.lineCardId = lineCardId;
    return this;
  }

   /**
   * Get lineCardId
   * @return lineCardId
  **/
  @ApiModelProperty(value = "")
  public String getLineCardId() {
    return lineCardId;
  }

  public void setLineCardId(String lineCardId) {
    this.lineCardId = lineCardId;
  }

  public NetworkDeviceNIOListResultResponse location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public NetworkDeviceNIOListResultResponse locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

   /**
   * Get locationName
   * @return locationName
  **/
  @ApiModelProperty(value = "")
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  public NetworkDeviceNIOListResultResponse macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

   /**
   * Get macAddress
   * @return macAddress
  **/
  @ApiModelProperty(value = "")
  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  public NetworkDeviceNIOListResultResponse managementIpAddress(String managementIpAddress) {
    this.managementIpAddress = managementIpAddress;
    return this;
  }

   /**
   * Get managementIpAddress
   * @return managementIpAddress
  **/
  @ApiModelProperty(value = "")
  public String getManagementIpAddress() {
    return managementIpAddress;
  }

  public void setManagementIpAddress(String managementIpAddress) {
    this.managementIpAddress = managementIpAddress;
  }

  public NetworkDeviceNIOListResultResponse memorySize(String memorySize) {
    this.memorySize = memorySize;
    return this;
  }

   /**
   * Get memorySize
   * @return memorySize
  **/
  @ApiModelProperty(value = "")
  public String getMemorySize() {
    return memorySize;
  }

  public void setMemorySize(String memorySize) {
    this.memorySize = memorySize;
  }

  public NetworkDeviceNIOListResultResponse netconfStatus(String netconfStatus) {
    this.netconfStatus = netconfStatus;
    return this;
  }

   /**
   * Get netconfStatus
   * @return netconfStatus
  **/
  @ApiModelProperty(value = "")
  public String getNetconfStatus() {
    return netconfStatus;
  }

  public void setNetconfStatus(String netconfStatus) {
    this.netconfStatus = netconfStatus;
  }

  public NetworkDeviceNIOListResultResponse numUpdates(Integer numUpdates) {
    this.numUpdates = numUpdates;
    return this;
  }

   /**
   * Get numUpdates
   * @return numUpdates
  **/
  @ApiModelProperty(value = "")
  public Integer getNumUpdates() {
    return numUpdates;
  }

  public void setNumUpdates(Integer numUpdates) {
    this.numUpdates = numUpdates;
  }

  public NetworkDeviceNIOListResultResponse pingStatus(String pingStatus) {
    this.pingStatus = pingStatus;
    return this;
  }

   /**
   * Get pingStatus
   * @return pingStatus
  **/
  @ApiModelProperty(value = "")
  public String getPingStatus() {
    return pingStatus;
  }

  public void setPingStatus(String pingStatus) {
    this.pingStatus = pingStatus;
  }

  public NetworkDeviceNIOListResultResponse platformId(String platformId) {
    this.platformId = platformId;
    return this;
  }

   /**
   * Get platformId
   * @return platformId
  **/
  @ApiModelProperty(value = "")
  public String getPlatformId() {
    return platformId;
  }

  public void setPlatformId(String platformId) {
    this.platformId = platformId;
  }

  public NetworkDeviceNIOListResultResponse portRange(String portRange) {
    this.portRange = portRange;
    return this;
  }

   /**
   * Get portRange
   * @return portRange
  **/
  @ApiModelProperty(value = "")
  public String getPortRange() {
    return portRange;
  }

  public void setPortRange(String portRange) {
    this.portRange = portRange;
  }

  public NetworkDeviceNIOListResultResponse qosStatus(String qosStatus) {
    this.qosStatus = qosStatus;
    return this;
  }

   /**
   * Get qosStatus
   * @return qosStatus
  **/
  @ApiModelProperty(value = "")
  public String getQosStatus() {
    return qosStatus;
  }

  public void setQosStatus(String qosStatus) {
    this.qosStatus = qosStatus;
  }

  public NetworkDeviceNIOListResultResponse reachabilityFailureReason(String reachabilityFailureReason) {
    this.reachabilityFailureReason = reachabilityFailureReason;
    return this;
  }

   /**
   * Get reachabilityFailureReason
   * @return reachabilityFailureReason
  **/
  @ApiModelProperty(value = "")
  public String getReachabilityFailureReason() {
    return reachabilityFailureReason;
  }

  public void setReachabilityFailureReason(String reachabilityFailureReason) {
    this.reachabilityFailureReason = reachabilityFailureReason;
  }

  public NetworkDeviceNIOListResultResponse reachabilityStatus(String reachabilityStatus) {
    this.reachabilityStatus = reachabilityStatus;
    return this;
  }

   /**
   * Get reachabilityStatus
   * @return reachabilityStatus
  **/
  @ApiModelProperty(value = "")
  public String getReachabilityStatus() {
    return reachabilityStatus;
  }

  public void setReachabilityStatus(String reachabilityStatus) {
    this.reachabilityStatus = reachabilityStatus;
  }

  public NetworkDeviceNIOListResultResponse role(String role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(value = "")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public NetworkDeviceNIOListResultResponse roleSource(String roleSource) {
    this.roleSource = roleSource;
    return this;
  }

   /**
   * Get roleSource
   * @return roleSource
  **/
  @ApiModelProperty(value = "")
  public String getRoleSource() {
    return roleSource;
  }

  public void setRoleSource(String roleSource) {
    this.roleSource = roleSource;
  }

  public NetworkDeviceNIOListResultResponse serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Get serialNumber
   * @return serialNumber
  **/
  @ApiModelProperty(value = "")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public NetworkDeviceNIOListResultResponse snmpContact(String snmpContact) {
    this.snmpContact = snmpContact;
    return this;
  }

   /**
   * Get snmpContact
   * @return snmpContact
  **/
  @ApiModelProperty(value = "")
  public String getSnmpContact() {
    return snmpContact;
  }

  public void setSnmpContact(String snmpContact) {
    this.snmpContact = snmpContact;
  }

  public NetworkDeviceNIOListResultResponse snmpLocation(String snmpLocation) {
    this.snmpLocation = snmpLocation;
    return this;
  }

   /**
   * Get snmpLocation
   * @return snmpLocation
  **/
  @ApiModelProperty(value = "")
  public String getSnmpLocation() {
    return snmpLocation;
  }

  public void setSnmpLocation(String snmpLocation) {
    this.snmpLocation = snmpLocation;
  }

  public NetworkDeviceNIOListResultResponse snmpStatus(String snmpStatus) {
    this.snmpStatus = snmpStatus;
    return this;
  }

   /**
   * Get snmpStatus
   * @return snmpStatus
  **/
  @ApiModelProperty(value = "")
  public String getSnmpStatus() {
    return snmpStatus;
  }

  public void setSnmpStatus(String snmpStatus) {
    this.snmpStatus = snmpStatus;
  }

  public NetworkDeviceNIOListResultResponse softwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
    return this;
  }

   /**
   * Get softwareVersion
   * @return softwareVersion
  **/
  @ApiModelProperty(value = "")
  public String getSoftwareVersion() {
    return softwareVersion;
  }

  public void setSoftwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
  }

  public NetworkDeviceNIOListResultResponse tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @ApiModelProperty(value = "")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public NetworkDeviceNIOListResultResponse tagCount(Integer tagCount) {
    this.tagCount = tagCount;
    return this;
  }

   /**
   * Get tagCount
   * @return tagCount
  **/
  @ApiModelProperty(value = "")
  public Integer getTagCount() {
    return tagCount;
  }

  public void setTagCount(Integer tagCount) {
    this.tagCount = tagCount;
  }

  public NetworkDeviceNIOListResultResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public NetworkDeviceNIOListResultResponse upTime(String upTime) {
    this.upTime = upTime;
    return this;
  }

   /**
   * Get upTime
   * @return upTime
  **/
  @ApiModelProperty(value = "")
  public String getUpTime() {
    return upTime;
  }

  public void setUpTime(String upTime) {
    this.upTime = upTime;
  }

  public NetworkDeviceNIOListResultResponse vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * Get vendor
   * @return vendor
  **/
  @ApiModelProperty(value = "")
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  public NetworkDeviceNIOListResultResponse wlcApDeviceStatus(String wlcApDeviceStatus) {
    this.wlcApDeviceStatus = wlcApDeviceStatus;
    return this;
  }

   /**
   * Get wlcApDeviceStatus
   * @return wlcApDeviceStatus
  **/
  @ApiModelProperty(value = "")
  public String getWlcApDeviceStatus() {
    return wlcApDeviceStatus;
  }

  public void setWlcApDeviceStatus(String wlcApDeviceStatus) {
    this.wlcApDeviceStatus = wlcApDeviceStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkDeviceNIOListResultResponse networkDeviceNIOListResultResponse = (NetworkDeviceNIOListResultResponse) o;
    return Objects.equals(this.anchorWlcForAp, networkDeviceNIOListResultResponse.anchorWlcForAp) &&
        Objects.equals(this.authModelId, networkDeviceNIOListResultResponse.authModelId) &&
        Objects.equals(this.avgUpdateFrequency, networkDeviceNIOListResultResponse.avgUpdateFrequency) &&
        Objects.equals(this.bootDateTime, networkDeviceNIOListResultResponse.bootDateTime) &&
        Objects.equals(this.cliStatus, networkDeviceNIOListResultResponse.cliStatus) &&
        Objects.equals(this.duplicateDeviceId, networkDeviceNIOListResultResponse.duplicateDeviceId) &&
        Objects.equals(this.errorCode, networkDeviceNIOListResultResponse.errorCode) &&
        Objects.equals(this.errorDescription, networkDeviceNIOListResultResponse.errorDescription) &&
        Objects.equals(this.family, networkDeviceNIOListResultResponse.family) &&
        Objects.equals(this.hostname, networkDeviceNIOListResultResponse.hostname) &&
        Objects.equals(this.httpStatus, networkDeviceNIOListResultResponse.httpStatus) &&
        Objects.equals(this.id, networkDeviceNIOListResultResponse.id) &&
        Objects.equals(this.imageName, networkDeviceNIOListResultResponse.imageName) &&
        Objects.equals(this.ingressQueueConfig, networkDeviceNIOListResultResponse.ingressQueueConfig) &&
        Objects.equals(this.interfaceCount, networkDeviceNIOListResultResponse.interfaceCount) &&
        Objects.equals(this.inventoryCollectionStatus, networkDeviceNIOListResultResponse.inventoryCollectionStatus) &&
        Objects.equals(this.inventoryReachabilityStatus, networkDeviceNIOListResultResponse.inventoryReachabilityStatus) &&
        Objects.equals(this.lastUpdated, networkDeviceNIOListResultResponse.lastUpdated) &&
        Objects.equals(this.lineCardCount, networkDeviceNIOListResultResponse.lineCardCount) &&
        Objects.equals(this.lineCardId, networkDeviceNIOListResultResponse.lineCardId) &&
        Objects.equals(this.location, networkDeviceNIOListResultResponse.location) &&
        Objects.equals(this.locationName, networkDeviceNIOListResultResponse.locationName) &&
        Objects.equals(this.macAddress, networkDeviceNIOListResultResponse.macAddress) &&
        Objects.equals(this.managementIpAddress, networkDeviceNIOListResultResponse.managementIpAddress) &&
        Objects.equals(this.memorySize, networkDeviceNIOListResultResponse.memorySize) &&
        Objects.equals(this.netconfStatus, networkDeviceNIOListResultResponse.netconfStatus) &&
        Objects.equals(this.numUpdates, networkDeviceNIOListResultResponse.numUpdates) &&
        Objects.equals(this.pingStatus, networkDeviceNIOListResultResponse.pingStatus) &&
        Objects.equals(this.platformId, networkDeviceNIOListResultResponse.platformId) &&
        Objects.equals(this.portRange, networkDeviceNIOListResultResponse.portRange) &&
        Objects.equals(this.qosStatus, networkDeviceNIOListResultResponse.qosStatus) &&
        Objects.equals(this.reachabilityFailureReason, networkDeviceNIOListResultResponse.reachabilityFailureReason) &&
        Objects.equals(this.reachabilityStatus, networkDeviceNIOListResultResponse.reachabilityStatus) &&
        Objects.equals(this.role, networkDeviceNIOListResultResponse.role) &&
        Objects.equals(this.roleSource, networkDeviceNIOListResultResponse.roleSource) &&
        Objects.equals(this.serialNumber, networkDeviceNIOListResultResponse.serialNumber) &&
        Objects.equals(this.snmpContact, networkDeviceNIOListResultResponse.snmpContact) &&
        Objects.equals(this.snmpLocation, networkDeviceNIOListResultResponse.snmpLocation) &&
        Objects.equals(this.snmpStatus, networkDeviceNIOListResultResponse.snmpStatus) &&
        Objects.equals(this.softwareVersion, networkDeviceNIOListResultResponse.softwareVersion) &&
        Objects.equals(this.tag, networkDeviceNIOListResultResponse.tag) &&
        Objects.equals(this.tagCount, networkDeviceNIOListResultResponse.tagCount) &&
        Objects.equals(this.type, networkDeviceNIOListResultResponse.type) &&
        Objects.equals(this.upTime, networkDeviceNIOListResultResponse.upTime) &&
        Objects.equals(this.vendor, networkDeviceNIOListResultResponse.vendor) &&
        Objects.equals(this.wlcApDeviceStatus, networkDeviceNIOListResultResponse.wlcApDeviceStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorWlcForAp, authModelId, avgUpdateFrequency, bootDateTime, cliStatus, duplicateDeviceId, errorCode, errorDescription, family, hostname, httpStatus, id, imageName, ingressQueueConfig, interfaceCount, inventoryCollectionStatus, inventoryReachabilityStatus, lastUpdated, lineCardCount, lineCardId, location, locationName, macAddress, managementIpAddress, memorySize, netconfStatus, numUpdates, pingStatus, platformId, portRange, qosStatus, reachabilityFailureReason, reachabilityStatus, role, roleSource, serialNumber, snmpContact, snmpLocation, snmpStatus, softwareVersion, tag, tagCount, type, upTime, vendor, wlcApDeviceStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkDeviceNIOListResultResponse {\n");
    
    sb.append("    anchorWlcForAp: ").append(toIndentedString(anchorWlcForAp)).append("\n");
    sb.append("    authModelId: ").append(toIndentedString(authModelId)).append("\n");
    sb.append("    avgUpdateFrequency: ").append(toIndentedString(avgUpdateFrequency)).append("\n");
    sb.append("    bootDateTime: ").append(toIndentedString(bootDateTime)).append("\n");
    sb.append("    cliStatus: ").append(toIndentedString(cliStatus)).append("\n");
    sb.append("    duplicateDeviceId: ").append(toIndentedString(duplicateDeviceId)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    httpStatus: ").append(toIndentedString(httpStatus)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    ingressQueueConfig: ").append(toIndentedString(ingressQueueConfig)).append("\n");
    sb.append("    interfaceCount: ").append(toIndentedString(interfaceCount)).append("\n");
    sb.append("    inventoryCollectionStatus: ").append(toIndentedString(inventoryCollectionStatus)).append("\n");
    sb.append("    inventoryReachabilityStatus: ").append(toIndentedString(inventoryReachabilityStatus)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    lineCardCount: ").append(toIndentedString(lineCardCount)).append("\n");
    sb.append("    lineCardId: ").append(toIndentedString(lineCardId)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    managementIpAddress: ").append(toIndentedString(managementIpAddress)).append("\n");
    sb.append("    memorySize: ").append(toIndentedString(memorySize)).append("\n");
    sb.append("    netconfStatus: ").append(toIndentedString(netconfStatus)).append("\n");
    sb.append("    numUpdates: ").append(toIndentedString(numUpdates)).append("\n");
    sb.append("    pingStatus: ").append(toIndentedString(pingStatus)).append("\n");
    sb.append("    platformId: ").append(toIndentedString(platformId)).append("\n");
    sb.append("    portRange: ").append(toIndentedString(portRange)).append("\n");
    sb.append("    qosStatus: ").append(toIndentedString(qosStatus)).append("\n");
    sb.append("    reachabilityFailureReason: ").append(toIndentedString(reachabilityFailureReason)).append("\n");
    sb.append("    reachabilityStatus: ").append(toIndentedString(reachabilityStatus)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    roleSource: ").append(toIndentedString(roleSource)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    snmpContact: ").append(toIndentedString(snmpContact)).append("\n");
    sb.append("    snmpLocation: ").append(toIndentedString(snmpLocation)).append("\n");
    sb.append("    snmpStatus: ").append(toIndentedString(snmpStatus)).append("\n");
    sb.append("    softwareVersion: ").append(toIndentedString(softwareVersion)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    tagCount: ").append(toIndentedString(tagCount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    upTime: ").append(toIndentedString(upTime)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    wlcApDeviceStatus: ").append(toIndentedString(wlcApDeviceStatus)).append("\n");
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

