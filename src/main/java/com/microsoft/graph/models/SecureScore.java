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
import com.microsoft.graph.models.AverageComparativeScore;
import com.microsoft.graph.models.ControlScore;
import com.microsoft.graph.models.SecurityVendorInformation;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Secure Score.
 */
public class SecureScore extends Entity implements IJsonBackedObject {


    /**
     * The Active User Count.
     * Active user count of the given tenant.
     */
    @SerializedName(value = "activeUserCount", alternate = {"ActiveUserCount"})
    @Expose
	@Nullable
    public Integer activeUserCount;

    /**
     * The Average Comparative Scores.
     * Average score by different scopes (for example, average by industry, average by seating) and control category (Identity, Data, Device, Apps, Infrastructure) within the scope.
     */
    @SerializedName(value = "averageComparativeScores", alternate = {"AverageComparativeScores"})
    @Expose
	@Nullable
    public java.util.List<AverageComparativeScore> averageComparativeScores;

    /**
     * The Azure Tenant Id.
     * GUID string for tenant ID.
     */
    @SerializedName(value = "azureTenantId", alternate = {"AzureTenantId"})
    @Expose
	@Nullable
    public String azureTenantId;

    /**
     * The Control Scores.
     * Contains tenant scores for a set of controls.
     */
    @SerializedName(value = "controlScores", alternate = {"ControlScores"})
    @Expose
	@Nullable
    public java.util.List<ControlScore> controlScores;

    /**
     * The Created Date Time.
     * The date when the entity is created.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Current Score.
     * Tenant current attained score on specified date.
     */
    @SerializedName(value = "currentScore", alternate = {"CurrentScore"})
    @Expose
	@Nullable
    public Double currentScore;

    /**
     * The Enabled Services.
     * Microsoft-provided services for the tenant (for example, Exchange online, Skype, Sharepoint).
     */
    @SerializedName(value = "enabledServices", alternate = {"EnabledServices"})
    @Expose
	@Nullable
    public java.util.List<String> enabledServices;

    /**
     * The Licensed User Count.
     * Licensed user count of the given tenant.
     */
    @SerializedName(value = "licensedUserCount", alternate = {"LicensedUserCount"})
    @Expose
	@Nullable
    public Integer licensedUserCount;

    /**
     * The Max Score.
     * Tenant maximum possible score on specified date.
     */
    @SerializedName(value = "maxScore", alternate = {"MaxScore"})
    @Expose
	@Nullable
    public Double maxScore;

    /**
     * The Vendor Information.
     * Complex type containing details about the security product/service vendor, provider, and subprovider (for example, vendor=Microsoft; provider=SecureScore). Required.
     */
    @SerializedName(value = "vendorInformation", alternate = {"VendorInformation"})
    @Expose
	@Nullable
    public SecurityVendorInformation vendorInformation;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
