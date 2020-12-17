// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.Message;
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
 * The class for the User Send Mail Parameter Set.
 */
public class UserSendMailParameterSet {
    /**
     * The message.
     * 
     */
    @SerializedName(value = "message", alternate = {"Message"})
    @Expose
	@Nullable
    public Message message;

    /**
     * The save To Sent Items.
     * 
     */
    @SerializedName(value = "saveToSentItems", alternate = {"SaveToSentItems"})
    @Expose
	@Nullable
    public Boolean saveToSentItems;


    /**
     * Instiaciates a new UserSendMailParameterSet
     */
    public UserSendMailParameterSet() {}
    /**
     * Instiaciates a new UserSendMailParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected UserSendMailParameterSet(@Nonnull final UserSendMailParameterSetBuilder builder) {
        this.message = builder.message;
        this.saveToSentItems = builder.saveToSentItems;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static UserSendMailParameterSetBuilder newBuilder() {
        return new UserSendMailParameterSetBuilder();
    }
    /**
     * Fluent builder for the UserSendMailParameterSet
     */
    public static final class UserSendMailParameterSetBuilder {
        /**
         * The message parameter value
         */
        @Nullable
        protected Message message;
        /**
         * Sets the Message
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public UserSendMailParameterSetBuilder withMessage(@Nullable final Message val) {
            this.message = val;
            return this;
        }
        /**
         * The saveToSentItems parameter value
         */
        @Nullable
        protected Boolean saveToSentItems;
        /**
         * Sets the SaveToSentItems
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public UserSendMailParameterSetBuilder withSaveToSentItems(@Nullable final Boolean val) {
            this.saveToSentItems = val;
            return this;
        }
        @Nullable
        protected UserSendMailParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public UserSendMailParameterSet build() {
            return new UserSendMailParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.message != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("message", message));
        }
        if(this.saveToSentItems != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("saveToSentItems", saveToSentItems));
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
