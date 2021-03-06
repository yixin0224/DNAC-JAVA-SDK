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
 * ClientDetailResponseResponseDetailOnboarding
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class ClientDetailResponseResponseDetailOnboarding {
  @SerializedName("averageRunDuration")
  private String averageRunDuration = null;

  @SerializedName("maxRunDuration")
  private String maxRunDuration = null;

  @SerializedName("averageAssocDuration")
  private String averageAssocDuration = null;

  @SerializedName("maxAssocDuration")
  private String maxAssocDuration = null;

  @SerializedName("averageAuthDuration")
  private String averageAuthDuration = null;

  @SerializedName("maxAuthDuration")
  private String maxAuthDuration = null;

  @SerializedName("averageDhcpDuration")
  private String averageDhcpDuration = null;

  @SerializedName("maxDhcpDuration")
  private String maxDhcpDuration = null;

  @SerializedName("aaaServerIp")
  private String aaaServerIp = null;

  @SerializedName("dhcpServerIp")
  private String dhcpServerIp = null;

  @SerializedName("authDoneTime")
  private String authDoneTime = null;

  @SerializedName("assocDoneTime")
  private String assocDoneTime = null;

  @SerializedName("dhcpDoneTime")
  private String dhcpDoneTime = null;

  public ClientDetailResponseResponseDetailOnboarding averageRunDuration(String averageRunDuration) {
    this.averageRunDuration = averageRunDuration;
    return this;
  }

   /**
   * Get averageRunDuration
   * @return averageRunDuration
  **/
  @ApiModelProperty(value = "")
  public String getAverageRunDuration() {
    return averageRunDuration;
  }

  public void setAverageRunDuration(String averageRunDuration) {
    this.averageRunDuration = averageRunDuration;
  }

  public ClientDetailResponseResponseDetailOnboarding maxRunDuration(String maxRunDuration) {
    this.maxRunDuration = maxRunDuration;
    return this;
  }

   /**
   * Get maxRunDuration
   * @return maxRunDuration
  **/
  @ApiModelProperty(value = "")
  public String getMaxRunDuration() {
    return maxRunDuration;
  }

  public void setMaxRunDuration(String maxRunDuration) {
    this.maxRunDuration = maxRunDuration;
  }

  public ClientDetailResponseResponseDetailOnboarding averageAssocDuration(String averageAssocDuration) {
    this.averageAssocDuration = averageAssocDuration;
    return this;
  }

   /**
   * Get averageAssocDuration
   * @return averageAssocDuration
  **/
  @ApiModelProperty(value = "")
  public String getAverageAssocDuration() {
    return averageAssocDuration;
  }

  public void setAverageAssocDuration(String averageAssocDuration) {
    this.averageAssocDuration = averageAssocDuration;
  }

  public ClientDetailResponseResponseDetailOnboarding maxAssocDuration(String maxAssocDuration) {
    this.maxAssocDuration = maxAssocDuration;
    return this;
  }

   /**
   * Get maxAssocDuration
   * @return maxAssocDuration
  **/
  @ApiModelProperty(value = "")
  public String getMaxAssocDuration() {
    return maxAssocDuration;
  }

  public void setMaxAssocDuration(String maxAssocDuration) {
    this.maxAssocDuration = maxAssocDuration;
  }

  public ClientDetailResponseResponseDetailOnboarding averageAuthDuration(String averageAuthDuration) {
    this.averageAuthDuration = averageAuthDuration;
    return this;
  }

   /**
   * Get averageAuthDuration
   * @return averageAuthDuration
  **/
  @ApiModelProperty(value = "")
  public String getAverageAuthDuration() {
    return averageAuthDuration;
  }

  public void setAverageAuthDuration(String averageAuthDuration) {
    this.averageAuthDuration = averageAuthDuration;
  }

  public ClientDetailResponseResponseDetailOnboarding maxAuthDuration(String maxAuthDuration) {
    this.maxAuthDuration = maxAuthDuration;
    return this;
  }

   /**
   * Get maxAuthDuration
   * @return maxAuthDuration
  **/
  @ApiModelProperty(value = "")
  public String getMaxAuthDuration() {
    return maxAuthDuration;
  }

  public void setMaxAuthDuration(String maxAuthDuration) {
    this.maxAuthDuration = maxAuthDuration;
  }

  public ClientDetailResponseResponseDetailOnboarding averageDhcpDuration(String averageDhcpDuration) {
    this.averageDhcpDuration = averageDhcpDuration;
    return this;
  }

   /**
   * Get averageDhcpDuration
   * @return averageDhcpDuration
  **/
  @ApiModelProperty(value = "")
  public String getAverageDhcpDuration() {
    return averageDhcpDuration;
  }

  public void setAverageDhcpDuration(String averageDhcpDuration) {
    this.averageDhcpDuration = averageDhcpDuration;
  }

  public ClientDetailResponseResponseDetailOnboarding maxDhcpDuration(String maxDhcpDuration) {
    this.maxDhcpDuration = maxDhcpDuration;
    return this;
  }

   /**
   * Get maxDhcpDuration
   * @return maxDhcpDuration
  **/
  @ApiModelProperty(value = "")
  public String getMaxDhcpDuration() {
    return maxDhcpDuration;
  }

  public void setMaxDhcpDuration(String maxDhcpDuration) {
    this.maxDhcpDuration = maxDhcpDuration;
  }

  public ClientDetailResponseResponseDetailOnboarding aaaServerIp(String aaaServerIp) {
    this.aaaServerIp = aaaServerIp;
    return this;
  }

   /**
   * Get aaaServerIp
   * @return aaaServerIp
  **/
  @ApiModelProperty(value = "")
  public String getAaaServerIp() {
    return aaaServerIp;
  }

  public void setAaaServerIp(String aaaServerIp) {
    this.aaaServerIp = aaaServerIp;
  }

  public ClientDetailResponseResponseDetailOnboarding dhcpServerIp(String dhcpServerIp) {
    this.dhcpServerIp = dhcpServerIp;
    return this;
  }

   /**
   * Get dhcpServerIp
   * @return dhcpServerIp
  **/
  @ApiModelProperty(value = "")
  public String getDhcpServerIp() {
    return dhcpServerIp;
  }

  public void setDhcpServerIp(String dhcpServerIp) {
    this.dhcpServerIp = dhcpServerIp;
  }

  public ClientDetailResponseResponseDetailOnboarding authDoneTime(String authDoneTime) {
    this.authDoneTime = authDoneTime;
    return this;
  }

   /**
   * Get authDoneTime
   * @return authDoneTime
  **/
  @ApiModelProperty(value = "")
  public String getAuthDoneTime() {
    return authDoneTime;
  }

  public void setAuthDoneTime(String authDoneTime) {
    this.authDoneTime = authDoneTime;
  }

  public ClientDetailResponseResponseDetailOnboarding assocDoneTime(String assocDoneTime) {
    this.assocDoneTime = assocDoneTime;
    return this;
  }

   /**
   * Get assocDoneTime
   * @return assocDoneTime
  **/
  @ApiModelProperty(value = "")
  public String getAssocDoneTime() {
    return assocDoneTime;
  }

  public void setAssocDoneTime(String assocDoneTime) {
    this.assocDoneTime = assocDoneTime;
  }

  public ClientDetailResponseResponseDetailOnboarding dhcpDoneTime(String dhcpDoneTime) {
    this.dhcpDoneTime = dhcpDoneTime;
    return this;
  }

   /**
   * Get dhcpDoneTime
   * @return dhcpDoneTime
  **/
  @ApiModelProperty(value = "")
  public String getDhcpDoneTime() {
    return dhcpDoneTime;
  }

  public void setDhcpDoneTime(String dhcpDoneTime) {
    this.dhcpDoneTime = dhcpDoneTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientDetailResponseResponseDetailOnboarding clientDetailResponseResponseDetailOnboarding = (ClientDetailResponseResponseDetailOnboarding) o;
    return Objects.equals(this.averageRunDuration, clientDetailResponseResponseDetailOnboarding.averageRunDuration) &&
        Objects.equals(this.maxRunDuration, clientDetailResponseResponseDetailOnboarding.maxRunDuration) &&
        Objects.equals(this.averageAssocDuration, clientDetailResponseResponseDetailOnboarding.averageAssocDuration) &&
        Objects.equals(this.maxAssocDuration, clientDetailResponseResponseDetailOnboarding.maxAssocDuration) &&
        Objects.equals(this.averageAuthDuration, clientDetailResponseResponseDetailOnboarding.averageAuthDuration) &&
        Objects.equals(this.maxAuthDuration, clientDetailResponseResponseDetailOnboarding.maxAuthDuration) &&
        Objects.equals(this.averageDhcpDuration, clientDetailResponseResponseDetailOnboarding.averageDhcpDuration) &&
        Objects.equals(this.maxDhcpDuration, clientDetailResponseResponseDetailOnboarding.maxDhcpDuration) &&
        Objects.equals(this.aaaServerIp, clientDetailResponseResponseDetailOnboarding.aaaServerIp) &&
        Objects.equals(this.dhcpServerIp, clientDetailResponseResponseDetailOnboarding.dhcpServerIp) &&
        Objects.equals(this.authDoneTime, clientDetailResponseResponseDetailOnboarding.authDoneTime) &&
        Objects.equals(this.assocDoneTime, clientDetailResponseResponseDetailOnboarding.assocDoneTime) &&
        Objects.equals(this.dhcpDoneTime, clientDetailResponseResponseDetailOnboarding.dhcpDoneTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageRunDuration, maxRunDuration, averageAssocDuration, maxAssocDuration, averageAuthDuration, maxAuthDuration, averageDhcpDuration, maxDhcpDuration, aaaServerIp, dhcpServerIp, authDoneTime, assocDoneTime, dhcpDoneTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientDetailResponseResponseDetailOnboarding {\n");
    
    sb.append("    averageRunDuration: ").append(toIndentedString(averageRunDuration)).append("\n");
    sb.append("    maxRunDuration: ").append(toIndentedString(maxRunDuration)).append("\n");
    sb.append("    averageAssocDuration: ").append(toIndentedString(averageAssocDuration)).append("\n");
    sb.append("    maxAssocDuration: ").append(toIndentedString(maxAssocDuration)).append("\n");
    sb.append("    averageAuthDuration: ").append(toIndentedString(averageAuthDuration)).append("\n");
    sb.append("    maxAuthDuration: ").append(toIndentedString(maxAuthDuration)).append("\n");
    sb.append("    averageDhcpDuration: ").append(toIndentedString(averageDhcpDuration)).append("\n");
    sb.append("    maxDhcpDuration: ").append(toIndentedString(maxDhcpDuration)).append("\n");
    sb.append("    aaaServerIp: ").append(toIndentedString(aaaServerIp)).append("\n");
    sb.append("    dhcpServerIp: ").append(toIndentedString(dhcpServerIp)).append("\n");
    sb.append("    authDoneTime: ").append(toIndentedString(authDoneTime)).append("\n");
    sb.append("    assocDoneTime: ").append(toIndentedString(assocDoneTime)).append("\n");
    sb.append("    dhcpDoneTime: ").append(toIndentedString(dhcpDoneTime)).append("\n");
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

