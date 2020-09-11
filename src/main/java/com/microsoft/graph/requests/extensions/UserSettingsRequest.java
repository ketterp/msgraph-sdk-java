// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserSettings;
import com.microsoft.graph.requests.extensions.IShiftPreferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.ShiftPreferencesRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Settings Request.
 */
public class UserSettingsRequest extends BaseRequest implements IUserSettingsRequest {
	
    /**
     * The request for the UserSettings
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserSettingsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserSettings.class);
    }

    /**
     * Gets the UserSettings from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<UserSettings> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UserSettings from the service
     *
     * @return the UserSettings from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserSettings get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<UserSettings> callback) {
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
     * Patches this UserSettings with a source
     *
     * @param sourceUserSettings the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UserSettings sourceUserSettings, final ICallback<UserSettings> callback) {
        send(HttpMethod.PATCH, callback, sourceUserSettings);
    }

    /**
     * Patches this UserSettings with a source
     *
     * @param sourceUserSettings the source object with updates
     * @return the updated UserSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserSettings patch(final UserSettings sourceUserSettings) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserSettings);
    }

    /**
     * Creates a UserSettings with a new object
     *
     * @param newUserSettings the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UserSettings newUserSettings, final ICallback<UserSettings> callback) {
        send(HttpMethod.POST, callback, newUserSettings);
    }

    /**
     * Creates a UserSettings with a new object
     *
     * @param newUserSettings the new object to create
     * @return the created UserSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserSettings post(final UserSettings newUserSettings) throws ClientException {
        return send(HttpMethod.POST, newUserSettings);
    }

    /**
     * Creates a UserSettings with a new object
     *
     * @param newUserSettings the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final UserSettings newUserSettings, final ICallback<UserSettings> callback) {
        send(HttpMethod.PUT, callback, newUserSettings);
    }

    /**
     * Creates a UserSettings with a new object
     *
     * @param newUserSettings the object to create/update
     * @return the created UserSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserSettings put(final UserSettings newUserSettings) throws ClientException {
        return send(HttpMethod.PUT, newUserSettings);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUserSettingsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UserSettingsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUserSettingsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UserSettingsRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IUserSettingsRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (UserSettingsRequest)this;
     }

}

