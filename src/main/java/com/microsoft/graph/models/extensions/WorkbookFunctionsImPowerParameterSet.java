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
 * The class for the Workbook Functions Im Power Parameter Set.
 */
public class WorkbookFunctionsImPowerParameterSet {
    /**
     * The inumber.
     * 
     */
    @SerializedName(value = "inumber", alternate = {"Inumber"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement inumber;

    /**
     * The number.
     * 
     */
    @SerializedName(value = "number", alternate = {"Number"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement number;


    /**
     * Instiaciates a new WorkbookFunctionsImPowerParameterSet
     */
    public WorkbookFunctionsImPowerParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsImPowerParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsImPowerParameterSet(@Nonnull final WorkbookFunctionsImPowerParameterSetBuilder builder) {
        this.inumber = builder.inumber;
        this.number = builder.number;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsImPowerParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsImPowerParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsImPowerParameterSet
     */
    public static final class WorkbookFunctionsImPowerParameterSetBuilder {
        /**
         * The inumber parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement inumber;
        /**
         * Sets the Inumber
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsImPowerParameterSetBuilder withInumber(@Nullable final com.google.gson.JsonElement val) {
            this.inumber = val;
            return this;
        }
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
        public WorkbookFunctionsImPowerParameterSetBuilder withNumber(@Nullable final com.google.gson.JsonElement val) {
            this.number = val;
            return this;
        }
        @Nullable
        protected WorkbookFunctionsImPowerParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsImPowerParameterSet build() {
            return new WorkbookFunctionsImPowerParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.inumber != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("inumber", inumber));
        }
        if(this.number != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("number", number));
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
