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


package cisco.com.dnac.v1.api.client.api;

import cisco.com.dnac.v1.api.client.ApiException;
import cisco.com.dnac.v1.api.client.model.CommandRunnerDTO;
import cisco.com.dnac.v1.api.client.model.CountResult;
import cisco.com.dnac.v1.api.client.model.ExportDeviceDTO;
import cisco.com.dnac.v1.api.client.model.FunctionalCapabilityListResult;
import cisco.com.dnac.v1.api.client.model.FunctionalCapabilityResult;
import cisco.com.dnac.v1.api.client.model.InventoryDeviceInfo;
import cisco.com.dnac.v1.api.client.model.LegitCliKeyResult;
import cisco.com.dnac.v1.api.client.model.ModuleListResult;
import cisco.com.dnac.v1.api.client.model.ModuleResult;
import cisco.com.dnac.v1.api.client.model.NetworkDeviceBriefNIO;
import cisco.com.dnac.v1.api.client.model.NetworkDeviceBriefNIOResult;
import cisco.com.dnac.v1.api.client.model.NetworkDeviceListResult;
import cisco.com.dnac.v1.api.client.model.NetworkDeviceResult;
import cisco.com.dnac.v1.api.client.model.NetworkDeviceSyncApiRequest;
import cisco.com.dnac.v1.api.client.model.RawCliInfoNIOListResult;
import cisco.com.dnac.v1.api.client.model.RegisterNetworkDeviceResult;
import cisco.com.dnac.v1.api.client.model.RetrievesAllNetworkDevicesResponse;
import cisco.com.dnac.v1.api.client.model.SuccessResult;
import cisco.com.dnac.v1.api.client.model.SuccessResultList;
import cisco.com.dnac.v1.api.client.model.TaskIdResult;
import cisco.com.dnac.v1.api.client.model.VlanListResult;
import cisco.com.dnac.v1.api.client.model.WirelessInfoResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NetworkDeviceApi
 */
@Ignore
public class NetworkDeviceApiTest {

