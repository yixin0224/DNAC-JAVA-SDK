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
import cisco.com.dnac.v1.api.client.model.SAVAMappingSyncResultSyncList;
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
 * SAVAMappingSyncResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class SAVAMappingSyncResult {
  @SerializedName("syncList")
  private List<SAVAMappingSyncResultSyncList> syncList = null;

  @SerializedName("syncMsg")
  private String syncMsg = null;

  public SAVAMappingSyncResult syncList(List<SAVAMappingSyncResultSyncList> syncList) {
    this.syncList = syncList;
    return this;
  }

  public SAVAMappingSyncResult addSyncListItem(SAVAMappingSyncResultSyncList syncListItem) {
    if (this.syncList == null) {
      this.syncList = new ArrayList<>();
    }
    this.syncList.add(syncListItem);
    return this;
  }

   /**
   * Get syncList
   * @return syncList
  **/
  @ApiModelProperty(value = "")
  public List<SAVAMappingSyncResultSyncList> getSyncList() {
    return syncList;
  }

  public void setSyncList(List<SAVAMappingSyncResultSyncList> syncList) {
    this.syncList = syncList;
  }

  public SAVAMappingSyncResult syncMsg(String syncMsg) {
    this.syncMsg = syncMsg;
    return this;
  }

   /**
   * Get syncMsg
   * @return syncMsg
  **/
  @ApiModelProperty(value = "")
  public String getSyncMsg() {
    return syncMsg;
  }

  public void setSyncMsg(String syncMsg) {
    this.syncMsg = syncMsg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SAVAMappingSyncResult saVAMappingSyncResult = (SAVAMappingSyncResult) o;
    return Objects.equals(this.syncList, saVAMappingSyncResult.syncList) &&
        Objects.equals(this.syncMsg, saVAMappingSyncResult.syncMsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(syncList, syncMsg);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SAVAMappingSyncResult {\n");
    
    sb.append("    syncList: ").append(toIndentedString(syncList)).append("\n");
    sb.append("    syncMsg: ").append(toIndentedString(syncMsg)).append("\n");
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
