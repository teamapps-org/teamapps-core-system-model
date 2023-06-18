/*-
 * ========================LICENSE_START=================================
 * TeamApps Core System Model
 * ---
 * Copyright (C) 2020 - 2023 TeamApps.org
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
		model.setPojoBuildTime(1687083703603L);
		EnumModel applicationPrivilegeGroupType = model.createEnum("applicationPrivilegeGroupType", "Application privilege group type", Arrays.asList("simplePrivilege", "simpleOrganizationalPrivilege", "simpleCustomObjectPrivilege", "standardPrivilegeGroup", "organizationalPrivilegeGroup", "customObjectPrivilegeGroup", "roleAssignmentDelegatedCustomPrivilegeGroup"), Arrays.asList("Simple privilege", "Simple organizational privilege", "Simple custom object privilege", "Standard privilege group", "Organizational privilege group", "Custom object privilege group", "Role assignment delegated custom privilege group"));
		EnumModel geoLocationType = model.createEnum("geoLocationType", "Geo location type", Arrays.asList("country", "state", "city", "place", "none"), Arrays.asList("country", "state", "city", "place", "none"));
		EnumModel languageSkillLevel = model.createEnum("languageSkillLevel", "Language skill level", Arrays.asList("motherTongue", "excellent", "good", "unknown"), Arrays.asList("Mother tongue", "Excellent", "Good", "Unknown"));
		EnumModel localizationKeyFormat = model.createEnum("localizationKeyFormat", "Localization key format", Arrays.asList("singleLine", "multiLine", "formatted"), Arrays.asList("Single line", "Multi line", "formatted"));
		EnumModel localizationKeyType = model.createEnum("localizationKeyType", "Localization key type", Arrays.asList("applicationResourceKey", "dictionaryKey", "reportingKey", "systemKey"), Arrays.asList("Application resource key", "Dictionary key", "Reporting key", "System key"));
		EnumModel logLevel = model.createEnum("logLevel", "Log level", Arrays.asList("info", "warning", "error"), Arrays.asList("info", "warning", "error"));
		EnumModel machineTranslationState = model.createEnum("machineTranslationState", "Machine translation state", Arrays.asList("translationRequested", "ok", "failed", "notNecessary"), Arrays.asList("Translation requested", "ok", "failed", "Not necessary"));
		EnumModel orgUnitLifeCycleStatus = model.createEnum("orgUnitLifeCycleStatus", "Org unit life cycle status", Arrays.asList("active", "inactive", "prepareDeletion"), Arrays.asList("active", "inactive", "Prepare deletion"));
		EnumModel roleType = model.createEnum("roleType", "Role type", Arrays.asList("leader", "assistant", "mentor", "administrator", "other"), Arrays.asList("leader", "assistant", "mentor", "administrator", "other"));
		EnumModel translationState = model.createEnum("translationState", "Translation state", Arrays.asList("translationRequested", "ok", "unclear", "notNecessary"), Arrays.asList("Translation requested", "ok", "unclear", "Not necessary"));
		EnumModel translationVerificationState = model.createEnum("translationVerificationState", "Translation verification state", Arrays.asList("notYetTranslated", "verificationRequested", "ok", "correctionsRequired", "notNecessary"), Arrays.asList("Not yet translated", "Verification requested", "ok", "Corrections required", "Not necessary"));
		EnumModel userAccountStatus = model.createEnum("userAccountStatus", "User account status", Arrays.asList("active", "inactive", "superAdmin"), Arrays.asList("active", "inactive", "Super admin"));

		TableModel address = model.createTable("address", "address", true, false, true);
		TableModel application = model.createTable("application", "application", true, false, true);
		TableModel applicationPerspective = model.createTable("applicationPerspective", "Application perspective", true, false, true);
		TableModel applicationPrivilege = model.createTable("applicationPrivilege", "Application privilege", true, false, true);
		TableModel applicationPrivilegeGroup = model.createTable("applicationPrivilegeGroup", "Application privilege group", true, false, true);
		TableModel applicationVersion = model.createTable("applicationVersion", "Application version", true, false, true);
		TableModel applicationVersionData = model.createTable("applicationVersionData", "Application version data", true, false, true);
		TableModel localizationKey = model.createTable("localizationKey", "Localization key", true, false, true);
		TableModel localizationTopic = model.createTable("localizationTopic", "Localization topic", true, false, true);
		TableModel localizationValue = model.createTable("localizationValue", "Localization value", true, false, true);
		TableModel login = model.createTable("login", "login", false, false, true);
		TableModel managedApplication = model.createTable("managedApplication", "Managed application", true, false, true);
		TableModel managedApplicationGroup = model.createTable("managedApplicationGroup", "Managed application group", true, false, true);
		TableModel managedApplicationPerspective = model.createTable("managedApplicationPerspective", "Managed application perspective", true, false, true);
		TableModel newsBoardMessage = model.createTable("newsBoardMessage", "News board message", true, false, true);
		TableModel newsBoardMessageImage = model.createTable("newsBoardMessageImage", "News board message image", true, false, true);
		TableModel newsBoardMessageTranslation = model.createTable("newsBoardMessageTranslation", "News board message translation", true, false, true);
		TableModel organizationField = model.createTable("organizationField", "Organization field", true, false, true);
		TableModel organizationUnit = model.createTable("organizationUnit", "Organization unit", true, false, true);
		TableModel organizationUnitType = model.createTable("organizationUnitType", "Organization unit type", true, false, true);
		TableModel role = model.createTable("role", "role", true, false, true);
		TableModel roleApplicationRoleAssignment = model.createTable("roleApplicationRoleAssignment", "Role application role assignment", true, false, true);
		TableModel rolePrivilegeAssignment = model.createTable("rolePrivilegeAssignment", "Role privilege assignment", true, false, true);
		TableModel systemLog = model.createTable("systemLog", "System log", true, false, true);
		TableModel systemSettings = model.createTable("systemSettings", "System settings", true, false, true);
		TableModel user = model.createTable("user", "user", true, false, true);
		TableModel userAcceptedPolicy = model.createTable("userAcceptedPolicy", "User accepted policy", true, false, true);
		TableModel userAcceptedPolicyEntries = model.createTable("userAcceptedPolicyEntries", "User accepted policy entries", true, false, true);
		TableModel userAccessToken = model.createTable("userAccessToken", "User access token", false, false, true);
		TableModel userLanguageSettings = model.createTable("userLanguageSettings", "User language settings", true, false, true);
		TableModel userLoginStats = model.createTable("userLoginStats", "User login stats", false, false, false);
		TableModel userRoleAssignment = model.createTable("userRoleAssignment", "User role assignment", true, false, true);

		TableModel addressView = model.createRemoteTable("addressView", "Address view", "address", "controlCenter", null);
		TableModel organizationFieldView = model.createRemoteTable("organizationFieldView", "Organization field view", "organizationField", "controlCenter", null);
		TableModel organizationUnitTypeView = model.createRemoteTable("organizationUnitTypeView", "Organization unit type view", "organizationUnitType", "controlCenter", null);
		TableModel organizationUnitView = model.createRemoteTable("organizationUnitView", "Organization unit view", "organizationUnit", "controlCenter", null);
		TableModel userView = model.createRemoteTable("userView", "User view", "user", "controlCenter", null);


		address.addText("name", "name");
		address.addText("organisation", "organisation");
		address.addText("street", "street");
		address.addText("city", "city");
		address.addText("dependentLocality", "Dependent locality");
		address.addText("state", "state");
		address.addText("postalCode", "Postal code");
		address.addText("country", "country");
		address.addFloat("latitude", "latitude");
		address.addFloat("longitude", "longitude");

		addressView.addText("name", "name");
		addressView.addText("organisation", "organisation");
		addressView.addText("street", "street");
		addressView.addText("city", "city");
		addressView.addText("dependentLocality", "Dependent locality");
		addressView.addText("state", "state");
		addressView.addText("postalCode", "Postal code");
		addressView.addText("country", "country");
		addressView.addFloat("latitude", "latitude");
		addressView.addFloat("longitude", "longitude");

		application.addText("name", "name");
		application.addText("icon", "icon");
		application.addText("titleKey", "Title key");
		application.addText("descriptionKey", "Description key");
		application.addBoolean("uninstalled", "uninstalled");
		application.addBoolean("unmanagedApplication", "Unmanaged application");
		application.addText("config", "config");
		application.addBoolean("darkTheme", "Dark theme");
		application.addMultiReference("perspectives", "perspectives", applicationPerspective, true);
		application.addMultiReference("privilegeGroups", "Privilege groups", applicationPrivilegeGroup, false);
		application.addMultiReference("versions", "versions", applicationVersion, false);
		application.addReference("installedVersion", "Installed version", applicationVersion, false);
		application.addMultiReference("installedAsMainApplication", "Installed as main application", managedApplication, false);

		applicationPerspective.addReference("application", "application", application, false);
		applicationPerspective.addText("name", "name");
		applicationPerspective.addText("icon", "icon");
		applicationPerspective.addText("titleKey", "Title key");
		applicationPerspective.addText("descriptionKey", "Description key");
		applicationPerspective.addBoolean("autoProvision", "Auto provision");
		applicationPerspective.addBoolean("toolbarPerspectiveMenu", "Toolbar perspective menu");
		applicationPerspective.addMultiReference("managedPerspectives", "Managed perspectives", managedApplicationPerspective, true);

		applicationPrivilege.addReference("privilegeGroup", "Privilege group", applicationPrivilegeGroup, false);
		applicationPrivilege.addText("name", "name");
		applicationPrivilege.addText("icon", "icon");
		applicationPrivilege.addText("titleKey", "Title key");

		applicationPrivilegeGroup.addReference("application", "application", application, false);
		applicationPrivilegeGroup.addEnum("applicationPrivilegeGroupType", "Application privilege group type", applicationPrivilegeGroupType);
		applicationPrivilegeGroup.addText("name", "name");
		applicationPrivilegeGroup.addText("icon", "icon");
		applicationPrivilegeGroup.addText("titleKey", "Title key");
		applicationPrivilegeGroup.addText("descriptionKey", "Description key");
		applicationPrivilegeGroup.addMultiReference("privileges", "privileges", applicationPrivilege, false);

		applicationVersion.addReference("application", "application", application, false);
		applicationVersion.addFile("binary", "binary", true, 100000, false);
		applicationVersion.addText("binaryHash", "Binary hash");
		applicationVersion.addText("version", "version");
		applicationVersion.addText("releaseNotes", "Release notes");
		applicationVersion.addReference("dataModelData", "Data model data", applicationVersionData, false);
		applicationVersion.addReference("localizationData", "Localization data", applicationVersionData, false);
		applicationVersion.addReference("privilegeData", "Privilege data", applicationVersionData, false);
		applicationVersion.addReference("perspectiveData", "Perspective data", applicationVersionData, false);

		applicationVersionData.addText("data", "data");
		applicationVersionData.addInteger("dataRows", "Data rows");
		applicationVersionData.addText("dataAdded", "Data added");
		applicationVersionData.addInteger("dataAddedRows", "Data added rows");
		applicationVersionData.addText("dataRemoved", "Data removed");
		applicationVersionData.addInteger("dataRemovedRows", "Data removed rows");

		localizationKey.addReference("application", "application", application, false);
		localizationKey.addText("key", "key");
		localizationKey.addBoolean("used", "used");
		localizationKey.addEnum("localizationKeyFormat", "Localization key format", localizationKeyFormat);
		localizationKey.addEnum("localizationKeyType", "Localization key type", localizationKeyType);
		localizationKey.addText("comments", "comments");
		localizationKey.addMultiReference("localizationValues", "Localization values", localizationValue, false);
		localizationKey.addMultiReference("topics", "topics", localizationTopic, false);

		localizationTopic.addMultiReference("keys", "keys", localizationKey, false);
		localizationTopic.addReference("application", "application", application, false);
		localizationTopic.addText("icon", "icon");
		localizationTopic.addText("title", "title");
		localizationTopic.addFile("screenshot", "screenshot", true, 100000, false);

		localizationValue.addReference("localizationKey", "Localization key", localizationKey, false);
		localizationValue.addText("language", "language");
		localizationValue.addText("original", "original");
		localizationValue.addText("machineTranslation", "Machine translation");
		localizationValue.addText("translation", "translation");
		localizationValue.addText("adminLocalOverride", "Admin local override");
		localizationValue.addText("adminKeyOverride", "Admin key override");
		localizationValue.addText("currentDisplayValue", "Current display value");
		localizationValue.addText("notes", "notes");
		localizationValue.addEnum("machineTranslationState", "Machine translation state", machineTranslationState);
		localizationValue.addEnum("translationState", "Translation state", translationState);
		localizationValue.addEnum("translationVerificationState", "Translation verification state", translationVerificationState);

		login.addReference("user", "user", user, false);
		login.addText("ip", "ip");
		login.addText("userAgent", "User agent");
		login.addBoolean("mobileDevice", "Mobile device");
		login.addText("screenSize", "Screen size");
		login.addTimestamp("dateLogin", "Date login");
		login.addTimestamp("dateLogout", "Date logout");
		login.addInteger("activityCount", "Activity count");
		login.addInteger("applicationOpenCount", "Application open count");

		managedApplication.addReference("mainApplication", "Main application", application, false);
		managedApplication.addReference("organizationField", "Organization field", organizationField, false);
		managedApplication.addText("icon", "icon");
		managedApplication.addText("titleKey", "Title key");
		managedApplication.addText("descriptionKey", "Description key");
		managedApplication.addBoolean("singleApplication", "Single application");
		managedApplication.addBoolean("darkTheme", "Dark theme");
		managedApplication.addBoolean("startOnLogin", "Start on login");
		managedApplication.addMultiReference("perspectives", "perspectives", managedApplicationPerspective, true);
		managedApplication.addInteger("listingPosition", "Listing position");
		managedApplication.addBoolean("toolbarApplicationMenu", "Toolbar application menu");
		managedApplication.addReference("applicationGroup", "Application group", managedApplicationGroup, false);
		managedApplication.addBoolean("hidden", "hidden");

		managedApplicationGroup.addText("icon", "icon");
		managedApplicationGroup.addText("name", "name");
		managedApplicationGroup.addText("titleKey", "Title key");
		managedApplicationGroup.addMultiReference("applications", "applications", managedApplication, false);
		managedApplicationGroup.addInteger("listingPosition", "Listing position");

		managedApplicationPerspective.addReference("managedApplication", "Managed application", managedApplication, false);
		managedApplicationPerspective.addReference("applicationPerspective", "Application perspective", applicationPerspective, false);
		managedApplicationPerspective.addText("iconOverride", "Icon override");
		managedApplicationPerspective.addText("titleKeyOverride", "Title key override");
		managedApplicationPerspective.addText("descriptionKeyOverride", "Description key override");
		managedApplicationPerspective.addBoolean("toolbarPerspectiveMenu", "Toolbar perspective menu");
		managedApplicationPerspective.addInteger("listingPosition", "Listing position");

		newsBoardMessage.addBoolean("published", "published");
		newsBoardMessage.addText("htmlMessage", "Html message");
		newsBoardMessage.addText("language", "language");
		newsBoardMessage.addMultiReference("images", "images", newsBoardMessageImage, true);
		newsBoardMessage.addMultiReference("translations", "translations", newsBoardMessageTranslation, true);
		newsBoardMessage.addReference("organizationField", "Organization field", organizationField, false);
		newsBoardMessage.addReference("organizationUnit", "Organization unit", organizationUnit, false);

		newsBoardMessageImage.addFile("file", "file", true, 100000, false);
		newsBoardMessageImage.addFile("thumbnail", "thumbnail", true, 100000, false);
		newsBoardMessageImage.addText("fileName", "File name");
		newsBoardMessageImage.addBoolean("embedded", "embedded");
		newsBoardMessageImage.addInteger("position", "position");

		newsBoardMessageTranslation.addReference("message", "message", newsBoardMessage, false);
		newsBoardMessageTranslation.addText("language", "language");
		newsBoardMessageTranslation.addText("translation", "translation");

		organizationField.addTranslatableText("title", "title");
		organizationField.addText("icon", "icon");

		organizationFieldView.addTranslatableText("title", "title");
		organizationFieldView.addText("icon", "icon");

		organizationUnit.addTranslatableText("name", "name");
		organizationUnit.addReference("parent", "parent", organizationUnit, false);
		organizationUnit.addMultiReference("children", "children", organizationUnit, false);
		organizationUnit.addReference("type", "type", organizationUnitType, false);
		organizationUnit.addText("icon", "icon");
		organizationUnit.addEnum("orgUnitLifeCycleStatus", "Org unit life cycle status", orgUnitLifeCycleStatus);
		organizationUnit.addReference("address", "address", address, false);
		organizationUnit.addMultiReference("users", "users", user, false);
		organizationUnit.addMultiReference("userRoleAssignments", "User role assignments", userRoleAssignment, false);

		organizationUnitType.addTranslatableText("name", "name");
		organizationUnitType.addTranslatableText("abbreviation", "abbreviation");
		organizationUnitType.addText("icon", "icon");
		organizationUnitType.addBoolean("translateOrganizationUnits", "Translate organization units");
		organizationUnitType.addBoolean("allowUsers", "Allow users");
		organizationUnitType.addReference("defaultChildType", "Default child type", organizationUnitType, false);
		organizationUnitType.addMultiReference("possibleChildrenTypes", "Possible children types", organizationUnitType, false);
		organizationUnitType.addEnum("geoLocationType", "Geo location type", geoLocationType);

		organizationUnitTypeView.addTranslatableText("name", "name");
		organizationUnitTypeView.addTranslatableText("abbreviation", "abbreviation");
		organizationUnitTypeView.addText("icon", "icon");
		organizationUnitTypeView.addBoolean("translateOrganizationUnits", "Translate organization units");
		organizationUnitTypeView.addBoolean("allowUserContainer", "Allow user container");
		organizationUnitTypeView.addReference("defaultChildType", "Default child type", organizationUnitTypeView, false);
		organizationUnitTypeView.addMultiReference("possibleChildrenTypes", "Possible children types", organizationUnitTypeView, false);
		organizationUnitTypeView.addEnum("geoLocationType", "Geo location type", geoLocationType);

		organizationUnitView.addTranslatableText("name", "name");
		organizationUnitView.addReference("parent", "parent", organizationUnitView, false);
		organizationUnitView.addMultiReference("children", "children", organizationUnitView, false);
		organizationUnitView.addReference("type", "type", organizationUnitTypeView, false);
		organizationUnitView.addText("icon", "icon");
		organizationUnitView.addEnum("orgUnitLifeCycleStatus", "Org unit life cycle status", orgUnitLifeCycleStatus);
		organizationUnitView.addReference("address", "address", addressView, false);

		role.addTranslatableText("title", "title");
		role.addText("icon", "icon");
		role.addEnum("roleType", "Role type", roleType);
		role.addReference("parent", "parent", role, false);
		role.addMultiReference("children", "children", role, false);
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

		roleApplicationRoleAssignment.addReference("role", "role", role, false);
		roleApplicationRoleAssignment.addReference("application", "application", application, false);
		roleApplicationRoleAssignment.addText("applicationRoleName", "Application role name");
		roleApplicationRoleAssignment.addReference("organizationFieldFilter", "Organization field filter", organizationField, false);
		roleApplicationRoleAssignment.addReference("fixedOrganizationRoot", "Fixed organization root", organizationUnit, false);
		roleApplicationRoleAssignment.addMultiReference("organizationUnitTypeFilter", "Organization unit type filter", organizationUnitType, false);
		roleApplicationRoleAssignment.addBoolean("noInheritanceOfOrganizationalUnits", "Noinheritance of organizational units");

		rolePrivilegeAssignment.addReference("role", "role", role, false);
		rolePrivilegeAssignment.addReference("application", "application", application, false);
		rolePrivilegeAssignment.addReference("privilegeGroup", "Privilege group", applicationPrivilegeGroup, false);
		rolePrivilegeAssignment.addMultiReference("privileges", "privileges", applicationPrivilege, false);
		rolePrivilegeAssignment.addText("privilegeObjects", "Privilege objects");
		rolePrivilegeAssignment.addBoolean("privilegeObjectInheritance", "Privilege object inheritance");
		rolePrivilegeAssignment.addReference("organizationFieldFilter", "Organization field filter", organizationField, false);
		rolePrivilegeAssignment.addReference("fixedOrganizationRoot", "Fixed organization root", organizationUnit, false);
		rolePrivilegeAssignment.addMultiReference("organizationUnitTypeFilter", "Organization unit type filter", organizationUnitType, false);
		rolePrivilegeAssignment.addBoolean("noInheritanceOfOrganizationalUnits", "Noinheritance of organizational units");

		systemLog.addReference("managedApplication", "Managed application", managedApplication, false);
		systemLog.addReference("managedPerspective", "Managed perspective", managedApplicationPerspective, false);
		systemLog.addReference("application", "application", application, false);
		systemLog.addReference("applicationPerspective", "Application perspective", applicationPerspective, false);
		systemLog.addReference("applicationVersion", "Application version", applicationVersion, false);
		systemLog.addEnum("logLevel", "Log level", logLevel);
		systemLog.addText("thread", "thread");
		systemLog.addText("message", "message");
		systemLog.addText("details", "details");
		systemLog.addText("exceptionClass", "Exception class");

		systemSettings.addText("allowedBaseLanguages", "Allowed base languages");

		user.addText("firstName", "First name");
		user.addText("firstNameTranslated", "First name translated");
		user.addText("lastName", "Last name");
		user.addText("lastNameTranslated", "Last name translated");
		user.addByteArray("profilePicture", "Profile picture");
		user.addByteArray("profilePictureLarge", "Profile picture large");
		user.addText("displayLanguage", "Display language");
		user.addText("email", "email");
		user.addText("mobile", "mobile");
		user.addText("phone", "phone");
		user.addText("login", "login");
		user.addTimestamp("lastLogin", "Last login");
		user.addText("password", "password");
		user.addText("theme", "theme");
		user.addBoolean("darkTheme", "Dark theme");
		user.addEnum("userAccountStatus", "User account status", userAccountStatus);
		user.addReference("acceptedPolicies", "Accepted policies", userAcceptedPolicy, false);
		user.addReference("address", "address", address, false);
		user.addReference("organizationUnit", "Organization unit", organizationUnit, false);
		user.addMultiReference("accessTokens", "Access tokens", userAccessToken, true);
		user.addMultiReference("roleAssignments", "Role assignments", userRoleAssignment, true);
		user.addMultiReference("languageSettings", "Language settings", userLanguageSettings, false);
		user.addReference("loginStats", "Login stats", userLoginStats, false);

		userAcceptedPolicy.addInteger("lastAcceptedPrivacyPolicy", "Last accepted privacy policy");
		userAcceptedPolicy.addInteger("lastAcceptedTermsOfUse", "Last accepted terms of use");
		userAcceptedPolicy.addMultiReference("acceptEntries", "Accept entries", userAcceptedPolicyEntries, false);

		userAcceptedPolicyEntries.addInteger("acceptedPrivacyPolicy", "Accepted privacy policy");
		userAcceptedPolicyEntries.addInteger("acceptedTermsOfUse", "Accepted terms of use");

		userAccessToken.addReference("user", "user", user, false);
		userAccessToken.addText("userAgentOnCreation", "User agent on creation");
		userAccessToken.addText("userAgentLastUsed", "User agent last used");
		userAccessToken.addTimestamp("lastUsed", "Last used");
		userAccessToken.addBoolean("valid", "valid");
		userAccessToken.addBoolean("restApi", "Rest api");
		userAccessToken.addText("secureToken", "Secure token");

		userLanguageSettings.addText("language", "language");
		userLanguageSettings.addEnum("languageSkillLevel", "Language skill level", languageSkillLevel);

		userLoginStats.addReference("user", "user", user, false);
		userLoginStats.addTimestamp("firstLogin", "First login");
		userLoginStats.addTimestamp("lastLogin", "Last login");
		userLoginStats.addInteger("loginCount", "Login count");
		userLoginStats.addTimestamp("lastLoginIpAddress", "Last login ip address");
		userLoginStats.addTimestamp("wrongPasswordTimestamp", "Wrong password timestamp");
		userLoginStats.addTimestamp("wrongPasswordIpAddress", "Wrong password ip address");
		userLoginStats.addInteger("wrongPasswordCount", "Wrong password count");

		userRoleAssignment.addReference("user", "user", user, false);
		userRoleAssignment.addReference("role", "role", role, false);
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
		userView.addText("language", "language");
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
