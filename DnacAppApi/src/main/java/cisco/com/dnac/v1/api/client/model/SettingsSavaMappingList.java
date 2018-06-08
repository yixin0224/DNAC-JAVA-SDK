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
import cisco.com.dnac.v1.api.client.model.SAVAMappingProfile;
import cisco.com.dnac.v1.api.client.model.SAVAMappingSyncResult;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SettingsSavaMappingList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class SettingsSavaMappingList {
  @SerializedName("autoSyncPeriod")
  private Integer autoSyncPeriod = null;

  @SerializedName("ccoUser")
  private String ccoUser = null;

  @SerializedName("expiry")
  private Integer expiry = null;

  @SerializedName("lastSync")
  private Integer lastSync = null;

  @SerializedName("profile")
  private SAVAMappingProfile profile = null;

  @SerializedName("smartAccountId")
  private String smartAccountId = null;

  @SerializedName("syncResult")
  private SAVAMappingSyncResult syncResult = null;

  @SerializedName("syncResultStr")
  private String syncResultStr = null;

  @SerializedName("syncStartTime")
  private Integer syncStartTime = null;

  /**
   * Gets or Sets syncStatus
   */
  @JsonAdapter(SyncStatusEnum.Adapter.class)
  public enum SyncStatusEnum {
    NOT_SYNCED("NOT_SYNCED"),
    
    SYNCING("SYNCING"),
    
    SUCCESS("SUCCESS"),
    
    FAILURE("FAILURE");

    private String value;

    SyncStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SyncStatusEnum fromValue(String text) {
      for (SyncStatusEnum b : SyncStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SyncStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SyncStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SyncStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SyncStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("syncStatus")
  private SyncStatusEnum syncStatus = null;

  @SerializedName("tenantId")
  private String tenantId = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("virtualAccountId")
  private String virtualAccountId = null;

  public SettingsSavaMappingList autoSyncPeriod(Integer autoSyncPeriod) {
    this.autoSyncPeriod = autoSyncPeriod;
    return this;
  }

   /**
   * Get autoSyncPeriod
   * @return autoSyncPeriod
  **/
  @ApiModelProperty(value = "")
  public Integer getAutoSyncPeriod() {
    return autoSyncPeriod;
  }

  public void setAutoSyncPeriod(Integer autoSyncPeriod) {
    this.autoSyncPeriod = autoSyncPeriod;
  }

  public SettingsSavaMappingList ccoUser(String ccoUser) {
    this.ccoUser = ccoUser;
    return this;
  }

   /**
   * Get ccoUser
   * @return ccoUser
  **/
  @ApiModelProperty(value = "")
  public String getCcoUser() {
    return ccoUser;
  }

  public void setCcoUser(String ccoUser) {
    this.ccoUser = ccoUser;
  }

  public SettingsSavaMappingList expiry(Integer expiry) {
    this.expiry = expiry;
    return this;
  }

   /**
   * Get expiry
   * @return expiry
  **/
  @ApiModelProperty(value = "")
  public Integer getExpiry() {
    return expiry;
  }

  public void setExpiry(Integer expiry) {
    this.expiry = expiry;
  }

  public SettingsSavaMappingList lastSync(Integer lastSync) {
    this.lastSync = lastSync;
    return this;
  }

   /**
   * Get lastSync
   * @return lastSync
  **/
  @ApiModelProperty(value = "")
  public Integer getLastSync() {
    return lastSync;
  }

  public void setLastSync(Integer lastSync) {
    this.lastSync = lastSync;
  }

  public SettingsSavaMappingList profile(SAVAMappingProfile profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @ApiModelProperty(value = "")
  public SAVAMappingProfile getProfile() {
    return profile;
  }

  public void setProfile(SAVAMappingProfile profile) {
    this.profile = profile;
  }

  public SettingsSavaMappingList smartAccountId(String smartAccountId) {
    this.smartAccountId = smartAccountId;
    return this;
  }

   /**
   * Get smartAccountId
   * @return smartAccountId
  **/
  @ApiModelProperty(value = "")
  public String getSmartAccountId() {
    return smartAccountId;
  }

  public void setSmartAccountId(String smartAccountId) {
    this.smartAccountId = smartAccountId;
  }

  public SettingsSavaMappingList syncResult(SAVAMappingSyncResult syncResult) {
    this.syncResult = syncResult;
    return this;
  }

   /**
   * Get syncResult
   * @return syncResult
  **/
  @ApiModelProperty(value = "")
  public SAVAMappingSyncResult getSyncResult() {
    return syncResult;
  }

  public void setSyncResult(SAVAMappingSyncResult syncResult) {
    this.syncResult = syncResult;
  }

  public SettingsSavaMappingList syncResultStr(String syncResultStr) {
    this.syncResultStr = syncResultStr;
    return this;
  }

   /**
   * Get syncResultStr
   * @return syncResultStr
  **/
  @ApiModelProperty(value = "")
  public String getSyncResultStr() {
    return syncResultStr;
  }

  public void setSyncResultStr(String syncResultStr) {
    this.syncResultStr = syncResultStr;
  }

  public SettingsSavaMappingList syncStartTime(Integer syncStartTime) {
    this.syncStartTime = syncStartTime;
    return this;
  }

   /**
   * Get syncStartTime
   * @return syncStartTime
  **/
  @ApiModelProperty(value = "")
  public Integer getSyncStartTime() {
    return syncStartTime;
  }

  public void setSyncStartTime(Integer syncStartTime) {
    this.syncStartTime = syncStartTime;
  }

  public SettingsSavaMappingList syncStatus(SyncStatusEnum syncStatus) {
    this.syncStatus = syncStatus;
    return this;
  }

   /**
   * Get syncStatus
   * @return syncStatus
  **/
  @ApiModelProperty(value = "")
  public SyncStatusEnum getSyncStatus() {
    return syncStatus;
  }

  public void setSyncStatus(SyncStatusEnum syncStatus) {
    this.syncStatus = syncStatus;
  }

  public SettingsSavaMappingList tenantId(String tenantId) {
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

  public SettingsSavaMappingList token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(value = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public SettingsSavaMappingList virtualAccountId(String virtualAccountId) {
    this.virtualAccountId = virtualAccountId;
    return this;
  }

   /**
   * Get virtualAccountId
   * @return virtualAccountId
  **/
  @ApiModelProperty(value = "")
  public String getVirtualAccountId() {
    return virtualAccountId;
  }

  public void setVirtualAccountId(String virtualAccountId) {
    this.virtualAccountId = virtualAccountId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingsSavaMappingList settingsSavaMappingList = (SettingsSavaMappingList) o;
    return Objects.equals(this.autoSyncPeriod, settingsSavaMappingList.autoSyncPeriod) &&
        Objects.equals(this.ccoUser, settingsSavaMappingList.ccoUser) &&
        Objects.equals(this.expiry, settingsSavaMappingList.expiry) &&
        Objects.equals(this.lastSync, settingsSavaMappingList.lastSync) &&
        Objects.equals(this.profile, settingsSavaMappingList.profile) &&
        Objects.equals(this.smartAccountId, settingsSavaMappingList.smartAccountId) &&
        Objects.equals(this.syncResult, settingsSavaMappingList.syncResult) &&
        Objects.equals(this.syncResultStr, settingsSavaMappingList.syncResultStr) &&
        Objects.equals(this.syncStartTime, settingsSavaMappingList.syncStartTime) &&
        Objects.equals(this.syncStatus, settingsSavaMappingList.syncStatus) &&
        Objects.equals(this.tenantId, settingsSavaMappingList.tenantId) &&
        Objects.equals(this.token, settingsSavaMappingList.token) &&
        Objects.equals(this.virtualAccountId, settingsSavaMappingList.virtualAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoSyncPeriod, ccoUser, expiry, lastSync, profile, smartAccountId, syncResult, syncResultStr, syncStartTime, syncStatus, tenantId, token, virtualAccountId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsSavaMappingList {\n");
    
    sb.append("    autoSyncPeriod: ").append(toIndentedString(autoSyncPeriod)).append("\n");
    sb.append("    ccoUser: ").append(toIndentedString(ccoUser)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    lastSync: ").append(toIndentedString(lastSync)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    smartAccountId: ").append(toIndentedString(smartAccountId)).append("\n");
    sb.append("    syncResult: ").append(toIndentedString(syncResult)).append("\n");
    sb.append("    syncResultStr: ").append(toIndentedString(syncResultStr)).append("\n");
    sb.append("    syncStartTime: ").append(toIndentedString(syncStartTime)).append("\n");
    sb.append("    syncStatus: ").append(toIndentedString(syncStatus)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    virtualAccountId: ").append(toIndentedString(virtualAccountId)).append("\n");
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
