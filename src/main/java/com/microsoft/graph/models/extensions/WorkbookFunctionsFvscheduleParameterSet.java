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
 * The class for the Workbook Functions Fvschedule Parameter Set.
 */
public class WorkbookFunctionsFvscheduleParameterSet {
    /**
     * The principal.
     * 
     */
    @SerializedName(value = "principal", alternate = {"Principal"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement principal;

    /**
     * The schedule.
     * 
     */
    @SerializedName(value = "schedule", alternate = {"Schedule"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement schedule;


    /**
     * Instiaciates a new WorkbookFunctionsFvscheduleParameterSet
     */
    public WorkbookFunctionsFvscheduleParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsFvscheduleParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsFvscheduleParameterSet(@Nonnull final WorkbookFunctionsFvscheduleParameterSetBuilder builder) {
        this.principal = builder.principal;
        this.schedule = builder.schedule;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsFvscheduleParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsFvscheduleParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsFvscheduleParameterSet
     */
    public static final class WorkbookFunctionsFvscheduleParameterSetBuilder {
        /**
         * The principal parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement principal;
        /**
         * Sets the Principal
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsFvscheduleParameterSetBuilder withPrincipal(@Nullable final com.google.gson.JsonElement val) {
            this.principal = val;
            return this;
        }
        /**
         * The schedule parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement schedule;
        /**
         * Sets the Schedule
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsFvscheduleParameterSetBuilder withSchedule(@Nullable final com.google.gson.JsonElement val) {
            this.schedule = val;
            return this;
        }
        @Nullable
        protected WorkbookFunctionsFvscheduleParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsFvscheduleParameterSet build() {
            return new WorkbookFunctionsFvscheduleParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.principal != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("principal", principal));
        }
        if(this.schedule != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("schedule", schedule));
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
