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
import cisco.com.dnac.v1.api.client.model.PathResponseResultResponseEgressPhysicalInterfaceAclAnalysis;
import cisco.com.dnac.v1.api.client.model.PathResponseResultResponseEgressPhysicalInterfaceInterfaceStatistics;
import cisco.com.dnac.v1.api.client.model.PathResponseResultResponseEgressPhysicalInterfacePathOverlayInfo;
import cisco.com.dnac.v1.api.client.model.PathResponseResultResponseEgressPhysicalInterfaceQosStatistics;
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
 * PathResponseResultResponseEgressPhysicalInterface
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class PathResponseResultResponseEgressPhysicalInterface {
  @SerializedName("aclAnalysis")
  private PathResponseResultResponseEgressPhysicalInterfaceAclAnalysis aclAnalysis = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("interfaceStatistics")
  private PathResponseResultResponseEgressPhysicalInterfaceInterfaceStatistics interfaceStatistics = null;

  @SerializedName("interfaceStatsCollection")
  private String interfaceStatsCollection = null;

  @SerializedName("interfaceStatsCollectionFailureReason")
  private String interfaceStatsCollectionFailureReason = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("pathOverlayInfo")
  private List<PathResponseResultResponseEgressPhysicalInterfacePathOverlayInfo> pathOverlayInfo = null;

  @SerializedName("qosStatistics")
  private List<PathResponseResultResponseEgressPhysicalInterfaceQosStatistics> qosStatistics = null;

  @SerializedName("qosStatsCollection")
  private String qosStatsCollection = null;

  @SerializedName("qosStatsCollectionFailureReason")
  private String qosStatsCollectionFailureReason = null;

  @SerializedName("usedVlan")
  private String usedVlan = null;

  @SerializedName("vrfName")
  private String vrfName = null;

  public PathResponseResultResponseEgressPhysicalInterface aclAnalysis(PathResponseResultResponseEgressPhysicalInterfaceAclAnalysis aclAnalysis) {
    this.aclAnalysis = aclAnalysis;
    return this;
  }

   /**
   * Get aclAnalysis
   * @return aclAnalysis
  **/
  @ApiModelProperty(value = "")
  public PathResponseResultResponseEgressPhysicalInterfaceAclAnalysis getAclAnalysis() {
    return aclAnalysis;
  }

  public void setAclAnalysis(PathResponseResultResponseEgressPhysicalInterfaceAclAnalysis aclAnalysis) {
    this.aclAnalysis = aclAnalysis;
  }

  public PathResponseResultResponseEgressPhysicalInterface id(String id) {
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

  public PathResponseResultResponseEgressPhysicalInterface interfaceStatistics(PathResponseResultResponseEgressPhysicalInterfaceInterfaceStatistics interfaceStatistics) {
    this.interfaceStatistics = interfaceStatistics;
    return this;
  }

   /**
   * Get interfaceStatistics
   * @return interfaceStatistics
  **/
  @ApiModelProperty(value = "")
  public PathResponseResultResponseEgressPhysicalInterfaceInterfaceStatistics getInterfaceStatistics() {
    return interfaceStatistics;
  }

  public void setInterfaceStatistics(PathResponseResultResponseEgressPhysicalInterfaceInterfaceStatistics interfaceStatistics) {
    this.interfaceStatistics = interfaceStatistics;
  }

  public PathResponseResultResponseEgressPhysicalInterface interfaceStatsCollection(String interfaceStatsCollection) {
    this.interfaceStatsCollection = interfaceStatsCollection;
    return this;
  }

   /**
   * Get interfaceStatsCollection
   * @return interfaceStatsCollection
  **/
  @ApiModelProperty(value = "")
  public String getInterfaceStatsCollection() {
    return interfaceStatsCollection;
  }

  public void setInterfaceStatsCollection(String interfaceStatsCollection) {
    this.interfaceStatsCollection = interfaceStatsCollection;
  }

  public PathResponseResultResponseEgressPhysicalInterface interfaceStatsCollectionFailureReason(String interfaceStatsCollectionFailureReason) {
    this.interfaceStatsCollectionFailureReason = interfaceStatsCollectionFailureReason;
    return this;
  }

   /**
   * Get interfaceStatsCollectionFailureReason
   * @return interfaceStatsCollectionFailureReason
  **/
  @ApiModelProperty(value = "")
  public String getInterfaceStatsCollectionFailureReason() {
    return interfaceStatsCollectionFailureReason;
  }

  public void setInterfaceStatsCollectionFailureReason(String interfaceStatsCollectionFailureReason) {
    this.interfaceStatsCollectionFailureReason = interfaceStatsCollectionFailureReason;
  }

  public PathResponseResultResponseEgressPhysicalInterface name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PathResponseResultResponseEgressPhysicalInterface pathOverlayInfo(List<PathResponseResultResponseEgressPhysicalInterfacePathOverlayInfo> pathOverlayInfo) {
    this.pathOverlayInfo = pathOverlayInfo;
    return this;
  }

  public PathResponseResultResponseEgressPhysicalInterface addPathOverlayInfoItem(PathResponseResultResponseEgressPhysicalInterfacePathOverlayInfo pathOverlayInfoItem) {
    if (this.pathOverlayInfo == null) {
      this.pathOverlayInfo = new ArrayList<>();
    }
    this.pathOverlayInfo.add(pathOverlayInfoItem);
    return this;
  }

   /**
   * Get pathOverlayInfo
   * @return pathOverlayInfo
  **/
  @ApiModelProperty(value = "")
  public List<PathResponseResultResponseEgressPhysicalInterfacePathOverlayInfo> getPathOverlayInfo() {
    return pathOverlayInfo;
  }

  public void setPathOverlayInfo(List<PathResponseResultResponseEgressPhysicalInterfacePathOverlayInfo> pathOverlayInfo) {
    this.pathOverlayInfo = pathOverlayInfo;
  }

  public PathResponseResultResponseEgressPhysicalInterface qosStatistics(List<PathResponseResultResponseEgressPhysicalInterfaceQosStatistics> qosStatistics) {
    this.qosStatistics = qosStatistics;
    return this;
  }

  public PathResponseResultResponseEgressPhysicalInterface addQosStatisticsItem(PathResponseResultResponseEgressPhysicalInterfaceQosStatistics qosStatisticsItem) {
    if (this.qosStatistics == null) {
      this.qosStatistics = new ArrayList<>();
    }
    this.qosStatistics.add(qosStatisticsItem);
    return this;
  }

   /**
   * Get qosStatistics
   * @return qosStatistics
  **/
  @ApiModelProperty(value = "")
  public List<PathResponseResultResponseEgressPhysicalInterfaceQosStatistics> getQosStatistics() {
    return qosStatistics;
  }

  public void setQosStatistics(List<PathResponseResultResponseEgressPhysicalInterfaceQosStatistics> qosStatistics) {
    this.qosStatistics = qosStatistics;
  }

  public PathResponseResultResponseEgressPhysicalInterface qosStatsCollection(String qosStatsCollection) {
    this.qosStatsCollection = qosStatsCollection;
    return this;
  }

   /**
   * Get qosStatsCollection
   * @return qosStatsCollection
  **/
  @ApiModelProperty(value = "")
  public String getQosStatsCollection() {
    return qosStatsCollection;
  }

  public void setQosStatsCollection(String qosStatsCollection) {
    this.qosStatsCollection = qosStatsCollection;
  }

  public PathResponseResultResponseEgressPhysicalInterface qosStatsCollectionFailureReason(String qosStatsCollectionFailureReason) {
    this.qosStatsCollectionFailureReason = qosStatsCollectionFailureReason;
    return this;
  }

   /**
   * Get qosStatsCollectionFailureReason
   * @return qosStatsCollectionFailureReason
  **/
  @ApiModelProperty(value = "")
  public String getQosStatsCollectionFailureReason() {
    return qosStatsCollectionFailureReason;
  }

  public void setQosStatsCollectionFailureReason(String qosStatsCollectionFailureReason) {
    this.qosStatsCollectionFailureReason = qosStatsCollectionFailureReason;
  }

  public PathResponseResultResponseEgressPhysicalInterface usedVlan(String usedVlan) {
    this.usedVlan = usedVlan;
    return this;
  }

   /**
   * Get usedVlan
   * @return usedVlan
  **/
  @ApiModelProperty(value = "")
  public String getUsedVlan() {
    return usedVlan;
  }

  public void setUsedVlan(String usedVlan) {
    this.usedVlan = usedVlan;
  }

  public PathResponseResultResponseEgressPhysicalInterface vrfName(String vrfName) {
    this.vrfName = vrfName;
    return this;
  }

   /**
   * Get vrfName
   * @return vrfName
  **/
  @ApiModelProperty(value = "")
  public String getVrfName() {
    return vrfName;
  }

  public void setVrfName(String vrfName) {
    this.vrfName = vrfName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PathResponseResultResponseEgressPhysicalInterface pathResponseResultResponseEgressPhysicalInterface = (PathResponseResultResponseEgressPhysicalInterface) o;
    return Objects.equals(this.aclAnalysis, pathResponseResultResponseEgressPhysicalInterface.aclAnalysis) &&
        Objects.equals(this.id, pathResponseResultResponseEgressPhysicalInterface.id) &&
        Objects.equals(this.interfaceStatistics, pathResponseResultResponseEgressPhysicalInterface.interfaceStatistics) &&
        Objects.equals(this.interfaceStatsCollection, pathResponseResultResponseEgressPhysicalInterface.interfaceStatsCollection) &&
        Objects.equals(this.interfaceStatsCollectionFailureReason, pathResponseResultResponseEgressPhysicalInterface.interfaceStatsCollectionFailureReason) &&
        Objects.equals(this.name, pathResponseResultResponseEgressPhysicalInterface.name) &&
        Objects.equals(this.pathOverlayInfo, pathResponseResultResponseEgressPhysicalInterface.pathOverlayInfo) &&
        Objects.equals(this.qosStatistics, pathResponseResultResponseEgressPhysicalInterface.qosStatistics) &&
        Objects.equals(this.qosStatsCollection, pathResponseResultResponseEgressPhysicalInterface.qosStatsCollection) &&
        Objects.equals(this.qosStatsCollectionFailureReason, pathResponseResultResponseEgressPhysicalInterface.qosStatsCollectionFailureReason) &&
        Objects.equals(this.usedVlan, pathResponseResultResponseEgressPhysicalInterface.usedVlan) &&
        Objects.equals(this.vrfName, pathResponseResultResponseEgressPhysicalInterface.vrfName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aclAnalysis, id, interfaceStatistics, interfaceStatsCollection, interfaceStatsCollectionFailureReason, name, pathOverlayInfo, qosStatistics, qosStatsCollection, qosStatsCollectionFailureReason, usedVlan, vrfName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PathResponseResultResponseEgressPhysicalInterface {\n");
    
    sb.append("    aclAnalysis: ").append(toIndentedString(aclAnalysis)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interfaceStatistics: ").append(toIndentedString(interfaceStatistics)).append("\n");
    sb.append("    interfaceStatsCollection: ").append(toIndentedString(interfaceStatsCollection)).append("\n");
    sb.append("    interfaceStatsCollectionFailureReason: ").append(toIndentedString(interfaceStatsCollectionFailureReason)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pathOverlayInfo: ").append(toIndentedString(pathOverlayInfo)).append("\n");
    sb.append("    qosStatistics: ").append(toIndentedString(qosStatistics)).append("\n");
    sb.append("    qosStatsCollection: ").append(toIndentedString(qosStatsCollection)).append("\n");
    sb.append("    qosStatsCollectionFailureReason: ").append(toIndentedString(qosStatsCollectionFailureReason)).append("\n");
    sb.append("    usedVlan: ").append(toIndentedString(usedVlan)).append("\n");
    sb.append("    vrfName: ").append(toIndentedString(vrfName)).append("\n");
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

