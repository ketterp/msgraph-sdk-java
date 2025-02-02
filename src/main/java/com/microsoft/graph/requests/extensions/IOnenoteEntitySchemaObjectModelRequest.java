// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OnenoteEntitySchemaObjectModel;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Onenote Entity Schema Object Model Request.
 */
public interface IOnenoteEntitySchemaObjectModelRequest extends IHttpRequest {

    /**
     * Gets the OnenoteEntitySchemaObjectModel from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super OnenoteEntitySchemaObjectModel> callback);

    /**
     * Gets the OnenoteEntitySchemaObjectModel from the service
     *
     * @return the OnenoteEntitySchemaObjectModel from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OnenoteEntitySchemaObjectModel get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super OnenoteEntitySchemaObjectModel> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this OnenoteEntitySchemaObjectModel with a source
     *
     * @param sourceOnenoteEntitySchemaObjectModel the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final OnenoteEntitySchemaObjectModel sourceOnenoteEntitySchemaObjectModel, final ICallback<? super OnenoteEntitySchemaObjectModel> callback);

    /**
     * Patches this OnenoteEntitySchemaObjectModel with a source
     *
     * @param sourceOnenoteEntitySchemaObjectModel the source object with updates
     * @return the updated OnenoteEntitySchemaObjectModel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OnenoteEntitySchemaObjectModel patch(final OnenoteEntitySchemaObjectModel sourceOnenoteEntitySchemaObjectModel) throws ClientException;

    /**
     * Posts a OnenoteEntitySchemaObjectModel with a new object
     *
     * @param newOnenoteEntitySchemaObjectModel the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final OnenoteEntitySchemaObjectModel newOnenoteEntitySchemaObjectModel, final ICallback<? super OnenoteEntitySchemaObjectModel> callback);

    /**
     * Posts a OnenoteEntitySchemaObjectModel with a new object
     *
     * @param newOnenoteEntitySchemaObjectModel the new object to create
     * @return the created OnenoteEntitySchemaObjectModel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OnenoteEntitySchemaObjectModel post(final OnenoteEntitySchemaObjectModel newOnenoteEntitySchemaObjectModel) throws ClientException;

    /**
     * Posts a OnenoteEntitySchemaObjectModel with a new object
     *
     * @param newOnenoteEntitySchemaObjectModel the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final OnenoteEntitySchemaObjectModel newOnenoteEntitySchemaObjectModel, final ICallback<? super OnenoteEntitySchemaObjectModel> callback);

    /**
     * Posts a OnenoteEntitySchemaObjectModel with a new object
     *
     * @param newOnenoteEntitySchemaObjectModel the object to create/update
     * @return the created OnenoteEntitySchemaObjectModel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OnenoteEntitySchemaObjectModel put(final OnenoteEntitySchemaObjectModel newOnenoteEntitySchemaObjectModel) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOnenoteEntitySchemaObjectModelRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOnenoteEntitySchemaObjectModelRequest expand(final String value);

}

