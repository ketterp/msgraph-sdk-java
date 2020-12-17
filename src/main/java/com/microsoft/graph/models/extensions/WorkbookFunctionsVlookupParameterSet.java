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
 * The class for the Workbook Functions Vlookup Parameter Set.
 */
public class WorkbookFunctionsVlookupParameterSet {
    /**
     * The lookup Value.
     * 
     */
    @SerializedName(value = "lookupValue", alternate = {"LookupValue"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement lookupValue;

    /**
     * The table Array.
     * 
     */
    @SerializedName(value = "tableArray", alternate = {"TableArray"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement tableArray;

    /**
     * The col Index Num.
     * 
     */
    @SerializedName(value = "colIndexNum", alternate = {"ColIndexNum"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement colIndexNum;

    /**
     * The range Lookup.
     * 
     */
    @SerializedName(value = "rangeLookup", alternate = {"RangeLookup"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement rangeLookup;


    /**
     * Instiaciates a new WorkbookFunctionsVlookupParameterSet
     */
    public WorkbookFunctionsVlookupParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsVlookupParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsVlookupParameterSet(@Nonnull final WorkbookFunctionsVlookupParameterSetBuilder builder) {
        this.lookupValue = builder.lookupValue;
        this.tableArray = builder.tableArray;
        this.colIndexNum = builder.colIndexNum;
        this.rangeLookup = builder.rangeLookup;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsVlookupParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsVlookupParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsVlookupParameterSet
     */
    public static final class WorkbookFunctionsVlookupParameterSetBuilder {
        /**
         * The lookupValue parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement lookupValue;
        /**
         * Sets the LookupValue
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsVlookupParameterSetBuilder withLookupValue(@Nullable final com.google.gson.JsonElement val) {
            this.lookupValue = val;
            return this;
        }
        /**
         * The tableArray parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement tableArray;
        /**
         * Sets the TableArray
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsVlookupParameterSetBuilder withTableArray(@Nullable final com.google.gson.JsonElement val) {
            this.tableArray = val;
            return this;
        }
        /**
         * The colIndexNum parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement colIndexNum;
        /**
         * Sets the ColIndexNum
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsVlookupParameterSetBuilder withColIndexNum(@Nullable final com.google.gson.JsonElement val) {
            this.colIndexNum = val;
            return this;
        }
        /**
         * The rangeLookup parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement rangeLookup;
        /**
         * Sets the RangeLookup
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsVlookupParameterSetBuilder withRangeLookup(@Nullable final com.google.gson.JsonElement val) {
            this.rangeLookup = val;
            return this;
        }
        @Nullable
        protected WorkbookFunctionsVlookupParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsVlookupParameterSet build() {
            return new WorkbookFunctionsVlookupParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.lookupValue != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("lookupValue", lookupValue));
        }
        if(this.tableArray != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("tableArray", tableArray));
        }
        if(this.colIndexNum != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("colIndexNum", colIndexNum));
        }
        if(this.rangeLookup != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("rangeLookup", rangeLookup));
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
