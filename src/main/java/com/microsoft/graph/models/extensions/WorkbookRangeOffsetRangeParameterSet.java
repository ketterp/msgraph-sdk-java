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
 * The class for the Workbook Range Offset Range Parameter Set.
 */
public class WorkbookRangeOffsetRangeParameterSet {
    /**
     * The row Offset.
     * 
     */
    @SerializedName(value = "rowOffset", alternate = {"RowOffset"})
    @Expose
	@Nullable
    public Integer rowOffset;

    /**
     * The column Offset.
     * 
     */
    @SerializedName(value = "columnOffset", alternate = {"ColumnOffset"})
    @Expose
	@Nullable
    public Integer columnOffset;


    /**
     * Instiaciates a new WorkbookRangeOffsetRangeParameterSet
     */
    public WorkbookRangeOffsetRangeParameterSet() {}
    /**
     * Instiaciates a new WorkbookRangeOffsetRangeParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookRangeOffsetRangeParameterSet(@Nonnull final WorkbookRangeOffsetRangeParameterSetBuilder builder) {
        this.rowOffset = builder.rowOffset;
        this.columnOffset = builder.columnOffset;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookRangeOffsetRangeParameterSetBuilder newBuilder() {
        return new WorkbookRangeOffsetRangeParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookRangeOffsetRangeParameterSet
     */
    public static final class WorkbookRangeOffsetRangeParameterSetBuilder {
        /**
         * The rowOffset parameter value
         */
        @Nullable
        protected Integer rowOffset;
        /**
         * Sets the RowOffset
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookRangeOffsetRangeParameterSetBuilder withRowOffset(@Nullable final Integer val) {
            this.rowOffset = val;
            return this;
        }
        /**
         * The columnOffset parameter value
         */
        @Nullable
        protected Integer columnOffset;
        /**
         * Sets the ColumnOffset
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookRangeOffsetRangeParameterSetBuilder withColumnOffset(@Nullable final Integer val) {
            this.columnOffset = val;
            return this;
        }
        @Nullable
        protected WorkbookRangeOffsetRangeParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookRangeOffsetRangeParameterSet build() {
            return new WorkbookRangeOffsetRangeParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.rowOffset != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("rowOffset", rowOffset));
        }
        if(this.columnOffset != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("columnOffset", columnOffset));
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
