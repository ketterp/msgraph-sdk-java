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
 * The class for the Workbook Functions Standardize Parameter Set.
 */
public class WorkbookFunctionsStandardizeParameterSet {
    /**
     * The x.
     * 
     */
    @SerializedName(value = "x", alternate = {"X"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement x;

    /**
     * The mean.
     * 
     */
    @SerializedName(value = "mean", alternate = {"Mean"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement mean;

    /**
     * The standard Dev.
     * 
     */
    @SerializedName(value = "standardDev", alternate = {"StandardDev"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement standardDev;


    /**
     * Instiaciates a new WorkbookFunctionsStandardizeParameterSet
     */
    public WorkbookFunctionsStandardizeParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsStandardizeParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsStandardizeParameterSet(@Nonnull final WorkbookFunctionsStandardizeParameterSetBuilder builder) {
        this.x = builder.x;
        this.mean = builder.mean;
        this.standardDev = builder.standardDev;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsStandardizeParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsStandardizeParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsStandardizeParameterSet
     */
    public static final class WorkbookFunctionsStandardizeParameterSetBuilder {
        /**
         * The x parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement x;
        /**
         * Sets the X
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsStandardizeParameterSetBuilder withX(@Nullable final com.google.gson.JsonElement val) {
            this.x = val;
            return this;
        }
        /**
         * The mean parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement mean;
        /**
         * Sets the Mean
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsStandardizeParameterSetBuilder withMean(@Nullable final com.google.gson.JsonElement val) {
            this.mean = val;
            return this;
        }
        /**
         * The standardDev parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement standardDev;
        /**
         * Sets the StandardDev
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsStandardizeParameterSetBuilder withStandardDev(@Nullable final com.google.gson.JsonElement val) {
            this.standardDev = val;
            return this;
        }
        @Nullable
        protected WorkbookFunctionsStandardizeParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsStandardizeParameterSet build() {
            return new WorkbookFunctionsStandardizeParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.x != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("x", x));
        }
        if(this.mean != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("mean", mean));
        }
        if(this.standardDev != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("standardDev", standardDev));
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
