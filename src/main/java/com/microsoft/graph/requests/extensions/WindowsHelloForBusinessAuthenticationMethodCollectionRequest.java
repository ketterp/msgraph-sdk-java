// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Authentication;
import com.microsoft.graph.models.extensions.WindowsHelloForBusinessAuthenticationMethod;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IWindowsHelloForBusinessAuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsHelloForBusinessAuthenticationMethodCollectionResponse;
import com.microsoft.graph.requests.extensions.IWindowsHelloForBusinessAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsHelloForBusinessAuthenticationMethodCollectionRequest;
import com.microsoft.graph.requests.extensions.WindowsHelloForBusinessAuthenticationMethodCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Hello For Business Authentication Method Collection Request.
 */
public class WindowsHelloForBusinessAuthenticationMethodCollectionRequest extends BaseCollectionRequest<WindowsHelloForBusinessAuthenticationMethodCollectionResponse, IWindowsHelloForBusinessAuthenticationMethodCollectionPage> implements IWindowsHelloForBusinessAuthenticationMethodCollectionRequest {

    /**
     * The request builder for this collection of WindowsHelloForBusinessAuthenticationMethod
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsHelloForBusinessAuthenticationMethodCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsHelloForBusinessAuthenticationMethodCollectionResponse.class, IWindowsHelloForBusinessAuthenticationMethodCollectionPage.class);
    }

    public void get(final ICallback<? super IWindowsHelloForBusinessAuthenticationMethodCollectionPage> callback) {
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

    public IWindowsHelloForBusinessAuthenticationMethodCollectionPage get() throws ClientException {
        final WindowsHelloForBusinessAuthenticationMethodCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final WindowsHelloForBusinessAuthenticationMethod newWindowsHelloForBusinessAuthenticationMethod, final ICallback<? super WindowsHelloForBusinessAuthenticationMethod> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new WindowsHelloForBusinessAuthenticationMethodRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newWindowsHelloForBusinessAuthenticationMethod, callback);
    }

    public WindowsHelloForBusinessAuthenticationMethod post(final WindowsHelloForBusinessAuthenticationMethod newWindowsHelloForBusinessAuthenticationMethod) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new WindowsHelloForBusinessAuthenticationMethodRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newWindowsHelloForBusinessAuthenticationMethod);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWindowsHelloForBusinessAuthenticationMethodCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WindowsHelloForBusinessAuthenticationMethodCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IWindowsHelloForBusinessAuthenticationMethodCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (WindowsHelloForBusinessAuthenticationMethodCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IWindowsHelloForBusinessAuthenticationMethodCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (WindowsHelloForBusinessAuthenticationMethodCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWindowsHelloForBusinessAuthenticationMethodCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (WindowsHelloForBusinessAuthenticationMethodCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IWindowsHelloForBusinessAuthenticationMethodCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (WindowsHelloForBusinessAuthenticationMethodCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IWindowsHelloForBusinessAuthenticationMethodCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (WindowsHelloForBusinessAuthenticationMethodCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IWindowsHelloForBusinessAuthenticationMethodCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IWindowsHelloForBusinessAuthenticationMethodCollectionRequest)this;
    }
    public IWindowsHelloForBusinessAuthenticationMethodCollectionPage buildFromResponse(final WindowsHelloForBusinessAuthenticationMethodCollectionResponse response) {
        final IWindowsHelloForBusinessAuthenticationMethodCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new WindowsHelloForBusinessAuthenticationMethodCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final WindowsHelloForBusinessAuthenticationMethodCollectionPage page = new WindowsHelloForBusinessAuthenticationMethodCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
