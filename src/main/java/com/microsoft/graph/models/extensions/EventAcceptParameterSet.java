// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;


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
 * The class for the Event Accept Parameter Set.
 */
public class EventAcceptParameterSet {
    /**
     * The comment.
     * 
     */
    @SerializedName(value = "comment", alternate = {"Comment"})
    @Expose
	@Nullable
    public String comment;

    /**
     * The send Response.
     * 
     */
    @SerializedName(value = "sendResponse", alternate = {"SendResponse"})
    @Expose
	@Nullable
    public Boolean sendResponse;


    /**
     * Instiaciates a new EventAcceptParameterSet
     */
    public EventAcceptParameterSet() {}
    /**
     * Instiaciates a new EventAcceptParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected EventAcceptParameterSet(@Nonnull final EventAcceptParameterSetBuilder builder) {
        this.comment = builder.comment;
        this.sendResponse = builder.sendResponse;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static EventAcceptParameterSetBuilder newBuilder() {
        return new EventAcceptParameterSetBuilder();
    }
    /**
     * Fluent builder for the EventAcceptParameterSet
     */
    public static final class EventAcceptParameterSetBuilder {
        /**
         * The comment parameter value
         */
        @Nullable
        protected String comment;
        /**
         * Sets the Comment
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public EventAcceptParameterSetBuilder withComment(@Nullable final String val) {
            this.comment = val;
            return this;
        }
        /**
         * The sendResponse parameter value
         */
        @Nullable
        protected Boolean sendResponse;
        /**
         * Sets the SendResponse
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public EventAcceptParameterSetBuilder withSendResponse(@Nullable final Boolean val) {
            this.sendResponse = val;
            return this;
        }
        @Nullable
        protected EventAcceptParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public EventAcceptParameterSet build() {
            return new EventAcceptParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.comment != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("comment", comment));
        }
        if(this.sendResponse != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("sendResponse", sendResponse));
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
