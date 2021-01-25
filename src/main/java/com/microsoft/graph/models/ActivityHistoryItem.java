// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.Status;
import com.microsoft.graph.models.UserActivity;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Activity History Item.
 */
public class ActivityHistoryItem extends Entity implements IJsonBackedObject {


    /**
     * The Active Duration Seconds.
     * Optional. The duration of active user engagement. if not supplied, this is calculated from the startedDateTime and lastActiveDateTime.
     */
    @SerializedName(value = "activeDurationSeconds", alternate = {"ActiveDurationSeconds"})
    @Expose
	@Nullable
    public Integer activeDurationSeconds;

    /**
     * The Created Date Time.
     * Set by the server. DateTime in UTC when the object was created on the server.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Expiration Date Time.
     * Optional. UTC DateTime when the historyItem will undergo hard-delete. Can be set by the client.
     */
    @SerializedName(value = "expirationDateTime", alternate = {"ExpirationDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime expirationDateTime;

    /**
     * The Last Active Date Time.
     * Optional. UTC DateTime when the historyItem (activity session) was last understood as active or finished - if null, historyItem status should be Ongoing.
     */
    @SerializedName(value = "lastActiveDateTime", alternate = {"LastActiveDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastActiveDateTime;

    /**
     * The Last Modified Date Time.
     * Set by the server. DateTime in UTC when the object was modified on the server.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Started Date Time.
     * Required. UTC DateTime when the historyItem (activity session) was started. Required for timeline history.
     */
    @SerializedName(value = "startedDateTime", alternate = {"StartedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime startedDateTime;

    /**
     * The Status.
     * Set by the server. A status code used to identify valid objects. Values: active, updated, deleted, ignored.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public Status status;

    /**
     * The User Timezone.
     * Optional. The timezone in which the user's device used to generate the activity was located at activity creation time. Values supplied as Olson IDs in order to support cross-platform representation.
     */
    @SerializedName(value = "userTimezone", alternate = {"UserTimezone"})
    @Expose
	@Nullable
    public String userTimezone;

    /**
     * The Activity.
     * Optional. NavigationProperty/Containment; navigation property to the associated activity.
     */
    @SerializedName(value = "activity", alternate = {"Activity"})
    @Expose
	@Nullable
    public UserActivity activity;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
