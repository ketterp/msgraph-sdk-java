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
 * The class for the Workbook Functions Quartile_Exc Parameter Set.
 */
public class WorkbookFunctionsQuartile_ExcParameterSet {
    /**
     * The array.
     * 
     */
    @SerializedName(value = "array", alternate = {"Array"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement array;

    /**
     * The quart.
     * 
     */
    @SerializedName(value = "quart", alternate = {"Quart"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement quart;


    /**
     * Instiaciates a new WorkbookFunctionsQuartile_ExcParameterSet
     */
    public WorkbookFunctionsQuartile_ExcParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsQuartile_ExcParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsQuartile_ExcParameterSet(@Nonnull final WorkbookFunctionsQuartile_ExcParameterSetBuilder builder) {
        this.array = builder.array;
        this.quart = builder.quart;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsQuartile_ExcParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsQuartile_ExcParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsQuartile_ExcParameterSet
     */
    public static final class WorkbookFunctionsQuartile_ExcParameterSetBuilder {
        /**
         * The array parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement array;
        /**
         * Sets the Array
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsQuartile_ExcParameterSetBuilder withArray(@Nullable final com.google.gson.JsonElement val) {
            this.array = val;
            return this;
        }
        /**
         * The quart parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement quart;
        /**
         * Sets the Quart
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsQuartile_ExcParameterSetBuilder withQuart(@Nullable final com.google.gson.JsonElement val) {
            this.quart = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsQuartile_ExcParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsQuartile_ExcParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsQuartile_ExcParameterSet build() {
            return new WorkbookFunctionsQuartile_ExcParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.array != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("array", array));
        }
        if(this.quart != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("quart", quart));
        }
        return result;
    }
}
