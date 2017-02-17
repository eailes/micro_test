package com.example.esi.api;

import com.example.esi.ApiClient;
import com.example.esi.ApiException;
import com.example.esi.Pair;
import com.example.esi.auth.CharacterInfo;
import com.example.esi.auth.OAuth;

import javax.ws.rs.core.GenericType;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Api to retrieve the character information from the sso.
 */
public class SsoApi {
    private static final String DATE_FORMAT = "yyyy-MM-dd'T'hh:mm:ss";
    private final ApiClient apiClient;

    public SsoApi() {
        this(new ApiClient());
    }

    public SsoApi(final ApiClient apiClient) {
        this.apiClient = apiClient;
        apiClient.setBasePath(OAuth.URI_OAUTH);
        apiClient.setDateFormat(new SimpleDateFormat(DATE_FORMAT));
    }

    public CharacterInfo getCharacterInfo() throws ApiException {
        final Object localVarPostBody = null;

        final String localVarPath = "/verify";

        final List<Pair> localVarQueryParams = new ArrayList<>();
        final Map<String, String> localVarHeaderParams = new HashMap<>();
        final Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {};
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "evesso" };

        final GenericType<CharacterInfo> localVarReturnType = new GenericType<CharacterInfo>() {
        };

        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams,
                localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
