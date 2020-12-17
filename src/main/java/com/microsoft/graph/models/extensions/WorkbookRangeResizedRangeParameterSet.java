// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.WorkbookRange;
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
 * The class for the Workbook Range Resized Range Parameter Set.
 */
public class WorkbookRangeResizedRangeParameterSet {
    /**
     * The delta Rows.
     * 
     */
    @SerializedName(value = "deltaRows", alternate = {"DeltaRows"})
    @Expose
	@Nullable
    public Integer deltaRows;

    /**
     * The delta Columns.
     * 
     */
    @SerializedName(value = "deltaColumns", alternate = {"DeltaColumns"})
    @Expose
	@Nullable
    public Integer deltaColumns;


    /**
     * Instiaciates a new WorkbookRangeResizedRangeParameterSet
     */
    public WorkbookRangeResizedRangeParameterSet() {}
    /**
     * Instiaciates a new WorkbookRangeResizedRangeParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookRangeResizedRangeParameterSet(@Nonnull final WorkbookRangeResizedRangeParameterSetBuilder builder) {
        this.deltaRows = builder.deltaRows;
        this.deltaColumns = builder.deltaColumns;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookRangeResizedRangeParameterSetBuilder newBuilder() {
        return new WorkbookRangeResizedRangeParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookRangeResizedRangeParameterSet
     */
    public static final class WorkbookRangeResizedRangeParameterSetBuilder {
        /**
         * The deltaRows parameter value
         */
        @Nullable
        protected Integer deltaRows;
        /**
         * Sets the DeltaRows
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookRangeResizedRangeParameterSetBuilder withDeltaRows(@Nullable final Integer val) {
            this.deltaRows = val;
            return this;
        }
        /**
         * The deltaColumns parameter value
         */
        @Nullable
        protected Integer deltaColumns;
        /**
         * Sets the DeltaColumns
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookRangeResizedRangeParameterSetBuilder withDeltaColumns(@Nullable final Integer val) {
            this.deltaColumns = val;
            return this;
        }
        @Nullable
        protected WorkbookRangeResizedRangeParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookRangeResizedRangeParameterSet build() {
            return new WorkbookRangeResizedRangeParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.deltaRows != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("deltaRows", deltaRows));
        }
        if(this.deltaColumns != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("deltaColumns", deltaColumns));
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
