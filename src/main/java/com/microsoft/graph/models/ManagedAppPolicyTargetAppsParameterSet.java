// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.ManagedMobileApp;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Policy Target Apps Parameter Set.
 */
public class ManagedAppPolicyTargetAppsParameterSet {
    /**
     * The apps.
     * 
     */
    @SerializedName(value = "apps", alternate = {"Apps"})
    @Expose
	@Nullable
    public java.util.List<ManagedMobileApp> apps;


    /**
     * Instiaciates a new ManagedAppPolicyTargetAppsParameterSet
     */
    public ManagedAppPolicyTargetAppsParameterSet() {}
    /**
     * Instiaciates a new ManagedAppPolicyTargetAppsParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ManagedAppPolicyTargetAppsParameterSet(@Nonnull final ManagedAppPolicyTargetAppsParameterSetBuilder builder) {
        this.apps = builder.apps;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ManagedAppPolicyTargetAppsParameterSetBuilder newBuilder() {
        return new ManagedAppPolicyTargetAppsParameterSetBuilder();
    }
    /**
     * Fluent builder for the ManagedAppPolicyTargetAppsParameterSet
     */
    public static final class ManagedAppPolicyTargetAppsParameterSetBuilder {
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
        public ManagedAppPolicyTargetAppsParameterSetBuilder withApps(@Nullable final java.util.List<ManagedMobileApp> val) {
            this.apps = val;
            return this;
        }
        /**
         * Instanciates a new ManagedAppPolicyTargetAppsParameterSetBuilder
         */
        @Nullable
        protected ManagedAppPolicyTargetAppsParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ManagedAppPolicyTargetAppsParameterSet build() {
            return new ManagedAppPolicyTargetAppsParameterSet(this);
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
}
