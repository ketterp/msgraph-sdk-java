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
 * The class for the Workbook Functions Decimal Parameter Set.
 */
public class WorkbookFunctionsDecimalParameterSet {
    /**
     * The number.
     * 
     */
    @SerializedName(value = "number", alternate = {"Number"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement number;

    /**
     * The radix.
     * 
     */
    @SerializedName(value = "radix", alternate = {"Radix"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement radix;


    /**
     * Instiaciates a new WorkbookFunctionsDecimalParameterSet
     */
    public WorkbookFunctionsDecimalParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsDecimalParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsDecimalParameterSet(@Nonnull final WorkbookFunctionsDecimalParameterSetBuilder builder) {
        this.number = builder.number;
        this.radix = builder.radix;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsDecimalParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsDecimalParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsDecimalParameterSet
     */
    public static final class WorkbookFunctionsDecimalParameterSetBuilder {
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
        public WorkbookFunctionsDecimalParameterSetBuilder withNumber(@Nullable final com.google.gson.JsonElement val) {
            this.number = val;
            return this;
        }
        /**
         * The radix parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement radix;
        /**
         * Sets the Radix
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDecimalParameterSetBuilder withRadix(@Nullable final com.google.gson.JsonElement val) {
            this.radix = val;
            return this;
        }
        @Nullable
        protected WorkbookFunctionsDecimalParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsDecimalParameterSet build() {
            return new WorkbookFunctionsDecimalParameterSet(this);
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
        if(this.radix != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("radix", radix));
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
