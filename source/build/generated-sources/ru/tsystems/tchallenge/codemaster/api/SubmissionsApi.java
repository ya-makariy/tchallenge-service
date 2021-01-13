package ru.tsystems.tchallenge.codemaster.api;

import ru.tsystems.tchallenge.codemaster.ApiClient;

import ru.tsystems.tchallenge.codemaster.model.OperationResult;
import ru.tsystems.tchallenge.codemaster.model.OperationResultWithSubmissionResult;
import ru.tsystems.tchallenge.codemaster.model.OperationResultWithViolationList;
import ru.tsystems.tchallenge.codemaster.model.SubmissionInvoice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-27T17:05:56.813+03:00")
@Component("ru.tsystems.tchallenge.codemaster.api.SubmissionsApi")
public class SubmissionsApi {
    private ApiClient apiClient;

    public SubmissionsApi() {
        this(new ApiClient());
    }

    @Autowired
    public SubmissionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * Create new submission. Submission is a program, that need to check by launching tests. Request can be async (means that it only create task to run tests and return current status) Also request can be synchronously (means that request will be blocked until all tests are executed and it can return only final result) 
     * <p><b>200</b> - Submission check results
     * <p><b>400</b> - Expected error
     * <p><b>0</b> - An occured exception situation
     * @param invoice Invoice to create submission
     * @param async Whether to create task and return result immedeateely or to block request untill all tests are executed 
     * @return OperationResultWithSubmissionResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OperationResultWithSubmissionResult createSubmission(SubmissionInvoice invoice, Boolean async) throws RestClientException {
        Object postBody = invoice;
        
        // verify the required parameter 'invoice' is set
        if (invoice == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'invoice' when calling createSubmission");
        }
        
        String path = UriComponentsBuilder.fromPath("/submissions").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "async", async));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<OperationResultWithSubmissionResult> returnType = new ParameterizedTypeReference<OperationResultWithSubmissionResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Retrieve result of submission
     * <p><b>200</b> - Submission check results
     * <p><b>0</b> - An occured exception situation
     * @param id The ID of a submission
     * @param withLang Wherer to include to response or not info about language, used to compile/run program 
     * @param withSource Whether to include to response or not source code
     * @return OperationResultWithSubmissionResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OperationResultWithSubmissionResult getSubmissionResult(String id, Boolean withLang, Boolean withSource) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getSubmissionResult");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/submissions/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "withLang", withLang));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "withSource", withSource));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<OperationResultWithSubmissionResult> returnType = new ParameterizedTypeReference<OperationResultWithSubmissionResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
