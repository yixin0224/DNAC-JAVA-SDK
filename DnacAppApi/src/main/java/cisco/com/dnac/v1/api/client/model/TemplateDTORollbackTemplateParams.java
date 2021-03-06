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
import cisco.com.dnac.v1.api.client.model.TemplateDTORange;
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
 * TemplateDTORollbackTemplateParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class TemplateDTORollbackTemplateParams {
  /**
   * Gets or Sets dataType
   */
  @JsonAdapter(DataTypeEnum.Adapter.class)
  public enum DataTypeEnum {
    STRING("STRING"),
    
    INTEGER("INTEGER"),
    
    IPADDRESS("IPADDRESS"),
    
    MACADDRESS("MACADDRESS"),
    
    SECTIONDIVIDER("SECTIONDIVIDER");

    private String value;

    DataTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DataTypeEnum fromValue(String text) {
      for (DataTypeEnum b : DataTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DataTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DataTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DataTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DataTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("dataType")
  private DataTypeEnum dataType = null;

  @SerializedName("defaultValue")
  private String defaultValue = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("group")
  private String group = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("instructionText")
  private String instructionText = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("order")
  private Integer order = null;

  @SerializedName("parameterName")
  private String parameterName = null;

  @SerializedName("provider")
  private String provider = null;

  @SerializedName("range")
  private List<TemplateDTORange> range = null;

  @SerializedName("required")
  private Boolean required = null;

  @SerializedName("selection")
  private Object selection = null;

  public TemplateDTORollbackTemplateParams dataType(DataTypeEnum dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * Get dataType
   * @return dataType
  **/
  @ApiModelProperty(value = "")
  public DataTypeEnum getDataType() {
    return dataType;
  }

  public void setDataType(DataTypeEnum dataType) {
    this.dataType = dataType;
  }

  public TemplateDTORollbackTemplateParams defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Get defaultValue
   * @return defaultValue
  **/
  @ApiModelProperty(value = "")
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public TemplateDTORollbackTemplateParams description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TemplateDTORollbackTemplateParams displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public TemplateDTORollbackTemplateParams group(String group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @ApiModelProperty(value = "")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public TemplateDTORollbackTemplateParams id(String id) {
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

  public TemplateDTORollbackTemplateParams instructionText(String instructionText) {
    this.instructionText = instructionText;
    return this;
  }

   /**
   * Get instructionText
   * @return instructionText
  **/
  @ApiModelProperty(value = "")
  public String getInstructionText() {
    return instructionText;
  }

  public void setInstructionText(String instructionText) {
    this.instructionText = instructionText;
  }

  public TemplateDTORollbackTemplateParams key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(value = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public TemplateDTORollbackTemplateParams order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(value = "")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public TemplateDTORollbackTemplateParams parameterName(String parameterName) {
    this.parameterName = parameterName;
    return this;
  }

   /**
   * Get parameterName
   * @return parameterName
  **/
  @ApiModelProperty(value = "")
  public String getParameterName() {
    return parameterName;
  }

  public void setParameterName(String parameterName) {
    this.parameterName = parameterName;
  }

  public TemplateDTORollbackTemplateParams provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @ApiModelProperty(value = "")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public TemplateDTORollbackTemplateParams range(List<TemplateDTORange> range) {
    this.range = range;
    return this;
  }

  public TemplateDTORollbackTemplateParams addRangeItem(TemplateDTORange rangeItem) {
    if (this.range == null) {
      this.range = new ArrayList<>();
    }
    this.range.add(rangeItem);
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @ApiModelProperty(value = "")
  public List<TemplateDTORange> getRange() {
    return range;
  }

  public void setRange(List<TemplateDTORange> range) {
    this.range = range;
  }

  public TemplateDTORollbackTemplateParams required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @ApiModelProperty(value = "")
  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public TemplateDTORollbackTemplateParams selection(Object selection) {
    this.selection = selection;
    return this;
  }

   /**
   * Get selection
   * @return selection
  **/
  @ApiModelProperty(value = "")
  public Object getSelection() {
    return selection;
  }

  public void setSelection(Object selection) {
    this.selection = selection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateDTORollbackTemplateParams templateDTORollbackTemplateParams = (TemplateDTORollbackTemplateParams) o;
    return Objects.equals(this.dataType, templateDTORollbackTemplateParams.dataType) &&
        Objects.equals(this.defaultValue, templateDTORollbackTemplateParams.defaultValue) &&
        Objects.equals(this.description, templateDTORollbackTemplateParams.description) &&
        Objects.equals(this.displayName, templateDTORollbackTemplateParams.displayName) &&
        Objects.equals(this.group, templateDTORollbackTemplateParams.group) &&
        Objects.equals(this.id, templateDTORollbackTemplateParams.id) &&
        Objects.equals(this.instructionText, templateDTORollbackTemplateParams.instructionText) &&
        Objects.equals(this.key, templateDTORollbackTemplateParams.key) &&
        Objects.equals(this.order, templateDTORollbackTemplateParams.order) &&
        Objects.equals(this.parameterName, templateDTORollbackTemplateParams.parameterName) &&
        Objects.equals(this.provider, templateDTORollbackTemplateParams.provider) &&
        Objects.equals(this.range, templateDTORollbackTemplateParams.range) &&
        Objects.equals(this.required, templateDTORollbackTemplateParams.required) &&
        Objects.equals(this.selection, templateDTORollbackTemplateParams.selection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataType, defaultValue, description, displayName, group, id, instructionText, key, order, parameterName, provider, range, required, selection);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateDTORollbackTemplateParams {\n");
    
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instructionText: ").append(toIndentedString(instructionText)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    selection: ").append(toIndentedString(selection)).append("\n");
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

