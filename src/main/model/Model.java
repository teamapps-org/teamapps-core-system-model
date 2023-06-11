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
import org.teamapps.universaldb.model.TableModel;
import org.teamapps.universaldb.schema.*;

import java.util.Arrays;

import static org.teamapps.universaldb.schema.TableOption.*;

public class Model implements ModelProvider {

	@Override
	public DatabaseModel getModel() {
		DatabaseModel model = new DatabaseModel("controlCenter", "Control center", "org.teamapps.model", "coreSystemModel");
		model.setPojoBuildTime(1686232224912L);
		model.createEnum("userAccountStatus", "User account status", Arrays.asList("active", "inactive", "superAdmin"), Arrays.asList("active", "inactive", "Super admin"));
		model.createEnum("languageSkillLevel", "Language skill level", Arrays.asList("motherTongue", "excellent", "good", "unknown"), Arrays.asList("Mother tongue", "Excellent", "Good", "Unknown"));
		model.createEnum("orgUnitLifeCycleStatus", "Org unit life cycle status", Arrays.asList("active", "inactive", "prepareDeletion"), Arrays.asList("active", "inactive", "Prepare deletion"));
		model.createEnum("geoLocationType", "Geo location type", Arrays.asList("country", "state", "city", "place", "none"), Arrays.asList("country", "state", "city", "place", "none"));
//		model.createEnum("orgUnitLifeCycleStatus", "Org unit life cycle status", Arrays.asList("active", "inactive", "prepareDeletion"), Arrays.asList("active", "inactive", "Prepare deletion"));
//		model.createEnum("geoLocationType", "Geo location type", Arrays.asList("country", "state", "city", "place", "none"), Arrays.asList("country", "state", "city", "place", "none"));
		model.createEnum("roleType", "Role type", Arrays.asList("leader", "assistant", "mentor", "administrator", "other"), Arrays.asList("leader", "assistant", "mentor", "administrator", "other"));
		model.createEnum("logLevel", "Log level", Arrays.asList("info", "warning", "error"), Arrays.asList("info", "warning", "error"));
		model.createEnum("applicationPrivilegeGroupType", "Application privilege group type", Arrays.asList("simplePrivilege", "simpleOrganizationalPrivilege", "simpleCustomObjectPrivilege", "standardPrivilegeGroup", "organizationalPrivilegeGroup", "customObjectPrivilegeGroup", "roleAssignmentDelegatedCustomPrivilegeGroup"), Arrays.asList("Simple privilege", "Simple organizational privilege", "Simple custom object privilege", "Standard privilege group", "Organizational privilege group", "Custom object privilege group", "Role assignment delegated custom privilege group"));
		model.createEnum("localizationKeyFormat", "Localization key format", Arrays.asList("singleLine", "multiLine", "formatted"), Arrays.asList("Single line", "Multi line", "formatted"));
		model.createEnum("localizationKeyType", "Localization key type", Arrays.asList("applicationResourceKey", "dictionaryKey", "reportingKey", "systemKey"), Arrays.asList("Application resource key", "Dictionary key", "Reporting key", "System key"));
		model.createEnum("machineTranslationState", "Machine translation state", Arrays.asList("translationRequested", "ok", "failed", "notNecessary"), Arrays.asList("Translation requested", "ok", "failed", "Not necessary"));
		model.createEnum("translationState", "Translation state", Arrays.asList("translationRequested", "ok", "unclear", "notNecessary"), Arrays.asList("Translation requested", "ok", "unclear", "Not necessary"));
		model.createEnum("translationVerificationState", "Translation verification state", Arrays.asList("notYetTranslated", "verificationRequested", "ok", "correctionsRequired", "notNecessary"), Arrays.asList("Not yet translated", "Verification requested", "ok", "Corrections required", "Not necessary"));

		TableModel loginTable = model.createTable("login", "login", false, false, true);
		TableModel userTable = model.createTable("user", "user", true, false, true);
		TableModel userAcceptedPolicyTable = model.createTable("userAcceptedPolicy", "User accepted policy", true, false, true);
		TableModel userAcceptedPolicyEntriesTable = model.createTable("userAcceptedPolicyEntries", "User accepted policy entries", true, false, true);
		TableModel userAccessTokenTable = model.createTable("userAccessToken", "User access token", false, false, true);
		TableModel userLanguageSettingsTable = model.createTable("userLanguageSettings", "User language settings", true, false, true);
		TableModel userLoginStatsTable = model.createTable("userLoginStats", "User login stats", false, false, false);
		TableModel organizationUnitTable = model.createTable("organizationUnit", "Organization unit", true, false, true);
		TableModel organizationUnitTypeTable = model.createTable("organizationUnitType", "Organization unit type", true, false, true);
		TableModel organizationFieldTable = model.createTable("organizationField", "Organization field", true, false, true);
		TableModel addressTable = model.createTable("address", "address", true, false, true);
		TableModel roleTable = model.createTable("role", "role", true, false, true);
		TableModel userRoleAssignmentTable = model.createTable("userRoleAssignment", "User role assignment", true, false, true);
		TableModel rolePrivilegeAssignmentTable = model.createTable("rolePrivilegeAssignment", "Role privilege assignment", true, false, true);
		TableModel roleApplicationRoleAssignmentTable = model.createTable("roleApplicationRoleAssignment", "Role application role assignment", true, false, true);
		TableModel systemSettingsTable = model.createTable("systemSettings", "System settings", true, false, true);
		TableModel systemLogTable = model.createTable("systemLog", "System log", true, false, true);
		TableModel applicationTable = model.createTable("application", "application", true, false, true);
		TableModel applicationPerspectiveTable = model.createTable("applicationPerspective", "Application perspective", true, false, true);
		TableModel applicationPrivilegeGroupTable = model.createTable("applicationPrivilegeGroup", "Application privilege group", true, false, true);
		TableModel applicationPrivilegeTable = model.createTable("applicationPrivilege", "Application privilege", true, false, true);
		TableModel applicationVersionTable = model.createTable("applicationVersion", "Application version", true, false, true);
		TableModel applicationVersionDataTable = model.createTable("applicationVersionData", "Application version data", true, false, true);
		TableModel managedApplicationTable = model.createTable("managedApplication", "Managed application", true, false, true);
		TableModel managedApplicationPerspectiveTable = model.createTable("managedApplicationPerspective", "Managed application perspective", true, false, true);
		TableModel managedApplicationGroupTable = model.createTable("managedApplicationGroup", "Managed application group", true, false, true);
		TableModel localizationKeyTable = model.createTable("localizationKey", "Localization key", true, false, true);
		TableModel localizationValueTable = model.createTable("localizationValue", "Localization value", true, false, true);
		TableModel localizationTopicTable = model.createTable("localizationTopic", "Localization topic", true, false, true);
		TableModel newsBoardMessageTable = model.createTable("newsBoardMessage", "News board message", true, false, true);
		TableModel newsBoardMessageImageTable = model.createTable("newsBoardMessageImage", "News board message image", true, false, true);
		TableModel newsBoardMessageTranslationTable = model.createTable("newsBoardMessageTranslation", "News board message translation", true, false, true);
		TableModel organizationUnitViewTable = model.createRemoteTable("organizationUnitView", "Organization unit view", "controlCenter");
		TableModel organizationUnitTypeViewTable = model.createRemoteTable("organizationUnitTypeView", "Organization unit type view", "controlCenter");
		TableModel organizationFieldViewTable = model.createRemoteTable("organizationFieldView", "Organization field view", "controlCenter");
		TableModel addressViewTable = model.createRemoteTable("addressView", "Address view", "controlCenter");
		TableModel userViewTable = model.createRemoteTable("userView", "User view", "controlCenter");

		loginTable.addReference("user", "user", "user", false);
		loginTable.addText("ip", "ip");
		loginTable.addText("userAgent", "User agent");
		loginTable.addBoolean("mobileDevice", "Mobile device");
		loginTable.addText("screenSize", "Screen size");
		loginTable.addTimestamp("dateLogin", "Date login");
		loginTable.addTimestamp("dateLogout", "Date logout");
		loginTable.addInteger("activityCount", "Activity count");
		loginTable.addInteger("applicationOpenCount", "Application open count");

		userTable.addText("firstName", "First name");
		userTable.addText("firstNameTranslated", "First name translated");
		userTable.addText("lastName", "Last name");
		userTable.addText("lastNameTranslated", "Last name translated");
		userTable.addByteArray("profilePicture", "Profile picture");
		userTable.addByteArray("profilePictureLarge", "Profile picture large");
		userTable.addText("displayLanguage", "Display language");
		userTable.addText("email", "email");
		userTable.addText("mobile", "mobile");
		userTable.addText("phone", "phone");
		userTable.addText("login", "login");
		userTable.addTimestamp("lastLogin", "Last login");
		userTable.addText("password", "password");
		userTable.addText("theme", "theme");
		userTable.addBoolean("darkTheme", "Dark theme");
		userTable.addEnum("userAccountStatus", "User account status", "userAccountStatus");
		userTable.addReference("acceptedPolicies", "Accepted policies", "userAcceptedPolicy", false);
		userTable.addReference("address", "address", "address", false);
		userTable.addReference("organizationUnit", "Organization unit", "organizationUnit", false);
		userTable.addMultiReference("accessTokens", "Access tokens", "userAccessToken", true);
		userTable.addMultiReference("roleAssignments", "Role assignments", "userRoleAssignment", true);
		userTable.addMultiReference("languageSettings", "Language settings", "userLanguageSettings", false);
		userTable.addReference("loginStats", "Login stats", "userLoginStats", false);

		userAcceptedPolicyTable.addInteger("lastAcceptedPrivacyPolicy", "Last accepted privacy policy");
		userAcceptedPolicyTable.addInteger("lastAcceptedTermsOfUse", "Last accepted terms of use");
		userAcceptedPolicyTable.addMultiReference("acceptEntries", "Accept entries", "userAcceptedPolicyEntries", false);

		userAcceptedPolicyEntriesTable.addInteger("acceptedPrivacyPolicy", "Accepted privacy policy");
		userAcceptedPolicyEntriesTable.addInteger("acceptedTermsOfUse", "Accepted terms of use");

		userAccessTokenTable.addReference("user", "user", "user", false);
		userAccessTokenTable.addText("userAgentOnCreation", "User agent on creation");
		userAccessTokenTable.addText("userAgentLastUsed", "User agent last used");
		userAccessTokenTable.addTimestamp("lastUsed", "Last used");
		userAccessTokenTable.addBoolean("valid", "valid");
		userAccessTokenTable.addBoolean("restApi", "Rest api");
		userAccessTokenTable.addText("secureToken", "Secure token");

		userLanguageSettingsTable.addText("language", "language");
		userLanguageSettingsTable.addEnum("languageSkillLevel", "Language skill level", "languageSkillLevel");

		userLoginStatsTable.addReference("user", "user", "user", false);
		userLoginStatsTable.addTimestamp("firstLogin", "First login");
		userLoginStatsTable.addTimestamp("lastLogin", "Last login");
		userLoginStatsTable.addInteger("loginCount", "Login count");
		userLoginStatsTable.addTimestamp("lastLoginIpAddress", "Last login ip address");
		userLoginStatsTable.addTimestamp("wrongPasswordTimestamp", "Wrong password timestamp");
		userLoginStatsTable.addTimestamp("wrongPasswordIpAddress", "Wrong password ip address");
		userLoginStatsTable.addInteger("wrongPasswordCount", "Wrong password count");

		organizationUnitTable.addTranslatableText("name", "name");
		organizationUnitTable.addReference("parent", "parent", "organizationUnit", false);
		organizationUnitTable.addMultiReference("children", "children", "organizationUnit", false);
		organizationUnitTable.addReference("type", "type", "organizationUnitType", false);
		organizationUnitTable.addText("icon", "icon");
		organizationUnitTable.addEnum("orgUnitLifeCycleStatus", "Org unit life cycle status", "orgUnitLifeCycleStatus");
		organizationUnitTable.addReference("address", "address", "address", false);
		organizationUnitTable.addMultiReference("users", "users", "user", false);
		organizationUnitTable.addMultiReference("userRoleAssignments", "User role assignments", "userRoleAssignment", false);

		organizationUnitTypeTable.addTranslatableText("name", "name");
		organizationUnitTypeTable.addTranslatableText("abbreviation", "abbreviation");
		organizationUnitTypeTable.addText("icon", "icon");
		organizationUnitTypeTable.addBoolean("translateOrganizationUnits", "Translate organization units");
		organizationUnitTypeTable.addBoolean("allowUsers", "Allow users");
		organizationUnitTypeTable.addReference("defaultChildType", "Default child type", "organizationUnitType", false);
		organizationUnitTypeTable.addMultiReference("possibleChildrenTypes", "Possible children types", "organizationUnitType", false);
		organizationUnitTypeTable.addEnum("geoLocationType", "Geo location type", "geoLocationType");

		organizationFieldTable.addTranslatableText("title", "title");
		organizationFieldTable.addText("icon", "icon");

		addressTable.addText("name", "name");
		addressTable.addText("organisation", "organisation");
		addressTable.addText("street", "street");
		addressTable.addText("city", "city");
		addressTable.addText("dependentLocality", "Dependent locality");
		addressTable.addText("state", "state");
		addressTable.addText("postalCode", "Postal code");
		addressTable.addText("country", "country");
		addressTable.addFloat("latitude", "latitude");
		addressTable.addFloat("longitude", "longitude");

		organizationUnitViewTable.addTranslatableText("name", "name");
		organizationUnitViewTable.addReference("parent", "parent", "organizationUnitView", false);
		organizationUnitViewTable.addMultiReference("children", "children", "organizationUnitView", false);
		organizationUnitViewTable.addReference("type", "type", "organizationUnitTypeView", false);
		organizationUnitViewTable.addText("icon", "icon");
		organizationUnitViewTable.addEnum("orgUnitLifeCycleStatus", "Org unit life cycle status", "orgUnitLifeCycleStatus");
		organizationUnitViewTable.addReference("address", "address", "addressView", false);

		organizationUnitTypeViewTable.addTranslatableText("name", "name");
		organizationUnitTypeViewTable.addTranslatableText("abbreviation", "abbreviation");
		organizationUnitTypeViewTable.addText("icon", "icon");
		organizationUnitTypeViewTable.addBoolean("translateOrganizationUnits", "Translate organization units");
		organizationUnitTypeViewTable.addBoolean("allowUserContainer", "Allow user container");
		organizationUnitTypeViewTable.addReference("defaultChildType", "Default child type", "organizationUnitTypeView", false);
		organizationUnitTypeViewTable.addMultiReference("possibleChildrenTypes", "Possible children types", "organizationUnitTypeView", false);
		organizationUnitTypeViewTable.addEnum("geoLocationType", "Geo location type", "geoLocationType");

		organizationFieldViewTable.addTranslatableText("title", "title");
		organizationFieldViewTable.addText("icon", "icon");

		addressViewTable.addText("name", "name");
		addressViewTable.addText("organisation", "organisation");
		addressViewTable.addText("street", "street");
		addressViewTable.addText("city", "city");
		addressViewTable.addText("dependentLocality", "Dependent locality");
		addressViewTable.addText("state", "state");
		addressViewTable.addText("postalCode", "Postal code");
		addressViewTable.addText("country", "country");
		addressViewTable.addFloat("latitude", "latitude");
		addressViewTable.addFloat("longitude", "longitude");

		userViewTable.addText("firstName", "First name");
		userViewTable.addText("firstNameTranslated", "First name translated");
		userViewTable.addText("lastName", "Last name");
		userViewTable.addText("lastNameTranslated", "Last name translated");
		userViewTable.addByteArray("profilePicture", "Profile picture");
		userViewTable.addByteArray("profilePictureLarge", "Profile picture large");
		userViewTable.addText("language", "language");
		userViewTable.addReference("organizationUnit", "Organization unit", "organizationUnitView", false);

		roleTable.addTranslatableText("title", "title");
		roleTable.addText("icon", "icon");
		roleTable.addEnum("roleType", "Role type", "roleType");
		roleTable.addReference("parent", "parent", "role", false);
		roleTable.addMultiReference("children", "children", "role", false);
		roleTable.addReference("organizationUnit", "Organization unit", "organizationUnit", false);
		roleTable.addMultiReference("allowedOrganizationUnitTypes", "Allowed organization unit types", "organizationUnitType", false);
		roleTable.addReference("organizationField", "Organization field", "organizationField", false);
		roleTable.addBoolean("delegatedCustomPrivilegeObjectRole", "Delegated custom privilege object role");
		roleTable.addMultiReference("generalizationRoles", "Generalization roles", "role", false);
		roleTable.addMultiReference("specializationRoles", "Specialization roles", "role", false);
		roleTable.addMultiReference("privilegesReceivingRoles", "Privileges receiving roles", "role", false);
		roleTable.addMultiReference("privilegesSendingRoles", "Privileges sending roles", "role", false);
		roleTable.addBoolean("noDirectMemberships", "No direct memberships");
		roleTable.addMultiReference("userRoleAssignments", "User role assignments", "userRoleAssignment", true);
		roleTable.addMultiReference("privilegeAssignments", "Privilege assignments", "rolePrivilegeAssignment", true);
		roleTable.addMultiReference("applicationRoleAssignments", "Application role assignments", "roleApplicationRoleAssignment", true);

		userRoleAssignmentTable.addReference("user", "user", "user", false);
		userRoleAssignmentTable.addReference("role", "role", "role", false);
		userRoleAssignmentTable.addReference("organizationUnit", "Organization unit", "organizationUnit", false);
		userRoleAssignmentTable.addInteger("delegatedCustomPrivilegeObjectId", "Delegated custom privilege object id");
		userRoleAssignmentTable.addBoolean("mainResponsible", "Main responsible");
		userRoleAssignmentTable.addTimestamp("lastVerified", "Last verified");
		userRoleAssignmentTable.addReference("lastVerifiedBy", "Last verified by", "user", false);

		rolePrivilegeAssignmentTable.addReference("role", "role", "role", false);
		rolePrivilegeAssignmentTable.addReference("application", "application", "application", false);
		rolePrivilegeAssignmentTable.addReference("privilegeGroup", "Privilege group", "applicationPrivilegeGroup", false);
		rolePrivilegeAssignmentTable.addMultiReference("privileges", "privileges", "applicationPrivilege", false);
		rolePrivilegeAssignmentTable.addText("privilegeObjects", "Privilege objects");
		rolePrivilegeAssignmentTable.addBoolean("privilegeObjectInheritance", "Privilege object inheritance");
		rolePrivilegeAssignmentTable.addReference("organizationFieldFilter", "Organization field filter", "organizationField", false);
		rolePrivilegeAssignmentTable.addReference("fixedOrganizationRoot", "Fixed organization root", "organizationUnit", false);
		rolePrivilegeAssignmentTable.addMultiReference("organizationUnitTypeFilter", "Organization unit type filter", "organizationUnitType", false);
		rolePrivilegeAssignmentTable.addBoolean("noInheritanceOfOrganizationalUnits", "Noinheritance of organizational units");

		roleApplicationRoleAssignmentTable.addReference("role", "role", "role", false);
		roleApplicationRoleAssignmentTable.addReference("application", "application", "application", false);
		roleApplicationRoleAssignmentTable.addText("applicationRoleName", "Application role name");
		roleApplicationRoleAssignmentTable.addReference("organizationFieldFilter", "Organization field filter", "organizationField", false);
		roleApplicationRoleAssignmentTable.addReference("fixedOrganizationRoot", "Fixed organization root", "organizationUnit", false);
		roleApplicationRoleAssignmentTable.addMultiReference("organizationUnitTypeFilter", "Organization unit type filter", "organizationUnitType", false);
		roleApplicationRoleAssignmentTable.addBoolean("noInheritanceOfOrganizationalUnits", "Noinheritance of organizational units");

		systemSettingsTable.addText("allowedBaseLanguages", "Allowed base languages");

		systemLogTable.addReference("managedApplication", "Managed application", "managedApplication", false);
		systemLogTable.addReference("managedPerspective", "Managed perspective", "managedApplicationPerspective", false);
		systemLogTable.addReference("application", "application", "application", false);
		systemLogTable.addReference("applicationPerspective", "Application perspective", "applicationPerspective", false);
		systemLogTable.addReference("applicationVersion", "Application version", "applicationVersion", false);
		systemLogTable.addEnum("logLevel", "Log level", "logLevel");
		systemLogTable.addText("thread", "thread");
		systemLogTable.addText("message", "message");
		systemLogTable.addText("details", "details");
		systemLogTable.addText("exceptionClass", "Exception class");

		applicationTable.addText("name", "name");
		applicationTable.addText("icon", "icon");
		applicationTable.addText("titleKey", "Title key");
		applicationTable.addText("descriptionKey", "Description key");
		applicationTable.addBoolean("uninstalled", "uninstalled");
		applicationTable.addBoolean("unmanagedApplication", "Unmanaged application");
		applicationTable.addText("config", "config");
		applicationTable.addBoolean("darkTheme", "Dark theme");
		applicationTable.addMultiReference("perspectives", "perspectives", "applicationPerspective", true);
		applicationTable.addMultiReference("privilegeGroups", "Privilege groups", "applicationPrivilegeGroup", false);
		applicationTable.addMultiReference("versions", "versions", "applicationVersion", false);
		applicationTable.addReference("installedVersion", "Installed version", "applicationVersion", false);
		applicationTable.addMultiReference("installedAsMainApplication", "Installed as main application", "managedApplication", false);

		applicationPerspectiveTable.addReference("application", "application", "application", false);
		applicationPerspectiveTable.addText("name", "name");
		applicationPerspectiveTable.addText("icon", "icon");
		applicationPerspectiveTable.addText("titleKey", "Title key");
		applicationPerspectiveTable.addText("descriptionKey", "Description key");
		applicationPerspectiveTable.addBoolean("autoProvision", "Auto provision");
		applicationPerspectiveTable.addBoolean("toolbarPerspectiveMenu", "Toolbar perspective menu");
		applicationPerspectiveTable.addMultiReference("managedPerspectives", "Managed perspectives", "managedApplicationPerspective", true);

		applicationPrivilegeGroupTable.addReference("application", "application", "application", false);
		applicationPrivilegeGroupTable.addEnum("applicationPrivilegeGroupType", "Application privilege group type", "applicationPrivilegeGroupType");
		applicationPrivilegeGroupTable.addText("name", "name");
		applicationPrivilegeGroupTable.addText("icon", "icon");
		applicationPrivilegeGroupTable.addText("titleKey", "Title key");
		applicationPrivilegeGroupTable.addText("descriptionKey", "Description key");
		applicationPrivilegeGroupTable.addMultiReference("privileges", "privileges", "applicationPrivilege", false);

		applicationPrivilegeTable.addReference("privilegeGroup", "Privilege group", "applicationPrivilegeGroup", false);
		applicationPrivilegeTable.addText("name", "name");
		applicationPrivilegeTable.addText("icon", "icon");
		applicationPrivilegeTable.addText("titleKey", "Title key");

		applicationVersionTable.addReference("application", "application", "application", false);
		applicationVersionTable.addFile("binary", "binary", true, 100000, false);
		applicationVersionTable.addText("binaryHash", "Binary hash");
		applicationVersionTable.addText("version", "version");
		applicationVersionTable.addText("releaseNotes", "Release notes");
		applicationVersionTable.addReference("dataModelData", "Data model data", "applicationVersionData", false);
		applicationVersionTable.addReference("localizationData", "Localization data", "applicationVersionData", false);
		applicationVersionTable.addReference("privilegeData", "Privilege data", "applicationVersionData", false);
		applicationVersionTable.addReference("perspectiveData", "Perspective data", "applicationVersionData", false);

		applicationVersionDataTable.addText("data", "data");
		applicationVersionDataTable.addInteger("dataRows", "Data rows");
		applicationVersionDataTable.addText("dataAdded", "Data added");
		applicationVersionDataTable.addInteger("dataAddedRows", "Data added rows");
		applicationVersionDataTable.addText("dataRemoved", "Data removed");
		applicationVersionDataTable.addInteger("dataRemovedRows", "Data removed rows");

		managedApplicationTable.addReference("mainApplication", "Main application", "application", false);
		managedApplicationTable.addReference("organizationField", "Organization field", "organizationField", false);
		managedApplicationTable.addText("icon", "icon");
		managedApplicationTable.addText("titleKey", "Title key");
		managedApplicationTable.addText("descriptionKey", "Description key");
		managedApplicationTable.addBoolean("singleApplication", "Single application");
		managedApplicationTable.addBoolean("darkTheme", "Dark theme");
		managedApplicationTable.addBoolean("startOnLogin", "Start on login");
		managedApplicationTable.addMultiReference("perspectives", "perspectives", "managedApplicationPerspective", true);
		managedApplicationTable.addInteger("listingPosition", "Listing position");
		managedApplicationTable.addBoolean("toolbarApplicationMenu", "Toolbar application menu");
		managedApplicationTable.addReference("applicationGroup", "Application group", "managedApplicationGroup", false);
		managedApplicationTable.addBoolean("hidden", "hidden");

		managedApplicationPerspectiveTable.addReference("managedApplication", "Managed application", "managedApplication", false);
		managedApplicationPerspectiveTable.addReference("applicationPerspective", "Application perspective", "applicationPerspective", false);
		managedApplicationPerspectiveTable.addText("iconOverride", "Icon override");
		managedApplicationPerspectiveTable.addText("titleKeyOverride", "Title key override");
		managedApplicationPerspectiveTable.addText("descriptionKeyOverride", "Description key override");
		managedApplicationPerspectiveTable.addBoolean("toolbarPerspectiveMenu", "Toolbar perspective menu");
		managedApplicationPerspectiveTable.addInteger("listingPosition", "Listing position");

		managedApplicationGroupTable.addText("icon", "icon");
		managedApplicationGroupTable.addText("name", "name");
		managedApplicationGroupTable.addText("titleKey", "Title key");
		managedApplicationGroupTable.addMultiReference("applications", "applications", "managedApplication", false);
		managedApplicationGroupTable.addInteger("listingPosition", "Listing position");

		localizationKeyTable.addReference("application", "application", "application", false);
		localizationKeyTable.addText("key", "key");
		localizationKeyTable.addBoolean("used", "used");
		localizationKeyTable.addEnum("localizationKeyFormat", "Localization key format", "localizationKeyFormat");
		localizationKeyTable.addEnum("localizationKeyType", "Localization key type", "localizationKeyType");
		localizationKeyTable.addText("comments", "comments");
		localizationKeyTable.addMultiReference("localizationValues", "Localization values", "localizationValue", false);
		localizationKeyTable.addMultiReference("topics", "topics", "localizationTopic", false);

		localizationValueTable.addReference("localizationKey", "Localization key", "localizationKey", false);
		localizationValueTable.addText("language", "language");
		localizationValueTable.addText("original", "original");
		localizationValueTable.addText("machineTranslation", "Machine translation");
		localizationValueTable.addText("translation", "translation");
		localizationValueTable.addText("adminLocalOverride", "Admin local override");
		localizationValueTable.addText("adminKeyOverride", "Admin key override");
		localizationValueTable.addText("currentDisplayValue", "Current display value");
		localizationValueTable.addText("notes", "notes");
		localizationValueTable.addEnum("machineTranslationState", "Machine translation state", "machineTranslationState");
		localizationValueTable.addEnum("translationState", "Translation state", "translationState");
		localizationValueTable.addEnum("translationVerificationState", "Translation verification state", "translationVerificationState");

		localizationTopicTable.addMultiReference("keys", "keys", "localizationKey", false);
		localizationTopicTable.addReference("application", "application", "application", false);
		localizationTopicTable.addText("icon", "icon");
		localizationTopicTable.addText("title", "title");
		localizationTopicTable.addFile("screenshot", "screenshot", true, 100000, false);

		newsBoardMessageTable.addBoolean("published", "published");
		newsBoardMessageTable.addText("htmlMessage", "Html message");
		newsBoardMessageTable.addText("language", "language");
		newsBoardMessageTable.addMultiReference("images", "images", "newsBoardMessageImage", true);
		newsBoardMessageTable.addMultiReference("translations", "translations", "newsBoardMessageTranslation", true);
		newsBoardMessageTable.addReference("organizationField", "Organization field", "organizationField", false);
		newsBoardMessageTable.addReference("organizationUnit", "Organization unit", "organizationUnit", false);

		newsBoardMessageImageTable.addFile("file", "file", true, 100000, false);
		newsBoardMessageImageTable.addFile("thumbnail", "thumbnail", true, 100000, false);
		newsBoardMessageImageTable.addText("fileName", "File name");
		newsBoardMessageImageTable.addBoolean("embedded", "embedded");
		newsBoardMessageImageTable.addInteger("position", "position");

		newsBoardMessageTranslationTable.addReference("message", "message", "newsBoardMessage", false);
		newsBoardMessageTranslationTable.addText("language", "language");
		newsBoardMessageTranslationTable.addText("translation", "translation");

		model.addReverseReferenceField(userTable, "organizationUnit", organizationUnitTable, "users");
		model.addReverseReferenceField(userTable, "accessTokens", userAccessTokenTable, "user");
		model.addReverseReferenceField(userTable, "roleAssignments", userRoleAssignmentTable, "user");
		model.addReverseReferenceField(userTable, "loginStats", userLoginStatsTable, "user");
		model.addReverseReferenceField(userAccessTokenTable, "user", userTable, "accessTokens");
		model.addReverseReferenceField(userLoginStatsTable, "user", userTable, "loginStats");
		model.addReverseReferenceField(organizationUnitTable, "parent", organizationUnitTable, "children");
		model.addReverseReferenceField(organizationUnitTable, "children", organizationUnitTable, "parent");
		model.addReverseReferenceField(organizationUnitTable, "users", userTable, "organizationUnit");
		model.addReverseReferenceField(organizationUnitTable, "userRoleAssignments", userRoleAssignmentTable, "organizationUnit");
		model.addReverseReferenceField(roleTable, "parent", roleTable, "children");
		model.addReverseReferenceField(roleTable, "children", roleTable, "parent");
		model.addReverseReferenceField(roleTable, "generalizationRoles", roleTable, "specializationRoles");
		model.addReverseReferenceField(roleTable, "specializationRoles", roleTable, "generalizationRoles");
		model.addReverseReferenceField(roleTable, "privilegesReceivingRoles", roleTable, "privilegesSendingRoles");
		model.addReverseReferenceField(roleTable, "privilegesSendingRoles", roleTable, "privilegesReceivingRoles");
		model.addReverseReferenceField(roleTable, "userRoleAssignments", userRoleAssignmentTable, "role");
		model.addReverseReferenceField(roleTable, "privilegeAssignments", rolePrivilegeAssignmentTable, "role");
		model.addReverseReferenceField(roleTable, "applicationRoleAssignments", roleApplicationRoleAssignmentTable, "role");
		model.addReverseReferenceField(userRoleAssignmentTable, "user", userTable, "roleAssignments");
		model.addReverseReferenceField(userRoleAssignmentTable, "role", roleTable, "userRoleAssignments");
		model.addReverseReferenceField(userRoleAssignmentTable, "organizationUnit", organizationUnitTable, "userRoleAssignments");
		model.addReverseReferenceField(rolePrivilegeAssignmentTable, "role", roleTable, "privilegeAssignments");
		model.addReverseReferenceField(roleApplicationRoleAssignmentTable, "role", roleTable, "applicationRoleAssignments");
		model.addReverseReferenceField(applicationTable, "perspectives", applicationPerspectiveTable, "application");
		model.addReverseReferenceField(applicationTable, "privilegeGroups", applicationPrivilegeGroupTable, "application");
		model.addReverseReferenceField(applicationTable, "versions", applicationVersionTable, "application");
		model.addReverseReferenceField(applicationTable, "installedAsMainApplication", managedApplicationTable, "mainApplication");
		model.addReverseReferenceField(applicationPerspectiveTable, "application", applicationTable, "perspectives");
		model.addReverseReferenceField(applicationPerspectiveTable, "managedPerspectives", managedApplicationPerspectiveTable, "applicationPerspective");
		model.addReverseReferenceField(applicationPrivilegeGroupTable, "application", applicationTable, "privilegeGroups");
		model.addReverseReferenceField(applicationPrivilegeGroupTable, "privileges", applicationPrivilegeTable, "privilegeGroup");
		model.addReverseReferenceField(applicationPrivilegeTable, "privilegeGroup", applicationPrivilegeGroupTable, "privileges");
		model.addReverseReferenceField(applicationVersionTable, "application", applicationTable, "versions");
		model.addReverseReferenceField(managedApplicationTable, "mainApplication", applicationTable, "installedAsMainApplication");
		model.addReverseReferenceField(managedApplicationTable, "perspectives", managedApplicationPerspectiveTable, "managedApplication");
		model.addReverseReferenceField(managedApplicationTable, "applicationGroup", managedApplicationGroupTable, "applications");
		model.addReverseReferenceField(managedApplicationPerspectiveTable, "managedApplication", managedApplicationTable, "perspectives");
		model.addReverseReferenceField(managedApplicationPerspectiveTable, "applicationPerspective", applicationPerspectiveTable, "managedPerspectives");
		model.addReverseReferenceField(managedApplicationGroupTable, "applications", managedApplicationTable, "applicationGroup");
		model.addReverseReferenceField(localizationKeyTable, "localizationValues", localizationValueTable, "localizationKey");
		model.addReverseReferenceField(localizationKeyTable, "topics", localizationTopicTable, "keys");
		model.addReverseReferenceField(localizationValueTable, "localizationKey", localizationKeyTable, "localizationValues");
		model.addReverseReferenceField(localizationTopicTable, "keys", localizationKeyTable, "topics");
		model.addReverseReferenceField(newsBoardMessageTable, "translations", newsBoardMessageTranslationTable, "message");
		model.addReverseReferenceField(newsBoardMessageTranslationTable, "message", newsBoardMessageTable, "translations");

		return model;
	}

}
