// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceComplianceScheduledActionForRule;
import com.microsoft.graph.models.extensions.DeviceComplianceActionItem;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.DeviceComplianceActionItemCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceComplianceActionItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceActionItemCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Action Item Collection Request.
 */
public class DeviceComplianceActionItemCollectionRequest extends BaseCollectionRequest<DeviceComplianceActionItem, DeviceComplianceActionItemCollectionResponse> {

    /**
     * The request builder for this collection of DeviceComplianceActionItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    @SuppressWarnings("unchecked")
    public DeviceComplianceActionItemCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceComplianceActionItemCollectionResponse.class,(Class<BaseCollectionPage<DeviceComplianceActionItem>>) (new BaseCollectionPage<DeviceComplianceActionItem>(new java.util.ArrayList<DeviceComplianceActionItem>(), null).getClass()));
    }

    public void get(final ICallback<? super BaseCollectionPage<DeviceComplianceActionItem>> callback) {
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

    public BaseCollectionPage<DeviceComplianceActionItem> get() throws ClientException {
        final DeviceComplianceActionItemCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceComplianceActionItem newDeviceComplianceActionItem, final ICallback<? super DeviceComplianceActionItem> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceComplianceActionItemRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceComplianceActionItem, callback);
    }

    public DeviceComplianceActionItem post(final DeviceComplianceActionItem newDeviceComplianceActionItem) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceComplianceActionItemRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceComplianceActionItem);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public DeviceComplianceActionItemCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public DeviceComplianceActionItemCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public DeviceComplianceActionItemCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public DeviceComplianceActionItemCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public DeviceComplianceActionItemCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public DeviceComplianceActionItemCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public DeviceComplianceActionItemCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return this;
    }
    public BaseCollectionPage<DeviceComplianceActionItem> buildFromResponse(final DeviceComplianceActionItemCollectionResponse response) {
        final DeviceComplianceActionItemCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceComplianceActionItemCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final BaseCollectionPage<DeviceComplianceActionItem> page = new BaseCollectionPage<DeviceComplianceActionItem>(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
