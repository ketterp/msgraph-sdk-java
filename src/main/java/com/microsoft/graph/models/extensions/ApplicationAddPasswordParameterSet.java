// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.PasswordCredential;
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
 * The class for the Application Add Password Parameter Set.
 */
public class ApplicationAddPasswordParameterSet {
    /**
     * The password Credential.
     * 
     */
    @SerializedName(value = "passwordCredential", alternate = {"PasswordCredential"})
    @Expose
	@Nullable
    public PasswordCredential passwordCredential;


    /**
     * Instiaciates a new ApplicationAddPasswordParameterSet
     */
    public ApplicationAddPasswordParameterSet() {}
    /**
     * Instiaciates a new ApplicationAddPasswordParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ApplicationAddPasswordParameterSet(@Nonnull final ApplicationAddPasswordParameterSetBuilder builder) {
        this.passwordCredential = builder.passwordCredential;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ApplicationAddPasswordParameterSetBuilder newBuilder() {
        return new ApplicationAddPasswordParameterSetBuilder();
    }
    /**
     * Fluent builder for the ApplicationAddPasswordParameterSet
     */
    public static final class ApplicationAddPasswordParameterSetBuilder {
        /**
         * The passwordCredential parameter value
         */
        @Nullable
        protected PasswordCredential passwordCredential;
        /**
         * Sets the PasswordCredential
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ApplicationAddPasswordParameterSetBuilder withPasswordCredential(@Nullable final PasswordCredential val) {
            this.passwordCredential = val;
            return this;
        }
        @Nullable
        protected ApplicationAddPasswordParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ApplicationAddPasswordParameterSet build() {
            return new ApplicationAddPasswordParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.passwordCredential != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("passwordCredential", passwordCredential));
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
