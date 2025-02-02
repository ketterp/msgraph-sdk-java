// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceConfigurationUserStatus;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration User Status Request.
 */
public class DeviceConfigurationUserStatusRequest extends BaseRequest implements IDeviceConfigurationUserStatusRequest {
	
    /**
     * The request for the DeviceConfigurationUserStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceConfigurationUserStatusRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceConfigurationUserStatus.class);
    }

    /**
     * Gets the DeviceConfigurationUserStatus from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceConfigurationUserStatus> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceConfigurationUserStatus from the service
     *
     * @return the DeviceConfigurationUserStatus from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceConfigurationUserStatus get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DeviceConfigurationUserStatus> callback) {
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
     * Patches this DeviceConfigurationUserStatus with a source
     *
     * @param sourceDeviceConfigurationUserStatus the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceConfigurationUserStatus sourceDeviceConfigurationUserStatus, final ICallback<? super DeviceConfigurationUserStatus> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceConfigurationUserStatus);
    }

    /**
     * Patches this DeviceConfigurationUserStatus with a source
     *
     * @param sourceDeviceConfigurationUserStatus the source object with updates
     * @return the updated DeviceConfigurationUserStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceConfigurationUserStatus patch(final DeviceConfigurationUserStatus sourceDeviceConfigurationUserStatus) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceConfigurationUserStatus);
    }

    /**
     * Creates a DeviceConfigurationUserStatus with a new object
     *
     * @param newDeviceConfigurationUserStatus the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceConfigurationUserStatus newDeviceConfigurationUserStatus, final ICallback<? super DeviceConfigurationUserStatus> callback) {
        send(HttpMethod.POST, callback, newDeviceConfigurationUserStatus);
    }

    /**
     * Creates a DeviceConfigurationUserStatus with a new object
     *
     * @param newDeviceConfigurationUserStatus the new object to create
     * @return the created DeviceConfigurationUserStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceConfigurationUserStatus post(final DeviceConfigurationUserStatus newDeviceConfigurationUserStatus) throws ClientException {
        return send(HttpMethod.POST, newDeviceConfigurationUserStatus);
    }

    /**
     * Creates a DeviceConfigurationUserStatus with a new object
     *
     * @param newDeviceConfigurationUserStatus the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceConfigurationUserStatus newDeviceConfigurationUserStatus, final ICallback<? super DeviceConfigurationUserStatus> callback) {
        send(HttpMethod.PUT, callback, newDeviceConfigurationUserStatus);
    }

    /**
     * Creates a DeviceConfigurationUserStatus with a new object
     *
     * @param newDeviceConfigurationUserStatus the object to create/update
     * @return the created DeviceConfigurationUserStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceConfigurationUserStatus put(final DeviceConfigurationUserStatus newDeviceConfigurationUserStatus) throws ClientException {
        return send(HttpMethod.PUT, newDeviceConfigurationUserStatus);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceConfigurationUserStatusRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceConfigurationUserStatusRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceConfigurationUserStatusRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceConfigurationUserStatusRequest)this;
     }

}

