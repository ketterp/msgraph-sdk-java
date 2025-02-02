// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ChatType;
import com.microsoft.graph.models.extensions.TeamsAppInstallation;
import com.microsoft.graph.models.extensions.ConversationMember;
import com.microsoft.graph.models.extensions.TeamsTab;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.TeamsAppInstallationCollectionPage;
import com.microsoft.graph.requests.extensions.ConversationMemberCollectionPage;
import com.microsoft.graph.requests.extensions.TeamsTabCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chat.
 */
public class Chat extends Entity implements IJsonBackedObject {


    /**
     * The Chat Type.
     * Specifies the type of chat. Possible values are:group, oneOnOne and meeting.
     */
    @SerializedName(value = "chatType", alternate = {"ChatType"})
    @Expose
    public ChatType chatType;

    /**
     * The Created Date Time.
     * Date and time at which the chat was created. Read-only.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Last Updated Date Time.
     * Date and time at which the chat was renamed or list of members were last changed. Read-only.
     */
    @SerializedName(value = "lastUpdatedDateTime", alternate = {"LastUpdatedDateTime"})
    @Expose
    public java.util.Calendar lastUpdatedDateTime;

    /**
     * The Topic.
     * (Optional) Subject or topic for the chat. Only available for group chats.
     */
    @SerializedName(value = "topic", alternate = {"Topic"})
    @Expose
    public String topic;

    /**
     * The Installed Apps.
     * A collection of all the apps in the chat. Nullable.
     */
    @SerializedName(value = "installedApps", alternate = {"InstalledApps"})
    @Expose
    public TeamsAppInstallationCollectionPage installedApps;

    /**
     * The Members.
     * A collection of all the members in the chat. Nullable.
     */
    @SerializedName(value = "members", alternate = {"Members"})
    @Expose
    public ConversationMemberCollectionPage members;

    /**
     * The Tabs.
     * 
     */
    @SerializedName(value = "tabs", alternate = {"Tabs"})
    @Expose
    public TeamsTabCollectionPage tabs;


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
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("installedApps")) {
            installedApps = serializer.deserializeObject(json.get("installedApps").toString(), TeamsAppInstallationCollectionPage.class);
        }

        if (json.has("members")) {
            members = serializer.deserializeObject(json.get("members").toString(), ConversationMemberCollectionPage.class);
        }

        if (json.has("tabs")) {
            tabs = serializer.deserializeObject(json.get("tabs").toString(), TeamsTabCollectionPage.class);
        }
    }
}
