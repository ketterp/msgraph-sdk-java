// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Printer;
import com.microsoft.graph.requests.extensions.IPrinterCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.PrinterCollectionPage;
import com.microsoft.graph.requests.extensions.PrinterCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Printer Collection Page.
 */
public class PrinterCollectionPage extends BaseCollectionPage<Printer, IPrinterCollectionRequestBuilder> implements IPrinterCollectionPage {

    /**
     * A collection page for Printer
     *
     * @param response the serialized PrinterCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PrinterCollectionPage(final PrinterCollectionResponse response, final IPrinterCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
