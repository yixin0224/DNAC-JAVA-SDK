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
import cisco.com.dnac.v1.api.client.model.DownloadsAFileReferredByTheFileIdResponse;
import cisco.com.dnac.v1.api.client.model.FileObjectListResult;
import cisco.com.dnac.v1.api.client.model.NameSpaceListResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FileApi
 */
@Ignore
public class FileApiTest {

    private final FileApi api = new FileApi();

    
    /**
     * Downloads a file referred by the fileId
     *
     * This method is used to download a file referred by the fileId
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFileByFileIdTest() throws ApiException {
        String fileId = null;
        DownloadsAFileReferredByTheFileIdResponse response = api.getFileByFileId(fileId);

        // TODO: test validations
    }
    
    /**
     * Returns list of available namespaces
     *
     * This method is used to obtain a list of available namespaces
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFileNamespaceTest() throws ApiException {
        NameSpaceListResult response = api.getFileNamespace();

        // TODO: test validations
    }
    
    /**
     * Returns list of files under a specific namespace
     *
     * This method is used to obtain a list of files under a specific namespace
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFileNamespaceByNameSpaceTest() throws ApiException {
        String nameSpace = null;
        FileObjectListResult response = api.getFileNamespaceByNameSpace(nameSpace);

        // TODO: test validations
    }
    
}
