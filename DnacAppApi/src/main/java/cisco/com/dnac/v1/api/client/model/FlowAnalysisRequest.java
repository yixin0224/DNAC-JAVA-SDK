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
 * FlowAnalysisRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class FlowAnalysisRequest {
  @SerializedName("controlPath")
  private Boolean controlPath = null;

  @SerializedName("destIP")
  private String destIP = null;

  @SerializedName("destPort")
  private String destPort = null;

  @SerializedName("inclusions")
  private List<String> inclusions = null;

  @SerializedName("periodicRefresh")
  private Boolean periodicRefresh = null;

  @SerializedName("protocol")
  private String protocol = null;

  @SerializedName("sourceIP")
  private String sourceIP = null;

  @SerializedName("sourcePort")
  private String sourcePort = null;

  public FlowAnalysisRequest controlPath(Boolean controlPath) {
    this.controlPath = controlPath;
    return this;
  }

   /**
   * Get controlPath
   * @return controlPath
  **/
  @ApiModelProperty(value = "")
  public Boolean isControlPath() {
    return controlPath;
  }

  public void setControlPath(Boolean controlPath) {
    this.controlPath = controlPath;
  }

  public FlowAnalysisRequest destIP(String destIP) {
    this.destIP = destIP;
    return this;
  }

   /**
   * Get destIP
   * @return destIP
  **/
  @ApiModelProperty(value = "")
  public String getDestIP() {
    return destIP;
  }

  public void setDestIP(String destIP) {
    this.destIP = destIP;
  }

  public FlowAnalysisRequest destPort(String destPort) {
    this.destPort = destPort;
    return this;
  }

   /**
   * Get destPort
   * @return destPort
  **/
  @ApiModelProperty(value = "")
  public String getDestPort() {
    return destPort;
  }

  public void setDestPort(String destPort) {
    this.destPort = destPort;
  }

  public FlowAnalysisRequest inclusions(List<String> inclusions) {
    this.inclusions = inclusions;
    return this;
  }

  public FlowAnalysisRequest addInclusionsItem(String inclusionsItem) {
    if (this.inclusions == null) {
      this.inclusions = new ArrayList<>();
    }
    this.inclusions.add(inclusionsItem);
    return this;
  }

   /**
   * Get inclusions
   * @return inclusions
  **/
  @ApiModelProperty(value = "")
  public List<String> getInclusions() {
    return inclusions;
  }

  public void setInclusions(List<String> inclusions) {
    this.inclusions = inclusions;
  }

  public FlowAnalysisRequest periodicRefresh(Boolean periodicRefresh) {
    this.periodicRefresh = periodicRefresh;
    return this;
  }

   /**
   * Get periodicRefresh
   * @return periodicRefresh
  **/
  @ApiModelProperty(value = "")
  public Boolean isPeriodicRefresh() {
    return periodicRefresh;
  }

  public void setPeriodicRefresh(Boolean periodicRefresh) {
    this.periodicRefresh = periodicRefresh;
  }

  public FlowAnalysisRequest protocol(String protocol) {
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

  public FlowAnalysisRequest sourceIP(String sourceIP) {
    this.sourceIP = sourceIP;
    return this;
  }

   /**
   * Get sourceIP
   * @return sourceIP
  **/
  @ApiModelProperty(value = "")
  public String getSourceIP() {
    return sourceIP;
  }

  public void setSourceIP(String sourceIP) {
    this.sourceIP = sourceIP;
  }

  public FlowAnalysisRequest sourcePort(String sourcePort) {
    this.sourcePort = sourcePort;
    return this;
  }

   /**
   * Get sourcePort
   * @return sourcePort
  **/
  @ApiModelProperty(value = "")
  public String getSourcePort() {
    return sourcePort;
  }

  public void setSourcePort(String sourcePort) {
    this.sourcePort = sourcePort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowAnalysisRequest flowAnalysisRequest = (FlowAnalysisRequest) o;
    return Objects.equals(this.controlPath, flowAnalysisRequest.controlPath) &&
        Objects.equals(this.destIP, flowAnalysisRequest.destIP) &&
        Objects.equals(this.destPort, flowAnalysisRequest.destPort) &&
        Objects.equals(this.inclusions, flowAnalysisRequest.inclusions) &&
        Objects.equals(this.periodicRefresh, flowAnalysisRequest.periodicRefresh) &&
        Objects.equals(this.protocol, flowAnalysisRequest.protocol) &&
        Objects.equals(this.sourceIP, flowAnalysisRequest.sourceIP) &&
        Objects.equals(this.sourcePort, flowAnalysisRequest.sourcePort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controlPath, destIP, destPort, inclusions, periodicRefresh, protocol, sourceIP, sourcePort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowAnalysisRequest {\n");
    
    sb.append("    controlPath: ").append(toIndentedString(controlPath)).append("\n");
    sb.append("    destIP: ").append(toIndentedString(destIP)).append("\n");
    sb.append("    destPort: ").append(toIndentedString(destPort)).append("\n");
    sb.append("    inclusions: ").append(toIndentedString(inclusions)).append("\n");
    sb.append("    periodicRefresh: ").append(toIndentedString(periodicRefresh)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    sourceIP: ").append(toIndentedString(sourceIP)).append("\n");
    sb.append("    sourcePort: ").append(toIndentedString(sourcePort)).append("\n");
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

