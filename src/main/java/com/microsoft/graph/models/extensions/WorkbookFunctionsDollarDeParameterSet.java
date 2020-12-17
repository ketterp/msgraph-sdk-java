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
 * The class for the Workbook Functions Dollar De Parameter Set.
 */
public class WorkbookFunctionsDollarDeParameterSet {
    /**
     * The fractional Dollar.
     * 
     */
    @SerializedName(value = "fractionalDollar", alternate = {"FractionalDollar"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement fractionalDollar;

    /**
     * The fraction.
     * 
     */
    @SerializedName(value = "fraction", alternate = {"Fraction"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement fraction;


    /**
     * Instiaciates a new WorkbookFunctionsDollarDeParameterSet
     */
    public WorkbookFunctionsDollarDeParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsDollarDeParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsDollarDeParameterSet(@Nonnull final WorkbookFunctionsDollarDeParameterSetBuilder builder) {
        this.fractionalDollar = builder.fractionalDollar;
        this.fraction = builder.fraction;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsDollarDeParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsDollarDeParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsDollarDeParameterSet
     */
    public static final class WorkbookFunctionsDollarDeParameterSetBuilder {
        /**
         * The fractionalDollar parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement fractionalDollar;
        /**
         * Sets the FractionalDollar
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDollarDeParameterSetBuilder withFractionalDollar(@Nullable final com.google.gson.JsonElement val) {
            this.fractionalDollar = val;
            return this;
        }
        /**
         * The fraction parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement fraction;
        /**
         * Sets the Fraction
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDollarDeParameterSetBuilder withFraction(@Nullable final com.google.gson.JsonElement val) {
            this.fraction = val;
            return this;
        }
        @Nullable
        protected WorkbookFunctionsDollarDeParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsDollarDeParameterSet build() {
            return new WorkbookFunctionsDollarDeParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.fractionalDollar != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("fractionalDollar", fractionalDollar));
        }
        if(this.fraction != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("fraction", fraction));
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
