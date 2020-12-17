// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Accr Int Parameter Set.
 */
public class WorkbookFunctionsAccrIntParameterSet {
    /**
     * The issue.
     * 
     */
    @SerializedName(value = "issue", alternate = {"Issue"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement issue;

    /**
     * The first Interest.
     * 
     */
    @SerializedName(value = "firstInterest", alternate = {"FirstInterest"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement firstInterest;

    /**
     * The settlement.
     * 
     */
    @SerializedName(value = "settlement", alternate = {"Settlement"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement settlement;

    /**
     * The rate.
     * 
     */
    @SerializedName(value = "rate", alternate = {"Rate"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement rate;

    /**
     * The par.
     * 
     */
    @SerializedName(value = "par", alternate = {"Par"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement par;

    /**
     * The frequency.
     * 
     */
    @SerializedName(value = "frequency", alternate = {"Frequency"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement frequency;

    /**
     * The basis.
     * 
     */
    @SerializedName(value = "basis", alternate = {"Basis"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement basis;

    /**
     * The calc Method.
     * 
     */
    @SerializedName(value = "calcMethod", alternate = {"CalcMethod"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement calcMethod;


    /**
     * Instiaciates a new WorkbookFunctionsAccrIntParameterSet
     */
    public WorkbookFunctionsAccrIntParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsAccrIntParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsAccrIntParameterSet(@Nonnull final WorkbookFunctionsAccrIntParameterSetBuilder builder) {
        this.issue = builder.issue;
        this.firstInterest = builder.firstInterest;
        this.settlement = builder.settlement;
        this.rate = builder.rate;
        this.par = builder.par;
        this.frequency = builder.frequency;
        this.basis = builder.basis;
        this.calcMethod = builder.calcMethod;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsAccrIntParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsAccrIntParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsAccrIntParameterSet
     */
    public static final class WorkbookFunctionsAccrIntParameterSetBuilder {
        /**
         * The issue parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement issue;
        /**
         * Sets the Issue
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsAccrIntParameterSetBuilder withIssue(@Nullable final com.google.gson.JsonElement val) {
            this.issue = val;
            return this;
        }
        /**
         * The firstInterest parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement firstInterest;
        /**
         * Sets the FirstInterest
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsAccrIntParameterSetBuilder withFirstInterest(@Nullable final com.google.gson.JsonElement val) {
            this.firstInterest = val;
            return this;
        }
        /**
         * The settlement parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement settlement;
        /**
         * Sets the Settlement
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsAccrIntParameterSetBuilder withSettlement(@Nullable final com.google.gson.JsonElement val) {
            this.settlement = val;
            return this;
        }
        /**
         * The rate parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement rate;
        /**
         * Sets the Rate
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsAccrIntParameterSetBuilder withRate(@Nullable final com.google.gson.JsonElement val) {
            this.rate = val;
            return this;
        }
        /**
         * The par parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement par;
        /**
         * Sets the Par
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsAccrIntParameterSetBuilder withPar(@Nullable final com.google.gson.JsonElement val) {
            this.par = val;
            return this;
        }
        /**
         * The frequency parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement frequency;
        /**
         * Sets the Frequency
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsAccrIntParameterSetBuilder withFrequency(@Nullable final com.google.gson.JsonElement val) {
            this.frequency = val;
            return this;
        }
        /**
         * The basis parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement basis;
        /**
         * Sets the Basis
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsAccrIntParameterSetBuilder withBasis(@Nullable final com.google.gson.JsonElement val) {
            this.basis = val;
            return this;
        }
        /**
         * The calcMethod parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement calcMethod;
        /**
         * Sets the CalcMethod
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsAccrIntParameterSetBuilder withCalcMethod(@Nullable final com.google.gson.JsonElement val) {
            this.calcMethod = val;
            return this;
        }
        @Nullable
        protected WorkbookFunctionsAccrIntParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsAccrIntParameterSet build() {
            return new WorkbookFunctionsAccrIntParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.issue != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("issue", issue));
        }
        if(this.firstInterest != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("firstInterest", firstInterest));
        }
        if(this.settlement != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("settlement", settlement));
        }
        if(this.rate != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("rate", rate));
        }
        if(this.par != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("par", par));
        }
        if(this.frequency != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("frequency", frequency));
        }
        if(this.basis != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("basis", basis));
        }
        if(this.calcMethod != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("calcMethod", calcMethod));
        }
        return result;
    }
    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
