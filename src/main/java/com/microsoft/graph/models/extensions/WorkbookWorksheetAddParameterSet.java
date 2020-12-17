// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.WorkbookWorksheet;
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
 * The class for the Workbook Worksheet Add Parameter Set.
 */
public class WorkbookWorksheetAddParameterSet {
    /**
     * The name.
     * 
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;


    /**
     * Instiaciates a new WorkbookWorksheetAddParameterSet
     */
    public WorkbookWorksheetAddParameterSet() {}
    /**
     * Instiaciates a new WorkbookWorksheetAddParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookWorksheetAddParameterSet(@Nonnull final WorkbookWorksheetAddParameterSetBuilder builder) {
        this.name = builder.name;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookWorksheetAddParameterSetBuilder newBuilder() {
        return new WorkbookWorksheetAddParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookWorksheetAddParameterSet
     */
    public static final class WorkbookWorksheetAddParameterSetBuilder {
        /**
         * The name parameter value
         */
        @Nullable
        protected String name;
        /**
         * Sets the Name
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookWorksheetAddParameterSetBuilder withName(@Nullable final String val) {
            this.name = val;
            return this;
        }
        @Nullable
        protected WorkbookWorksheetAddParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookWorksheetAddParameterSet build() {
            return new WorkbookWorksheetAddParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.name != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("name", name));
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
