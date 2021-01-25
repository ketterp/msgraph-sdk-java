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
 * The class for the Workbook Functions Rows Parameter Set.
 */
public class WorkbookFunctionsRowsParameterSet {
    /**
     * The array.
     * 
     */
    @SerializedName(value = "array", alternate = {"Array"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement array;


    /**
     * Instiaciates a new WorkbookFunctionsRowsParameterSet
     */
    public WorkbookFunctionsRowsParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsRowsParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsRowsParameterSet(@Nonnull final WorkbookFunctionsRowsParameterSetBuilder builder) {
        this.array = builder.array;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsRowsParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsRowsParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsRowsParameterSet
     */
    public static final class WorkbookFunctionsRowsParameterSetBuilder {
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
        public WorkbookFunctionsRowsParameterSetBuilder withArray(@Nullable final com.google.gson.JsonElement val) {
            this.array = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsRowsParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsRowsParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsRowsParameterSet build() {
            return new WorkbookFunctionsRowsParameterSet(this);
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
        return result;
    }
}
