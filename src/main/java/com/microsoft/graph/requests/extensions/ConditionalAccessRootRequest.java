// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ConditionalAccessRoot;
import com.microsoft.graph.requests.extensions.INamedLocationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.INamedLocationRequestBuilder;
import com.microsoft.graph.requests.extensions.NamedLocationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.NamedLocationRequestBuilder;
import com.microsoft.graph.requests.extensions.IConditionalAccessPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConditionalAccessPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ConditionalAccessPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConditionalAccessPolicyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conditional Access Root Request.
 */
public class ConditionalAccessRootRequest extends BaseRequest implements IConditionalAccessRootRequest {
	
    /**
     * The request for the ConditionalAccessRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ConditionalAccessRootRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ConditionalAccessRoot.class);
    }

    /**
     * Gets the ConditionalAccessRoot from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ConditionalAccessRoot> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ConditionalAccessRoot from the service
     *
     * @return the ConditionalAccessRoot from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ConditionalAccessRoot get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<ConditionalAccessRoot> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ConditionalAccessRoot with a source
     *
     * @param sourceConditionalAccessRoot the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ConditionalAccessRoot sourceConditionalAccessRoot, final ICallback<ConditionalAccessRoot> callback) {
        send(HttpMethod.PATCH, callback, sourceConditionalAccessRoot);
    }

    /**
     * Patches this ConditionalAccessRoot with a source
     *
     * @param sourceConditionalAccessRoot the source object with updates
     * @return the updated ConditionalAccessRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ConditionalAccessRoot patch(final ConditionalAccessRoot sourceConditionalAccessRoot) throws ClientException {
        return send(HttpMethod.PATCH, sourceConditionalAccessRoot);
    }

    /**
     * Creates a ConditionalAccessRoot with a new object
     *
     * @param newConditionalAccessRoot the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ConditionalAccessRoot newConditionalAccessRoot, final ICallback<ConditionalAccessRoot> callback) {
        send(HttpMethod.POST, callback, newConditionalAccessRoot);
    }

    /**
     * Creates a ConditionalAccessRoot with a new object
     *
     * @param newConditionalAccessRoot the new object to create
     * @return the created ConditionalAccessRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ConditionalAccessRoot post(final ConditionalAccessRoot newConditionalAccessRoot) throws ClientException {
        return send(HttpMethod.POST, newConditionalAccessRoot);
    }

    /**
     * Creates a ConditionalAccessRoot with a new object
     *
     * @param newConditionalAccessRoot the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ConditionalAccessRoot newConditionalAccessRoot, final ICallback<ConditionalAccessRoot> callback) {
        send(HttpMethod.PUT, callback, newConditionalAccessRoot);
    }

    /**
     * Creates a ConditionalAccessRoot with a new object
     *
     * @param newConditionalAccessRoot the object to create/update
     * @return the created ConditionalAccessRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ConditionalAccessRoot put(final ConditionalAccessRoot newConditionalAccessRoot) throws ClientException {
        return send(HttpMethod.PUT, newConditionalAccessRoot);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IConditionalAccessRootRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ConditionalAccessRootRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IConditionalAccessRootRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ConditionalAccessRootRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IConditionalAccessRootRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (ConditionalAccessRootRequest)this;
     }

}

