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
 * The class for the Workbook Functions Ispmt Parameter Set.
 */
public class WorkbookFunctionsIspmtParameterSet {
    /**
     * The rate.
     * 
     */
    @SerializedName(value = "rate", alternate = {"Rate"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement rate;

    /**
     * The per.
     * 
     */
    @SerializedName(value = "per", alternate = {"Per"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement per;

    /**
     * The nper.
     * 
     */
    @SerializedName(value = "nper", alternate = {"Nper"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement nper;

    /**
     * The pv.
     * 
     */
    @SerializedName(value = "pv", alternate = {"Pv"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement pv;


    /**
     * Instiaciates a new WorkbookFunctionsIspmtParameterSet
     */
    public WorkbookFunctionsIspmtParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsIspmtParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsIspmtParameterSet(@Nonnull final WorkbookFunctionsIspmtParameterSetBuilder builder) {
        this.rate = builder.rate;
        this.per = builder.per;
        this.nper = builder.nper;
        this.pv = builder.pv;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsIspmtParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsIspmtParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsIspmtParameterSet
     */
    public static final class WorkbookFunctionsIspmtParameterSetBuilder {
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
        public WorkbookFunctionsIspmtParameterSetBuilder withRate(@Nullable final com.google.gson.JsonElement val) {
            this.rate = val;
            return this;
        }
        /**
         * The per parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement per;
        /**
         * Sets the Per
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsIspmtParameterSetBuilder withPer(@Nullable final com.google.gson.JsonElement val) {
            this.per = val;
            return this;
        }
        /**
         * The nper parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement nper;
        /**
         * Sets the Nper
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsIspmtParameterSetBuilder withNper(@Nullable final com.google.gson.JsonElement val) {
            this.nper = val;
            return this;
        }
        /**
         * The pv parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement pv;
        /**
         * Sets the Pv
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsIspmtParameterSetBuilder withPv(@Nullable final com.google.gson.JsonElement val) {
            this.pv = val;
            return this;
        }
        @Nullable
        protected WorkbookFunctionsIspmtParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsIspmtParameterSet build() {
            return new WorkbookFunctionsIspmtParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.rate != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("rate", rate));
        }
        if(this.per != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("per", per));
        }
        if(this.nper != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("nper", nper));
        }
        if(this.pv != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("pv", pv));
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
