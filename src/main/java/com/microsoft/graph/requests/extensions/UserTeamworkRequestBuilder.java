// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserTeamwork;
import com.microsoft.graph.requests.extensions.IUserScopeTeamsAppInstallationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserScopeTeamsAppInstallationRequestBuilder;
import com.microsoft.graph.requests.extensions.UserScopeTeamsAppInstallationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserScopeTeamsAppInstallationRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Teamwork Request Builder.
 */
public class UserTeamworkRequestBuilder extends BaseRequestBuilder implements IUserTeamworkRequestBuilder {

    /**
     * The request builder for the UserTeamwork
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserTeamworkRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserTeamworkRequest instance
     */
    public IUserTeamworkRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IUserTeamworkRequest instance
     */
    public IUserTeamworkRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.UserTeamworkRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IUserScopeTeamsAppInstallationCollectionRequestBuilder installedApps() {
        return new UserScopeTeamsAppInstallationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("installedApps"), getClient(), null);
    }

    public IUserScopeTeamsAppInstallationRequestBuilder installedApps(final String id) {
        return new UserScopeTeamsAppInstallationRequestBuilder(getRequestUrlWithAdditionalSegment("installedApps") + "/" + id, getClient(), null);
    }
}
