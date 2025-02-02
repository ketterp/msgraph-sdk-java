// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrintJob;
import com.microsoft.graph.models.extensions.PrintDocument;
import com.microsoft.graph.models.extensions.PrintDocumentUploadProperties;
import com.microsoft.graph.models.extensions.UploadSession;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IPrintDocumentCollectionPage;
import com.microsoft.graph.requests.extensions.PrintDocumentCollectionResponse;
import com.microsoft.graph.requests.extensions.IPrintDocumentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintDocumentCollectionRequest;
import com.microsoft.graph.requests.extensions.PrintDocumentCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Document Collection Request.
 */
public class PrintDocumentCollectionRequest extends BaseCollectionRequest<PrintDocumentCollectionResponse, IPrintDocumentCollectionPage> implements IPrintDocumentCollectionRequest {

    /**
     * The request builder for this collection of PrintDocument
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrintDocumentCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrintDocumentCollectionResponse.class, IPrintDocumentCollectionPage.class);
    }

    public void get(final ICallback<? super IPrintDocumentCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IPrintDocumentCollectionPage get() throws ClientException {
        final PrintDocumentCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final PrintDocument newPrintDocument, final ICallback<? super PrintDocument> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new PrintDocumentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPrintDocument, callback);
    }

    public PrintDocument post(final PrintDocument newPrintDocument) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new PrintDocumentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPrintDocument);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPrintDocumentCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PrintDocumentCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IPrintDocumentCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (PrintDocumentCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IPrintDocumentCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (PrintDocumentCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPrintDocumentCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PrintDocumentCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IPrintDocumentCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (PrintDocumentCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IPrintDocumentCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (PrintDocumentCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IPrintDocumentCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IPrintDocumentCollectionRequest)this;
    }
    public IPrintDocumentCollectionPage buildFromResponse(final PrintDocumentCollectionResponse response) {
        final IPrintDocumentCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new PrintDocumentCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final PrintDocumentCollectionPage page = new PrintDocumentCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
