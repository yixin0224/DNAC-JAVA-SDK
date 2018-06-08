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
import cisco.com.dnac.v1.api.client.model.CollectionProjectDTO;
import cisco.com.dnac.v1.api.client.model.CollectionTemplateInfo;
import cisco.com.dnac.v1.api.client.model.ProjectDTO;
import cisco.com.dnac.v1.api.client.model.TaskIdResult;
import cisco.com.dnac.v1.api.client.model.TemplateDTO;
import cisco.com.dnac.v1.api.client.model.TemplateDeploymentInfo;
import cisco.com.dnac.v1.api.client.model.TemplateDeploymentStatusDTO;
import cisco.com.dnac.v1.api.client.model.TemplatePreviewRequestDTO;
import cisco.com.dnac.v1.api.client.model.TemplatePreviewResponseDTO;
import cisco.com.dnac.v1.api.client.model.TemplateVersionRequestDTO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TemplateProgrammerApi
 */
@Ignore
public class TemplateProgrammerApiTest {

    private final TemplateProgrammerApi api = new TemplateProgrammerApi();

    
    /**
     * Deletes the project
     *
     * Deletes the project
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTemplateProgrammerProjectByProjectIdTest() throws ApiException {
        String projectId = null;
        TaskIdResult response = api.deleteTemplateProgrammerProjectByProjectId(projectId);

        // TODO: test validations
    }
    
    /**
     * Deletes the template
     *
     * Deletes the template
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTemplateProgrammerTemplateByTemplateIdTest() throws ApiException {
        String templateId = null;
        TaskIdResult response = api.deleteTemplateProgrammerTemplateByTemplateId(templateId);

        // TODO: test validations
    }
    
    /**
     * Gets a list of projects
     *
     * List the projects
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTemplateProgrammerProjectTest() throws ApiException {
        String name = null;
        CollectionProjectDTO response = api.getTemplateProgrammerProject(name);

        // TODO: test validations
    }
    
    /**
     * Gets the templates available depending on the criteria
     *
     * Gets the templates available depending on the criteria
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTemplateProgrammerTemplateTest() throws ApiException {
        String projectId = null;
        String softwareType = null;
        String softwareVersion = null;
        String productFamily = null;
        String productSeries = null;
        String productType = null;
        Boolean includeHead = null;
        Boolean filterConflictingTemplates = null;
        CollectionTemplateInfo response = api.getTemplateProgrammerTemplate(projectId, softwareType, softwareVersion, productFamily, productSeries, productType, includeHead, filterConflictingTemplates);

        // TODO: test validations
    }
    
    /**
     * Status of template deployment
     *
     * API to retrieve the status of template deployment.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTemplateProgrammerTemplateDeployStatusByDeploymentIdTest() throws ApiException {
        String deploymentId = null;
        TemplateDeploymentStatusDTO response = api.getTemplateProgrammerTemplateDeployStatusByDeploymentId(deploymentId);

        // TODO: test validations
    }
    
    /**
     * Gets all the versions of a given template
     *
     * Get all the versions of template
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTemplateProgrammerTemplateVersionByTempleteIdTest() throws ApiException {
        String templateId = null;
        CollectionTemplateInfo response = api.getTemplateProgrammerTemplateVersionByTempleteId(templateId);

        // TODO: test validations
    }
    
    /**
     * Create Project
     *
     * This API is used to create a new project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postTemplateProgrammerProjectTest() throws ApiException {
        ProjectDTO request = null;
        TaskIdResult response = api.postTemplateProgrammerProject(request);

        // TODO: test validations
    }
    
    /**
     * Create Template
     *
     * API to create a template.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postTemplateProgrammerProjectTemplateByProjectIdTest() throws ApiException {
        TemplateDTO request = null;
        String projectId = null;
        TaskIdResult response = api.postTemplateProgrammerProjectTemplateByProjectId(request, projectId);

        // TODO: test validations
    }
    
    /**
     * Deploy Template
     *
     * API to deploy a template.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postTemplateProgrammerTemplateDeployTest() throws ApiException {
        TemplateDeploymentInfo request = null;
        TemplateDeploymentStatusDTO response = api.postTemplateProgrammerTemplateDeploy(request);

        // TODO: test validations
    }
    
    /**
     * Version Template
     *
     * API to version the current contents of the template.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postTemplateProgrammerTemplateVersionTest() throws ApiException {
        TemplateVersionRequestDTO request = null;
        TaskIdResult response = api.postTemplateProgrammerTemplateVersion(request);

        // TODO: test validations
    }
    
    /**
     * Update Project
     *
     * This API is used to update an existing project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putTemplateProgrammerProjectTest() throws ApiException {
        ProjectDTO request = null;
        TaskIdResult response = api.putTemplateProgrammerProject(request);

        // TODO: test validations
    }
    
    /**
     * Update Template
     *
     * API to update a template.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putTemplateProgrammerTemplateTest() throws ApiException {
        TemplateDTO request = null;
        TaskIdResult response = api.putTemplateProgrammerTemplate(request);

        // TODO: test validations
    }
    
    /**
     * Preview Template
     *
     * API to preview a template.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putTemplateProgrammerTemplatePreviewTest() throws ApiException {
        TemplatePreviewRequestDTO request = null;
        TemplatePreviewResponseDTO response = api.putTemplateProgrammerTemplatePreview(request);

        // TODO: test validations
    }
    
    /**
     * Gets details of a given template
     *
     * Details of the template
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void templateProgrammerTemplateByTemplateIdTest() throws ApiException {
        String templateId = null;
        TemplateDTO response = api.templateProgrammerTemplateByTemplateId(templateId);

        // TODO: test validations
    }
    
}
