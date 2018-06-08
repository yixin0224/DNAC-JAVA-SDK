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
import cisco.com.dnac.v1.api.client.model.CountResult;
import cisco.com.dnac.v1.api.client.model.DeviceIfListResult;
import cisco.com.dnac.v1.api.client.model.DeviceIfResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InterfaceApi
 */
@Ignore
public class InterfaceApiTest {

    private final InterfaceApi api = new InterfaceApi();

    
    /**
     * Retrieves all interfaces
     *
     * Gets all available interfaces with a maximum limit of 500
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInterfaceTest() throws ApiException {
        DeviceIfListResult response = api.getInterface();

        // TODO: test validations
    }
    
    /**
     * Retrieves interface by ID
     *
     * Gets the interface for the given interface ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInterfaceByIdTest() throws ApiException {
        String id = null;
        DeviceIfResult response = api.getInterfaceById(id);

        // TODO: test validations
    }
    
    /**
     * Retrieves interface count
     *
     * Gets the count of interfaces for all devices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInterfaceCountTest() throws ApiException {
        CountResult response = api.getInterfaceCount();

        // TODO: test validations
    }
    
    /**
     * Retrieves interfaces by IP address
     *
     * Gets list of interfaces with the given IP address
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInterfaceIpAddressByIpAddressTest() throws ApiException {
        String ipAddress = null;
        DeviceIfListResult response = api.getInterfaceIpAddressByIpAddress(ipAddress);

        // TODO: test validations
    }
    
    /**
     * Retrieves ISIS interfaces
     *
     * Gets the interfaces that has ISIS enabled
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInterfaceIsisTest() throws ApiException {
        DeviceIfListResult response = api.getInterfaceIsis();

        // TODO: test validations
    }
    
    /**
     * Retrieves device interfaces
     *
     * Gets list of interfaces for the given device
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInterfaceNetworkDeviceByDeviceIdTest() throws ApiException {
        String deviceId = null;
        DeviceIfListResult response = api.getInterfaceNetworkDeviceByDeviceId(deviceId);

        // TODO: test validations
    }
    
    /**
     * Retrieves device interface count
     *
     * Gets the interface count for the given device
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInterfaceNetworkDeviceCountByDeviceIdTest() throws ApiException {
        String deviceId = null;
        CountResult response = api.getInterfaceNetworkDeviceCountByDeviceId(deviceId);

        // TODO: test validations
    }
    
    /**
     * Retrieves interface for the given device and interface name
     *
     * Gets the interface for the given device ID and for the given interface name
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInterfaceNetworkDeviceInterfaceNameByDeviceIdTest() throws ApiException {
        String deviceId = null;
        String name = null;
        DeviceIfResult response = api.getInterfaceNetworkDeviceInterfaceNameByDeviceId(deviceId, name);

        // TODO: test validations
    }
    
    /**
     * Retrieves OSPF interfaces
     *
     * Gets the interfaces that has OSPF enabled
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInterfaceOspfTest() throws ApiException {
        DeviceIfListResult response = api.getInterfaceOspf();

        // TODO: test validations
    }
    
    /**
     * Retrieves device interfaces in the given range
     *
     * Gets the list of interfaces for the device for the specified range
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkDeviceByDeviceIdRangeTest() throws ApiException {
        String deviceId = null;
        Integer startIndex = null;
        Integer recordsToReturn = null;
        DeviceIfListResult response = api.getNetworkDeviceByDeviceIdRange(deviceId, startIndex, recordsToReturn);

        // TODO: test validations
    }
    
}
