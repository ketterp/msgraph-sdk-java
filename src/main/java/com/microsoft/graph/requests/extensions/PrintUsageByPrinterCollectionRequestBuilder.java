// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ReportRoot;
import com.microsoft.graph.models.extensions.PrintUsageByPrinter;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IPrintUsageByPrinterCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintUsageByPrinterRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintUsageByPrinterCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Usage By Printer Collection Request Builder.
 */
public class PrintUsageByPrinterCollectionRequestBuilder extends BaseRequestBuilder implements IPrintUsageByPrinterCollectionRequestBuilder {

    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrintUsageByPrinterCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IPrintUsageByPrinterCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IPrintUsageByPrinterCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new PrintUsageByPrinterCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IPrintUsageByPrinterRequestBuilder byId(final String id) {
        return new PrintUsageByPrinterRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
