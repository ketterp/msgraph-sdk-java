// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.DeviceManagementExchangeConnectorType;
import com.microsoft.graph.models.DeviceManagementExchangeConnectorStatus;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Exchange Connector.
 */
public class DeviceManagementExchangeConnector extends Entity implements IJsonBackedObject {


    /**
     * The Connector Server Name.
     * The name of the server hosting the Exchange Connector.
     */
    @SerializedName(value = "connectorServerName", alternate = {"ConnectorServerName"})
    @Expose
	@Nullable
    public String connectorServerName;

    /**
     * The Exchange Alias.
     * An alias assigned to the Exchange server
     */
    @SerializedName(value = "exchangeAlias", alternate = {"ExchangeAlias"})
    @Expose
	@Nullable
    public String exchangeAlias;

    /**
     * The Exchange Connector Type.
     * The type of Exchange Connector Configured. Possible values are: onPremises, hosted, serviceToService, dedicated.
     */
    @SerializedName(value = "exchangeConnectorType", alternate = {"ExchangeConnectorType"})
    @Expose
	@Nullable
    public DeviceManagementExchangeConnectorType exchangeConnectorType;

    /**
     * The Exchange Organization.
     * Exchange Organization to the Exchange server
     */
    @SerializedName(value = "exchangeOrganization", alternate = {"ExchangeOrganization"})
    @Expose
	@Nullable
    public String exchangeOrganization;

    /**
     * The Last Sync Date Time.
     * Last sync time for the Exchange Connector
     */
    @SerializedName(value = "lastSyncDateTime", alternate = {"LastSyncDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastSyncDateTime;

    /**
     * The Primary Smtp Address.
     * Email address used to configure the Service To Service Exchange Connector.
     */
    @SerializedName(value = "primarySmtpAddress", alternate = {"PrimarySmtpAddress"})
    @Expose
	@Nullable
    public String primarySmtpAddress;

    /**
     * The Server Name.
     * The name of the Exchange server.
     */
    @SerializedName(value = "serverName", alternate = {"ServerName"})
    @Expose
	@Nullable
    public String serverName;

    /**
     * The Status.
     * Exchange Connector Status. Possible values are: none, connectionPending, connected, disconnected.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public DeviceManagementExchangeConnectorStatus status;

    /**
     * The Version.
     * The version of the ExchangeConnectorAgent
     */
    @SerializedName(value = "version", alternate = {"Version"})
    @Expose
	@Nullable
    public String version;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
