// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.RequiredPasswordType;
import com.microsoft.graph.models.DeviceCompliancePolicy;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows81Compliance Policy.
 */
public class Windows81CompliancePolicy extends DeviceCompliancePolicy implements IJsonBackedObject {


    /**
     * The Os Maximum Version.
     * Maximum Windows 8.1 version.
     */
    @SerializedName(value = "osMaximumVersion", alternate = {"OsMaximumVersion"})
    @Expose
	@Nullable
    public String osMaximumVersion;

    /**
     * The Os Minimum Version.
     * Minimum Windows 8.1 version.
     */
    @SerializedName(value = "osMinimumVersion", alternate = {"OsMinimumVersion"})
    @Expose
	@Nullable
    public String osMinimumVersion;

    /**
     * The Password Block Simple.
     * Indicates whether or not to block simple password.
     */
    @SerializedName(value = "passwordBlockSimple", alternate = {"PasswordBlockSimple"})
    @Expose
	@Nullable
    public Boolean passwordBlockSimple;

    /**
     * The Password Expiration Days.
     * Password expiration in days.
     */
    @SerializedName(value = "passwordExpirationDays", alternate = {"PasswordExpirationDays"})
    @Expose
	@Nullable
    public Integer passwordExpirationDays;

    /**
     * The Password Minimum Character Set Count.
     * The number of character sets required in the password.
     */
    @SerializedName(value = "passwordMinimumCharacterSetCount", alternate = {"PasswordMinimumCharacterSetCount"})
    @Expose
	@Nullable
    public Integer passwordMinimumCharacterSetCount;

    /**
     * The Password Minimum Length.
     * The minimum password length.
     */
    @SerializedName(value = "passwordMinimumLength", alternate = {"PasswordMinimumLength"})
    @Expose
	@Nullable
    public Integer passwordMinimumLength;

    /**
     * The Password Minutes Of Inactivity Before Lock.
     * Minutes of inactivity before a password is required.
     */
    @SerializedName(value = "passwordMinutesOfInactivityBeforeLock", alternate = {"PasswordMinutesOfInactivityBeforeLock"})
    @Expose
	@Nullable
    public Integer passwordMinutesOfInactivityBeforeLock;

    /**
     * The Password Previous Password Block Count.
     * The number of previous passwords to prevent re-use of. Valid values 0 to 24
     */
    @SerializedName(value = "passwordPreviousPasswordBlockCount", alternate = {"PasswordPreviousPasswordBlockCount"})
    @Expose
	@Nullable
    public Integer passwordPreviousPasswordBlockCount;

    /**
     * The Password Required.
     * Require a password to unlock Windows device.
     */
    @SerializedName(value = "passwordRequired", alternate = {"PasswordRequired"})
    @Expose
	@Nullable
    public Boolean passwordRequired;

    /**
     * The Password Required Type.
     * The required password type. Possible values are: deviceDefault, alphanumeric, numeric.
     */
    @SerializedName(value = "passwordRequiredType", alternate = {"PasswordRequiredType"})
    @Expose
	@Nullable
    public RequiredPasswordType passwordRequiredType;

    /**
     * The Storage Require Encryption.
     * Indicates whether or not to require encryption on a windows 8.1 device.
     */
    @SerializedName(value = "storageRequireEncryption", alternate = {"StorageRequireEncryption"})
    @Expose
	@Nullable
    public Boolean storageRequireEncryption;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
