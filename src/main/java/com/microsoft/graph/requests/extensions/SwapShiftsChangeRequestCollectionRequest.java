// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Schedule;
import com.microsoft.graph.models.extensions.SwapShiftsChangeRequest;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.SwapShiftsChangeRequestCollectionResponse;
import com.microsoft.graph.requests.extensions.SwapShiftsChangeRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SwapShiftsChangeRequestCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Swap Shifts Change Request Collection Request.
 */
public class SwapShiftsChangeRequestCollectionRequest extends BaseCollectionRequest<SwapShiftsChangeRequest, SwapShiftsChangeRequestCollectionResponse> {

    /**
     * The request builder for this collection of SwapShiftsChangeRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    @SuppressWarnings("unchecked")
    public SwapShiftsChangeRequestCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SwapShiftsChangeRequestCollectionResponse.class,(Class<BaseCollectionPage<SwapShiftsChangeRequest>>) (new BaseCollectionPage<SwapShiftsChangeRequest>(new java.util.ArrayList<SwapShiftsChangeRequest>(), null).getClass()));
    }

    public void get(final ICallback<? super BaseCollectionPage<SwapShiftsChangeRequest>> callback) {
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

    public BaseCollectionPage<SwapShiftsChangeRequest> get() throws ClientException {
        final SwapShiftsChangeRequestCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final SwapShiftsChangeRequest newSwapShiftsChangeRequest, final ICallback<? super SwapShiftsChangeRequest> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new SwapShiftsChangeRequestRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newSwapShiftsChangeRequest, callback);
    }

    public SwapShiftsChangeRequest post(final SwapShiftsChangeRequest newSwapShiftsChangeRequest) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new SwapShiftsChangeRequestRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newSwapShiftsChangeRequest);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public SwapShiftsChangeRequestCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public SwapShiftsChangeRequestCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public SwapShiftsChangeRequestCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public SwapShiftsChangeRequestCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public SwapShiftsChangeRequestCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public SwapShiftsChangeRequestCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public SwapShiftsChangeRequestCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return this;
    }
    public BaseCollectionPage<SwapShiftsChangeRequest> buildFromResponse(final SwapShiftsChangeRequestCollectionResponse response) {
        final SwapShiftsChangeRequestCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new SwapShiftsChangeRequestCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final BaseCollectionPage<SwapShiftsChangeRequest> page = new BaseCollectionPage<SwapShiftsChangeRequest>(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
