// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessOrganizerActivityCountsRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessOrganizerActivityCountsRequest;
import com.microsoft.graph.models.extensions.Report;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Skype For Business Organizer Activity Counts Request Builder.
 */
public class ReportRootGetSkypeForBusinessOrganizerActivityCountsRequestBuilder extends BaseFunctionRequestBuilder implements IReportRootGetSkypeForBusinessOrganizerActivityCountsRequestBuilder {

    /**
     * The request builder for this ReportRootGetSkypeForBusinessOrganizerActivityCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public ReportRootGetSkypeForBusinessOrganizerActivityCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetSkypeForBusinessOrganizerActivityCountsRequest
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSkypeForBusinessOrganizerActivityCountsRequest instance
     */
    public IReportRootGetSkypeForBusinessOrganizerActivityCountsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IReportRootGetSkypeForBusinessOrganizerActivityCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSkypeForBusinessOrganizerActivityCountsRequest instance
     */
    public IReportRootGetSkypeForBusinessOrganizerActivityCountsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ReportRootGetSkypeForBusinessOrganizerActivityCountsRequest request = new ReportRootGetSkypeForBusinessOrganizerActivityCountsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
