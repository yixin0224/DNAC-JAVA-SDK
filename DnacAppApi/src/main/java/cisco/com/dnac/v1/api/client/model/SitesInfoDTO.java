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
 * SitesInfoDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class SitesInfoDTO {
  @SerializedName("siteUuids")
  private List<String> siteUuids = null;

  public SitesInfoDTO siteUuids(List<String> siteUuids) {
    this.siteUuids = siteUuids;
    return this;
  }

  public SitesInfoDTO addSiteUuidsItem(String siteUuidsItem) {
    if (this.siteUuids == null) {
      this.siteUuids = new ArrayList<>();
    }
    this.siteUuids.add(siteUuidsItem);
    return this;
  }

   /**
   * Get siteUuids
   * @return siteUuids
  **/
  @ApiModelProperty(value = "")
  public List<String> getSiteUuids() {
    return siteUuids;
  }

  public void setSiteUuids(List<String> siteUuids) {
    this.siteUuids = siteUuids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SitesInfoDTO sitesInfoDTO = (SitesInfoDTO) o;
    return Objects.equals(this.siteUuids, sitesInfoDTO.siteUuids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siteUuids);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SitesInfoDTO {\n");
    
    sb.append("    siteUuids: ").append(toIndentedString(siteUuids)).append("\n");
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

