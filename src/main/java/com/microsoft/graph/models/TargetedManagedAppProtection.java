// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.TargetedManagedAppPolicyAssignment;
import com.microsoft.graph.models.ManagedAppProtection;
import com.microsoft.graph.requests.TargetedManagedAppPolicyAssignmentCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Targeted Managed App Protection.
 */
public class TargetedManagedAppProtection extends ManagedAppProtection implements IJsonBackedObject {


    /**
     * The Is Assigned.
     * Indicates if the policy is deployed to any inclusion groups or not.
     */
    @SerializedName(value = "isAssigned", alternate = {"IsAssigned"})
    @Expose
	@Nullable
    public Boolean isAssigned;

    /**
     * The Assignments.
     * Navigation property to list of inclusion and exclusion groups to which the policy is deployed.
     */
    @SerializedName(value = "assignments", alternate = {"Assignments"})
    @Expose
	@Nullable
    public TargetedManagedAppPolicyAssignmentCollectionPage assignments;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("assignments")) {
            assignments = serializer.deserializeObject(json.get("assignments").toString(), TargetedManagedAppPolicyAssignmentCollectionPage.class);
        }
    }
}
