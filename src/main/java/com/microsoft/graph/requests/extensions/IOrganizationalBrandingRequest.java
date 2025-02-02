// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OrganizationalBranding;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Organizational Branding Request.
 */
public interface IOrganizationalBrandingRequest extends IHttpRequest {

    /**
     * Gets the OrganizationalBranding from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super OrganizationalBranding> callback);

    /**
     * Gets the OrganizationalBranding from the service
     *
     * @return the OrganizationalBranding from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OrganizationalBranding get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super OrganizationalBranding> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this OrganizationalBranding with a source
     *
     * @param sourceOrganizationalBranding the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final OrganizationalBranding sourceOrganizationalBranding, final ICallback<? super OrganizationalBranding> callback);

    /**
     * Patches this OrganizationalBranding with a source
     *
     * @param sourceOrganizationalBranding the source object with updates
     * @return the updated OrganizationalBranding
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OrganizationalBranding patch(final OrganizationalBranding sourceOrganizationalBranding) throws ClientException;

    /**
     * Posts a OrganizationalBranding with a new object
     *
     * @param newOrganizationalBranding the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final OrganizationalBranding newOrganizationalBranding, final ICallback<? super OrganizationalBranding> callback);

    /**
     * Posts a OrganizationalBranding with a new object
     *
     * @param newOrganizationalBranding the new object to create
     * @return the created OrganizationalBranding
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OrganizationalBranding post(final OrganizationalBranding newOrganizationalBranding) throws ClientException;

    /**
     * Posts a OrganizationalBranding with a new object
     *
     * @param newOrganizationalBranding the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final OrganizationalBranding newOrganizationalBranding, final ICallback<? super OrganizationalBranding> callback);

    /**
     * Posts a OrganizationalBranding with a new object
     *
     * @param newOrganizationalBranding the object to create/update
     * @return the created OrganizationalBranding
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OrganizationalBranding put(final OrganizationalBranding newOrganizationalBranding) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOrganizationalBrandingRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOrganizationalBrandingRequest expand(final String value);

}

