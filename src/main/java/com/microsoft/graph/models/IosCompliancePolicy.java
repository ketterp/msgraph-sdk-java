// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.DeviceThreatProtectionLevel;
import com.microsoft.graph.models.RequiredPasswordType;
import com.microsoft.graph.models.DeviceCompliancePolicy;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Compliance Policy.
 */
public class IosCompliancePolicy extends DeviceCompliancePolicy implements IJsonBackedObject {


    /**
     * The Device Threat Protection Enabled.
     * Require that devices have enabled device threat protection .
     */
    @SerializedName(value = "deviceThreatProtectionEnabled", alternate = {"DeviceThreatProtectionEnabled"})
    @Expose
	@Nullable
    public Boolean deviceThreatProtectionEnabled;

    /**
     * The Device Threat Protection Required Security Level.
     * Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured, low, medium, high, notSet.
     */
    @SerializedName(value = "deviceThreatProtectionRequiredSecurityLevel", alternate = {"DeviceThreatProtectionRequiredSecurityLevel"})
    @Expose
	@Nullable
    public DeviceThreatProtectionLevel deviceThreatProtectionRequiredSecurityLevel;

    /**
     * The Managed Email Profile Required.
     * Indicates whether or not to require a managed email profile.
     */
    @SerializedName(value = "managedEmailProfileRequired", alternate = {"ManagedEmailProfileRequired"})
    @Expose
	@Nullable
    public Boolean managedEmailProfileRequired;

    /**
     * The Os Maximum Version.
     * Maximum IOS version.
     */
    @SerializedName(value = "osMaximumVersion", alternate = {"OsMaximumVersion"})
    @Expose
	@Nullable
    public String osMaximumVersion;

    /**
     * The Os Minimum Version.
     * Minimum IOS version.
     */
    @SerializedName(value = "osMinimumVersion", alternate = {"OsMinimumVersion"})
    @Expose
	@Nullable
    public String osMinimumVersion;

    /**
     * The Passcode Block Simple.
     * Indicates whether or not to block simple passcodes.
     */
    @SerializedName(value = "passcodeBlockSimple", alternate = {"PasscodeBlockSimple"})
    @Expose
	@Nullable
    public Boolean passcodeBlockSimple;

    /**
     * The Passcode Expiration Days.
     * Number of days before the passcode expires. Valid values 1 to 65535
     */
    @SerializedName(value = "passcodeExpirationDays", alternate = {"PasscodeExpirationDays"})
    @Expose
	@Nullable
    public Integer passcodeExpirationDays;

    /**
     * The Passcode Minimum Character Set Count.
     * The number of character sets required in the password.
     */
    @SerializedName(value = "passcodeMinimumCharacterSetCount", alternate = {"PasscodeMinimumCharacterSetCount"})
    @Expose
	@Nullable
    public Integer passcodeMinimumCharacterSetCount;

    /**
     * The Passcode Minimum Length.
     * Minimum length of passcode. Valid values 4 to 14
     */
    @SerializedName(value = "passcodeMinimumLength", alternate = {"PasscodeMinimumLength"})
    @Expose
	@Nullable
    public Integer passcodeMinimumLength;

    /**
     * The Passcode Minutes Of Inactivity Before Lock.
     * Minutes of inactivity before a passcode is required.
     */
    @SerializedName(value = "passcodeMinutesOfInactivityBeforeLock", alternate = {"PasscodeMinutesOfInactivityBeforeLock"})
    @Expose
	@Nullable
    public Integer passcodeMinutesOfInactivityBeforeLock;

    /**
     * The Passcode Previous Passcode Block Count.
     * Number of previous passcodes to block. Valid values 1 to 24
     */
    @SerializedName(value = "passcodePreviousPasscodeBlockCount", alternate = {"PasscodePreviousPasscodeBlockCount"})
    @Expose
	@Nullable
    public Integer passcodePreviousPasscodeBlockCount;

    /**
     * The Passcode Required.
     * Indicates whether or not to require a passcode.
     */
    @SerializedName(value = "passcodeRequired", alternate = {"PasscodeRequired"})
    @Expose
	@Nullable
    public Boolean passcodeRequired;

    /**
     * The Passcode Required Type.
     * The required passcode type. Possible values are: deviceDefault, alphanumeric, numeric.
     */
    @SerializedName(value = "passcodeRequiredType", alternate = {"PasscodeRequiredType"})
    @Expose
	@Nullable
    public RequiredPasswordType passcodeRequiredType;

    /**
     * The Security Block Jailbroken Devices.
     * Devices must not be jailbroken or rooted.
     */
    @SerializedName(value = "securityBlockJailbrokenDevices", alternate = {"SecurityBlockJailbrokenDevices"})
    @Expose
	@Nullable
    public Boolean securityBlockJailbrokenDevices;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
