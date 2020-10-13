// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.TokenIssuancePolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.TokenIssuancePolicy;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyWithReferenceRequest;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Token Issuance Policy Collection With References Request.
 */
public class TokenIssuancePolicyCollectionWithReferencesRequest extends BaseCollectionWithReferencesRequest<TokenIssuancePolicy, TokenIssuancePolicyWithReferenceRequest, TokenIssuancePolicyReferenceRequestBuilder, TokenIssuancePolicyWithReferenceRequestBuilder, TokenIssuancePolicyCollectionResponse, TokenIssuancePolicyCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of TokenIssuancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    @SuppressWarnings("unchecked")
    public TokenIssuancePolicyCollectionWithReferencesRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TokenIssuancePolicyCollectionResponse.class, (Class<BaseCollectionPage<TokenIssuancePolicy>>) (new BaseCollectionPage<TokenIssuancePolicy>(new java.util.ArrayList<TokenIssuancePolicy>(), null).getClass()), TokenIssuancePolicyCollectionWithReferencesRequestBuilder.class);
    }

    public void get(final ICallback<? super BaseCollectionPage<TokenIssuancePolicy>> callback) {
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

    public BaseCollectionPage<TokenIssuancePolicy> get() throws ClientException {
        final TokenIssuancePolicyCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public TokenIssuancePolicyCollectionWithReferencesRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return this;
    }

    public TokenIssuancePolicyCollectionWithReferencesRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return this;
    }

    public TokenIssuancePolicyCollectionWithReferencesRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return this;
    }

    public TokenIssuancePolicyCollectionWithReferencesRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return this;
    }

    public TokenIssuancePolicyCollectionWithReferencesRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return this;
    }

    public BaseCollectionPage<TokenIssuancePolicy> buildFromResponse(final TokenIssuancePolicyCollectionResponse response) {
        final TokenIssuancePolicyCollectionWithReferencesRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new TokenIssuancePolicyCollectionWithReferencesRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final BaseCollectionPage<TokenIssuancePolicy> page = new BaseCollectionPage<TokenIssuancePolicy>(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
