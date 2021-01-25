// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.ChatMessagePolicyViolationDlpActionTypes;
import com.microsoft.graph.models.ChatMessagePolicyViolationPolicyTip;
import com.microsoft.graph.models.ChatMessagePolicyViolationUserActionTypes;
import com.microsoft.graph.models.ChatMessagePolicyViolationVerdictDetailsTypes;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chat Message Policy Violation.
 */
public class ChatMessagePolicyViolation implements IJsonBackedObject {

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
     * The Dlp Action.
     * The action taken by the DLP provider on the message with sensitive content. Supported values are: NoneNotifySender -- Inform the sender of the violation but allow readers to read the message.BlockAccess -- Block readers from reading the message.BlockAccessExternal -- Block users outside the organization from reading the message, while allowing users within the organization to read the message.
     */
    @SerializedName(value = "dlpAction", alternate = {"DlpAction"})
    @Expose
	@Nullable
    public EnumSet<ChatMessagePolicyViolationDlpActionTypes> dlpAction;

    /**
     * The Justification Text.
     * Justification text provided by the sender of the message when overriding a policy violation.
     */
    @SerializedName(value = "justificationText", alternate = {"JustificationText"})
    @Expose
	@Nullable
    public String justificationText;

    /**
     * The Policy Tip.
     * Information to display to the message sender about why the message was flagged as a violation.
     */
    @SerializedName(value = "policyTip", alternate = {"PolicyTip"})
    @Expose
	@Nullable
    public ChatMessagePolicyViolationPolicyTip policyTip;

    /**
     * The User Action.
     * Indicates the action taken by the user on a message blocked by the DLP provider. Supported values are: NoneOverrideReportFalsePositiveWhen the DLP provider is updating the message for blocking sensitive content, userAction is not required.
     */
    @SerializedName(value = "userAction", alternate = {"UserAction"})
    @Expose
	@Nullable
    public EnumSet<ChatMessagePolicyViolationUserActionTypes> userAction;

    /**
     * The Verdict Details.
     * Indicates what actions the sender may take in response to the policy violation. Supported values are: NoneAllowFalsePositiveOverride -- Allows the sender to declare the policyViolation to be an error in the DLP app and its rules, and allow readers to see the message again if the dlpAction had hidden it.AllowOverrideWithoutJustification -- Allows the sender to overriide the DLP violation and allow readers to see the message again if the dlpAction had hidden it, without needing to provide an explanation for doing so. AllowOverrideWithJustification -- Allows the sender to overriide the DLP violation and allow readers to see the message again if the dlpAction had hidden it, after providing an explanation for doing so.AllowOverrideWithoutJustification and AllowOverrideWithJustification are mutually exclusive.
     */
    @SerializedName(value = "verdictDetails", alternate = {"VerdictDetails"})
    @Expose
	@Nullable
    public EnumSet<ChatMessagePolicyViolationVerdictDetailsTypes> verdictDetails;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
