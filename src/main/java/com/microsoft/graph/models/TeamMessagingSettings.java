// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Team Messaging Settings.
 */
public class TeamMessagingSettings implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Allow Channel Mentions.
     * If set to true, @channel mentions are allowed.
     */
    @SerializedName(value = "allowChannelMentions", alternate = {"AllowChannelMentions"})
    @Expose
	@Nullable
    public Boolean allowChannelMentions;

    /**
     * The Allow Owner Delete Messages.
     * If set to true, owners can delete any message.
     */
    @SerializedName(value = "allowOwnerDeleteMessages", alternate = {"AllowOwnerDeleteMessages"})
    @Expose
	@Nullable
    public Boolean allowOwnerDeleteMessages;

    /**
     * The Allow Team Mentions.
     * If set to true, @team mentions are allowed.
     */
    @SerializedName(value = "allowTeamMentions", alternate = {"AllowTeamMentions"})
    @Expose
	@Nullable
    public Boolean allowTeamMentions;

    /**
     * The Allow User Delete Messages.
     * If set to true, users can delete their messages.
     */
    @SerializedName(value = "allowUserDeleteMessages", alternate = {"AllowUserDeleteMessages"})
    @Expose
	@Nullable
    public Boolean allowUserDeleteMessages;

    /**
     * The Allow User Edit Messages.
     * If set to true, users can edit their messages.
     */
    @SerializedName(value = "allowUserEditMessages", alternate = {"AllowUserEditMessages"})
    @Expose
	@Nullable
    public Boolean allowUserEditMessages;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
