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
import cisco.com.dnac.v1.api.client.model.ClientDetailResponseResponseDetailHealthScore;
import cisco.com.dnac.v1.api.client.model.ClientDetailResponseResponseDetailOnboarding;
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
 * ClientDetailResponseResponseDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class ClientDetailResponseResponseDetail {
  @SerializedName("id")
  private String id = null;

  @SerializedName("connectionStatus")
  private String connectionStatus = null;

  @SerializedName("hostType")
  private String hostType = null;

  @SerializedName("userId")
  private String userId = null;

  @SerializedName("hostName")
  private String hostName = null;

  @SerializedName("hostOs")
  private String hostOs = null;

  @SerializedName("hostVersion")
  private String hostVersion = null;

  @SerializedName("subType")
  private String subType = null;

  @SerializedName("lastUpdated")
  private String lastUpdated = null;

  @SerializedName("healthScore")
  private List<ClientDetailResponseResponseDetailHealthScore> healthScore = null;

  @SerializedName("hostMac")
  private String hostMac = null;

  @SerializedName("hostIpV4")
  private String hostIpV4 = null;

  @SerializedName("hostIpV6")
  private List<String> hostIpV6 = null;

  @SerializedName("authType")
  private String authType = null;

  @SerializedName("vlanId")
  private String vlanId = null;

  @SerializedName("ssid")
  private String ssid = null;

  @SerializedName("frequency")
  private String frequency = null;

  @SerializedName("channel")
  private String channel = null;

  @SerializedName("apGroup")
  private String apGroup = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("clientConnection")
  private String clientConnection = null;

  @SerializedName("connectedDevice")
  private List<String> connectedDevice = null;

  @SerializedName("issueCount")
  private String issueCount = null;

  @SerializedName("rssi")
  private String rssi = null;

  @SerializedName("avgRssi")
  private String avgRssi = null;

  @SerializedName("snr")
  private String snr = null;

  @SerializedName("avgSnr")
  private String avgSnr = null;

  @SerializedName("dataRate")
  private String dataRate = null;

  @SerializedName("txBytes")
  private String txBytes = null;

  @SerializedName("rxBytes")
  private String rxBytes = null;

  @SerializedName("dnsSuccess")
  private String dnsSuccess = null;

  @SerializedName("dnsFailure")
  private String dnsFailure = null;

  @SerializedName("onboarding")
  private ClientDetailResponseResponseDetailOnboarding onboarding = null;

  @SerializedName("onboardingTime")
  private String onboardingTime = null;

  @SerializedName("port")
  private String port = null;

  public ClientDetailResponseResponseDetail id(String id) {
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

  public ClientDetailResponseResponseDetail connectionStatus(String connectionStatus) {
    this.connectionStatus = connectionStatus;
    return this;
  }

   /**
   * Get connectionStatus
   * @return connectionStatus
  **/
  @ApiModelProperty(value = "")
  public String getConnectionStatus() {
    return connectionStatus;
  }

  public void setConnectionStatus(String connectionStatus) {
    this.connectionStatus = connectionStatus;
  }

  public ClientDetailResponseResponseDetail hostType(String hostType) {
    this.hostType = hostType;
    return this;
  }

   /**
   * Get hostType
   * @return hostType
  **/
  @ApiModelProperty(value = "")
  public String getHostType() {
    return hostType;
  }

  public void setHostType(String hostType) {
    this.hostType = hostType;
  }

  public ClientDetailResponseResponseDetail userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public ClientDetailResponseResponseDetail hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

   /**
   * Get hostName
   * @return hostName
  **/
  @ApiModelProperty(value = "")
  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public ClientDetailResponseResponseDetail hostOs(String hostOs) {
    this.hostOs = hostOs;
    return this;
  }

   /**
   * Get hostOs
   * @return hostOs
  **/
  @ApiModelProperty(value = "")
  public String getHostOs() {
    return hostOs;
  }

  public void setHostOs(String hostOs) {
    this.hostOs = hostOs;
  }

  public ClientDetailResponseResponseDetail hostVersion(String hostVersion) {
    this.hostVersion = hostVersion;
    return this;
  }

   /**
   * Get hostVersion
   * @return hostVersion
  **/
  @ApiModelProperty(value = "")
  public String getHostVersion() {
    return hostVersion;
  }

  public void setHostVersion(String hostVersion) {
    this.hostVersion = hostVersion;
  }

  public ClientDetailResponseResponseDetail subType(String subType) {
    this.subType = subType;
    return this;
  }

   /**
   * Get subType
   * @return subType
  **/
  @ApiModelProperty(value = "")
  public String getSubType() {
    return subType;
  }

  public void setSubType(String subType) {
    this.subType = subType;
  }

  public ClientDetailResponseResponseDetail lastUpdated(String lastUpdated) {
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

  public ClientDetailResponseResponseDetail healthScore(List<ClientDetailResponseResponseDetailHealthScore> healthScore) {
    this.healthScore = healthScore;
    return this;
  }

  public ClientDetailResponseResponseDetail addHealthScoreItem(ClientDetailResponseResponseDetailHealthScore healthScoreItem) {
    if (this.healthScore == null) {
      this.healthScore = new ArrayList<>();
    }
    this.healthScore.add(healthScoreItem);
    return this;
  }

   /**
   * Get healthScore
   * @return healthScore
  **/
  @ApiModelProperty(value = "")
  public List<ClientDetailResponseResponseDetailHealthScore> getHealthScore() {
    return healthScore;
  }

  public void setHealthScore(List<ClientDetailResponseResponseDetailHealthScore> healthScore) {
    this.healthScore = healthScore;
  }

  public ClientDetailResponseResponseDetail hostMac(String hostMac) {
    this.hostMac = hostMac;
    return this;
  }

   /**
   * Get hostMac
   * @return hostMac
  **/
  @ApiModelProperty(value = "")
  public String getHostMac() {
    return hostMac;
  }

  public void setHostMac(String hostMac) {
    this.hostMac = hostMac;
  }

  public ClientDetailResponseResponseDetail hostIpV4(String hostIpV4) {
    this.hostIpV4 = hostIpV4;
    return this;
  }

   /**
   * Get hostIpV4
   * @return hostIpV4
  **/
  @ApiModelProperty(value = "")
  public String getHostIpV4() {
    return hostIpV4;
  }

  public void setHostIpV4(String hostIpV4) {
    this.hostIpV4 = hostIpV4;
  }

  public ClientDetailResponseResponseDetail hostIpV6(List<String> hostIpV6) {
    this.hostIpV6 = hostIpV6;
    return this;
  }

  public ClientDetailResponseResponseDetail addHostIpV6Item(String hostIpV6Item) {
    if (this.hostIpV6 == null) {
      this.hostIpV6 = new ArrayList<>();
    }
    this.hostIpV6.add(hostIpV6Item);
    return this;
  }

   /**
   * Get hostIpV6
   * @return hostIpV6
  **/
  @ApiModelProperty(value = "")
  public List<String> getHostIpV6() {
    return hostIpV6;
  }

  public void setHostIpV6(List<String> hostIpV6) {
    this.hostIpV6 = hostIpV6;
  }

  public ClientDetailResponseResponseDetail authType(String authType) {
    this.authType = authType;
    return this;
  }

   /**
   * Get authType
   * @return authType
  **/
  @ApiModelProperty(value = "")
  public String getAuthType() {
    return authType;
  }

  public void setAuthType(String authType) {
    this.authType = authType;
  }

  public ClientDetailResponseResponseDetail vlanId(String vlanId) {
    this.vlanId = vlanId;
    return this;
  }

   /**
   * Get vlanId
   * @return vlanId
  **/
  @ApiModelProperty(value = "")
  public String getVlanId() {
    return vlanId;
  }

  public void setVlanId(String vlanId) {
    this.vlanId = vlanId;
  }

  public ClientDetailResponseResponseDetail ssid(String ssid) {
    this.ssid = ssid;
    return this;
  }

   /**
   * Get ssid
   * @return ssid
  **/
  @ApiModelProperty(value = "")
  public String getSsid() {
    return ssid;
  }

  public void setSsid(String ssid) {
    this.ssid = ssid;
  }

  public ClientDetailResponseResponseDetail frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @ApiModelProperty(value = "")
  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

  public ClientDetailResponseResponseDetail channel(String channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @ApiModelProperty(value = "")
  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }

  public ClientDetailResponseResponseDetail apGroup(String apGroup) {
    this.apGroup = apGroup;
    return this;
  }

   /**
   * Get apGroup
   * @return apGroup
  **/
  @ApiModelProperty(value = "")
  public String getApGroup() {
    return apGroup;
  }

  public void setApGroup(String apGroup) {
    this.apGroup = apGroup;
  }

  public ClientDetailResponseResponseDetail location(String location) {
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

  public ClientDetailResponseResponseDetail clientConnection(String clientConnection) {
    this.clientConnection = clientConnection;
    return this;
  }

   /**
   * Get clientConnection
   * @return clientConnection
  **/
  @ApiModelProperty(value = "")
  public String getClientConnection() {
    return clientConnection;
  }

  public void setClientConnection(String clientConnection) {
    this.clientConnection = clientConnection;
  }

  public ClientDetailResponseResponseDetail connectedDevice(List<String> connectedDevice) {
    this.connectedDevice = connectedDevice;
    return this;
  }

  public ClientDetailResponseResponseDetail addConnectedDeviceItem(String connectedDeviceItem) {
    if (this.connectedDevice == null) {
      this.connectedDevice = new ArrayList<>();
    }
    this.connectedDevice.add(connectedDeviceItem);
    return this;
  }

   /**
   * Get connectedDevice
   * @return connectedDevice
  **/
  @ApiModelProperty(value = "")
  public List<String> getConnectedDevice() {
    return connectedDevice;
  }

  public void setConnectedDevice(List<String> connectedDevice) {
    this.connectedDevice = connectedDevice;
  }

  public ClientDetailResponseResponseDetail issueCount(String issueCount) {
    this.issueCount = issueCount;
    return this;
  }

   /**
   * Get issueCount
   * @return issueCount
  **/
  @ApiModelProperty(value = "")
  public String getIssueCount() {
    return issueCount;
  }

  public void setIssueCount(String issueCount) {
    this.issueCount = issueCount;
  }

  public ClientDetailResponseResponseDetail rssi(String rssi) {
    this.rssi = rssi;
    return this;
  }

   /**
   * Get rssi
   * @return rssi
  **/
  @ApiModelProperty(value = "")
  public String getRssi() {
    return rssi;
  }

  public void setRssi(String rssi) {
    this.rssi = rssi;
  }

  public ClientDetailResponseResponseDetail avgRssi(String avgRssi) {
    this.avgRssi = avgRssi;
    return this;
  }

   /**
   * Get avgRssi
   * @return avgRssi
  **/
  @ApiModelProperty(value = "")
  public String getAvgRssi() {
    return avgRssi;
  }

  public void setAvgRssi(String avgRssi) {
    this.avgRssi = avgRssi;
  }

  public ClientDetailResponseResponseDetail snr(String snr) {
    this.snr = snr;
    return this;
  }

   /**
   * Get snr
   * @return snr
  **/
  @ApiModelProperty(value = "")
  public String getSnr() {
    return snr;
  }

  public void setSnr(String snr) {
    this.snr = snr;
  }

  public ClientDetailResponseResponseDetail avgSnr(String avgSnr) {
    this.avgSnr = avgSnr;
    return this;
  }

   /**
   * Get avgSnr
   * @return avgSnr
  **/
  @ApiModelProperty(value = "")
  public String getAvgSnr() {
    return avgSnr;
  }

  public void setAvgSnr(String avgSnr) {
    this.avgSnr = avgSnr;
  }

  public ClientDetailResponseResponseDetail dataRate(String dataRate) {
    this.dataRate = dataRate;
    return this;
  }

   /**
   * Get dataRate
   * @return dataRate
  **/
  @ApiModelProperty(value = "")
  public String getDataRate() {
    return dataRate;
  }

  public void setDataRate(String dataRate) {
    this.dataRate = dataRate;
  }

  public ClientDetailResponseResponseDetail txBytes(String txBytes) {
    this.txBytes = txBytes;
    return this;
  }

   /**
   * Get txBytes
   * @return txBytes
  **/
  @ApiModelProperty(value = "")
  public String getTxBytes() {
    return txBytes;
  }

  public void setTxBytes(String txBytes) {
    this.txBytes = txBytes;
  }

  public ClientDetailResponseResponseDetail rxBytes(String rxBytes) {
    this.rxBytes = rxBytes;
    return this;
  }

   /**
   * Get rxBytes
   * @return rxBytes
  **/
  @ApiModelProperty(value = "")
  public String getRxBytes() {
    return rxBytes;
  }

  public void setRxBytes(String rxBytes) {
    this.rxBytes = rxBytes;
  }

  public ClientDetailResponseResponseDetail dnsSuccess(String dnsSuccess) {
    this.dnsSuccess = dnsSuccess;
    return this;
  }

   /**
   * Get dnsSuccess
   * @return dnsSuccess
  **/
  @ApiModelProperty(value = "")
  public String getDnsSuccess() {
    return dnsSuccess;
  }

  public void setDnsSuccess(String dnsSuccess) {
    this.dnsSuccess = dnsSuccess;
  }

  public ClientDetailResponseResponseDetail dnsFailure(String dnsFailure) {
    this.dnsFailure = dnsFailure;
    return this;
  }

   /**
   * Get dnsFailure
   * @return dnsFailure
  **/
  @ApiModelProperty(value = "")
  public String getDnsFailure() {
    return dnsFailure;
  }

  public void setDnsFailure(String dnsFailure) {
    this.dnsFailure = dnsFailure;
  }

  public ClientDetailResponseResponseDetail onboarding(ClientDetailResponseResponseDetailOnboarding onboarding) {
    this.onboarding = onboarding;
    return this;
  }

   /**
   * Get onboarding
   * @return onboarding
  **/
  @ApiModelProperty(value = "")
  public ClientDetailResponseResponseDetailOnboarding getOnboarding() {
    return onboarding;
  }

  public void setOnboarding(ClientDetailResponseResponseDetailOnboarding onboarding) {
    this.onboarding = onboarding;
  }

  public ClientDetailResponseResponseDetail onboardingTime(String onboardingTime) {
    this.onboardingTime = onboardingTime;
    return this;
  }

   /**
   * Get onboardingTime
   * @return onboardingTime
  **/
  @ApiModelProperty(value = "")
  public String getOnboardingTime() {
    return onboardingTime;
  }

  public void setOnboardingTime(String onboardingTime) {
    this.onboardingTime = onboardingTime;
  }

  public ClientDetailResponseResponseDetail port(String port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @ApiModelProperty(value = "")
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientDetailResponseResponseDetail clientDetailResponseResponseDetail = (ClientDetailResponseResponseDetail) o;
    return Objects.equals(this.id, clientDetailResponseResponseDetail.id) &&
        Objects.equals(this.connectionStatus, clientDetailResponseResponseDetail.connectionStatus) &&
        Objects.equals(this.hostType, clientDetailResponseResponseDetail.hostType) &&
        Objects.equals(this.userId, clientDetailResponseResponseDetail.userId) &&
        Objects.equals(this.hostName, clientDetailResponseResponseDetail.hostName) &&
        Objects.equals(this.hostOs, clientDetailResponseResponseDetail.hostOs) &&
        Objects.equals(this.hostVersion, clientDetailResponseResponseDetail.hostVersion) &&
        Objects.equals(this.subType, clientDetailResponseResponseDetail.subType) &&
        Objects.equals(this.lastUpdated, clientDetailResponseResponseDetail.lastUpdated) &&
        Objects.equals(this.healthScore, clientDetailResponseResponseDetail.healthScore) &&
        Objects.equals(this.hostMac, clientDetailResponseResponseDetail.hostMac) &&
        Objects.equals(this.hostIpV4, clientDetailResponseResponseDetail.hostIpV4) &&
        Objects.equals(this.hostIpV6, clientDetailResponseResponseDetail.hostIpV6) &&
        Objects.equals(this.authType, clientDetailResponseResponseDetail.authType) &&
        Objects.equals(this.vlanId, clientDetailResponseResponseDetail.vlanId) &&
        Objects.equals(this.ssid, clientDetailResponseResponseDetail.ssid) &&
        Objects.equals(this.frequency, clientDetailResponseResponseDetail.frequency) &&
        Objects.equals(this.channel, clientDetailResponseResponseDetail.channel) &&
        Objects.equals(this.apGroup, clientDetailResponseResponseDetail.apGroup) &&
        Objects.equals(this.location, clientDetailResponseResponseDetail.location) &&
        Objects.equals(this.clientConnection, clientDetailResponseResponseDetail.clientConnection) &&
        Objects.equals(this.connectedDevice, clientDetailResponseResponseDetail.connectedDevice) &&
        Objects.equals(this.issueCount, clientDetailResponseResponseDetail.issueCount) &&
        Objects.equals(this.rssi, clientDetailResponseResponseDetail.rssi) &&
        Objects.equals(this.avgRssi, clientDetailResponseResponseDetail.avgRssi) &&
        Objects.equals(this.snr, clientDetailResponseResponseDetail.snr) &&
        Objects.equals(this.avgSnr, clientDetailResponseResponseDetail.avgSnr) &&
        Objects.equals(this.dataRate, clientDetailResponseResponseDetail.dataRate) &&
        Objects.equals(this.txBytes, clientDetailResponseResponseDetail.txBytes) &&
        Objects.equals(this.rxBytes, clientDetailResponseResponseDetail.rxBytes) &&
        Objects.equals(this.dnsSuccess, clientDetailResponseResponseDetail.dnsSuccess) &&
        Objects.equals(this.dnsFailure, clientDetailResponseResponseDetail.dnsFailure) &&
        Objects.equals(this.onboarding, clientDetailResponseResponseDetail.onboarding) &&
        Objects.equals(this.onboardingTime, clientDetailResponseResponseDetail.onboardingTime) &&
        Objects.equals(this.port, clientDetailResponseResponseDetail.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, connectionStatus, hostType, userId, hostName, hostOs, hostVersion, subType, lastUpdated, healthScore, hostMac, hostIpV4, hostIpV6, authType, vlanId, ssid, frequency, channel, apGroup, location, clientConnection, connectedDevice, issueCount, rssi, avgRssi, snr, avgSnr, dataRate, txBytes, rxBytes, dnsSuccess, dnsFailure, onboarding, onboardingTime, port);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientDetailResponseResponseDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    connectionStatus: ").append(toIndentedString(connectionStatus)).append("\n");
    sb.append("    hostType: ").append(toIndentedString(hostType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    hostOs: ").append(toIndentedString(hostOs)).append("\n");
    sb.append("    hostVersion: ").append(toIndentedString(hostVersion)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    healthScore: ").append(toIndentedString(healthScore)).append("\n");
    sb.append("    hostMac: ").append(toIndentedString(hostMac)).append("\n");
    sb.append("    hostIpV4: ").append(toIndentedString(hostIpV4)).append("\n");
    sb.append("    hostIpV6: ").append(toIndentedString(hostIpV6)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
    sb.append("    ssid: ").append(toIndentedString(ssid)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    apGroup: ").append(toIndentedString(apGroup)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    clientConnection: ").append(toIndentedString(clientConnection)).append("\n");
    sb.append("    connectedDevice: ").append(toIndentedString(connectedDevice)).append("\n");
    sb.append("    issueCount: ").append(toIndentedString(issueCount)).append("\n");
    sb.append("    rssi: ").append(toIndentedString(rssi)).append("\n");
    sb.append("    avgRssi: ").append(toIndentedString(avgRssi)).append("\n");
    sb.append("    snr: ").append(toIndentedString(snr)).append("\n");
    sb.append("    avgSnr: ").append(toIndentedString(avgSnr)).append("\n");
    sb.append("    dataRate: ").append(toIndentedString(dataRate)).append("\n");
    sb.append("    txBytes: ").append(toIndentedString(txBytes)).append("\n");
    sb.append("    rxBytes: ").append(toIndentedString(rxBytes)).append("\n");
    sb.append("    dnsSuccess: ").append(toIndentedString(dnsSuccess)).append("\n");
    sb.append("    dnsFailure: ").append(toIndentedString(dnsFailure)).append("\n");
    sb.append("    onboarding: ").append(toIndentedString(onboarding)).append("\n");
    sb.append("    onboardingTime: ").append(toIndentedString(onboardingTime)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
