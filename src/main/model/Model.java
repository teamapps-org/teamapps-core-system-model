/*-
 * ========================LICENSE_START=================================
 * TeamApps Core System Model
 * ---
 * Copyright (C) 2020 - 2024 TeamApps.org
 * ---
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * =========================LICENSE_END==================================
 */

import org.teamapps.universaldb.model.DatabaseModel;
import org.teamapps.universaldb.model.EnumModel;
import org.teamapps.universaldb.model.TableModel;
import org.teamapps.universaldb.schema.*;

import java.util.Arrays;

import static org.teamapps.universaldb.schema.TableOption.*;

public class Model implements ModelProvider {

	@Override
	public DatabaseModel getModel() {
		DatabaseModel model = new DatabaseModel("controlCenter", "Control center", "org.teamapps.model", "coreSystemModel");
		model.setPojoBuildTime(1690360218187L);
		EnumModel applicationPrivilegeGroupType = model.createEnum("applicationPrivilegeGroupType", "Application privilege group type", Arrays.asList("simplePrivilege", "simpleOrganizationalPrivilege", "simpleCustomObjectPrivilege", "standardPrivilegeGroup", "organizationalPrivilegeGroup", "customObjectPrivilegeGroup", "roleAssignmentDelegatedCustomPrivilegeGroup"), Arrays.asList("Simple privilege", "Simple organizational privilege", "Simple custom object privilege", "Standard privilege group", "Organizational privilege group", "Custom object privilege group", "Role assignment delegated custom privilege group"));
		EnumModel geoLocationType = model.createEnum("geoLocationType", "Geo location type", Arrays.asList("country", "state", "city", "place", "none"), Arrays.asList("Country", "State", "City", "Place", "None"));
		EnumModel languageSkillLevel = model.createEnum("languageSkillLevel", "Language skill level", Arrays.asList("motherTongue", "excellent", "good", "unknown"), Arrays.asList("Mother tongue", "Excellent", "Good", "Unknown"));
		EnumModel localizationKeyFormat = model.createEnum("localizationKeyFormat", "Localization key format", Arrays.asList("singleLine", "multiLine", "formatted"), Arrays.asList("Single line", "Multi line", "Formatted"));
		EnumModel localizationKeyType = model.createEnum("localizationKeyType", "Localization key type", Arrays.asList("applicationResourceKey", "dictionaryKey", "reportingKey", "systemKey"), Arrays.asList("Application resource key", "Dictionary key", "Reporting key", "System key"));
		EnumModel logLevel = model.createEnum("logLevel", "Log level", Arrays.asList("debug", "info", "warning", "error"), Arrays.asList("Debug", "Info", "Warning", "Error"));
		EnumModel machineTranslationState = model.createEnum("machineTranslationState", "Machine translation state", Arrays.asList("translationRequested", "ok", "failed", "notNecessary"), Arrays.asList("Translation requested", "Ok", "Failed", "Not necessary"));
		EnumModel orgUnitLifeCycleStatus = model.createEnum("orgUnitLifeCycleStatus", "Org unit life cycle status", Arrays.asList("active", "inactive", "prepareDeletion", "deleted"), Arrays.asList("Active", "Inactive", "Prepare deletion", "Deleted"));
		EnumModel roleType = model.createEnum("roleType", "Role type", Arrays.asList("leader", "assistant", "mentor", "administrator", "other"), Arrays.asList("Leader", "Assistant", "Mentor", "Administrator", "Other"));
		EnumModel translationState = model.createEnum("translationState", "Translation state", Arrays.asList("translationRequested", "ok", "unclear", "notNecessary"), Arrays.asList("Translation requested", "Ok", "Unclear", "Not necessary"));
		EnumModel translationVerificationState = model.createEnum("translationVerificationState", "Translation verification state", Arrays.asList("notYetTranslated", "verificationRequested", "ok", "correctionsRequired", "notNecessary"), Arrays.asList("Not yet translated", "Verification requested", "Ok", "Corrections required", "Not necessary"));
		EnumModel userAccountStatus = model.createEnum("userAccountStatus", "User account status", Arrays.asList("active", "inactive", "superAdmin"), Arrays.asList("Active", "Inactive", "Super admin"));
		EnumModel gender = model.createEnum("gender", "Gender", Arrays.asList("male", "female", "unknown"), Arrays.asList("Male", "Female", "Unknown"));
		EnumModel totpAuthenticationType = model.createEnum("totpAuthenticationType", "none", "onEveryLogin", "oncePerDayPerDevice");

		TableModel address = model.createTable("address", "Address", true, true, true);
		TableModel application = model.createTable("application", "Application", true, true, true);
		TableModel applicationPerspective = model.createTable("applicationPerspective", "Application perspective", true, true, true);
		TableModel applicationPrivilege = model.createTable("applicationPrivilege", "Application privilege", true, true, true);
		TableModel applicationPrivilegeGroup = model.createTable("applicationPrivilegeGroup", "Application privilege group", true, true, true);
		TableModel applicationVersion = model.createTable("applicationVersion", "Application version", true, true, true);
		TableModel applicationVersionData = model.createTable("applicationVersionData", "Application version data", true, true, true);
		TableModel localizationKey = model.createTable("localizationKey", "Localization key", true, true, true);
		TableModel localizationTopic = model.createTable("localizationTopic", "Localization topic", true, true, true);
		TableModel localizationValue = model.createTable("localizationValue", "Localization value", true, true, true);
		TableModel managedApplication = model.createTable("managedApplication", "Managed application", true, true, true);
		TableModel managedApplicationGroup = model.createTable("managedApplicationGroup", "Managed application group", true, true, true);
		TableModel managedApplicationPerspective = model.createTable("managedApplicationPerspective", "Managed application perspective", true, true, true);
		TableModel newsBoardMessage = model.createTable("newsBoardMessage", "News board message", true, true, true);
		TableModel newsBoardMessageImage = model.createTable("newsBoardMessageImage", "News board message image", true, true, true);
		TableModel newsBoardMessageTranslation = model.createTable("newsBoardMessageTranslation", "News board message translation", true, true, true);
		TableModel organizationField = model.createTable("organizationField", "Organization field", true, true, true);
		TableModel organizationUnit = model.createTable("organizationUnit", "Organization unit", true, true, true);
		TableModel organizationUnitType = model.createTable("organizationUnitType", "Organization unit type", true, true, true);
		TableModel role = model.createTable("role", "Role", true, true, true);
		TableModel roleApplicationRoleAssignment = model.createTable("roleApplicationRoleAssignment", "Role application role assignment", true, true, true);
		TableModel rolePrivilegeAssignment = model.createTable("rolePrivilegeAssignment", "Role privilege assignment", true, true, true);
		TableModel systemLog = model.createTable("systemLog", "System log", true, true, true);
		TableModel systemSettings = model.createTable("systemSettings", "System settings", true, true, true);
		TableModel user = model.createTable("user", "User", true, true, true);
		TableModel userAccessToken = model.createTable("userAccessToken", "User access token", true, false, false);
		TableModel userLanguageSettings = model.createTable("userLanguageSettings", "User language settings", true, true, true);
		TableModel userLoginStats = model.createTable("userLoginStats", "User login stats", false, false, false);
		TableModel userRoleAssignment = model.createTable("userRoleAssignment", "User role assignment", true, true, true);

		TableModel addressView = model.createRemoteTable("addressView", "Address view", "address", "controlCenter", null);
		TableModel organizationFieldView = model.createRemoteTable("organizationFieldView", "Organization field view", "organizationField", "controlCenter", null);
		TableModel organizationUnitTypeView = model.createRemoteTable("organizationUnitTypeView", "Organization unit type view", "organizationUnitType", "controlCenter", null);
		TableModel organizationUnitView = model.createRemoteTable("organizationUnitView", "Organization unit view", "organizationUnit", "controlCenter", null);
		TableModel userView = model.createRemoteTable("userView", "User view", "user", "controlCenter", null);

		address.addText("name", "Name");
		address.addText("organisation", "Organisation");
		address.addText("street", "Street");
		address.addText("city", "City");
		address.addText("dependentLocality", "Dependent locality");
		address.addText("state", "State");
		address.addText("postalCode", "Postal code");
		address.addText("country", "Country");
		address.addFloat("latitude", "Latitude");
		address.addFloat("longitude", "Longitude");

		addressView.addText("name", "Name");
		addressView.addText("organisation", "Organisation");
		addressView.addText("street", "Street");
		addressView.addText("city", "City");
		addressView.addText("dependentLocality", "Dependent locality");
		addressView.addText("state", "State");
		addressView.addText("postalCode", "Postal code");
		addressView.addText("country", "Country");
		addressView.addFloat("latitude", "Latitude");
		addressView.addFloat("longitude", "Longitude");

		application.addText("name", "Name");
		application.addText("icon", "Icon");
		application.addText("titleKey", "Title key");
		application.addText("descriptionKey", "Description key");
		application.addBoolean("uninstalled", "Uninstalled");
		application.addBoolean("unmanagedApplication", "Unmanaged application");
		application.addText("config", "Config");
		application.addBoolean("darkTheme", "Dark theme");
		application.addMultiReference("perspectives", "Perspectives", applicationPerspective, true);
		application.addMultiReference("privilegeGroups", "Privilege groups", applicationPrivilegeGroup, false);
		application.addMultiReference("versions", "Versions", applicationVersion, false);
		application.addReference("installedVersion", "Installed version", applicationVersion, false);
		application.addMultiReference("installedAsMainApplication", "Installed as main application", managedApplication, false);

		applicationPerspective.addReference("application", "Application", application, false);
		applicationPerspective.addText("name", "Name");
		applicationPerspective.addText("icon", "Icon");
		applicationPerspective.addText("titleKey", "Title key");
		applicationPerspective.addText("descriptionKey", "Description key");
		applicationPerspective.addBoolean("autoProvision", "Auto provision");
		applicationPerspective.addBoolean("toolbarPerspectiveMenu", "Toolbar perspective menu");
		applicationPerspective.addMultiReference("managedPerspectives", "Managed perspectives", managedApplicationPerspective, true);

		applicationPrivilege.addReference("privilegeGroup", "Privilege group", applicationPrivilegeGroup, false);
		applicationPrivilege.addText("name", "Name");
		applicationPrivilege.addText("icon", "Icon");
		applicationPrivilege.addText("titleKey", "Title key");

		applicationPrivilegeGroup.addReference("application", "Application", application, false);
		applicationPrivilegeGroup.addEnum("applicationPrivilegeGroupType", "Application privilege group type", applicationPrivilegeGroupType);
		applicationPrivilegeGroup.addText("name", "Name");
		applicationPrivilegeGroup.addText("icon", "Icon");
		applicationPrivilegeGroup.addText("titleKey", "Title key");
		applicationPrivilegeGroup.addText("descriptionKey", "Description key");
		applicationPrivilegeGroup.addMultiReference("privileges", "Privileges", applicationPrivilege, false);

		applicationVersion.addReference("application", "Application", application, false);
		applicationVersion.addFile("binary", "Binary", true, 100000, false);
		applicationVersion.addText("binaryHash", "Binary hash");
		applicationVersion.addText("version", "Version");
		applicationVersion.addText("releaseNotes", "Release notes");
		applicationVersion.addReference("dataModelData", "Data model data", applicationVersionData, false);
		applicationVersion.addReference("localizationData", "Localization data", applicationVersionData, false);
		applicationVersion.addReference("privilegeData", "Privilege data", applicationVersionData, false);
		applicationVersion.addReference("perspectiveData", "Perspective data", applicationVersionData, false);

		applicationVersionData.addText("data", "Data");
		applicationVersionData.addInteger("dataRows", "Data rows");
		applicationVersionData.addText("dataAdded", "Data added");
		applicationVersionData.addInteger("dataAddedRows", "Data added rows");
		applicationVersionData.addText("dataRemoved", "Data removed");
		applicationVersionData.addInteger("dataRemovedRows", "Data removed rows");

		localizationKey.addReference("application", "Application", application, false);
		localizationKey.addText("key", "Key");
		localizationKey.addBoolean("used", "Used");
		localizationKey.addEnum("localizationKeyFormat", "Localization key format", localizationKeyFormat);
		localizationKey.addEnum("localizationKeyType", "Localization key type", localizationKeyType);
		localizationKey.addText("comments", "Comments");
		localizationKey.addMultiReference("localizationValues", "Localization values", localizationValue, false);
		localizationKey.addMultiReference("topics", "Topics", localizationTopic, false);

		localizationTopic.addMultiReference("keys", "Keys", localizationKey, false);
		localizationTopic.addReference("application", "Application", application, false);
		localizationTopic.addText("icon", "Icon");
		localizationTopic.addText("title", "Title");
		localizationTopic.addFile("screenshot", "Screenshot", true, 100000, false);

		localizationValue.addReference("localizationKey", "Localization key", localizationKey, false);
		localizationValue.addText("language", "Language");
		localizationValue.addText("original", "Original");
		localizationValue.addText("machineTranslation", "Machine translation");
		localizationValue.addText("translation", "Translation");
		localizationValue.addText("adminLocalOverride", "Admin local override");
		localizationValue.addText("adminKeyOverride", "Admin key override");
		localizationValue.addText("currentDisplayValue", "Current display value");
		localizationValue.addText("notes", "Notes");
		localizationValue.addEnum("machineTranslationState", "Machine translation state", machineTranslationState);
		localizationValue.addEnum("translationState", "Translation state", translationState);
		localizationValue.addEnum("translationVerificationState", "Translation verification state", translationVerificationState);

		managedApplication.addReference("mainApplication", "Main application", application, false);
		managedApplication.addReference("organizationField", "Organization field", organizationField, false);
		managedApplication.addText("icon", "Icon");
		managedApplication.addText("titleKey", "Title key");
		managedApplication.addText("descriptionKey", "Description key");
		managedApplication.addBoolean("singleApplication", "Single application");
		managedApplication.addBoolean("darkTheme", "Dark theme");
		managedApplication.addBoolean("startOnLogin", "Start on login");
		managedApplication.addMultiReference("perspectives", "Perspectives", managedApplicationPerspective, true);
		managedApplication.addInteger("listingPosition", "Listing position");
		managedApplication.addBoolean("toolbarApplicationMenu", "Toolbar application menu");
		managedApplication.addReference("applicationGroup", "Application group", managedApplicationGroup, false);
		managedApplication.addBoolean("hidden", "Hidden");

		managedApplicationGroup.addText("icon", "Icon");
		managedApplicationGroup.addText("name", "Name");
		managedApplicationGroup.addText("titleKey", "Title key");
		managedApplicationGroup.addMultiReference("applications", "Applications", managedApplication, false);
		managedApplicationGroup.addInteger("listingPosition", "Listing position");

		managedApplicationPerspective.addReference("managedApplication", "Managed application", managedApplication, false);
		managedApplicationPerspective.addReference("applicationPerspective", "Application perspective", applicationPerspective, false);
		managedApplicationPerspective.addText("iconOverride", "Icon override");
		managedApplicationPerspective.addText("titleKeyOverride", "Title key override");
		managedApplicationPerspective.addText("descriptionKeyOverride", "Description key override");
		managedApplicationPerspective.addBoolean("toolbarPerspectiveMenu", "Toolbar perspective menu");
		managedApplicationPerspective.addInteger("listingPosition", "Listing position");

		newsBoardMessage.addBoolean("published", "Published");
		newsBoardMessage.addText("htmlMessage", "Html message");
		newsBoardMessage.addText("language", "Language");
		newsBoardMessage.addMultiReference("images", "Images", newsBoardMessageImage, true);
		newsBoardMessage.addMultiReference("translations", "Translations", newsBoardMessageTranslation, true);
		newsBoardMessage.addReference("organizationField", "Organization field", organizationField, false);
		newsBoardMessage.addReference("organizationUnit", "Organization unit", organizationUnit, false);

		newsBoardMessageImage.addFile("file", "File", true, 100000, false);
		newsBoardMessageImage.addFile("thumbnail", "Thumbnail", true, 100000, false);
		newsBoardMessageImage.addText("fileName", "File name");
		newsBoardMessageImage.addBoolean("embedded", "Embedded");
		newsBoardMessageImage.addInteger("position", "Position");

		newsBoardMessageTranslation.addReference("message", "Message", newsBoardMessage, false);
		newsBoardMessageTranslation.addText("language", "Language");
		newsBoardMessageTranslation.addText("translation", "Translation");

		organizationField.addTranslatableText("title", "Title");
		organizationField.addText("icon", "Icon");

		organizationFieldView.addTranslatableText("title", "Title");
		organizationFieldView.addText("icon", "Icon");

		organizationUnit.addTranslatableText("name", "Name");
		organizationUnit.addReference("parent", "Parent", organizationUnit, false);
		organizationUnit.addMultiReference("children", "Children", organizationUnit, false);
		organizationUnit.addReference("type", "Type", organizationUnitType, false);
		organizationUnit.addText("icon", "Icon");
		organizationUnit.addEnum("orgUnitLifeCycleStatus", "Org unit life cycle status", orgUnitLifeCycleStatus);
		organizationUnit.addReference("address", "Address", address, false);
		organizationUnit.addMultiReference("users", "Users", user, false);
		organizationUnit.addMultiReference("userRoleAssignments", "User role assignments", userRoleAssignment, false);
		organizationUnit.addTimestamp("lifeCycleChangeDatePrepareDeletion"); //new
		organizationUnit.addTimestamp("lifeCycleChangeDateInactive"); //new
		organizationUnit.addTimestamp("lifeCycleChangeDateDeleted"); //new

		organizationUnitType.addTranslatableText("name", "Name");
		organizationUnitType.addTranslatableText("abbreviation", "Abbreviation");
		organizationUnitType.addText("icon", "Icon");
		organizationUnitType.addBoolean("translateOrganizationUnits", "Translate organization units");
		organizationUnitType.addBoolean("allowUsers", "Allow users");
		organizationUnitType.addReference("defaultChildType", "Default child type", organizationUnitType, false);
		organizationUnitType.addMultiReference("possibleChildrenTypes", "Possible children types", organizationUnitType, false);
		organizationUnitType.addEnum("geoLocationType", "Geo location type", geoLocationType);

		organizationUnitTypeView.addTranslatableText("name", "Name");
		organizationUnitTypeView.addTranslatableText("abbreviation", "Abbreviation");
		organizationUnitTypeView.addText("icon", "Icon");
		organizationUnitTypeView.addBoolean("translateOrganizationUnits", "Translate organization units");
		organizationUnitTypeView.addBoolean("allowUserContainer", "Allow user container");
		organizationUnitTypeView.addReference("defaultChildType", "Default child type", organizationUnitTypeView, false);
		organizationUnitTypeView.addMultiReference("possibleChildrenTypes", "Possible children types", organizationUnitTypeView, false);
		organizationUnitTypeView.addEnum("geoLocationType", "Geo location type", geoLocationType);

		organizationUnitView.addTranslatableText("name", "Name");
		organizationUnitView.addReference("parent", "Parent", organizationUnitView, false);
		organizationUnitView.addMultiReference("children", "Children", organizationUnitView, false);
		organizationUnitView.addReference("type", "Type", organizationUnitTypeView, false);
		organizationUnitView.addText("icon", "Icon");
		organizationUnitView.addEnum("orgUnitLifeCycleStatus", "Org unit life cycle status", orgUnitLifeCycleStatus);
		organizationUnitView.addReference("address", "Address", addressView, false);

		role.addTranslatableText("title", "Title");
		role.addText("icon", "Icon");
		role.addEnum("roleType", "Role type", roleType);
		role.addReference("parent", "Parent", role, false);
		role.addMultiReference("children", "Children", role, false);
		role.addReference("organizationUnit", "Organization unit", organizationUnit, false);
		role.addMultiReference("allowedOrganizationUnitTypes", "Allowed organization unit types", organizationUnitType, false);
		role.addReference("organizationField", "Organization field", organizationField, false);
		role.addBoolean("delegatedCustomPrivilegeObjectRole", "Delegated custom privilege object role");
		role.addMultiReference("generalizationRoles", "Generalization roles", role, false);
		role.addMultiReference("specializationRoles", "Specialization roles", role, false);
		role.addMultiReference("privilegesReceivingRoles", "Privileges receiving roles", role, false);
		role.addMultiReference("privilegesSendingRoles", "Privileges sending roles", role, false);
		role.addBoolean("noDirectMemberships", "No direct memberships");
		role.addMultiReference("userRoleAssignments", "User role assignments", userRoleAssignment, true);
		role.addMultiReference("privilegeAssignments", "Privilege assignments", rolePrivilegeAssignment, true);
		role.addMultiReference("applicationRoleAssignments", "Application role assignments", roleApplicationRoleAssignment, true);
		role.addBoolean("protectedAssignments");
		role.addBoolean("twoFactorAuthRequired");
		role.addText("roleKey");

		roleApplicationRoleAssignment.addReference("role", "Role", role, false);
		roleApplicationRoleAssignment.addReference("application", "Application", application, false);
		roleApplicationRoleAssignment.addText("applicationRoleName", "Application role name");
		roleApplicationRoleAssignment.addReference("organizationFieldFilter", "Organization field filter", organizationField, false);
		roleApplicationRoleAssignment.addReference("fixedOrganizationRoot", "Fixed organization root", organizationUnit, false);
		roleApplicationRoleAssignment.addMultiReference("organizationUnitTypeFilter", "Organization unit type filter", organizationUnitType, false);
		roleApplicationRoleAssignment.addBoolean("noInheritanceOfOrganizationalUnits", "Noinheritance of organizational units");

		rolePrivilegeAssignment.addReference("role", "Role", role, false);
		rolePrivilegeAssignment.addReference("application", "Application", application, false);
		rolePrivilegeAssignment.addReference("privilegeGroup", "Privilege group", applicationPrivilegeGroup, false);
		rolePrivilegeAssignment.addMultiReference("privileges", "Privileges", applicationPrivilege, false);
		rolePrivilegeAssignment.addText("privilegeObjects", "Privilege objects");
		rolePrivilegeAssignment.addBoolean("privilegeObjectInheritance", "Privilege object inheritance");
		rolePrivilegeAssignment.addReference("organizationFieldFilter", "Organization field filter", organizationField, false);
		rolePrivilegeAssignment.addReference("fixedOrganizationRoot", "Fixed organization root", organizationUnit, false);
		rolePrivilegeAssignment.addMultiReference("organizationUnitTypeFilter", "Organization unit type filter", organizationUnitType, false);
		rolePrivilegeAssignment.addBoolean("noInheritanceOfOrganizationalUnits", "Noinheritance of organizational units");

		systemLog.addReference("managedApplication", "Managed application", managedApplication, false);
		systemLog.addReference("managedPerspective", "Managed perspective", managedApplicationPerspective, false);
		systemLog.addReference("application", "Application", application, false);
		systemLog.addReference("applicationPerspective", "Application perspective", applicationPerspective, false);
		systemLog.addReference("applicationVersion", "Application version", applicationVersion, false);
		systemLog.addEnum("logLevel", "Log level", logLevel);
		systemLog.addText("thread", "Thread");
		systemLog.addText("message", "Message");
		systemLog.addText("details", "Details");
		systemLog.addText("exceptionClass", "Exception class");

		systemSettings.addText("allowedBaseLanguages", "Allowed base languages");

		user.addEnum("gender", "gender", gender);
		user.addText("firstName", "First name");
		user.addText("firstNameTranslated", "First name translated");
		user.addText("lastName", "Last name");
		user.addText("lastNameTranslated", "Last name translated");
		user.addByteArray("profilePicture", "Profile picture");
		user.addByteArray("profilePictureLarge", "Profile picture large");
		user.addText("displayLanguage", "Display language");
		user.addText("email", "Email");
		user.addText("mobile", "Mobile");
		user.addText("phone", "Phone");
		user.addText("login", "Login");
		user.addText("password", "Password");
		user.addText("theme", "Theme");
		user.addBoolean("darkTheme", "Dark theme");
		user.addEnum("userAccountStatus", "User account status", userAccountStatus);
		user.addReference("address", "Address", address, true);
		user.addReference("organizationUnit", "Organization unit", organizationUnit, false);
		user.addMultiReference("accessTokens", "Access tokens", userAccessToken, true);
		user.addMultiReference("roleAssignments", "Role assignments", userRoleAssignment, true);
		user.addMultiReference("languageSettings", "Language settings", userLanguageSettings, true);
		user.addReference("loginStats", "Login stats", userLoginStats, true);
		user.addText("totpSecret");
		user.addEnum(totpAuthenticationType);
		user.addText("multiFactorPrivilegesSecureHash");

		userAccessToken.addReference("user", "User", user, false);
		userAccessToken.addText("userAgentOnCreation", "User agent on creation");
		userAccessToken.addText("userAgentLastUsed", "User agent last used");
		userAccessToken.addTimestamp("lastUsed", "Last used");
		userAccessToken.addTimestamp("lastTotpAuthentication");
		userAccessToken.addBoolean("valid", "Valid");
		userAccessToken.addBoolean("restApi", "Rest api");
		userAccessToken.addText("secureToken", "Secure token");

		userLanguageSettings.addText("language", "Language");
		userLanguageSettings.addEnum("languageSkillLevel", "Language skill level", languageSkillLevel);

		userLoginStats.addReference("user", "User", user, false);
		userLoginStats.addTimestamp("firstLogin", "First login");
		userLoginStats.addTimestamp("lastLogin", "Last login");
		userLoginStats.addInteger("loginCount", "Login count");
		userLoginStats.addText("lastLoginIpAddress", "Last login ip address");
		userLoginStats.addTimestamp("wrongPasswordTimestamp", "Wrong password timestamp");
		userLoginStats.addText("wrongPasswordIpAddress", "Wrong password ip address");
		userLoginStats.addInteger("wrongPasswordCount", "Wrong password count");
		userLoginStats.addTimestamp("lastTotpAuthentication");

		userRoleAssignment.addReference("user", "User", user, false);
		userRoleAssignment.addReference("role", "Role", role, false);
		userRoleAssignment.addReference("organizationUnit", "Organization unit", organizationUnit, false);
		userRoleAssignment.addInteger("delegatedCustomPrivilegeObjectId", "Delegated custom privilege object id");
		userRoleAssignment.addBoolean("mainResponsible", "Main responsible");
		userRoleAssignment.addTimestamp("lastVerified", "Last verified");
		userRoleAssignment.addReference("lastVerifiedBy", "Last verified by", user, false);

		userView.addText("firstName", "First name");
		userView.addText("firstNameTranslated", "First name translated");
		userView.addText("lastName", "Last name");
		userView.addText("lastNameTranslated", "Last name translated");
		userView.addByteArray("profilePicture", "Profile picture");
		userView.addByteArray("profilePictureLarge", "Profile picture large");
		userView.addText("language", "Language");
		userView.addReference("organizationUnit", "Organization unit", organizationUnitView, false);

		model.addReverseReferenceField(application, "perspectives", applicationPerspective, "application");
		model.addReverseReferenceField(application, "privilegeGroups", applicationPrivilegeGroup, "application");
		model.addReverseReferenceField(application, "versions", applicationVersion, "application");
		model.addReverseReferenceField(application, "installedAsMainApplication", managedApplication, "mainApplication");
		model.addReverseReferenceField(applicationPerspective, "application", application, "perspectives");
		model.addReverseReferenceField(applicationPerspective, "managedPerspectives", managedApplicationPerspective, "applicationPerspective");
		model.addReverseReferenceField(applicationPrivilege, "privilegeGroup", applicationPrivilegeGroup, "privileges");
		model.addReverseReferenceField(applicationPrivilegeGroup, "application", application, "privilegeGroups");
		model.addReverseReferenceField(applicationPrivilegeGroup, "privileges", applicationPrivilege, "privilegeGroup");
		model.addReverseReferenceField(applicationVersion, "application", application, "versions");
		model.addReverseReferenceField(localizationKey, "localizationValues", localizationValue, "localizationKey");
		model.addReverseReferenceField(localizationKey, "topics", localizationTopic, "keys");
		model.addReverseReferenceField(localizationTopic, "keys", localizationKey, "topics");
		model.addReverseReferenceField(localizationValue, "localizationKey", localizationKey, "localizationValues");
		model.addReverseReferenceField(managedApplication, "mainApplication", application, "installedAsMainApplication");
		model.addReverseReferenceField(managedApplication, "perspectives", managedApplicationPerspective, "managedApplication");
		model.addReverseReferenceField(managedApplication, "applicationGroup", managedApplicationGroup, "applications");
		model.addReverseReferenceField(managedApplicationGroup, "applications", managedApplication, "applicationGroup");
		model.addReverseReferenceField(managedApplicationPerspective, "managedApplication", managedApplication, "perspectives");
		model.addReverseReferenceField(managedApplicationPerspective, "applicationPerspective", applicationPerspective, "managedPerspectives");
		model.addReverseReferenceField(newsBoardMessage, "translations", newsBoardMessageTranslation, "message");
		model.addReverseReferenceField(newsBoardMessageTranslation, "message", newsBoardMessage, "translations");
		model.addReverseReferenceField(organizationUnit, "parent", organizationUnit, "children");
		model.addReverseReferenceField(organizationUnit, "children", organizationUnit, "parent");
		model.addReverseReferenceField(organizationUnit, "users", user, "organizationUnit");
		model.addReverseReferenceField(organizationUnit, "userRoleAssignments", userRoleAssignment, "organizationUnit");
		model.addReverseReferenceField(role, "parent", role, "children");
		model.addReverseReferenceField(role, "children", role, "parent");
		model.addReverseReferenceField(role, "generalizationRoles", role, "specializationRoles");
		model.addReverseReferenceField(role, "specializationRoles", role, "generalizationRoles");
		model.addReverseReferenceField(role, "privilegesReceivingRoles", role, "privilegesSendingRoles");
		model.addReverseReferenceField(role, "privilegesSendingRoles", role, "privilegesReceivingRoles");
		model.addReverseReferenceField(role, "userRoleAssignments", userRoleAssignment, "role");
		model.addReverseReferenceField(role, "privilegeAssignments", rolePrivilegeAssignment, "role");
		model.addReverseReferenceField(role, "applicationRoleAssignments", roleApplicationRoleAssignment, "role");
		model.addReverseReferenceField(roleApplicationRoleAssignment, "role", role, "applicationRoleAssignments");
		model.addReverseReferenceField(rolePrivilegeAssignment, "role", role, "privilegeAssignments");
		model.addReverseReferenceField(user, "organizationUnit", organizationUnit, "users");
		model.addReverseReferenceField(user, "accessTokens", userAccessToken, "user");
		model.addReverseReferenceField(user, "roleAssignments", userRoleAssignment, "user");
		model.addReverseReferenceField(user, "loginStats", userLoginStats, "user");
		model.addReverseReferenceField(userAccessToken, "user", user, "accessTokens");
		model.addReverseReferenceField(userLoginStats, "user", user, "loginStats");
		model.addReverseReferenceField(userRoleAssignment, "user", user, "roleAssignments");
		model.addReverseReferenceField(userRoleAssignment, "role", role, "userRoleAssignments");
		model.addReverseReferenceField(userRoleAssignment, "organizationUnit", organizationUnit, "userRoleAssignments");

		return model;
	}

}
