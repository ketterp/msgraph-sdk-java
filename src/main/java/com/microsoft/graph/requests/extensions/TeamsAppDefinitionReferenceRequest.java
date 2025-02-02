// Template Source: BaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TeamsAppDefinition;
import com.microsoft.graph.requests.extensions.ITeamworkBotRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamworkBotRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams App Definition Reference Request.
 */
public class TeamsAppDefinitionReferenceRequest extends BaseRequest implements ITeamsAppDefinitionReferenceRequest {

    /**
     * The request for the TeamsAppDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamsAppDefinitionReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamsAppDefinition.class);
    }

    public void delete(final ICallback<? super TeamsAppDefinition> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public TeamsAppDefinition delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITeamsAppDefinitionReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (TeamsAppDefinitionReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITeamsAppDefinitionReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (TeamsAppDefinitionReferenceRequest)this;
    }
    /**
     * Puts the TeamsAppDefinition
     *
     * @param srcTeamsAppDefinition the TeamsAppDefinition reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(TeamsAppDefinition srcTeamsAppDefinition, final ICallback<? super TeamsAppDefinition> callback) {
        send(HttpMethod.PUT, callback, srcTeamsAppDefinition);
    }

    /**
     * Puts the TeamsAppDefinition
     *
     * @param srcTeamsAppDefinition the TeamsAppDefinition reference to PUT
     * @return the TeamsAppDefinition
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public TeamsAppDefinition put(TeamsAppDefinition srcTeamsAppDefinition) throws ClientException {
        return send(HttpMethod.PUT, srcTeamsAppDefinition);
    }
}
