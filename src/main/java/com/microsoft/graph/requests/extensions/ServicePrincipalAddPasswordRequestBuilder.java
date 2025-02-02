// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IServicePrincipalAddPasswordRequest;
import com.microsoft.graph.requests.extensions.ServicePrincipalAddPasswordRequest;
import com.microsoft.graph.models.extensions.PasswordCredential;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal Add Password Request Builder.
 */
public class ServicePrincipalAddPasswordRequestBuilder extends BaseActionRequestBuilder implements IServicePrincipalAddPasswordRequestBuilder {

    /**
     * The request builder for this ServicePrincipalAddPassword
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param passwordCredential the passwordCredential
     */
    public ServicePrincipalAddPasswordRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final PasswordCredential passwordCredential) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("passwordCredential", passwordCredential);
    }

    /**
     * Creates the IServicePrincipalAddPasswordRequest
     *
     * @param requestOptions the options for the request
     * @return the IServicePrincipalAddPasswordRequest instance
     */
    public IServicePrincipalAddPasswordRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IServicePrincipalAddPasswordRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IServicePrincipalAddPasswordRequest instance
     */
    public IServicePrincipalAddPasswordRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ServicePrincipalAddPasswordRequest request = new ServicePrincipalAddPasswordRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("passwordCredential")) {
            request.body.passwordCredential = getParameter("passwordCredential");
        }

        return request;
    }
}
