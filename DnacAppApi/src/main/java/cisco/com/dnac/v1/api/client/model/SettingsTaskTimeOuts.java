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
 * SettingsTaskTimeOuts
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class SettingsTaskTimeOuts {
  @SerializedName("configTimeOut")
  private Integer configTimeOut = null;

  @SerializedName("generalTimeOut")
  private Integer generalTimeOut = null;

  @SerializedName("imageDownloadTimeOut")
  private Integer imageDownloadTimeOut = null;

  public SettingsTaskTimeOuts configTimeOut(Integer configTimeOut) {
    this.configTimeOut = configTimeOut;
    return this;
  }

   /**
   * Get configTimeOut
   * @return configTimeOut
  **/
  @ApiModelProperty(value = "")
  public Integer getConfigTimeOut() {
    return configTimeOut;
  }

  public void setConfigTimeOut(Integer configTimeOut) {
    this.configTimeOut = configTimeOut;
  }

  public SettingsTaskTimeOuts generalTimeOut(Integer generalTimeOut) {
    this.generalTimeOut = generalTimeOut;
    return this;
  }

   /**
   * Get generalTimeOut
   * @return generalTimeOut
  **/
  @ApiModelProperty(value = "")
  public Integer getGeneralTimeOut() {
    return generalTimeOut;
  }

  public void setGeneralTimeOut(Integer generalTimeOut) {
    this.generalTimeOut = generalTimeOut;
  }

  public SettingsTaskTimeOuts imageDownloadTimeOut(Integer imageDownloadTimeOut) {
    this.imageDownloadTimeOut = imageDownloadTimeOut;
    return this;
  }

   /**
   * Get imageDownloadTimeOut
   * @return imageDownloadTimeOut
  **/
  @ApiModelProperty(value = "")
  public Integer getImageDownloadTimeOut() {
    return imageDownloadTimeOut;
  }

  public void setImageDownloadTimeOut(Integer imageDownloadTimeOut) {
    this.imageDownloadTimeOut = imageDownloadTimeOut;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingsTaskTimeOuts settingsTaskTimeOuts = (SettingsTaskTimeOuts) o;
    return Objects.equals(this.configTimeOut, settingsTaskTimeOuts.configTimeOut) &&
        Objects.equals(this.generalTimeOut, settingsTaskTimeOuts.generalTimeOut) &&
        Objects.equals(this.imageDownloadTimeOut, settingsTaskTimeOuts.imageDownloadTimeOut);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configTimeOut, generalTimeOut, imageDownloadTimeOut);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsTaskTimeOuts {\n");
    
    sb.append("    configTimeOut: ").append(toIndentedString(configTimeOut)).append("\n");
    sb.append("    generalTimeOut: ").append(toIndentedString(generalTimeOut)).append("\n");
    sb.append("    imageDownloadTimeOut: ").append(toIndentedString(imageDownloadTimeOut)).append("\n");
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

