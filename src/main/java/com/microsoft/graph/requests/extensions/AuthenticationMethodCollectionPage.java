// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AuthenticationMethod;
import com.microsoft.graph.requests.extensions.IAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.AuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.extensions.AuthenticationMethodCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication Method Collection Page.
 */
public class AuthenticationMethodCollectionPage extends BaseCollectionPage<AuthenticationMethod, IAuthenticationMethodCollectionRequestBuilder> implements IAuthenticationMethodCollectionPage {

    /**
     * A collection page for AuthenticationMethod
     *
     * @param response the serialized AuthenticationMethodCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AuthenticationMethodCollectionPage(final AuthenticationMethodCollectionResponse response, final IAuthenticationMethodCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
