// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.ManagedAppRegistration;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.ManagedAppRegistration;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationWithReferenceRequest;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Registration Collection With References Request.
 */
public class ManagedAppRegistrationCollectionWithReferencesRequest extends BaseCollectionWithReferencesRequest<ManagedAppRegistration, ManagedAppRegistrationWithReferenceRequest, ManagedAppRegistrationReferenceRequestBuilder, ManagedAppRegistrationWithReferenceRequestBuilder, ManagedAppRegistrationCollectionResponse, ManagedAppRegistrationCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of ManagedAppRegistration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    @SuppressWarnings("unchecked")
    public ManagedAppRegistrationCollectionWithReferencesRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedAppRegistrationCollectionResponse.class, (Class<BaseCollectionPage<ManagedAppRegistration>>) (new BaseCollectionPage<ManagedAppRegistration>(new java.util.ArrayList<ManagedAppRegistration>(), null).getClass()), ManagedAppRegistrationCollectionWithReferencesRequestBuilder.class);
    }

    public void get(final ICallback<? super BaseCollectionPage<ManagedAppRegistration>> callback) {
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

    public BaseCollectionPage<ManagedAppRegistration> get() throws ClientException {
        final ManagedAppRegistrationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public ManagedAppRegistrationCollectionWithReferencesRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return this;
    }

    public ManagedAppRegistrationCollectionWithReferencesRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return this;
    }

    public ManagedAppRegistrationCollectionWithReferencesRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return this;
    }

    public ManagedAppRegistrationCollectionWithReferencesRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return this;
    }

    public ManagedAppRegistrationCollectionWithReferencesRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return this;
    }

    public BaseCollectionPage<ManagedAppRegistration> buildFromResponse(final ManagedAppRegistrationCollectionResponse response) {
        final ManagedAppRegistrationCollectionWithReferencesRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ManagedAppRegistrationCollectionWithReferencesRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final BaseCollectionPage<ManagedAppRegistration> page = new BaseCollectionPage<ManagedAppRegistration>(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
