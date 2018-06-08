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
 * NetworkDeviceListResultResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class NetworkDeviceListResultResponse {
  @SerializedName("apManagerInterfaceIp")
  private String apManagerInterfaceIp = null;

  @SerializedName("associatedWlcIp")
  private String associatedWlcIp = null;

  @SerializedName("bootDateTime")
  private String bootDateTime = null;

  @SerializedName("collectionInterval")
  private String collectionInterval = null;

  @SerializedName("collectionStatus")
  private String collectionStatus = null;

  @SerializedName("errorCode")
  private String errorCode = null;

  @SerializedName("errorDescription")
  private String errorDescription = null;

  @SerializedName("family")
  private String family = null;

  @SerializedName("hostname")
  private String hostname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("instanceTenantId")
  private String instanceTenantId = null;

  @SerializedName("instanceUuid")
  private String instanceUuid = null;

  @SerializedName("interfaceCount")
  private String interfaceCount = null;

  @SerializedName("inventoryStatusDetail")
  private String inventoryStatusDetail = null;

  @SerializedName("lastUpdateTime")
  private String lastUpdateTime = null;

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

  @SerializedName("platformId")
  private String platformId = null;

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

  @SerializedName("series")
  private String series = null;

  @SerializedName("snmpContact")
  private String snmpContact = null;

  @SerializedName("snmpLocation")
  private String snmpLocation = null;

  @SerializedName("softwareType")
  private String softwareType = null;

  @SerializedName("softwareVersion")
  private String softwareVersion = null;

  @SerializedName("tagCount")
  private String tagCount = null;

  @SerializedName("tunnelUdpPort")
  private String tunnelUdpPort = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("upTime")
  private String upTime = null;

  @SerializedName("waasDeviceMode")
  private String waasDeviceMode = null;

  public NetworkDeviceListResultResponse apManagerInterfaceIp(String apManagerInterfaceIp) {
    this.apManagerInterfaceIp = apManagerInterfaceIp;
    return this;
  }

   /**
   * Get apManagerInterfaceIp
   * @return apManagerInterfaceIp
  **/
  @ApiModelProperty(value = "")
  public String getApManagerInterfaceIp() {
    return apManagerInterfaceIp;
  }

  public void setApManagerInterfaceIp(String apManagerInterfaceIp) {
    this.apManagerInterfaceIp = apManagerInterfaceIp;
  }

  public NetworkDeviceListResultResponse associatedWlcIp(String associatedWlcIp) {
    this.associatedWlcIp = associatedWlcIp;
    return this;
  }

   /**
   * Get associatedWlcIp
   * @return associatedWlcIp
  **/
  @ApiModelProperty(value = "")
  public String getAssociatedWlcIp() {
    return associatedWlcIp;
  }

  public void setAssociatedWlcIp(String associatedWlcIp) {
    this.associatedWlcIp = associatedWlcIp;
  }

  public NetworkDeviceListResultResponse bootDateTime(String bootDateTime) {
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

  public NetworkDeviceListResultResponse collectionInterval(String collectionInterval) {
    this.collectionInterval = collectionInterval;
    return this;
  }

   /**
   * Get collectionInterval
   * @return collectionInterval
  **/
  @ApiModelProperty(value = "")
  public String getCollectionInterval() {
    return collectionInterval;
  }

  public void setCollectionInterval(String collectionInterval) {
    this.collectionInterval = collectionInterval;
  }

  public NetworkDeviceListResultResponse collectionStatus(String collectionStatus) {
    this.collectionStatus = collectionStatus;
    return this;
  }

   /**
   * Get collectionStatus
   * @return collectionStatus
  **/
  @ApiModelProperty(value = "")
  public String getCollectionStatus() {
    return collectionStatus;
  }

  public void setCollectionStatus(String collectionStatus) {
    this.collectionStatus = collectionStatus;
  }

  public NetworkDeviceListResultResponse errorCode(String errorCode) {
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

  public NetworkDeviceListResultResponse errorDescription(String errorDescription) {
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

  public NetworkDeviceListResultResponse family(String family) {
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

  public NetworkDeviceListResultResponse hostname(String hostname) {
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

  public NetworkDeviceListResultResponse id(String id) {
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

  public NetworkDeviceListResultResponse instanceTenantId(String instanceTenantId) {
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

  public NetworkDeviceListResultResponse instanceUuid(String instanceUuid) {
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

  public NetworkDeviceListResultResponse interfaceCount(String interfaceCount) {
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

  public NetworkDeviceListResultResponse inventoryStatusDetail(String inventoryStatusDetail) {
    this.inventoryStatusDetail = inventoryStatusDetail;
    return this;
  }

   /**
   * Get inventoryStatusDetail
   * @return inventoryStatusDetail
  **/
  @ApiModelProperty(value = "")
  public String getInventoryStatusDetail() {
    return inventoryStatusDetail;
  }

  public void setInventoryStatusDetail(String inventoryStatusDetail) {
    this.inventoryStatusDetail = inventoryStatusDetail;
  }

  public NetworkDeviceListResultResponse lastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

   /**
   * Get lastUpdateTime
   * @return lastUpdateTime
  **/
  @ApiModelProperty(value = "")
  public String getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  public NetworkDeviceListResultResponse lastUpdated(String lastUpdated) {
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

  public NetworkDeviceListResultResponse lineCardCount(String lineCardCount) {
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

  public NetworkDeviceListResultResponse lineCardId(String lineCardId) {
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

  public NetworkDeviceListResultResponse location(String location) {
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

  public NetworkDeviceListResultResponse locationName(String locationName) {
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

  public NetworkDeviceListResultResponse macAddress(String macAddress) {
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

  public NetworkDeviceListResultResponse managementIpAddress(String managementIpAddress) {
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

  public NetworkDeviceListResultResponse memorySize(String memorySize) {
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

  public NetworkDeviceListResultResponse platformId(String platformId) {
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

  public NetworkDeviceListResultResponse reachabilityFailureReason(String reachabilityFailureReason) {
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

  public NetworkDeviceListResultResponse reachabilityStatus(String reachabilityStatus) {
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

  public NetworkDeviceListResultResponse role(String role) {
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

  public NetworkDeviceListResultResponse roleSource(String roleSource) {
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

  public NetworkDeviceListResultResponse serialNumber(String serialNumber) {
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

  public NetworkDeviceListResultResponse series(String series) {
    this.series = series;
    return this;
  }

   /**
   * Get series
   * @return series
  **/
  @ApiModelProperty(value = "")
  public String getSeries() {
    return series;
  }

  public void setSeries(String series) {
    this.series = series;
  }

  public NetworkDeviceListResultResponse snmpContact(String snmpContact) {
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

  public NetworkDeviceListResultResponse snmpLocation(String snmpLocation) {
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

  public NetworkDeviceListResultResponse softwareType(String softwareType) {
    this.softwareType = softwareType;
    return this;
  }

   /**
   * Get softwareType
   * @return softwareType
  **/
  @ApiModelProperty(value = "")
  public String getSoftwareType() {
    return softwareType;
  }

  public void setSoftwareType(String softwareType) {
    this.softwareType = softwareType;
  }

  public NetworkDeviceListResultResponse softwareVersion(String softwareVersion) {
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

  public NetworkDeviceListResultResponse tagCount(String tagCount) {
    this.tagCount = tagCount;
    return this;
  }

   /**
   * Get tagCount
   * @return tagCount
  **/
  @ApiModelProperty(value = "")
  public String getTagCount() {
    return tagCount;
  }

  public void setTagCount(String tagCount) {
    this.tagCount = tagCount;
  }

  public NetworkDeviceListResultResponse tunnelUdpPort(String tunnelUdpPort) {
    this.tunnelUdpPort = tunnelUdpPort;
    return this;
  }

   /**
   * Get tunnelUdpPort
   * @return tunnelUdpPort
  **/
  @ApiModelProperty(value = "")
  public String getTunnelUdpPort() {
    return tunnelUdpPort;
  }

  public void setTunnelUdpPort(String tunnelUdpPort) {
    this.tunnelUdpPort = tunnelUdpPort;
  }

  public NetworkDeviceListResultResponse type(String type) {
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

  public NetworkDeviceListResultResponse upTime(String upTime) {
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

  public NetworkDeviceListResultResponse waasDeviceMode(String waasDeviceMode) {
    this.waasDeviceMode = waasDeviceMode;
    return this;
  }

   /**
   * Get waasDeviceMode
   * @return waasDeviceMode
  **/
  @ApiModelProperty(value = "")
  public String getWaasDeviceMode() {
    return waasDeviceMode;
  }

  public void setWaasDeviceMode(String waasDeviceMode) {
    this.waasDeviceMode = waasDeviceMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkDeviceListResultResponse networkDeviceListResultResponse = (NetworkDeviceListResultResponse) o;
    return Objects.equals(this.apManagerInterfaceIp, networkDeviceListResultResponse.apManagerInterfaceIp) &&
        Objects.equals(this.associatedWlcIp, networkDeviceListResultResponse.associatedWlcIp) &&
        Objects.equals(this.bootDateTime, networkDeviceListResultResponse.bootDateTime) &&
        Objects.equals(this.collectionInterval, networkDeviceListResultResponse.collectionInterval) &&
        Objects.equals(this.collectionStatus, networkDeviceListResultResponse.collectionStatus) &&
        Objects.equals(this.errorCode, networkDeviceListResultResponse.errorCode) &&
        Objects.equals(this.errorDescription, networkDeviceListResultResponse.errorDescription) &&
        Objects.equals(this.family, networkDeviceListResultResponse.family) &&
        Objects.equals(this.hostname, networkDeviceListResultResponse.hostname) &&
        Objects.equals(this.id, networkDeviceListResultResponse.id) &&
        Objects.equals(this.instanceTenantId, networkDeviceListResultResponse.instanceTenantId) &&
        Objects.equals(this.instanceUuid, networkDeviceListResultResponse.instanceUuid) &&
        Objects.equals(this.interfaceCount, networkDeviceListResultResponse.interfaceCount) &&
        Objects.equals(this.inventoryStatusDetail, networkDeviceListResultResponse.inventoryStatusDetail) &&
        Objects.equals(this.lastUpdateTime, networkDeviceListResultResponse.lastUpdateTime) &&
        Objects.equals(this.lastUpdated, networkDeviceListResultResponse.lastUpdated) &&
        Objects.equals(this.lineCardCount, networkDeviceListResultResponse.lineCardCount) &&
        Objects.equals(this.lineCardId, networkDeviceListResultResponse.lineCardId) &&
        Objects.equals(this.location, networkDeviceListResultResponse.location) &&
        Objects.equals(this.locationName, networkDeviceListResultResponse.locationName) &&
        Objects.equals(this.macAddress, networkDeviceListResultResponse.macAddress) &&
        Objects.equals(this.managementIpAddress, networkDeviceListResultResponse.managementIpAddress) &&
        Objects.equals(this.memorySize, networkDeviceListResultResponse.memorySize) &&
        Objects.equals(this.platformId, networkDeviceListResultResponse.platformId) &&
        Objects.equals(this.reachabilityFailureReason, networkDeviceListResultResponse.reachabilityFailureReason) &&
        Objects.equals(this.reachabilityStatus, networkDeviceListResultResponse.reachabilityStatus) &&
        Objects.equals(this.role, networkDeviceListResultResponse.role) &&
        Objects.equals(this.roleSource, networkDeviceListResultResponse.roleSource) &&
        Objects.equals(this.serialNumber, networkDeviceListResultResponse.serialNumber) &&
        Objects.equals(this.series, networkDeviceListResultResponse.series) &&
        Objects.equals(this.snmpContact, networkDeviceListResultResponse.snmpContact) &&
        Objects.equals(this.snmpLocation, networkDeviceListResultResponse.snmpLocation) &&
        Objects.equals(this.softwareType, networkDeviceListResultResponse.softwareType) &&
        Objects.equals(this.softwareVersion, networkDeviceListResultResponse.softwareVersion) &&
        Objects.equals(this.tagCount, networkDeviceListResultResponse.tagCount) &&
        Objects.equals(this.tunnelUdpPort, networkDeviceListResultResponse.tunnelUdpPort) &&
        Objects.equals(this.type, networkDeviceListResultResponse.type) &&
        Objects.equals(this.upTime, networkDeviceListResultResponse.upTime) &&
        Objects.equals(this.waasDeviceMode, networkDeviceListResultResponse.waasDeviceMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apManagerInterfaceIp, associatedWlcIp, bootDateTime, collectionInterval, collectionStatus, errorCode, errorDescription, family, hostname, id, instanceTenantId, instanceUuid, interfaceCount, inventoryStatusDetail, lastUpdateTime, lastUpdated, lineCardCount, lineCardId, location, locationName, macAddress, managementIpAddress, memorySize, platformId, reachabilityFailureReason, reachabilityStatus, role, roleSource, serialNumber, series, snmpContact, snmpLocation, softwareType, softwareVersion, tagCount, tunnelUdpPort, type, upTime, waasDeviceMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkDeviceListResultResponse {\n");
    
    sb.append("    apManagerInterfaceIp: ").append(toIndentedString(apManagerInterfaceIp)).append("\n");
    sb.append("    associatedWlcIp: ").append(toIndentedString(associatedWlcIp)).append("\n");
    sb.append("    bootDateTime: ").append(toIndentedString(bootDateTime)).append("\n");
    sb.append("    collectionInterval: ").append(toIndentedString(collectionInterval)).append("\n");
    sb.append("    collectionStatus: ").append(toIndentedString(collectionStatus)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instanceTenantId: ").append(toIndentedString(instanceTenantId)).append("\n");
    sb.append("    instanceUuid: ").append(toIndentedString(instanceUuid)).append("\n");
    sb.append("    interfaceCount: ").append(toIndentedString(interfaceCount)).append("\n");
    sb.append("    inventoryStatusDetail: ").append(toIndentedString(inventoryStatusDetail)).append("\n");
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    lineCardCount: ").append(toIndentedString(lineCardCount)).append("\n");
    sb.append("    lineCardId: ").append(toIndentedString(lineCardId)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    managementIpAddress: ").append(toIndentedString(managementIpAddress)).append("\n");
    sb.append("    memorySize: ").append(toIndentedString(memorySize)).append("\n");
    sb.append("    platformId: ").append(toIndentedString(platformId)).append("\n");
    sb.append("    reachabilityFailureReason: ").append(toIndentedString(reachabilityFailureReason)).append("\n");
    sb.append("    reachabilityStatus: ").append(toIndentedString(reachabilityStatus)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    roleSource: ").append(toIndentedString(roleSource)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    snmpContact: ").append(toIndentedString(snmpContact)).append("\n");
    sb.append("    snmpLocation: ").append(toIndentedString(snmpLocation)).append("\n");
    sb.append("    softwareType: ").append(toIndentedString(softwareType)).append("\n");
    sb.append("    softwareVersion: ").append(toIndentedString(softwareVersion)).append("\n");
    sb.append("    tagCount: ").append(toIndentedString(tagCount)).append("\n");
    sb.append("    tunnelUdpPort: ").append(toIndentedString(tunnelUdpPort)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    upTime: ").append(toIndentedString(upTime)).append("\n");
    sb.append("    waasDeviceMode: ").append(toIndentedString(waasDeviceMode)).append("\n");
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

