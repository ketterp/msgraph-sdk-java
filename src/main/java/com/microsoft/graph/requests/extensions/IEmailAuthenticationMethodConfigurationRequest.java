// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EmailAuthenticationMethodConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Email Authentication Method Configuration Request.
 */
public interface IEmailAuthenticationMethodConfigurationRequest extends IHttpRequest {

    /**
     * Gets the EmailAuthenticationMethodConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super EmailAuthenticationMethodConfiguration> callback);

    /**
     * Gets the EmailAuthenticationMethodConfiguration from the service
     *
     * @return the EmailAuthenticationMethodConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EmailAuthenticationMethodConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super EmailAuthenticationMethodConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this EmailAuthenticationMethodConfiguration with a source
     *
     * @param sourceEmailAuthenticationMethodConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final EmailAuthenticationMethodConfiguration sourceEmailAuthenticationMethodConfiguration, final ICallback<? super EmailAuthenticationMethodConfiguration> callback);

    /**
     * Patches this EmailAuthenticationMethodConfiguration with a source
     *
     * @param sourceEmailAuthenticationMethodConfiguration the source object with updates
     * @return the updated EmailAuthenticationMethodConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EmailAuthenticationMethodConfiguration patch(final EmailAuthenticationMethodConfiguration sourceEmailAuthenticationMethodConfiguration) throws ClientException;

    /**
     * Posts a EmailAuthenticationMethodConfiguration with a new object
     *
     * @param newEmailAuthenticationMethodConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final EmailAuthenticationMethodConfiguration newEmailAuthenticationMethodConfiguration, final ICallback<? super EmailAuthenticationMethodConfiguration> callback);

    /**
     * Posts a EmailAuthenticationMethodConfiguration with a new object
     *
     * @param newEmailAuthenticationMethodConfiguration the new object to create
     * @return the created EmailAuthenticationMethodConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EmailAuthenticationMethodConfiguration post(final EmailAuthenticationMethodConfiguration newEmailAuthenticationMethodConfiguration) throws ClientException;

    /**
     * Posts a EmailAuthenticationMethodConfiguration with a new object
     *
     * @param newEmailAuthenticationMethodConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final EmailAuthenticationMethodConfiguration newEmailAuthenticationMethodConfiguration, final ICallback<? super EmailAuthenticationMethodConfiguration> callback);

    /**
     * Posts a EmailAuthenticationMethodConfiguration with a new object
     *
     * @param newEmailAuthenticationMethodConfiguration the object to create/update
     * @return the created EmailAuthenticationMethodConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EmailAuthenticationMethodConfiguration put(final EmailAuthenticationMethodConfiguration newEmailAuthenticationMethodConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEmailAuthenticationMethodConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEmailAuthenticationMethodConfigurationRequest expand(final String value);

}

