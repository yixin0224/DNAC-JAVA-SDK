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
import cisco.com.dnac.v1.api.client.model.ResetRequestConfigParameters;
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
 * ResetRequestConfigList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class ResetRequestConfigList {
  @SerializedName("configId")
  private String configId = null;

  @SerializedName("configParameters")
  private List<ResetRequestConfigParameters> configParameters = null;

  public ResetRequestConfigList configId(String configId) {
    this.configId = configId;
    return this;
  }

   /**
   * Get configId
   * @return configId
  **/
  @ApiModelProperty(value = "")
  public String getConfigId() {
    return configId;
  }

  public void setConfigId(String configId) {
    this.configId = configId;
  }

  public ResetRequestConfigList configParameters(List<ResetRequestConfigParameters> configParameters) {
    this.configParameters = configParameters;
    return this;
  }

  public ResetRequestConfigList addConfigParametersItem(ResetRequestConfigParameters configParametersItem) {
    if (this.configParameters == null) {
      this.configParameters = new ArrayList<>();
    }
    this.configParameters.add(configParametersItem);
    return this;
  }

   /**
   * Get configParameters
   * @return configParameters
  **/
  @ApiModelProperty(value = "")
  public List<ResetRequestConfigParameters> getConfigParameters() {
    return configParameters;
  }

  public void setConfigParameters(List<ResetRequestConfigParameters> configParameters) {
    this.configParameters = configParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResetRequestConfigList resetRequestConfigList = (ResetRequestConfigList) o;
    return Objects.equals(this.configId, resetRequestConfigList.configId) &&
        Objects.equals(this.configParameters, resetRequestConfigList.configParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configId, configParameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetRequestConfigList {\n");
    
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    configParameters: ").append(toIndentedString(configParameters)).append("\n");
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

