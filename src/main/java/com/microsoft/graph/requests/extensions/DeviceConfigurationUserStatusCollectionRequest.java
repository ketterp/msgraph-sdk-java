// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceConfiguration;
import com.microsoft.graph.models.extensions.DeviceConfigurationUserStatus;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.DeviceConfigurationUserStatusCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceConfigurationUserStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationUserStatusCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration User Status Collection Request.
 */
public class DeviceConfigurationUserStatusCollectionRequest extends BaseCollectionRequest<DeviceConfigurationUserStatus, DeviceConfigurationUserStatusCollectionResponse> {

    /**
     * The request builder for this collection of DeviceConfigurationUserStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    @SuppressWarnings("unchecked")
    public DeviceConfigurationUserStatusCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceConfigurationUserStatusCollectionResponse.class,(Class<BaseCollectionPage<DeviceConfigurationUserStatus>>) (new BaseCollectionPage<DeviceConfigurationUserStatus>(new java.util.ArrayList<DeviceConfigurationUserStatus>(), null).getClass()));
    }

    public void get(final ICallback<? super BaseCollectionPage<DeviceConfigurationUserStatus>> callback) {
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

    public BaseCollectionPage<DeviceConfigurationUserStatus> get() throws ClientException {
        final DeviceConfigurationUserStatusCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceConfigurationUserStatus newDeviceConfigurationUserStatus, final ICallback<? super DeviceConfigurationUserStatus> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceConfigurationUserStatusRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceConfigurationUserStatus, callback);
    }

    public DeviceConfigurationUserStatus post(final DeviceConfigurationUserStatus newDeviceConfigurationUserStatus) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceConfigurationUserStatusRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceConfigurationUserStatus);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public DeviceConfigurationUserStatusCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public DeviceConfigurationUserStatusCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public DeviceConfigurationUserStatusCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public DeviceConfigurationUserStatusCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public DeviceConfigurationUserStatusCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public DeviceConfigurationUserStatusCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public DeviceConfigurationUserStatusCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return this;
    }
    public BaseCollectionPage<DeviceConfigurationUserStatus> buildFromResponse(final DeviceConfigurationUserStatusCollectionResponse response) {
        final DeviceConfigurationUserStatusCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceConfigurationUserStatusCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final BaseCollectionPage<DeviceConfigurationUserStatus> page = new BaseCollectionPage<DeviceConfigurationUserStatus>(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
