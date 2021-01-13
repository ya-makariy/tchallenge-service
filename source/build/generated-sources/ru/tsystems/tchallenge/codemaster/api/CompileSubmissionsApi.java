package ru.tsystems.tchallenge.codemaster.api;

import ru.tsystems.tchallenge.codemaster.ApiClient;

import ru.tsystems.tchallenge.codemaster.model.CompileInvoice;
import ru.tsystems.tchallenge.codemaster.model.OperationResult;
import ru.tsystems.tchallenge.codemaster.model.OperationResultWithCompileResult;
import ru.tsystems.tchallenge.codemaster.model.OperationResultWithViolationList;

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
@Component("ru.tsystems.tchallenge.codemaster.api.CompileSubmissionsApi")
public class CompileSubmissionsApi {
    private ApiClient apiClient;

    public CompileSubmissionsApi() {
        this(new ApiClient());
    }

    @Autowired
    public CompileSubmissionsApi(ApiClient apiClient) {
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
     * Create new compile task
     * <p><b>200</b> - Result of compilation
     * <p><b>400</b> - Expected error
     * <p><b>0</b> - An occured exception situation
     * @param invoice An invoice for creating compilation task
     * @return OperationResultWithCompileResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OperationResultWithCompileResult createCompileTask(CompileInvoice invoice) throws RestClientException {
        Object postBody = invoice;
        
        // verify the required parameter 'invoice' is set
        if (invoice == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'invoice' when calling createCompileTask");
        }
        
        String path = UriComponentsBuilder.fromPath("/compilation/submissions").build().toUriString();
        
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

        ParameterizedTypeReference<OperationResultWithCompileResult> returnType = new ParameterizedTypeReference<OperationResultWithCompileResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Retrieve result of compilation.
     * <p><b>200</b> - Result of compilation
     * <p><b>0</b> - An occured exception situation
     * @param id The ID of the submission.
     * @return OperationResultWithCompileResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OperationResultWithCompileResult getCompileResult(String id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getCompileResult");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/compilation/submissions/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<OperationResultWithCompileResult> returnType = new ParameterizedTypeReference<OperationResultWithCompileResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
