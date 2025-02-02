// Template Source: IBaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Printer;
import com.microsoft.graph.models.extensions.PrintCertificateSigningRequest;
import com.microsoft.graph.requests.extensions.IPrintConnectorCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintConnectorWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrinterShareCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrinterShareWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintTaskTriggerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintTaskTriggerRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.Printer;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Printer Reference Request.
 */
public interface IPrinterReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super Printer> callback);

    Printer delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPrinterReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPrinterReferenceRequest expand(final String value);

    /**
     * Puts the Printer
     *
     * @param srcPrinter the Printer to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(Printer srcPrinter, final ICallback<? super Printer> callback);

    /**
     * Puts the Printer
     *
     * @param srcPrinter the Printer to PUT
     * @return the Printer
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    Printer put(Printer srcPrinter) throws ClientException;
}
