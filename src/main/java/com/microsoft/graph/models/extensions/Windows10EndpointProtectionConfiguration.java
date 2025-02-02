// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ApplicationGuardBlockClipboardSharingType;
import com.microsoft.graph.models.generated.ApplicationGuardBlockFileTransferType;
import com.microsoft.graph.models.generated.AppLockerApplicationControlType;
import com.microsoft.graph.models.extensions.BitLockerRemovableDrivePolicy;
import com.microsoft.graph.models.generated.FirewallCertificateRevocationListCheckMethodType;
import com.microsoft.graph.models.generated.FirewallPacketQueueingMethodType;
import com.microsoft.graph.models.generated.FirewallPreSharedKeyEncodingMethodType;
import com.microsoft.graph.models.extensions.WindowsFirewallNetworkProfile;
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Endpoint Protection Configuration.
 */
public class Windows10EndpointProtectionConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Application Guard Allow Persistence.
     * Allow persisting user generated data inside the App Guard Containter (favorites, cookies, web passwords, etc.)
     */
    @SerializedName(value = "applicationGuardAllowPersistence", alternate = {"ApplicationGuardAllowPersistence"})
    @Expose
    public Boolean applicationGuardAllowPersistence;

    /**
     * The Application Guard Allow Print To Local Printers.
     * Allow printing to Local Printers from Container
     */
    @SerializedName(value = "applicationGuardAllowPrintToLocalPrinters", alternate = {"ApplicationGuardAllowPrintToLocalPrinters"})
    @Expose
    public Boolean applicationGuardAllowPrintToLocalPrinters;

    /**
     * The Application Guard Allow Print To Network Printers.
     * Allow printing to Network Printers from Container
     */
    @SerializedName(value = "applicationGuardAllowPrintToNetworkPrinters", alternate = {"ApplicationGuardAllowPrintToNetworkPrinters"})
    @Expose
    public Boolean applicationGuardAllowPrintToNetworkPrinters;

    /**
     * The Application Guard Allow Print To PDF.
     * Allow printing to PDF from Container
     */
    @SerializedName(value = "applicationGuardAllowPrintToPDF", alternate = {"ApplicationGuardAllowPrintToPDF"})
    @Expose
    public Boolean applicationGuardAllowPrintToPDF;

    /**
     * The Application Guard Allow Print To XPS.
     * Allow printing to XPS from Container
     */
    @SerializedName(value = "applicationGuardAllowPrintToXPS", alternate = {"ApplicationGuardAllowPrintToXPS"})
    @Expose
    public Boolean applicationGuardAllowPrintToXPS;

    /**
     * The Application Guard Block Clipboard Sharing.
     * Block clipboard to share data from Host to Container, or from Container to Host, or both ways, or neither ways. Possible values are: notConfigured, blockBoth, blockHostToContainer, blockContainerToHost, blockNone.
     */
    @SerializedName(value = "applicationGuardBlockClipboardSharing", alternate = {"ApplicationGuardBlockClipboardSharing"})
    @Expose
    public ApplicationGuardBlockClipboardSharingType applicationGuardBlockClipboardSharing;

    /**
     * The Application Guard Block File Transfer.
     * Block clipboard to transfer image file, text file or neither of them. Possible values are: notConfigured, blockImageAndTextFile, blockImageFile, blockNone, blockTextFile.
     */
    @SerializedName(value = "applicationGuardBlockFileTransfer", alternate = {"ApplicationGuardBlockFileTransfer"})
    @Expose
    public ApplicationGuardBlockFileTransferType applicationGuardBlockFileTransfer;

    /**
     * The Application Guard Block Non Enterprise Content.
     * Block enterprise sites to load non-enterprise content, such as third party plug-ins
     */
    @SerializedName(value = "applicationGuardBlockNonEnterpriseContent", alternate = {"ApplicationGuardBlockNonEnterpriseContent"})
    @Expose
    public Boolean applicationGuardBlockNonEnterpriseContent;

    /**
     * The Application Guard Enabled.
     * Enable Windows Defender Application Guard
     */
    @SerializedName(value = "applicationGuardEnabled", alternate = {"ApplicationGuardEnabled"})
    @Expose
    public Boolean applicationGuardEnabled;

    /**
     * The Application Guard Force Auditing.
     * Force auditing will persist Windows logs and events to meet security/compliance criteria (sample events are user login-logoff, use of privilege rights, software installation, system changes, etc.)
     */
    @SerializedName(value = "applicationGuardForceAuditing", alternate = {"ApplicationGuardForceAuditing"})
    @Expose
    public Boolean applicationGuardForceAuditing;

    /**
     * The App Locker Application Control.
     * Enables the Admin to choose what types of app to allow on devices. Possible values are: notConfigured, enforceComponentsAndStoreApps, auditComponentsAndStoreApps, enforceComponentsStoreAppsAndSmartlocker, auditComponentsStoreAppsAndSmartlocker.
     */
    @SerializedName(value = "appLockerApplicationControl", alternate = {"AppLockerApplicationControl"})
    @Expose
    public AppLockerApplicationControlType appLockerApplicationControl;

    /**
     * The Bit Locker Disable Warning For Other Disk Encryption.
     * Allows the Admin to disable the warning prompt for other disk encryption on the user machines.
     */
    @SerializedName(value = "bitLockerDisableWarningForOtherDiskEncryption", alternate = {"BitLockerDisableWarningForOtherDiskEncryption"})
    @Expose
    public Boolean bitLockerDisableWarningForOtherDiskEncryption;

    /**
     * The Bit Locker Enable Storage Card Encryption On Mobile.
     * Allows the admin to require encryption to be turned on using BitLocker. This policy is valid only for a mobile SKU.
     */
    @SerializedName(value = "bitLockerEnableStorageCardEncryptionOnMobile", alternate = {"BitLockerEnableStorageCardEncryptionOnMobile"})
    @Expose
    public Boolean bitLockerEnableStorageCardEncryptionOnMobile;

    /**
     * The Bit Locker Encrypt Device.
     * Allows the admin to require encryption to be turned on using BitLocker.
     */
    @SerializedName(value = "bitLockerEncryptDevice", alternate = {"BitLockerEncryptDevice"})
    @Expose
    public Boolean bitLockerEncryptDevice;

    /**
     * The Bit Locker Removable Drive Policy.
     * BitLocker Removable Drive Policy.
     */
    @SerializedName(value = "bitLockerRemovableDrivePolicy", alternate = {"BitLockerRemovableDrivePolicy"})
    @Expose
    public BitLockerRemovableDrivePolicy bitLockerRemovableDrivePolicy;

    /**
     * The Defender Additional Guarded Folders.
     * List of folder paths to be added to the list of protected folders
     */
    @SerializedName(value = "defenderAdditionalGuardedFolders", alternate = {"DefenderAdditionalGuardedFolders"})
    @Expose
    public java.util.List<String> defenderAdditionalGuardedFolders;

    /**
     * The Defender Attack Surface Reduction Excluded Paths.
     * List of exe files and folders to be excluded from attack surface reduction rules
     */
    @SerializedName(value = "defenderAttackSurfaceReductionExcludedPaths", alternate = {"DefenderAttackSurfaceReductionExcludedPaths"})
    @Expose
    public java.util.List<String> defenderAttackSurfaceReductionExcludedPaths;

    /**
     * The Defender Exploit Protection Xml.
     * Xml content containing information regarding exploit protection details.
     */
    @SerializedName(value = "defenderExploitProtectionXml", alternate = {"DefenderExploitProtectionXml"})
    @Expose
    public byte[] defenderExploitProtectionXml;

    /**
     * The Defender Exploit Protection Xml File Name.
     * Name of the file from which DefenderExploitProtectionXml was obtained.
     */
    @SerializedName(value = "defenderExploitProtectionXmlFileName", alternate = {"DefenderExploitProtectionXmlFileName"})
    @Expose
    public String defenderExploitProtectionXmlFileName;

    /**
     * The Defender Guarded Folders Allowed App Paths.
     * List of paths to exe that are allowed to access protected folders
     */
    @SerializedName(value = "defenderGuardedFoldersAllowedAppPaths", alternate = {"DefenderGuardedFoldersAllowedAppPaths"})
    @Expose
    public java.util.List<String> defenderGuardedFoldersAllowedAppPaths;

    /**
     * The Defender Security Center Block Exploit Protection Override.
     * Indicates whether or not to block user from overriding Exploit Protection settings.
     */
    @SerializedName(value = "defenderSecurityCenterBlockExploitProtectionOverride", alternate = {"DefenderSecurityCenterBlockExploitProtectionOverride"})
    @Expose
    public Boolean defenderSecurityCenterBlockExploitProtectionOverride;

    /**
     * The Firewall Block Stateful FTP.
     * Blocks stateful FTP connections to the device
     */
    @SerializedName(value = "firewallBlockStatefulFTP", alternate = {"FirewallBlockStatefulFTP"})
    @Expose
    public Boolean firewallBlockStatefulFTP;

    /**
     * The Firewall Certificate Revocation List Check Method.
     * Specify how the certificate revocation list is to be enforced. Possible values are: deviceDefault, none, attempt, require.
     */
    @SerializedName(value = "firewallCertificateRevocationListCheckMethod", alternate = {"FirewallCertificateRevocationListCheckMethod"})
    @Expose
    public FirewallCertificateRevocationListCheckMethodType firewallCertificateRevocationListCheckMethod;

    /**
     * The Firewall Idle Timeout For Security Association In Seconds.
     * Configures the idle timeout for security associations, in seconds, from 300 to 3600 inclusive. This is the period after which security associations will expire and be deleted. Valid values 300 to 3600
     */
    @SerializedName(value = "firewallIdleTimeoutForSecurityAssociationInSeconds", alternate = {"FirewallIdleTimeoutForSecurityAssociationInSeconds"})
    @Expose
    public Integer firewallIdleTimeoutForSecurityAssociationInSeconds;

    /**
     * The Firewall IPSec Exemptions Allow DHCP.
     * Configures IPSec exemptions to allow both IPv4 and IPv6 DHCP traffic
     */
    @SerializedName(value = "firewallIPSecExemptionsAllowDHCP", alternate = {"FirewallIPSecExemptionsAllowDHCP"})
    @Expose
    public Boolean firewallIPSecExemptionsAllowDHCP;

    /**
     * The Firewall IPSec Exemptions Allow ICMP.
     * Configures IPSec exemptions to allow ICMP
     */
    @SerializedName(value = "firewallIPSecExemptionsAllowICMP", alternate = {"FirewallIPSecExemptionsAllowICMP"})
    @Expose
    public Boolean firewallIPSecExemptionsAllowICMP;

    /**
     * The Firewall IPSec Exemptions Allow Neighbor Discovery.
     * Configures IPSec exemptions to allow neighbor discovery IPv6 ICMP type-codes
     */
    @SerializedName(value = "firewallIPSecExemptionsAllowNeighborDiscovery", alternate = {"FirewallIPSecExemptionsAllowNeighborDiscovery"})
    @Expose
    public Boolean firewallIPSecExemptionsAllowNeighborDiscovery;

    /**
     * The Firewall IPSec Exemptions Allow Router Discovery.
     * Configures IPSec exemptions to allow router discovery IPv6 ICMP type-codes
     */
    @SerializedName(value = "firewallIPSecExemptionsAllowRouterDiscovery", alternate = {"FirewallIPSecExemptionsAllowRouterDiscovery"})
    @Expose
    public Boolean firewallIPSecExemptionsAllowRouterDiscovery;

    /**
     * The Firewall Merge Keying Module Settings.
     * If an authentication set is not fully supported by a keying module, direct the module to ignore only unsupported authentication suites rather than the entire set
     */
    @SerializedName(value = "firewallMergeKeyingModuleSettings", alternate = {"FirewallMergeKeyingModuleSettings"})
    @Expose
    public Boolean firewallMergeKeyingModuleSettings;

    /**
     * The Firewall Packet Queueing Method.
     * Configures how packet queueing should be applied in the tunnel gateway scenario. Possible values are: deviceDefault, disabled, queueInbound, queueOutbound, queueBoth.
     */
    @SerializedName(value = "firewallPacketQueueingMethod", alternate = {"FirewallPacketQueueingMethod"})
    @Expose
    public FirewallPacketQueueingMethodType firewallPacketQueueingMethod;

    /**
     * The Firewall Pre Shared Key Encoding Method.
     * Select the preshared key encoding to be used. Possible values are: deviceDefault, none, utF8.
     */
    @SerializedName(value = "firewallPreSharedKeyEncodingMethod", alternate = {"FirewallPreSharedKeyEncodingMethod"})
    @Expose
    public FirewallPreSharedKeyEncodingMethodType firewallPreSharedKeyEncodingMethod;

    /**
     * The Firewall Profile Domain.
     * Configures the firewall profile settings for domain networks
     */
    @SerializedName(value = "firewallProfileDomain", alternate = {"FirewallProfileDomain"})
    @Expose
    public WindowsFirewallNetworkProfile firewallProfileDomain;

    /**
     * The Firewall Profile Private.
     * Configures the firewall profile settings for private networks
     */
    @SerializedName(value = "firewallProfilePrivate", alternate = {"FirewallProfilePrivate"})
    @Expose
    public WindowsFirewallNetworkProfile firewallProfilePrivate;

    /**
     * The Firewall Profile Public.
     * Configures the firewall profile settings for public networks
     */
    @SerializedName(value = "firewallProfilePublic", alternate = {"FirewallProfilePublic"})
    @Expose
    public WindowsFirewallNetworkProfile firewallProfilePublic;

    /**
     * The Smart Screen Block Override For Files.
     * Allows IT Admins to control whether users can can ignore SmartScreen warnings and run malicious files.
     */
    @SerializedName(value = "smartScreenBlockOverrideForFiles", alternate = {"SmartScreenBlockOverrideForFiles"})
    @Expose
    public Boolean smartScreenBlockOverrideForFiles;

    /**
     * The Smart Screen Enable In Shell.
     * Allows IT Admins to configure SmartScreen for Windows.
     */
    @SerializedName(value = "smartScreenEnableInShell", alternate = {"SmartScreenEnableInShell"})
    @Expose
    public Boolean smartScreenEnableInShell;


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

    }
}
