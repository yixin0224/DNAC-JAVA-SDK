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
import cisco.com.dnac.v1.api.client.model.DeviceInnerDeviceInfo;
import cisco.com.dnac.v1.api.client.model.DeviceInnerRunSummaryList;
import cisco.com.dnac.v1.api.client.model.DeviceInnerSystemResetWorkflow;
import cisco.com.dnac.v1.api.client.model.DeviceInnerWorkflowParameters;
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
 * DeviceInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class DeviceInner {
  @SerializedName("_id")
  private String id = null;

  @SerializedName("deviceInfo")
  private DeviceInnerDeviceInfo deviceInfo = null;

  @SerializedName("runSummaryList")
  private List<DeviceInnerRunSummaryList> runSummaryList = null;

  @SerializedName("systemResetWorkflow")
  private DeviceInnerSystemResetWorkflow systemResetWorkflow = null;

  @SerializedName("systemWorkflow")
  private DeviceInnerSystemResetWorkflow systemWorkflow = null;

  @SerializedName("tenantId")
  private String tenantId = null;

  @SerializedName("version")
  private Integer version = null;

  @SerializedName("workflow")
  private DeviceInnerSystemResetWorkflow workflow = null;

  @SerializedName("workflowParameters")
  private DeviceInnerWorkflowParameters workflowParameters = null;

  public DeviceInner id(String id) {
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

  public DeviceInner deviceInfo(DeviceInnerDeviceInfo deviceInfo) {
    this.deviceInfo = deviceInfo;
    return this;
  }

   /**
   * Get deviceInfo
   * @return deviceInfo
  **/
  @ApiModelProperty(value = "")
  public DeviceInnerDeviceInfo getDeviceInfo() {
    return deviceInfo;
  }

  public void setDeviceInfo(DeviceInnerDeviceInfo deviceInfo) {
    this.deviceInfo = deviceInfo;
  }

  public DeviceInner runSummaryList(List<DeviceInnerRunSummaryList> runSummaryList) {
    this.runSummaryList = runSummaryList;
    return this;
  }

  public DeviceInner addRunSummaryListItem(DeviceInnerRunSummaryList runSummaryListItem) {
    if (this.runSummaryList == null) {
      this.runSummaryList = new ArrayList<>();
    }
    this.runSummaryList.add(runSummaryListItem);
    return this;
  }

   /**
   * Get runSummaryList
   * @return runSummaryList
  **/
  @ApiModelProperty(value = "")
  public List<DeviceInnerRunSummaryList> getRunSummaryList() {
    return runSummaryList;
  }

  public void setRunSummaryList(List<DeviceInnerRunSummaryList> runSummaryList) {
    this.runSummaryList = runSummaryList;
  }

  public DeviceInner systemResetWorkflow(DeviceInnerSystemResetWorkflow systemResetWorkflow) {
    this.systemResetWorkflow = systemResetWorkflow;
    return this;
  }

   /**
   * Get systemResetWorkflow
   * @return systemResetWorkflow
  **/
  @ApiModelProperty(value = "")
  public DeviceInnerSystemResetWorkflow getSystemResetWorkflow() {
    return systemResetWorkflow;
  }

  public void setSystemResetWorkflow(DeviceInnerSystemResetWorkflow systemResetWorkflow) {
    this.systemResetWorkflow = systemResetWorkflow;
  }

  public DeviceInner systemWorkflow(DeviceInnerSystemResetWorkflow systemWorkflow) {
    this.systemWorkflow = systemWorkflow;
    return this;
  }

   /**
   * Get systemWorkflow
   * @return systemWorkflow
  **/
  @ApiModelProperty(value = "")
  public DeviceInnerSystemResetWorkflow getSystemWorkflow() {
    return systemWorkflow;
  }

  public void setSystemWorkflow(DeviceInnerSystemResetWorkflow systemWorkflow) {
    this.systemWorkflow = systemWorkflow;
  }

  public DeviceInner tenantId(String tenantId) {
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

  public DeviceInner version(Integer version) {
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

  public DeviceInner workflow(DeviceInnerSystemResetWorkflow workflow) {
    this.workflow = workflow;
    return this;
  }

   /**
   * Get workflow
   * @return workflow
  **/
  @ApiModelProperty(value = "")
  public DeviceInnerSystemResetWorkflow getWorkflow() {
    return workflow;
  }

  public void setWorkflow(DeviceInnerSystemResetWorkflow workflow) {
    this.workflow = workflow;
  }

  public DeviceInner workflowParameters(DeviceInnerWorkflowParameters workflowParameters) {
    this.workflowParameters = workflowParameters;
    return this;
  }

   /**
   * Get workflowParameters
   * @return workflowParameters
  **/
  @ApiModelProperty(value = "")
  public DeviceInnerWorkflowParameters getWorkflowParameters() {
    return workflowParameters;
  }

  public void setWorkflowParameters(DeviceInnerWorkflowParameters workflowParameters) {
    this.workflowParameters = workflowParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceInner deviceInner = (DeviceInner) o;
    return Objects.equals(this.id, deviceInner.id) &&
        Objects.equals(this.deviceInfo, deviceInner.deviceInfo) &&
        Objects.equals(this.runSummaryList, deviceInner.runSummaryList) &&
        Objects.equals(this.systemResetWorkflow, deviceInner.systemResetWorkflow) &&
        Objects.equals(this.systemWorkflow, deviceInner.systemWorkflow) &&
        Objects.equals(this.tenantId, deviceInner.tenantId) &&
        Objects.equals(this.version, deviceInner.version) &&
        Objects.equals(this.workflow, deviceInner.workflow) &&
        Objects.equals(this.workflowParameters, deviceInner.workflowParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, deviceInfo, runSummaryList, systemResetWorkflow, systemWorkflow, tenantId, version, workflow, workflowParameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceInner {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    deviceInfo: ").append(toIndentedString(deviceInfo)).append("\n");
    sb.append("    runSummaryList: ").append(toIndentedString(runSummaryList)).append("\n");
    sb.append("    systemResetWorkflow: ").append(toIndentedString(systemResetWorkflow)).append("\n");
    sb.append("    systemWorkflow: ").append(toIndentedString(systemWorkflow)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    workflow: ").append(toIndentedString(workflow)).append("\n");
    sb.append("    workflowParameters: ").append(toIndentedString(workflowParameters)).append("\n");
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

