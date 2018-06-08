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
 * ClientDetailResponseResponseConnectionInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class ClientDetailResponseResponseConnectionInfo {
  @SerializedName("hostType")
  private String hostType = null;

  @SerializedName("nwDeviceName")
  private String nwDeviceName = null;

  @SerializedName("nwDeviceMac")
  private String nwDeviceMac = null;

  @SerializedName("protocol")
  private String protocol = null;

  @SerializedName("band")
  private String band = null;

  @SerializedName("spatialStream")
  private String spatialStream = null;

  @SerializedName("channel")
  private String channel = null;

  @SerializedName("channelWidth")
  private String channelWidth = null;

  @SerializedName("wmm")
  private String wmm = null;

  @SerializedName("uapsd")
  private String uapsd = null;

  @SerializedName("timestamp")
  private String timestamp = null;

  public ClientDetailResponseResponseConnectionInfo hostType(String hostType) {
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

  public ClientDetailResponseResponseConnectionInfo nwDeviceName(String nwDeviceName) {
    this.nwDeviceName = nwDeviceName;
    return this;
  }

   /**
   * Get nwDeviceName
   * @return nwDeviceName
  **/
  @ApiModelProperty(value = "")
  public String getNwDeviceName() {
    return nwDeviceName;
  }

  public void setNwDeviceName(String nwDeviceName) {
    this.nwDeviceName = nwDeviceName;
  }

  public ClientDetailResponseResponseConnectionInfo nwDeviceMac(String nwDeviceMac) {
    this.nwDeviceMac = nwDeviceMac;
    return this;
  }

   /**
   * Get nwDeviceMac
   * @return nwDeviceMac
  **/
  @ApiModelProperty(value = "")
  public String getNwDeviceMac() {
    return nwDeviceMac;
  }

  public void setNwDeviceMac(String nwDeviceMac) {
    this.nwDeviceMac = nwDeviceMac;
  }

  public ClientDetailResponseResponseConnectionInfo protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @ApiModelProperty(value = "")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public ClientDetailResponseResponseConnectionInfo band(String band) {
    this.band = band;
    return this;
  }

   /**
   * Get band
   * @return band
  **/
  @ApiModelProperty(value = "")
  public String getBand() {
    return band;
  }

  public void setBand(String band) {
    this.band = band;
  }

  public ClientDetailResponseResponseConnectionInfo spatialStream(String spatialStream) {
    this.spatialStream = spatialStream;
    return this;
  }

   /**
   * Get spatialStream
   * @return spatialStream
  **/
  @ApiModelProperty(value = "")
  public String getSpatialStream() {
    return spatialStream;
  }

  public void setSpatialStream(String spatialStream) {
    this.spatialStream = spatialStream;
  }

  public ClientDetailResponseResponseConnectionInfo channel(String channel) {
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

  public ClientDetailResponseResponseConnectionInfo channelWidth(String channelWidth) {
    this.channelWidth = channelWidth;
    return this;
  }

   /**
   * Get channelWidth
   * @return channelWidth
  **/
  @ApiModelProperty(value = "")
  public String getChannelWidth() {
    return channelWidth;
  }

  public void setChannelWidth(String channelWidth) {
    this.channelWidth = channelWidth;
  }

  public ClientDetailResponseResponseConnectionInfo wmm(String wmm) {
    this.wmm = wmm;
    return this;
  }

   /**
   * Get wmm
   * @return wmm
  **/
  @ApiModelProperty(value = "")
  public String getWmm() {
    return wmm;
  }

  public void setWmm(String wmm) {
    this.wmm = wmm;
  }

  public ClientDetailResponseResponseConnectionInfo uapsd(String uapsd) {
    this.uapsd = uapsd;
    return this;
  }

   /**
   * Get uapsd
   * @return uapsd
  **/
  @ApiModelProperty(value = "")
  public String getUapsd() {
    return uapsd;
  }

  public void setUapsd(String uapsd) {
    this.uapsd = uapsd;
  }

  public ClientDetailResponseResponseConnectionInfo timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientDetailResponseResponseConnectionInfo clientDetailResponseResponseConnectionInfo = (ClientDetailResponseResponseConnectionInfo) o;
    return Objects.equals(this.hostType, clientDetailResponseResponseConnectionInfo.hostType) &&
        Objects.equals(this.nwDeviceName, clientDetailResponseResponseConnectionInfo.nwDeviceName) &&
        Objects.equals(this.nwDeviceMac, clientDetailResponseResponseConnectionInfo.nwDeviceMac) &&
        Objects.equals(this.protocol, clientDetailResponseResponseConnectionInfo.protocol) &&
        Objects.equals(this.band, clientDetailResponseResponseConnectionInfo.band) &&
        Objects.equals(this.spatialStream, clientDetailResponseResponseConnectionInfo.spatialStream) &&
        Objects.equals(this.channel, clientDetailResponseResponseConnectionInfo.channel) &&
        Objects.equals(this.channelWidth, clientDetailResponseResponseConnectionInfo.channelWidth) &&
        Objects.equals(this.wmm, clientDetailResponseResponseConnectionInfo.wmm) &&
        Objects.equals(this.uapsd, clientDetailResponseResponseConnectionInfo.uapsd) &&
        Objects.equals(this.timestamp, clientDetailResponseResponseConnectionInfo.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostType, nwDeviceName, nwDeviceMac, protocol, band, spatialStream, channel, channelWidth, wmm, uapsd, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientDetailResponseResponseConnectionInfo {\n");
    
    sb.append("    hostType: ").append(toIndentedString(hostType)).append("\n");
    sb.append("    nwDeviceName: ").append(toIndentedString(nwDeviceName)).append("\n");
    sb.append("    nwDeviceMac: ").append(toIndentedString(nwDeviceMac)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    band: ").append(toIndentedString(band)).append("\n");
    sb.append("    spatialStream: ").append(toIndentedString(spatialStream)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    channelWidth: ").append(toIndentedString(channelWidth)).append("\n");
    sb.append("    wmm: ").append(toIndentedString(wmm)).append("\n");
    sb.append("    uapsd: ").append(toIndentedString(uapsd)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

