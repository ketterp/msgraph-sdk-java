// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ConditionalAccessRoot;
import com.microsoft.graph.requests.extensions.INamedLocationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.INamedLocationRequestBuilder;
import com.microsoft.graph.requests.extensions.IConditionalAccessPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConditionalAccessPolicyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Conditional Access Root Request Builder.
 */
public interface IConditionalAccessRootRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IConditionalAccessRootRequest instance
     */
    IConditionalAccessRootRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IConditionalAccessRootRequest instance
     */
    IConditionalAccessRootRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    INamedLocationCollectionRequestBuilder namedLocations();

    INamedLocationRequestBuilder namedLocations(final String id);

    IConditionalAccessPolicyCollectionRequestBuilder policies();

    IConditionalAccessPolicyRequestBuilder policies(final String id);

}