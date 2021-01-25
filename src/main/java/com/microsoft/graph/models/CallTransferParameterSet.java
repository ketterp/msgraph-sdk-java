// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.InvitationParticipantInfo;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Transfer Parameter Set.
 */
public class CallTransferParameterSet {
    /**
     * The transfer Target.
     * 
     */
    @SerializedName(value = "transferTarget", alternate = {"TransferTarget"})
    @Expose
	@Nullable
    public InvitationParticipantInfo transferTarget;


    /**
     * Instiaciates a new CallTransferParameterSet
     */
    public CallTransferParameterSet() {}
    /**
     * Instiaciates a new CallTransferParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected CallTransferParameterSet(@Nonnull final CallTransferParameterSetBuilder builder) {
        this.transferTarget = builder.transferTarget;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static CallTransferParameterSetBuilder newBuilder() {
        return new CallTransferParameterSetBuilder();
    }
    /**
     * Fluent builder for the CallTransferParameterSet
     */
    public static final class CallTransferParameterSetBuilder {
        /**
         * The transferTarget parameter value
         */
        @Nullable
        protected InvitationParticipantInfo transferTarget;
        /**
         * Sets the TransferTarget
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public CallTransferParameterSetBuilder withTransferTarget(@Nullable final InvitationParticipantInfo val) {
            this.transferTarget = val;
            return this;
        }
        /**
         * Instanciates a new CallTransferParameterSetBuilder
         */
        @Nullable
        protected CallTransferParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public CallTransferParameterSet build() {
            return new CallTransferParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.transferTarget != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("transferTarget", transferTarget));
        }
        return result;
    }
}
