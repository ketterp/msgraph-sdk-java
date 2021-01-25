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
 * The class for the Workbook Functions Complex Parameter Set.
 */
public class WorkbookFunctionsComplexParameterSet {
    /**
     * The real Num.
     * 
     */
    @SerializedName(value = "realNum", alternate = {"RealNum"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement realNum;

    /**
     * The i Num.
     * 
     */
    @SerializedName(value = "iNum", alternate = {"INum"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement iNum;

    /**
     * The suffix.
     * 
     */
    @SerializedName(value = "suffix", alternate = {"Suffix"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement suffix;


    /**
     * Instiaciates a new WorkbookFunctionsComplexParameterSet
     */
    public WorkbookFunctionsComplexParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsComplexParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsComplexParameterSet(@Nonnull final WorkbookFunctionsComplexParameterSetBuilder builder) {
        this.realNum = builder.realNum;
        this.iNum = builder.iNum;
        this.suffix = builder.suffix;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsComplexParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsComplexParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsComplexParameterSet
     */
    public static final class WorkbookFunctionsComplexParameterSetBuilder {
        /**
         * The realNum parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement realNum;
        /**
         * Sets the RealNum
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsComplexParameterSetBuilder withRealNum(@Nullable final com.google.gson.JsonElement val) {
            this.realNum = val;
            return this;
        }
        /**
         * The iNum parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement iNum;
        /**
         * Sets the INum
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsComplexParameterSetBuilder withINum(@Nullable final com.google.gson.JsonElement val) {
            this.iNum = val;
            return this;
        }
        /**
         * The suffix parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement suffix;
        /**
         * Sets the Suffix
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsComplexParameterSetBuilder withSuffix(@Nullable final com.google.gson.JsonElement val) {
            this.suffix = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsComplexParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsComplexParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsComplexParameterSet build() {
            return new WorkbookFunctionsComplexParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.realNum != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("realNum", realNum));
        }
        if(this.iNum != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("iNum", iNum));
        }
        if(this.suffix != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("suffix", suffix));
        }
        return result;
    }
}