    private final NetworkDeviceApi api = new NetworkDeviceApi();

    
    /**
     * Delete network device by ID
     *
     * Removes the network device for the given ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNetworkDeviceByIdTest() throws ApiException {
        String id = null;
        Boolean isForceDelete = null;
        TaskIdResult response = api.deleteNetworkDeviceById(id, isForceDelete);

        // TODO: test validations
    }
    
    /**
     * Retrieves all network devices
     *
     * Gets the list of first 500 network devices sorted lexicographically based on host name. It can be filtered using management IP address, mac address, hostname and location name. If id param is provided, it will be returning the list of network-devices for the given id&#39;s and other request params will be ignored. In case of autocomplete request, returns the list of specified attributes.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkDeviceTest() throws ApiException {
        List<String> hostname = null;
        List<String> managementIpAddress = null;
        List<String> macAddress = null;
        List<String> locationName = null;
        List<String> serialNumber = null;
        List<String> location = null;
        List<String> family = null;
        List<String> type = null;
        List<String> series = null;
        List<String> collectionStatus = null;
        List<String> collectionInterval = null;
        List<String> notSyncedForMinutes = null;
        List<String> errorCode = null;
        List<String> errorDescription = null;
        List<String> softwareVersion = null;
        List<String> softwareType = null;
        List<String> platformId = null;
        List<String> role = null;
        List<String> reachabilityStatus = null;
        List<String> upTime = null;
        List<String> associatedWlcIp = null;
        List<String> licenseName = null;
        List<String> licenseType = null;
        List<String> licenseStatus = null;
        List<String> modulename = null;
        List<String> moduleequpimenttype = null;
        List<String> moduleservicestate = null;
        List<String> modulevendorequipmenttype = null;
        List<String> modulepartnumber = null;
        List<String> moduleoperationstatecode = null;
        String id = null;
        NetworkDeviceListResult response = api.getNetworkDevice(hostname, managementIpAddress, macAddress, locationName, serialNumber, location, family, type, series, collectionStatus, collectionInterval, notSyncedForMinutes, errorCode, errorDescription, softwareVersion, softwareType, platformId, role, reachabilityStatus, upTime, associatedWlcIp, licenseName, licenseType, licenseStatus, modulename, moduleequpimenttype, moduleservicestate, modulevendorequipmenttype, modulepartnumber, moduleoperationstatecode, id);

        // TODO: test validations
    }
    
    /**
     * Retrieves all network devices
     *
     * Gets the list of first 500 network devices sorted lexicographically based on host name. It can be filtered using management IP address, mac address, hostname and location name. If id param is provided, it will be returning the list of network-devices for the given id&#39;s and other request params will be ignored. In case of autocomplete request, returns the list of specified attributes.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkDeviceAutocompleteTest() throws ApiException {
        String vrfName = null;
        String managementIpAddress = null;
        String hostname = null;
        String macAddress = null;
        String family = null;
        String collectionStatus = null;
        String collectionInterval = null;
        String softwareVersion = null;
        String softwareType = null;
        String reachabilityStatus = null;
        String reachabilityFailureReason = null;
        String errorCode = null;
        String platformId = null;
        String series = null;
        String type = null;
        String serialNumber = null;
        String upTime = null;
        String role = null;
        String roleSource = null;
        String associatedWlcIp = null;
        String offset = null;
        String limit = null;
        RetrievesAllNetworkDevicesResponse response = api.getNetworkDeviceAutocomplete(vrfName, managementIpAddress, hostname, macAddress, family, collectionStatus, collectionInterval, softwareVersion, softwareType, reachabilityStatus, reachabilityFailureReason, errorCode, platformId, series, type, serialNumber, upTime, role, roleSource, associatedWlcIp, offset, limit);

        // TODO: test validations
    }
    
    /**
     * Retrieves network device brief by ID
     *
     * Gets brief network device info such as hostname, management IP address for the given device ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkDeviceBriefByIdTest() throws ApiException {
        String id = null;
        NetworkDeviceBriefNIOResult response = api.getNetworkDeviceBriefById(id);

        // TODO: test validations
    }
    
    /**
     * Retrieves network device by ID
     *
     * Gets the network device for the given device ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkDeviceByIdTest() throws ApiException {
        String id = null;
        NetworkDeviceResult response = api.getNetworkDeviceById(id);

        // TODO: test validations
    }
    
    /**
     * Retrieves the collection interval specified by device ID
     *
     * Retrieves collection interval by device id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkDeviceCollectionScheduleByIdTest() throws ApiException {
        String id = null;
        CountResult response = api.getNetworkDeviceCollectionScheduleById(id);

        // TODO: test validations
    }
    
    /**
     * Retrieves the collection interval of all devices
     *
     * Retrieves collection interval of all devices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkDeviceCollectionScheduleGlobalTest() throws ApiException {
        CountResult response = api.getNetworkDeviceCollectionScheduleGlobal();

        // TODO: test validations
    }
    
    /**
     * Retrieves device config list
     *
     * Gets the config for all devices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkDeviceConfigTest() throws ApiException {
        RawCliInfoNIOListResult response = api.getNetworkDeviceConfig();

        // TODO: test validations
    }
    
    /**
     * Retrieves device config
     *
     * Gets the device config by device ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkDeviceConfigByNetworkDeviceIdTest() throws ApiException {
        String networkDeviceId = null;
        SuccessResult response = api.getNetworkDeviceConfigByNetworkDeviceId(networkDeviceId);

        // TODO: test validations
    }
    
    /**
     * Retrieves config count
     *
     * Gets the count of device configs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkDeviceConfigCountTest() throws ApiException {
        CountResult response = api.getNetworkDeviceConfigCount();

        // TODO: test validations
    }
    
    /**
     * Retrieves network device count
     *
     * Gets the count of network devices filtered by management IP address, mac address, hostname and location name
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkDeviceCountTest() throws ApiException {
        CountResult response = api.getNetworkDeviceCount();

        // TODO: test validations
    }
    
    /**
     * Retrieves all functional-capability of devices
     *
     * Gets the functional-capability for given devices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkDeviceFunctionalCapabilityTest() throws ApiException {
        String deviceId = null;
        List<String> functionName = null;
        FunctionalCapabilityListResult response = api.getNetworkDeviceFunctionalCapability(deviceId, functionName);

        // TODO: test validations
    }
    
    /**
     * Gets the functional capability by id
     *
     * Retrieve functional capability with given id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkDeviceFunctionalCapabilityByIdTest() throws ApiException {
        String id = null;
        FunctionalCapabilityResult response = api.getNetworkDeviceFunctionalCapabilityById(id);

        // TODO: test validations
    }
    
    /**
     * Retrieve the values of given fields
     *
     * Gets the field values based on given filter
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkDeviceFunctionalCcapabilityAutocompleteTest() throws ApiException {
        List<String> functionName = null;
        SuccessResultList response = api.getNetworkDeviceFunctionalCcapabilityAutocomplete(functionName);

        // TODO: test validations
    }
    
    /**
     * Retrieves network device by IP address
     *
     * Gets the network device with the given IP address
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkDeviceIpAddressByIpAddressTest() throws ApiException {
        String ipAddress = null;
        NetworkDeviceResult response = api.getNetworkDeviceIpAddressByIpAddress(ipAddress);

        // TODO: test validations
    }
    
    /**
     * Get the organizations chosen while adding the meraki dashboard
     *
     * This method is used to get the selected organizations for the meraki dashboard
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkDeviceMerakiOrganizationByIdTest() throws ApiException {
        String id = null;
        SuccessResultList response = api.getNetworkDeviceMerakiOrganizationById(id);

        // TODO: test validations
    }
    
    /**
     * Gives all the modules associated with given device id
     *
     * Get modules of the given device id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkDeviceModuleTest() throws ApiException {
        String deviceId = null;
        String limit = null;
        String offset = null;
        List<String> nameList = null;
        List<String> vendorEquipmentTypeList = null;
        List<String> partNumberList = null;
        List<String> operationalStateCodeList = null;
        ModuleListResult response = api.getNetworkDeviceModule(deviceId, limit, offset, nameList, vendorEquipmentTypeList, partNumberList, operationalStateCodeList);

        // TODO: test validations
    }
    
    /**
     * Gives Module info by its id
     *
     * Get module by id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkDeviceModuleByIdTest() throws ApiException {
        String id = null;
        ModuleResult response = api.getNetworkDeviceModuleById(id);

        // TODO: test validations
    }
    
    /**
     * Gives total number of Modules
     *
     * Get Module Count
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkDeviceModuleCountTest() throws ApiException {
        String deviceId = null;
        List<String> nameList = null;
        List<String> vendorEquipmentTypeList = null;
        List<String> partNumberList = null;
        List<String> operationalStateCodeList = null;
        CountResult response = api.getNetworkDeviceModuleCount(deviceId, nameList, vendorEquipmentTypeList, partNumberList, operationalStateCodeList);

        // TODO: test validations
    }
    
    /**
     * Get all keywords of CLIs accepted by command runner
     *
     * Get valid keywords
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkDevicePollerCliLegitReadsTest() throws ApiException {
        LegitCliKeyResult response = api.getNetworkDevicePollerCliLegitReads();

        // TODO: test validations
    }
    
    /**
     * Retrieves network device by range
     *
     * Gets the list of network devices for the given range
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkDeviceRangeTest() throws ApiException {
        Integer startIndex = null;
        Integer recordsToReturn = null;
        NetworkDeviceListResult response = api.getNetworkDeviceRange(startIndex, recordsToReturn);

        // TODO: test validations
    }
    
    /**
     * Retrieves network device by serial number
     *
     * Gets the network device with the given serial number
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkDeviceSerialNumberBySerialNumberTest() throws ApiException {
        String serialNumber = null;
        NetworkDeviceResult response = api.getNetworkDeviceSerialNumberBySerialNumber(serialNumber);

        // TODO: test validations
    }
    
    /**
     * Updates certificate validation status and returns tenantId
     *
     * Registers a device for WSA notification
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkDeviceTenantinfoMacaddressTest() throws ApiException {
        String serialNumber = null;
        String macaddress = null;
        RegisterNetworkDeviceResult response = api.getNetworkDeviceTenantinfoMacaddress(serialNumber, macaddress);

        // TODO: test validations
    }
    
    /**
     * Retrieves list of VLAN data that are associated with interface for a device
     *
     * getDeviceVLANData
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkDeviceVlanByIdTest() throws ApiException {
        String id = null;
        String interfaceType = null;
        VlanListResult response = api.getNetworkDeviceVlanById(id, interfaceType);

        // TODO: test validations
    }
    
    /**
     * Retrieves wireless lan conrtoller info by Device ID
     *
     * Gets the wireless lan controller info using the given device ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkDeviceWirelessInfoByIdTest() throws ApiException {
        String id = null;
        WirelessInfoResult response = api.getNetworkDeviceWirelessInfoById(id);

        // TODO: test validations
    }
    
    /**
     * Network device POST api
     *
     * Adds the device with given credential
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNetworkDeviceTest() throws ApiException {
        InventoryDeviceInfo request = null;
        TaskIdResult response = api.postNetworkDevice(request);

        // TODO: test validations
    }
    
    /**
     * Export network-device to file
     *
     * Export the selected network-device to a file
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNetworkDeviceFileTest() throws ApiException {
        ExportDeviceDTO request = null;
        TaskIdResult response = api.postNetworkDeviceFile(request);

        // TODO: test validations
    }
    
    /**
     * Run read-only commands on devices to get their real-time configuration
     *
     * Submit request for read-only CLIs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNetworkDevicePollerCliReadRequestTest() throws ApiException {
        CommandRunnerDTO request = null;
        TaskIdResult response = api.postNetworkDevicePollerCliReadRequest(request);

        // TODO: test validations
    }
    
    /**
     * Network device sync api
     *
     * Sync the devices provided as input
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putNetworkDeviceTest() throws ApiException {
        InventoryDeviceInfo request = null;
        TaskIdResult response = api.putNetworkDevice(request);

        // TODO: test validations
    }
    
    /**
     * Updates network device role
     *
     * Updates the role of the device as access, core, distribution, border router
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putNetworkDeviceBriefTest() throws ApiException {
        NetworkDeviceBriefNIO request = null;
        TaskIdResult response = api.putNetworkDeviceBrief(request);

        // TODO: test validations
    }
    
    /**
     * Network device sync api
     *
     * Sync&#39;s the devices. If forceSync param is false (default) then the sync would run in normal priority thread. If forceSync param is true then the sync would run in high priority thread if avaiable, else the sync will fail. Result can be seen in the child task of each device
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putNetworkDeviceSyncTest() throws ApiException {
        NetworkDeviceSyncApiRequest request = null;
        Boolean forceSync = null;
        TaskIdResult response = api.putNetworkDeviceSync(request, forceSync);

        // TODO: test validations
    }
    
}