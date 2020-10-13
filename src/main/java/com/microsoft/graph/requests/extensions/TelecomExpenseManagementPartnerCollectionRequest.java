// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.TelecomExpenseManagementPartner;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.TelecomExpenseManagementPartnerCollectionResponse;
import com.microsoft.graph.requests.extensions.TelecomExpenseManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TelecomExpenseManagementPartnerCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Telecom Expense Management Partner Collection Request.
 */
public class TelecomExpenseManagementPartnerCollectionRequest extends BaseCollectionRequest<TelecomExpenseManagementPartner, TelecomExpenseManagementPartnerCollectionResponse> {

    /**
     * The request builder for this collection of TelecomExpenseManagementPartner
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    @SuppressWarnings("unchecked")
    public TelecomExpenseManagementPartnerCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TelecomExpenseManagementPartnerCollectionResponse.class,(Class<BaseCollectionPage<TelecomExpenseManagementPartner>>) (new BaseCollectionPage<TelecomExpenseManagementPartner>(new java.util.ArrayList<TelecomExpenseManagementPartner>(), null).getClass()));
    }

    public void get(final ICallback<? super BaseCollectionPage<TelecomExpenseManagementPartner>> callback) {
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

    public BaseCollectionPage<TelecomExpenseManagementPartner> get() throws ClientException {
        final TelecomExpenseManagementPartnerCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final TelecomExpenseManagementPartner newTelecomExpenseManagementPartner, final ICallback<? super TelecomExpenseManagementPartner> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new TelecomExpenseManagementPartnerRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newTelecomExpenseManagementPartner, callback);
    }

    public TelecomExpenseManagementPartner post(final TelecomExpenseManagementPartner newTelecomExpenseManagementPartner) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new TelecomExpenseManagementPartnerRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newTelecomExpenseManagementPartner);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public TelecomExpenseManagementPartnerCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public TelecomExpenseManagementPartnerCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public TelecomExpenseManagementPartnerCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public TelecomExpenseManagementPartnerCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public TelecomExpenseManagementPartnerCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public TelecomExpenseManagementPartnerCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public TelecomExpenseManagementPartnerCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return this;
    }
    public BaseCollectionPage<TelecomExpenseManagementPartner> buildFromResponse(final TelecomExpenseManagementPartnerCollectionResponse response) {
        final TelecomExpenseManagementPartnerCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new TelecomExpenseManagementPartnerCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final BaseCollectionPage<TelecomExpenseManagementPartner> page = new BaseCollectionPage<TelecomExpenseManagementPartner>(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
