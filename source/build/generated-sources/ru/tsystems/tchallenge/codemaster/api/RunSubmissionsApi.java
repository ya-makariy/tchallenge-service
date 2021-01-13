package ru.tsystems.tchallenge.codemaster.api;

import ru.tsystems.tchallenge.codemaster.ApiClient;

import ru.tsystems.tchallenge.codemaster.model.OperationResult;
import ru.tsystems.tchallenge.codemaster.model.OperationResultWithRunResult;
import ru.tsystems.tchallenge.codemaster.model.OperationResultWithViolationList;
import ru.tsystems.tchallenge.codemaster.model.RunInvoice;

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
@Component("ru.tsystems.tchallenge.codemaster.api.RunSubmissionsApi")
public class RunSubmissionsApi {
    private ApiClient apiClient;

    public RunSubmissionsApi() {
        this(new ApiClient());
    }

    @Autowired
    public RunSubmissionsApi(ApiClient apiClient) {
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
     * Create new launch program task
     * <p><b>200</b> - Result of compilation
     * <p><b>400</b> - Expected error
     * <p><b>0</b> - An occured exception situation
     * @param invoice The invoice parameter
     * @return OperationResultWithRunResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OperationResultWithRunResult createRunTask(RunInvoice invoice) throws RestClientException {
        Object postBody = invoice;
        
        // verify the required parameter 'invoice' is set
        if (invoice == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'invoice' when calling createRunTask");
        }
        
        String path = UriComponentsBuilder.fromPath("/run/submissions").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<OperationResultWithRunResult> returnType = new ParameterizedTypeReference<OperationResultWithRunResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Retrieve result of program launch
     * <p><b>200</b> - Result of compilation
     * <p><b>0</b> - An occured exception situation
     * @param id The ID of submission
     * @return OperationResultWithRunResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OperationResultWithRunResult getRunResult(String id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getRunResult");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/run/submissions/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<OperationResultWithRunResult> returnType = new ParameterizedTypeReference<OperationResultWithRunResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
