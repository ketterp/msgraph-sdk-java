// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.AutomaticRepliesSetting;
import com.microsoft.graph.models.DelegateMeetingMessageDeliveryOptions;
import com.microsoft.graph.models.LocaleInfo;
import com.microsoft.graph.models.WorkingHours;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mailbox Settings.
 */
public class MailboxSettings implements IJsonBackedObject {

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
     * The Archive Folder.
     * Folder ID of an archive folder for the user.
     */
    @SerializedName(value = "archiveFolder", alternate = {"ArchiveFolder"})
    @Expose
	@Nullable
    public String archiveFolder;

    /**
     * The Automatic Replies Setting.
     * Configuration settings to automatically notify the sender of an incoming email with a message from the signed-in user.
     */
    @SerializedName(value = "automaticRepliesSetting", alternate = {"AutomaticRepliesSetting"})
    @Expose
	@Nullable
    public AutomaticRepliesSetting automaticRepliesSetting;

    /**
     * The Date Format.
     * The date format for the user's mailbox.
     */
    @SerializedName(value = "dateFormat", alternate = {"DateFormat"})
    @Expose
	@Nullable
    public String dateFormat;

    /**
     * The Delegate Meeting Message Delivery Options.
     * If the user has a calendar delegate, this specifies whether the delegate, mailbox owner, or both receive meeting messages and meeting responses. Possible values are: sendToDelegateAndInformationToPrincipal, sendToDelegateAndPrincipal, sendToDelegateOnly.
     */
    @SerializedName(value = "delegateMeetingMessageDeliveryOptions", alternate = {"DelegateMeetingMessageDeliveryOptions"})
    @Expose
	@Nullable
    public DelegateMeetingMessageDeliveryOptions delegateMeetingMessageDeliveryOptions;

    /**
     * The Language.
     * The locale information for the user, including the preferred language and country/region.
     */
    @SerializedName(value = "language", alternate = {"Language"})
    @Expose
	@Nullable
    public LocaleInfo language;

    /**
     * The Time Format.
     * The time format for the user's mailbox.
     */
    @SerializedName(value = "timeFormat", alternate = {"TimeFormat"})
    @Expose
	@Nullable
    public String timeFormat;

    /**
     * The Time Zone.
     * The default time zone for the user's mailbox.
     */
    @SerializedName(value = "timeZone", alternate = {"TimeZone"})
    @Expose
	@Nullable
    public String timeZone;

    /**
     * The Working Hours.
     * The days of the week and hours in a specific time zone that the user works.
     */
    @SerializedName(value = "workingHours", alternate = {"WorkingHours"})
    @Expose
	@Nullable
    public WorkingHours workingHours;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
