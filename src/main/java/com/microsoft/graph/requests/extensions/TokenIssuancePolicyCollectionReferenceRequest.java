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

import com.microsoft.graph.requests.extensions.TokenIssuancePolicyWithReferenceRequest;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.models.extensions.TokenIssuancePolicy;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.ReferenceRequestBody;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Token Issuance Policy Collection Reference Request.
 */
public class TokenIssuancePolicyCollectionReferenceRequest extends BaseCollectionWithReferencesRequest<TokenIssuancePolicy, TokenIssuancePolicyWithReferenceRequest, TokenIssuancePolicyReferenceRequestBuilder, TokenIssuancePolicyWithReferenceRequestBuilder, TokenIssuancePolicyCollectionResponse, TokenIssuancePolicyCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of TokenIssuancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    @SuppressWarnings("unchecked")
    public TokenIssuancePolicyCollectionReferenceRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TokenIssuancePolicyCollectionResponse.class, (Class<BaseCollectionPage<TokenIssuancePolicy>>) (new BaseCollectionPage<TokenIssuancePolicy>(new java.util.ArrayList<TokenIssuancePolicy>(), null).getClass()), TokenIssuancePolicyCollectionWithReferencesRequestBuilder.class);
    }

    public void post(final TokenIssuancePolicy newTokenIssuancePolicy, final ICallback<? super TokenIssuancePolicy> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/policies/tokenIssuancePolicies/" + newTokenIssuancePolicy.id);
        new TokenIssuancePolicyWithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newTokenIssuancePolicy, body, callback);
    }

    public TokenIssuancePolicy post(final TokenIssuancePolicy newTokenIssuancePolicy) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/policies/tokenIssuancePolicies/" + newTokenIssuancePolicy.id);
        return new TokenIssuancePolicyWithReferenceRequestBuilder(requestUrl,getBaseRequest().getClient(), /* Options */ null)
                .buildRequest(getBaseRequest().getHeaders())
                .post(newTokenIssuancePolicy, body);
    }
    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public TokenIssuancePolicyCollectionReferenceRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public TokenIssuancePolicyCollectionReferenceRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the sort clause
     * @return the updated request
     */
    public TokenIssuancePolicyCollectionReferenceRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public TokenIssuancePolicyCollectionReferenceRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public TokenIssuancePolicyCollectionReferenceRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return this;
    }
}
