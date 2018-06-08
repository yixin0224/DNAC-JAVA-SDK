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
import cisco.com.dnac.v1.api.client.model.DeviceInnerSystemResetWorkflowTasks;
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
 * Workflow
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class Workflow {
  @SerializedName("_id")
  private String id = null;

  @SerializedName("addToInventory")
  private Boolean addToInventory = null;

  @SerializedName("addedOn")
  private Integer addedOn = null;

  @SerializedName("configId")
  private String configId = null;

  @SerializedName("currTaskIdx")
  private Integer currTaskIdx = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("endTime")
  private Integer endTime = null;

  @SerializedName("execTime")
  private Integer execTime = null;

  @SerializedName("imageId")
  private String imageId = null;

  @SerializedName("lastupdateOn")
  private Integer lastupdateOn = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("startTime")
  private Integer startTime = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("tasks")
  private List<DeviceInnerSystemResetWorkflowTasks> tasks = null;

  @SerializedName("tenantId")
  private String tenantId = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("useState")
  private String useState = null;

  @SerializedName("version")
  private Integer version = null;

  public Workflow id(String id) {
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

  public Workflow addToInventory(Boolean addToInventory) {
    this.addToInventory = addToInventory;
    return this;
  }

   /**
   * Get addToInventory
   * @return addToInventory
  **/
  @ApiModelProperty(value = "")
  public Boolean isAddToInventory() {
    return addToInventory;
  }

  public void setAddToInventory(Boolean addToInventory) {
    this.addToInventory = addToInventory;
  }

  public Workflow addedOn(Integer addedOn) {
    this.addedOn = addedOn;
    return this;
  }

   /**
   * Get addedOn
   * @return addedOn
  **/
  @ApiModelProperty(value = "")
  public Integer getAddedOn() {
    return addedOn;
  }

  public void setAddedOn(Integer addedOn) {
    this.addedOn = addedOn;
  }

  public Workflow configId(String configId) {
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

  public Workflow currTaskIdx(Integer currTaskIdx) {
    this.currTaskIdx = currTaskIdx;
    return this;
  }

   /**
   * Get currTaskIdx
   * @return currTaskIdx
  **/
  @ApiModelProperty(value = "")
  public Integer getCurrTaskIdx() {
    return currTaskIdx;
  }

  public void setCurrTaskIdx(Integer currTaskIdx) {
    this.currTaskIdx = currTaskIdx;
  }

  public Workflow description(String description) {
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

  public Workflow endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(value = "")
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public Workflow execTime(Integer execTime) {
    this.execTime = execTime;
    return this;
  }

   /**
   * Get execTime
   * @return execTime
  **/
  @ApiModelProperty(value = "")
  public Integer getExecTime() {
    return execTime;
  }

  public void setExecTime(Integer execTime) {
    this.execTime = execTime;
  }

  public Workflow imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

   /**
   * Get imageId
   * @return imageId
  **/
  @ApiModelProperty(value = "")
  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public Workflow lastupdateOn(Integer lastupdateOn) {
    this.lastupdateOn = lastupdateOn;
    return this;
  }

   /**
   * Get lastupdateOn
   * @return lastupdateOn
  **/
  @ApiModelProperty(value = "")
  public Integer getLastupdateOn() {
    return lastupdateOn;
  }

  public void setLastupdateOn(Integer lastupdateOn) {
    this.lastupdateOn = lastupdateOn;
  }

  public Workflow name(String name) {
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

  public Workflow startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(value = "")
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public Workflow state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Workflow tasks(List<DeviceInnerSystemResetWorkflowTasks> tasks) {
    this.tasks = tasks;
    return this;
  }

  public Workflow addTasksItem(DeviceInnerSystemResetWorkflowTasks tasksItem) {
    if (this.tasks == null) {
      this.tasks = new ArrayList<>();
    }
    this.tasks.add(tasksItem);
    return this;
  }

   /**
   * Get tasks
   * @return tasks
  **/
  @ApiModelProperty(value = "")
  public List<DeviceInnerSystemResetWorkflowTasks> getTasks() {
    return tasks;
  }

  public void setTasks(List<DeviceInnerSystemResetWorkflowTasks> tasks) {
    this.tasks = tasks;
  }

  public Workflow tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @ApiModelProperty(value = "")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public Workflow type(String type) {
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

  public Workflow useState(String useState) {
    this.useState = useState;
    return this;
  }

   /**
   * Get useState
   * @return useState
  **/
  @ApiModelProperty(value = "")
  public String getUseState() {
    return useState;
  }

  public void setUseState(String useState) {
    this.useState = useState;
  }

  public Workflow version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Workflow workflow = (Workflow) o;
    return Objects.equals(this.id, workflow.id) &&
        Objects.equals(this.addToInventory, workflow.addToInventory) &&
        Objects.equals(this.addedOn, workflow.addedOn) &&
        Objects.equals(this.configId, workflow.configId) &&
        Objects.equals(this.currTaskIdx, workflow.currTaskIdx) &&
        Objects.equals(this.description, workflow.description) &&
        Objects.equals(this.endTime, workflow.endTime) &&
        Objects.equals(this.execTime, workflow.execTime) &&
        Objects.equals(this.imageId, workflow.imageId) &&
        Objects.equals(this.lastupdateOn, workflow.lastupdateOn) &&
        Objects.equals(this.name, workflow.name) &&
        Objects.equals(this.startTime, workflow.startTime) &&
        Objects.equals(this.state, workflow.state) &&
        Objects.equals(this.tasks, workflow.tasks) &&
        Objects.equals(this.tenantId, workflow.tenantId) &&
        Objects.equals(this.type, workflow.type) &&
        Objects.equals(this.useState, workflow.useState) &&
        Objects.equals(this.version, workflow.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, addToInventory, addedOn, configId, currTaskIdx, description, endTime, execTime, imageId, lastupdateOn, name, startTime, state, tasks, tenantId, type, useState, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workflow {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    addToInventory: ").append(toIndentedString(addToInventory)).append("\n");
    sb.append("    addedOn: ").append(toIndentedString(addedOn)).append("\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    currTaskIdx: ").append(toIndentedString(currTaskIdx)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    execTime: ").append(toIndentedString(execTime)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    lastupdateOn: ").append(toIndentedString(lastupdateOn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    useState: ").append(toIndentedString(useState)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
