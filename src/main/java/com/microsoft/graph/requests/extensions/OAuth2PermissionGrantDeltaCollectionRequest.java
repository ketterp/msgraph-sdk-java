// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OAuth2PermissionGrant;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantDeltaCollectionResponse;
import com.microsoft.graph.models.extensions.OAuth2PermissionGrant;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the OAuth2Permission Grant Delta Collection Request.
 */
public class OAuth2PermissionGrantDeltaCollectionRequest extends BaseCollectionRequest<OAuth2PermissionGrant, OAuth2PermissionGrantDeltaCollectionResponse> {


    /**
     * The request for this OAuth2PermissionGrantDelta
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    @SuppressWarnings("unchecked")
    public OAuth2PermissionGrantDeltaCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OAuth2PermissionGrantDeltaCollectionResponse.class, (Class<BaseCollectionPage<OAuth2PermissionGrant>>) (new BaseCollectionPage<OAuth2PermissionGrant>(new java.util.ArrayList<OAuth2PermissionGrant>(), null).getClass()));
    }


    public void get(final ICallback<? super BaseCollectionPage<OAuth2PermissionGrant>> callback) {
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

    public BaseCollectionPage<OAuth2PermissionGrant> get() throws ClientException {
        final OAuth2PermissionGrantDeltaCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public BaseCollectionPage<OAuth2PermissionGrant> buildFromResponse(final OAuth2PermissionGrantDeltaCollectionResponse response) {
        final OAuth2PermissionGrantDeltaCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new OAuth2PermissionGrantDeltaCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final BaseCollectionPage<OAuth2PermissionGrant> page = new BaseCollectionPage<OAuth2PermissionGrant>(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public OAuth2PermissionGrantDeltaCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public OAuth2PermissionGrantDeltaCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public OAuth2PermissionGrantDeltaCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public OAuth2PermissionGrantDeltaCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public OAuth2PermissionGrantDeltaCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return this;
    }

}
