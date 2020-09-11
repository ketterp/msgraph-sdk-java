// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.FieldValueSet;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Field Value Set Request.
 */
public class FieldValueSetRequest extends BaseRequest implements IFieldValueSetRequest {
	
    /**
     * The request for the FieldValueSet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public FieldValueSetRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, FieldValueSet.class);
    }

    /**
     * Gets the FieldValueSet from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<FieldValueSet> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the FieldValueSet from the service
     *
     * @return the FieldValueSet from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public FieldValueSet get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<FieldValueSet> callback) {
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
     * Patches this FieldValueSet with a source
     *
     * @param sourceFieldValueSet the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final FieldValueSet sourceFieldValueSet, final ICallback<FieldValueSet> callback) {
        send(HttpMethod.PATCH, callback, sourceFieldValueSet);
    }

    /**
     * Patches this FieldValueSet with a source
     *
     * @param sourceFieldValueSet the source object with updates
     * @return the updated FieldValueSet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public FieldValueSet patch(final FieldValueSet sourceFieldValueSet) throws ClientException {
        return send(HttpMethod.PATCH, sourceFieldValueSet);
    }

    /**
     * Creates a FieldValueSet with a new object
     *
     * @param newFieldValueSet the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final FieldValueSet newFieldValueSet, final ICallback<FieldValueSet> callback) {
        send(HttpMethod.POST, callback, newFieldValueSet);
    }

    /**
     * Creates a FieldValueSet with a new object
     *
     * @param newFieldValueSet the new object to create
     * @return the created FieldValueSet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public FieldValueSet post(final FieldValueSet newFieldValueSet) throws ClientException {
        return send(HttpMethod.POST, newFieldValueSet);
    }

    /**
     * Creates a FieldValueSet with a new object
     *
     * @param newFieldValueSet the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final FieldValueSet newFieldValueSet, final ICallback<FieldValueSet> callback) {
        send(HttpMethod.PUT, callback, newFieldValueSet);
    }

    /**
     * Creates a FieldValueSet with a new object
     *
     * @param newFieldValueSet the object to create/update
     * @return the created FieldValueSet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public FieldValueSet put(final FieldValueSet newFieldValueSet) throws ClientException {
        return send(HttpMethod.PUT, newFieldValueSet);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IFieldValueSetRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (FieldValueSetRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IFieldValueSetRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (FieldValueSetRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IFieldValueSetRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (FieldValueSetRequest)this;
     }

}

