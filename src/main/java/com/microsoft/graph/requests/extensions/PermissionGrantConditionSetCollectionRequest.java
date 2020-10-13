// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PermissionGrantPolicy;
import com.microsoft.graph.models.extensions.PermissionGrantConditionSet;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.PermissionGrantConditionSetCollectionResponse;
import com.microsoft.graph.requests.extensions.PermissionGrantConditionSetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PermissionGrantConditionSetCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Permission Grant Condition Set Collection Request.
 */
public class PermissionGrantConditionSetCollectionRequest extends BaseCollectionRequest<PermissionGrantConditionSet, PermissionGrantConditionSetCollectionResponse> {

    /**
     * The request builder for this collection of PermissionGrantConditionSet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    @SuppressWarnings("unchecked")
    public PermissionGrantConditionSetCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PermissionGrantConditionSetCollectionResponse.class,(Class<BaseCollectionPage<PermissionGrantConditionSet>>) (new BaseCollectionPage<PermissionGrantConditionSet>(new java.util.ArrayList<PermissionGrantConditionSet>(), null).getClass()));
    }

    public void get(final ICallback<? super BaseCollectionPage<PermissionGrantConditionSet>> callback) {
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

    public BaseCollectionPage<PermissionGrantConditionSet> get() throws ClientException {
        final PermissionGrantConditionSetCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final PermissionGrantConditionSet newPermissionGrantConditionSet, final ICallback<? super PermissionGrantConditionSet> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new PermissionGrantConditionSetRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPermissionGrantConditionSet, callback);
    }

    public PermissionGrantConditionSet post(final PermissionGrantConditionSet newPermissionGrantConditionSet) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new PermissionGrantConditionSetRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPermissionGrantConditionSet);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public PermissionGrantConditionSetCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public PermissionGrantConditionSetCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public PermissionGrantConditionSetCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public PermissionGrantConditionSetCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public PermissionGrantConditionSetCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public PermissionGrantConditionSetCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public PermissionGrantConditionSetCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return this;
    }
    public BaseCollectionPage<PermissionGrantConditionSet> buildFromResponse(final PermissionGrantConditionSetCollectionResponse response) {
        final PermissionGrantConditionSetCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new PermissionGrantConditionSetCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final BaseCollectionPage<PermissionGrantConditionSet> page = new BaseCollectionPage<PermissionGrantConditionSet>(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
