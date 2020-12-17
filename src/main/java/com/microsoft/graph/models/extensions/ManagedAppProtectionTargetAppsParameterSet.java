// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.ManagedMobileApp;
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
 * The class for the Managed App Protection Target Apps Parameter Set.
 */
public class ManagedAppProtectionTargetAppsParameterSet {
    /**
     * The apps.
     * 
     */
    @SerializedName(value = "apps", alternate = {"Apps"})
    @Expose
	@Nullable
    public java.util.List<ManagedMobileApp> apps;


    /**
     * Instiaciates a new ManagedAppProtectionTargetAppsParameterSet
     */
    public ManagedAppProtectionTargetAppsParameterSet() {}
    /**
     * Instiaciates a new ManagedAppProtectionTargetAppsParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ManagedAppProtectionTargetAppsParameterSet(@Nonnull final ManagedAppProtectionTargetAppsParameterSetBuilder builder) {
        this.apps = builder.apps;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ManagedAppProtectionTargetAppsParameterSetBuilder newBuilder() {
        return new ManagedAppProtectionTargetAppsParameterSetBuilder();
    }
    /**
     * Fluent builder for the ManagedAppProtectionTargetAppsParameterSet
     */
    public static final class ManagedAppProtectionTargetAppsParameterSetBuilder {
        /**
         * The apps parameter value
         */
        @Nullable
        protected java.util.List<ManagedMobileApp> apps;
        /**
         * Sets the Apps
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ManagedAppProtectionTargetAppsParameterSetBuilder withApps(@Nullable final java.util.List<ManagedMobileApp> val) {
            this.apps = val;
            return this;
        }
        @Nullable
        protected ManagedAppProtectionTargetAppsParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ManagedAppProtectionTargetAppsParameterSet build() {
            return new ManagedAppProtectionTargetAppsParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.apps != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("apps", apps));
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
