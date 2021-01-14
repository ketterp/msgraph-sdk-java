// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.TermsAndConditionsAcceptanceStatus;
import com.microsoft.graph.models.extensions.TermsAndConditionsAssignment;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.TermsAndConditionsAcceptanceStatusCollectionPage;
import com.microsoft.graph.requests.extensions.TermsAndConditionsAssignmentCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Terms And Conditions.
 */
public class TermsAndConditions extends Entity implements IJsonBackedObject {


    /**
     * The Acceptance Statement.
     * Administrator-supplied explanation of the terms and conditions, typically describing what it means to accept the terms and conditions set out in the T&amp;C policy. This is shown to the user on prompts to accept the T&amp;C policy.
     */
    @SerializedName(value = "acceptanceStatement", alternate = {"AcceptanceStatement"})
    @Expose
	@Nullable
    public String acceptanceStatement;

    /**
     * The Body Text.
     * Administrator-supplied body text of the terms and conditions, typically the terms themselves. This is shown to the user on prompts to accept the T&amp;C policy.
     */
    @SerializedName(value = "bodyText", alternate = {"BodyText"})
    @Expose
	@Nullable
    public String bodyText;

    /**
     * The Created Date Time.
     * DateTime the object was created.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Description.
     * Administrator-supplied description of the T&amp;C policy.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * Administrator-supplied name for the T&amp;C policy.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Last Modified Date Time.
     * DateTime the object was last modified.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Title.
     * Administrator-supplied title of the terms and conditions. This is shown to the user on prompts to accept the T&amp;C policy.
     */
    @SerializedName(value = "title", alternate = {"Title"})
    @Expose
	@Nullable
    public String title;

    /**
     * The Version.
     * Integer indicating the current version of the terms. Incremented when an administrator makes a change to the terms and wishes to require users to re-accept the modified T&amp;C policy.
     */
    @SerializedName(value = "version", alternate = {"Version"})
    @Expose
	@Nullable
    public Integer version;

    /**
     * The Acceptance Statuses.
     * The list of acceptance statuses for this T&amp;C policy.
     */
    @SerializedName(value = "acceptanceStatuses", alternate = {"AcceptanceStatuses"})
    @Expose
	@Nullable
    public TermsAndConditionsAcceptanceStatusCollectionPage acceptanceStatuses;

    /**
     * The Assignments.
     * The list of assignments for this T&amp;C policy.
     */
    @SerializedName(value = "assignments", alternate = {"Assignments"})
    @Expose
	@Nullable
    public TermsAndConditionsAssignmentCollectionPage assignments;


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
	@Override
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


        if (json.has("acceptanceStatuses")) {
            acceptanceStatuses = serializer.deserializeObject(json.get("acceptanceStatuses").toString(), TermsAndConditionsAcceptanceStatusCollectionPage.class);
        }

        if (json.has("assignments")) {
            assignments = serializer.deserializeObject(json.get("assignments").toString(), TermsAndConditionsAssignmentCollectionPage.class);
        }
    }
}
