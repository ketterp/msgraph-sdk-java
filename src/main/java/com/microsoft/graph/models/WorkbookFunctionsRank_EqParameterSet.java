// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.WorkbookFunctionResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Rank_Eq Parameter Set.
 */
public class WorkbookFunctionsRank_EqParameterSet {
    /**
     * The number.
     * 
     */
    @SerializedName(value = "number", alternate = {"Number"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement number;

    /**
     * The ref.
     * 
     */
    @SerializedName(value = "ref", alternate = {"Ref"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement ref;

    /**
     * The order.
     * 
     */
    @SerializedName(value = "order", alternate = {"Order"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement order;


    /**
     * Instiaciates a new WorkbookFunctionsRank_EqParameterSet
     */
    public WorkbookFunctionsRank_EqParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsRank_EqParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsRank_EqParameterSet(@Nonnull final WorkbookFunctionsRank_EqParameterSetBuilder builder) {
        this.number = builder.number;
        this.ref = builder.ref;
        this.order = builder.order;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsRank_EqParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsRank_EqParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsRank_EqParameterSet
     */
    public static final class WorkbookFunctionsRank_EqParameterSetBuilder {
        /**
         * The number parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement number;
        /**
         * Sets the Number
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsRank_EqParameterSetBuilder withNumber(@Nullable final com.google.gson.JsonElement val) {
            this.number = val;
            return this;
        }
        /**
         * The ref parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement ref;
        /**
         * Sets the Ref
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsRank_EqParameterSetBuilder withRef(@Nullable final com.google.gson.JsonElement val) {
            this.ref = val;
            return this;
        }
        /**
         * The order parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement order;
        /**
         * Sets the Order
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsRank_EqParameterSetBuilder withOrder(@Nullable final com.google.gson.JsonElement val) {
            this.order = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsRank_EqParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsRank_EqParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsRank_EqParameterSet build() {
            return new WorkbookFunctionsRank_EqParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.number != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("number", number));
        }
        if(this.ref != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("ref", ref));
        }
        if(this.order != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("order", order));
        }
        return result;
    }
}
