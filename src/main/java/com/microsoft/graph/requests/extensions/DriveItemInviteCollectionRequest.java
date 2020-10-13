// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DriveRecipient;
import com.microsoft.graph.models.extensions.Permission;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.DriveItemInviteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemInviteCollectionResponse;
import com.microsoft.graph.models.extensions.Permission;
import com.microsoft.graph.models.extensions.DriveItemInviteBody;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Invite Collection Request.
 */
public class DriveItemInviteCollectionRequest extends BaseCollectionRequest<Permission, DriveItemInviteCollectionResponse> {


    protected final DriveItemInviteBody body;


    /**
     * The request for this DriveItemInvite
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    @SuppressWarnings("unchecked")
    public DriveItemInviteCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DriveItemInviteCollectionResponse.class, (Class<BaseCollectionPage<Permission>>) (new BaseCollectionPage<Permission>(new java.util.ArrayList<Permission>(), null).getClass()));
        body = new DriveItemInviteBody();
    }


    public void post(final ICallback<? super BaseCollectionPage<Permission>> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(post(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public BaseCollectionPage<Permission> post() throws ClientException {
        final DriveItemInviteCollectionResponse response = post(body);
        return buildFromResponse(response);
    }


    public BaseCollectionPage<Permission> buildFromResponse(final DriveItemInviteCollectionResponse response) {
        final DriveItemInviteCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DriveItemInviteCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (Boolean) null, (java.util.List<String>) null, (Boolean) null, (String) null, (java.util.List<DriveRecipient>) null, (String) null, (String) null);
        } else {
            builder = null;
        }
        final BaseCollectionPage<Permission> page = new BaseCollectionPage<Permission>(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public DriveItemInviteCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public DriveItemInviteCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public DriveItemInviteCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public DriveItemInviteCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public DriveItemInviteCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return this;
    }

}
