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
import cisco.com.dnac.v1.api.client.model.FlowAnalysisRequest;
import cisco.com.dnac.v1.api.client.model.FlowAnalysisRequestResultOutput;
import cisco.com.dnac.v1.api.client.model.GenerateTokenRequest;
import cisco.com.dnac.v1.api.client.model.GenerateTokenResponse;
import cisco.com.dnac.v1.api.client.model.PathResponseResult;
import cisco.com.dnac.v1.api.client.model.SystemPropertyListResult;
import cisco.com.dnac.v1.api.client.model.SystemPropertyNameAndIntValueDTO;
import cisco.com.dnac.v1.api.client.model.TaskIdResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MiscApi
 */
@Ignore
public class MiscApiTest {

    private final MiscApi api = new MiscApi();

    
    /**
     * Retrieves result of a previously requested flow analysis
     *
     * Retrieves result of a previously requested flow analysis by its Flow Analysis id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFlowAnalysisByFlowAnalysisIdTest() throws ApiException {
        String flowAnalysisId = null;
        PathResponseResult response = api.getFlowAnalysisByFlowAnalysisId(flowAnalysisId);

        // TODO: test validations
    }
    
    /**
     * Retrieves SNMP properties
     *
     * This method is used to get SNMP properties
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSnmpPropertyTest() throws ApiException {
        SystemPropertyListResult response = api.getSnmpProperty();

        // TODO: test validations
    }
    
    /**
     * Generate Token
     *
     * This method is used to generate token.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAuthTokenTest() throws ApiException {
        GenerateTokenRequest request = null;
        String authorization = null;
        GenerateTokenResponse response = api.postAuthToken(request, authorization);

        // TODO: test validations
    }
    
    /**
     * Initiates a new flow analysis
     *
     * Initiates a new flow analysis with periodic refresh and stat collection options. Returns a request id and a task id to get results and follow progress.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postFlowAnalysisTest() throws ApiException {
        FlowAnalysisRequest request = null;
        FlowAnalysisRequestResultOutput response = api.postFlowAnalysis(request);

        // TODO: test validations
    }
    
    /**
     * Creates or updates SNMP properties
     *
     * This method is used to add SNMP properties
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSnmpPropertyTest() throws ApiException {
        SystemPropertyNameAndIntValueDTO request = null;
        TaskIdResult response = api.postSnmpProperty(request);

        // TODO: test validations
    }
    
}
