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
import cisco.com.dnac.v1.api.client.model.FlowAnalysisListOutput;
import cisco.com.dnac.v1.api.client.model.TaskIdResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FlowAnalysisApi
 */
@Ignore
public class FlowAnalysisApiTest {

    private final FlowAnalysisApi api = new FlowAnalysisApi();

    
    /**
     * Deletes a flow analysis request
     *
     * Deletes a flow analysis request by its id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFlowAnalysisByFlowAnalysisIdTest() throws ApiException {
        String flowAnalysisId = null;
        TaskIdResult response = api.deleteFlowAnalysisByFlowAnalysisId(flowAnalysisId);

        // TODO: test validations
    }
    
    /**
     * Retrieves a summary of all flow analyses stored
     *
     * Retrieves a summary of all flow analyses stored. Filters the results by given parameters.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFlowAnalysisTest() throws ApiException {
        Boolean periodicRefresh = null;
        String sourceIP = null;
        String destIP = null;
        String sourcePort = null;
        String destPort = null;
        String gtCreateTime = null;
        String ltCreateTime = null;
        String protocol = null;
        String status = null;
        String taskId = null;
        String lastUpdateTime = null;
        String limit = null;
        String offset = null;
        String order = null;
        String sortBy = null;
        FlowAnalysisListOutput response = api.getFlowAnalysis(periodicRefresh, sourceIP, destIP, sourcePort, destPort, gtCreateTime, ltCreateTime, protocol, status, taskId, lastUpdateTime, limit, offset, order, sortBy);

        // TODO: test validations
    }
    
}
