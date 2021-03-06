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
 * DeviceInnerDeviceInfoFileSystemList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class DeviceInnerDeviceInfoFileSystemList {
  @SerializedName("freespace")
  private Integer freespace = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("readable")
  private Boolean readable = null;

  @SerializedName("size")
  private Integer size = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("writeable")
  private Boolean writeable = null;

  public DeviceInnerDeviceInfoFileSystemList freespace(Integer freespace) {
    this.freespace = freespace;
    return this;
  }

   /**
   * Get freespace
   * @return freespace
  **/
  @ApiModelProperty(value = "")
  public Integer getFreespace() {
    return freespace;
  }

  public void setFreespace(Integer freespace) {
    this.freespace = freespace;
  }

  public DeviceInnerDeviceInfoFileSystemList name(String name) {
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

  public DeviceInnerDeviceInfoFileSystemList readable(Boolean readable) {
    this.readable = readable;
    return this;
  }

   /**
   * Get readable
   * @return readable
  **/
  @ApiModelProperty(value = "")
  public Boolean isReadable() {
    return readable;
  }

  public void setReadable(Boolean readable) {
    this.readable = readable;
  }

  public DeviceInnerDeviceInfoFileSystemList size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public DeviceInnerDeviceInfoFileSystemList type(String type) {
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

  public DeviceInnerDeviceInfoFileSystemList writeable(Boolean writeable) {
    this.writeable = writeable;
    return this;
  }

   /**
   * Get writeable
   * @return writeable
  **/
  @ApiModelProperty(value = "")
  public Boolean isWriteable() {
    return writeable;
  }

  public void setWriteable(Boolean writeable) {
    this.writeable = writeable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceInnerDeviceInfoFileSystemList deviceInnerDeviceInfoFileSystemList = (DeviceInnerDeviceInfoFileSystemList) o;
    return Objects.equals(this.freespace, deviceInnerDeviceInfoFileSystemList.freespace) &&
        Objects.equals(this.name, deviceInnerDeviceInfoFileSystemList.name) &&
        Objects.equals(this.readable, deviceInnerDeviceInfoFileSystemList.readable) &&
        Objects.equals(this.size, deviceInnerDeviceInfoFileSystemList.size) &&
        Objects.equals(this.type, deviceInnerDeviceInfoFileSystemList.type) &&
        Objects.equals(this.writeable, deviceInnerDeviceInfoFileSystemList.writeable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freespace, name, readable, size, type, writeable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceInnerDeviceInfoFileSystemList {\n");
    
    sb.append("    freespace: ").append(toIndentedString(freespace)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    readable: ").append(toIndentedString(readable)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    writeable: ").append(toIndentedString(writeable)).append("\n");
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

