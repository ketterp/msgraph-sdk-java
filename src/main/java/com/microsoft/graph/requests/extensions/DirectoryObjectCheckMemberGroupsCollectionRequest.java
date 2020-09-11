// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;

import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDirectoryObjectCheckMemberGroupsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCheckMemberGroupsCollectionPage;
import com.microsoft.graph.requests.extensions.DirectoryObjectCheckMemberGroupsCollectionResponse;
import com.microsoft.graph.models.extensions.DirectoryObjectCheckMemberGroupsBody;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Object Check Member Groups Collection Request.
 */
public class DirectoryObjectCheckMemberGroupsCollectionRequest extends BaseCollectionRequest<DirectoryObjectCheckMemberGroupsCollectionResponse, IDirectoryObjectCheckMemberGroupsCollectionPage> implements IDirectoryObjectCheckMemberGroupsCollectionRequest {


    protected final DirectoryObjectCheckMemberGroupsBody body;


    /**
     * The request for this DirectoryObjectCheckMemberGroups
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DirectoryObjectCheckMemberGroupsCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DirectoryObjectCheckMemberGroupsCollectionResponse.class, IDirectoryObjectCheckMemberGroupsCollectionPage.class);
        body = new DirectoryObjectCheckMemberGroupsBody();
    }


    public void post(final ICallback<IDirectoryObjectCheckMemberGroupsCollectionPage> callback) {
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

    public IDirectoryObjectCheckMemberGroupsCollectionPage post() throws ClientException {
        final DirectoryObjectCheckMemberGroupsCollectionResponse response = post(body);
        return buildFromResponse(response);
    }


    public IDirectoryObjectCheckMemberGroupsCollectionPage buildFromResponse(final DirectoryObjectCheckMemberGroupsCollectionResponse response) {
        final IDirectoryObjectCheckMemberGroupsCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DirectoryObjectCheckMemberGroupsCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (java.util.List<String>) null);
        } else {
            builder = null;
        }
        final IDirectoryObjectCheckMemberGroupsCollectionPage page = new DirectoryObjectCheckMemberGroupsCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDirectoryObjectCheckMemberGroupsCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IDirectoryObjectCheckMemberGroupsCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDirectoryObjectCheckMemberGroupsCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IDirectoryObjectCheckMemberGroupsCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDirectoryObjectCheckMemberGroupsCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IDirectoryObjectCheckMemberGroupsCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IDirectoryObjectCheckMemberGroupsCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IDirectoryObjectCheckMemberGroupsCollectionRequest)this;
    }

}
