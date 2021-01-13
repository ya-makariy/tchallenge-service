package ru.tsystems.tchallenge.codemaster.api;

import ru.tsystems.tchallenge.codemaster.ApiClient;

import ru.tsystems.tchallenge.codemaster.model.OperationResult;
import ru.tsystems.tchallenge.codemaster.model.OperationResultWithLanguageInfoList;

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
@Component("ru.tsystems.tchallenge.codemaster.api.LanguagesApi")
public class LanguagesApi {
    private ApiClient apiClient;

    public LanguagesApi() {
        this(new ApiClient());
    }

    @Autowired
    public LanguagesApi(ApiClient apiClient) {
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
     * Retrieve list of available languages
     * <p><b>200</b> - The requested search result
     * <p><b>0</b> - An occured exception situation
     * @return OperationResultWithLanguageInfoList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OperationResultWithLanguageInfoList getAvailableLanguages() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/languages").build().toUriString();
        
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

        ParameterizedTypeReference<OperationResultWithLanguageInfoList> returnType = new ParameterizedTypeReference<OperationResultWithLanguageInfoList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
