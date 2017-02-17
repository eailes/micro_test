/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.example.esi.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CorporationRolesResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("character_id")
    private Integer characterId = null;

    /**
     * grantable_role string
     */
    public enum GrantableRolesEnum {
        DIRECTOR("Director"),

        PERSONNEL_MANAGER("Personnel_Manager"),

        ACCOUNTANT("Accountant"),

        SECURITY_OFFICER("Security_Officer"),

        FACTORY_MANAGER("Factory_Manager"),

        STATION_MANAGER("Station_Manager"),

        AUDITOR("Auditor"),

        HANGAR_TAKE_1("Hangar_Take_1"),

        HANGAR_TAKE_2("Hangar_Take_2"),

        HANGAR_TAKE_3("Hangar_Take_3"),

        HANGAR_TAKE_4("Hangar_Take_4"),

        HANGAR_TAKE_5("Hangar_Take_5"),

        HANGAR_TAKE_6("Hangar_Take_6"),

        HANGAR_TAKE_7("Hangar_Take_7"),

        HANGAR_QUERY_1("Hangar_Query_1"),

        HANGAR_QUERY_2("Hangar_Query_2"),

        HANGAR_QUERY_3("Hangar_Query_3"),

        HANGAR_QUERY_4("Hangar_Query_4"),

        HANGAR_QUERY_5("Hangar_Query_5"),

        HANGAR_QUERY_6("Hangar_Query_6"),

        HANGAR_QUERY_7("Hangar_Query_7"),

        ACCOUNT_TAKE_1("Account_Take_1"),

        ACCOUNT_TAKE_2("Account_Take_2"),

        ACCOUNT_TAKE_3("Account_Take_3"),

        ACCOUNT_TAKE_4("Account_Take_4"),

        ACCOUNT_TAKE_5("Account_Take_5"),

        ACCOUNT_TAKE_6("Account_Take_6"),

        ACCOUNT_TAKE_7("Account_Take_7"),

        DIPLOMAT("Diplomat"),

        CONFIG_EQUIPMENT("Config_Equipment"),

        CONTAINER_TAKE_1("Container_Take_1"),

        CONTAINER_TAKE_2("Container_Take_2"),

        CONTAINER_TAKE_3("Container_Take_3"),

        CONTAINER_TAKE_4("Container_Take_4"),

        CONTAINER_TAKE_5("Container_Take_5"),

        CONTAINER_TAKE_6("Container_Take_6"),

        CONTAINER_TAKE_7("Container_Take_7"),

        RENT_OFFICE("Rent_Office"),

        RENT_FACTORY_FACILITY("Rent_Factory_Facility"),

        RENT_RESEARCH_FACILITY("Rent_Research_Facility"),

        JUNIOR_ACCOUNTANT("Junior_Accountant"),

        CONFIG_STARBASE_EQUIPMENT("Config_Starbase_Equipment"),

        TRADER("Trader"),

        COMMUNICATIONS_OFFICER("Communications_Officer"),

        CONTRACT_MANAGER("Contract_Manager"),

        STARBASE_DEFENSE_OPERATOR("Starbase_Defense_Operator"),

        STARBASE_FUEL_TECHNICIAN("Starbase_Fuel_Technician"),

        FITTING_MANAGER("Fitting_Manager"),

        TERRESTRIAL_COMBAT_OFFICER("Terrestrial_Combat_Officer"),

        TERRESTRIAL_LOGISTICS_OFFICER("Terrestrial_Logistics_Officer");

        private String value;

        GrantableRolesEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static GrantableRolesEnum fromValue(String text) {
            for (GrantableRolesEnum b : GrantableRolesEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("grantable_roles")
    private List<GrantableRolesEnum> grantableRoles = new ArrayList<GrantableRolesEnum>();

    /**
     * grantable_roles_at_base string
     */
    public enum GrantableRolesAtBaseEnum {
        DIRECTOR("Director"),

        PERSONNEL_MANAGER("Personnel_Manager"),

        ACCOUNTANT("Accountant"),

        SECURITY_OFFICER("Security_Officer"),

        FACTORY_MANAGER("Factory_Manager"),

        STATION_MANAGER("Station_Manager"),

        AUDITOR("Auditor"),

        HANGAR_TAKE_1("Hangar_Take_1"),

        HANGAR_TAKE_2("Hangar_Take_2"),

        HANGAR_TAKE_3("Hangar_Take_3"),

        HANGAR_TAKE_4("Hangar_Take_4"),

        HANGAR_TAKE_5("Hangar_Take_5"),

        HANGAR_TAKE_6("Hangar_Take_6"),

        HANGAR_TAKE_7("Hangar_Take_7"),

        HANGAR_QUERY_1("Hangar_Query_1"),

        HANGAR_QUERY_2("Hangar_Query_2"),

        HANGAR_QUERY_3("Hangar_Query_3"),

        HANGAR_QUERY_4("Hangar_Query_4"),

        HANGAR_QUERY_5("Hangar_Query_5"),

        HANGAR_QUERY_6("Hangar_Query_6"),

        HANGAR_QUERY_7("Hangar_Query_7"),

        ACCOUNT_TAKE_1("Account_Take_1"),

        ACCOUNT_TAKE_2("Account_Take_2"),

        ACCOUNT_TAKE_3("Account_Take_3"),

        ACCOUNT_TAKE_4("Account_Take_4"),

        ACCOUNT_TAKE_5("Account_Take_5"),

        ACCOUNT_TAKE_6("Account_Take_6"),

        ACCOUNT_TAKE_7("Account_Take_7"),

        DIPLOMAT("Diplomat"),

        CONFIG_EQUIPMENT("Config_Equipment"),

        CONTAINER_TAKE_1("Container_Take_1"),

        CONTAINER_TAKE_2("Container_Take_2"),

        CONTAINER_TAKE_3("Container_Take_3"),

        CONTAINER_TAKE_4("Container_Take_4"),

        CONTAINER_TAKE_5("Container_Take_5"),

        CONTAINER_TAKE_6("Container_Take_6"),

        CONTAINER_TAKE_7("Container_Take_7"),

        RENT_OFFICE("Rent_Office"),

        RENT_FACTORY_FACILITY("Rent_Factory_Facility"),

        RENT_RESEARCH_FACILITY("Rent_Research_Facility"),

        JUNIOR_ACCOUNTANT("Junior_Accountant"),

        CONFIG_STARBASE_EQUIPMENT("Config_Starbase_Equipment"),

        TRADER("Trader"),

        COMMUNICATIONS_OFFICER("Communications_Officer"),

        CONTRACT_MANAGER("Contract_Manager"),

        STARBASE_DEFENSE_OPERATOR("Starbase_Defense_Operator"),

        STARBASE_FUEL_TECHNICIAN("Starbase_Fuel_Technician"),

        FITTING_MANAGER("Fitting_Manager"),

        TERRESTRIAL_COMBAT_OFFICER("Terrestrial_Combat_Officer"),

        TERRESTRIAL_LOGISTICS_OFFICER("Terrestrial_Logistics_Officer");

        private String value;

        GrantableRolesAtBaseEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static GrantableRolesAtBaseEnum fromValue(String text) {
            for (GrantableRolesAtBaseEnum b : GrantableRolesAtBaseEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("grantable_roles_at_base")
    private List<GrantableRolesAtBaseEnum> grantableRolesAtBase = new ArrayList<GrantableRolesAtBaseEnum>();

    /**
     * grantable_roles_at_hq string
     */
    public enum GrantableRolesAtHqEnum {
        DIRECTOR("Director"),

        PERSONNEL_MANAGER("Personnel_Manager"),

        ACCOUNTANT("Accountant"),

        SECURITY_OFFICER("Security_Officer"),

        FACTORY_MANAGER("Factory_Manager"),

        STATION_MANAGER("Station_Manager"),

        AUDITOR("Auditor"),

        HANGAR_TAKE_1("Hangar_Take_1"),

        HANGAR_TAKE_2("Hangar_Take_2"),

        HANGAR_TAKE_3("Hangar_Take_3"),

        HANGAR_TAKE_4("Hangar_Take_4"),

        HANGAR_TAKE_5("Hangar_Take_5"),

        HANGAR_TAKE_6("Hangar_Take_6"),

        HANGAR_TAKE_7("Hangar_Take_7"),

        HANGAR_QUERY_1("Hangar_Query_1"),

        HANGAR_QUERY_2("Hangar_Query_2"),

        HANGAR_QUERY_3("Hangar_Query_3"),

        HANGAR_QUERY_4("Hangar_Query_4"),

        HANGAR_QUERY_5("Hangar_Query_5"),

        HANGAR_QUERY_6("Hangar_Query_6"),

        HANGAR_QUERY_7("Hangar_Query_7"),

        ACCOUNT_TAKE_1("Account_Take_1"),

        ACCOUNT_TAKE_2("Account_Take_2"),

        ACCOUNT_TAKE_3("Account_Take_3"),

        ACCOUNT_TAKE_4("Account_Take_4"),

        ACCOUNT_TAKE_5("Account_Take_5"),

        ACCOUNT_TAKE_6("Account_Take_6"),

        ACCOUNT_TAKE_7("Account_Take_7"),

        DIPLOMAT("Diplomat"),

        CONFIG_EQUIPMENT("Config_Equipment"),

        CONTAINER_TAKE_1("Container_Take_1"),

        CONTAINER_TAKE_2("Container_Take_2"),

        CONTAINER_TAKE_3("Container_Take_3"),

        CONTAINER_TAKE_4("Container_Take_4"),

        CONTAINER_TAKE_5("Container_Take_5"),

        CONTAINER_TAKE_6("Container_Take_6"),

        CONTAINER_TAKE_7("Container_Take_7"),

        RENT_OFFICE("Rent_Office"),

        RENT_FACTORY_FACILITY("Rent_Factory_Facility"),

        RENT_RESEARCH_FACILITY("Rent_Research_Facility"),

        JUNIOR_ACCOUNTANT("Junior_Accountant"),

        CONFIG_STARBASE_EQUIPMENT("Config_Starbase_Equipment"),

        TRADER("Trader"),

        COMMUNICATIONS_OFFICER("Communications_Officer"),

        CONTRACT_MANAGER("Contract_Manager"),

        STARBASE_DEFENSE_OPERATOR("Starbase_Defense_Operator"),

        STARBASE_FUEL_TECHNICIAN("Starbase_Fuel_Technician"),

        FITTING_MANAGER("Fitting_Manager"),

        TERRESTRIAL_COMBAT_OFFICER("Terrestrial_Combat_Officer"),

        TERRESTRIAL_LOGISTICS_OFFICER("Terrestrial_Logistics_Officer");

        private String value;

        GrantableRolesAtHqEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static GrantableRolesAtHqEnum fromValue(String text) {
            for (GrantableRolesAtHqEnum b : GrantableRolesAtHqEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("grantable_roles_at_hq")
    private List<GrantableRolesAtHqEnum> grantableRolesAtHq = new ArrayList<GrantableRolesAtHqEnum>();

    /**
     * grantable_roles_at_other string
     */
    public enum GrantableRolesAtOtherEnum {
        DIRECTOR("Director"),

        PERSONNEL_MANAGER("Personnel_Manager"),

        ACCOUNTANT("Accountant"),

        SECURITY_OFFICER("Security_Officer"),

        FACTORY_MANAGER("Factory_Manager"),

        STATION_MANAGER("Station_Manager"),

        AUDITOR("Auditor"),

        HANGAR_TAKE_1("Hangar_Take_1"),

        HANGAR_TAKE_2("Hangar_Take_2"),

        HANGAR_TAKE_3("Hangar_Take_3"),

        HANGAR_TAKE_4("Hangar_Take_4"),

        HANGAR_TAKE_5("Hangar_Take_5"),

        HANGAR_TAKE_6("Hangar_Take_6"),

        HANGAR_TAKE_7("Hangar_Take_7"),

        HANGAR_QUERY_1("Hangar_Query_1"),

        HANGAR_QUERY_2("Hangar_Query_2"),

        HANGAR_QUERY_3("Hangar_Query_3"),

        HANGAR_QUERY_4("Hangar_Query_4"),

        HANGAR_QUERY_5("Hangar_Query_5"),

        HANGAR_QUERY_6("Hangar_Query_6"),

        HANGAR_QUERY_7("Hangar_Query_7"),

        ACCOUNT_TAKE_1("Account_Take_1"),

        ACCOUNT_TAKE_2("Account_Take_2"),

        ACCOUNT_TAKE_3("Account_Take_3"),

        ACCOUNT_TAKE_4("Account_Take_4"),

        ACCOUNT_TAKE_5("Account_Take_5"),

        ACCOUNT_TAKE_6("Account_Take_6"),

        ACCOUNT_TAKE_7("Account_Take_7"),

        DIPLOMAT("Diplomat"),

        CONFIG_EQUIPMENT("Config_Equipment"),

        CONTAINER_TAKE_1("Container_Take_1"),

        CONTAINER_TAKE_2("Container_Take_2"),

        CONTAINER_TAKE_3("Container_Take_3"),

        CONTAINER_TAKE_4("Container_Take_4"),

        CONTAINER_TAKE_5("Container_Take_5"),

        CONTAINER_TAKE_6("Container_Take_6"),

        CONTAINER_TAKE_7("Container_Take_7"),

        RENT_OFFICE("Rent_Office"),

        RENT_FACTORY_FACILITY("Rent_Factory_Facility"),

        RENT_RESEARCH_FACILITY("Rent_Research_Facility"),

        JUNIOR_ACCOUNTANT("Junior_Accountant"),

        CONFIG_STARBASE_EQUIPMENT("Config_Starbase_Equipment"),

        TRADER("Trader"),

        COMMUNICATIONS_OFFICER("Communications_Officer"),

        CONTRACT_MANAGER("Contract_Manager"),

        STARBASE_DEFENSE_OPERATOR("Starbase_Defense_Operator"),

        STARBASE_FUEL_TECHNICIAN("Starbase_Fuel_Technician"),

        FITTING_MANAGER("Fitting_Manager"),

        TERRESTRIAL_COMBAT_OFFICER("Terrestrial_Combat_Officer"),

        TERRESTRIAL_LOGISTICS_OFFICER("Terrestrial_Logistics_Officer");

        private String value;

        GrantableRolesAtOtherEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static GrantableRolesAtOtherEnum fromValue(String text) {
            for (GrantableRolesAtOtherEnum b : GrantableRolesAtOtherEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("grantable_roles_at_other")
    private List<GrantableRolesAtOtherEnum> grantableRolesAtOther = new ArrayList<GrantableRolesAtOtherEnum>();

    /**
     * role string
     */
    public enum RolesEnum {
        DIRECTOR("Director"),

        PERSONNEL_MANAGER("Personnel_Manager"),

        ACCOUNTANT("Accountant"),

        SECURITY_OFFICER("Security_Officer"),

        FACTORY_MANAGER("Factory_Manager"),

        STATION_MANAGER("Station_Manager"),

        AUDITOR("Auditor"),

        HANGAR_TAKE_1("Hangar_Take_1"),

        HANGAR_TAKE_2("Hangar_Take_2"),

        HANGAR_TAKE_3("Hangar_Take_3"),

        HANGAR_TAKE_4("Hangar_Take_4"),

        HANGAR_TAKE_5("Hangar_Take_5"),

        HANGAR_TAKE_6("Hangar_Take_6"),

        HANGAR_TAKE_7("Hangar_Take_7"),

        HANGAR_QUERY_1("Hangar_Query_1"),

        HANGAR_QUERY_2("Hangar_Query_2"),

        HANGAR_QUERY_3("Hangar_Query_3"),

        HANGAR_QUERY_4("Hangar_Query_4"),

        HANGAR_QUERY_5("Hangar_Query_5"),

        HANGAR_QUERY_6("Hangar_Query_6"),

        HANGAR_QUERY_7("Hangar_Query_7"),

        ACCOUNT_TAKE_1("Account_Take_1"),

        ACCOUNT_TAKE_2("Account_Take_2"),

        ACCOUNT_TAKE_3("Account_Take_3"),

        ACCOUNT_TAKE_4("Account_Take_4"),

        ACCOUNT_TAKE_5("Account_Take_5"),

        ACCOUNT_TAKE_6("Account_Take_6"),

        ACCOUNT_TAKE_7("Account_Take_7"),

        DIPLOMAT("Diplomat"),

        CONFIG_EQUIPMENT("Config_Equipment"),

        CONTAINER_TAKE_1("Container_Take_1"),

        CONTAINER_TAKE_2("Container_Take_2"),

        CONTAINER_TAKE_3("Container_Take_3"),

        CONTAINER_TAKE_4("Container_Take_4"),

        CONTAINER_TAKE_5("Container_Take_5"),

        CONTAINER_TAKE_6("Container_Take_6"),

        CONTAINER_TAKE_7("Container_Take_7"),

        RENT_OFFICE("Rent_Office"),

        RENT_FACTORY_FACILITY("Rent_Factory_Facility"),

        RENT_RESEARCH_FACILITY("Rent_Research_Facility"),

        JUNIOR_ACCOUNTANT("Junior_Accountant"),

        CONFIG_STARBASE_EQUIPMENT("Config_Starbase_Equipment"),

        TRADER("Trader"),

        COMMUNICATIONS_OFFICER("Communications_Officer"),

        CONTRACT_MANAGER("Contract_Manager"),

        STARBASE_DEFENSE_OPERATOR("Starbase_Defense_Operator"),

        STARBASE_FUEL_TECHNICIAN("Starbase_Fuel_Technician"),

        FITTING_MANAGER("Fitting_Manager"),

        TERRESTRIAL_COMBAT_OFFICER("Terrestrial_Combat_Officer"),

        TERRESTRIAL_LOGISTICS_OFFICER("Terrestrial_Logistics_Officer");

        private String value;

        RolesEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RolesEnum fromValue(String text) {
            for (RolesEnum b : RolesEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("roles")
    private List<RolesEnum> roles = new ArrayList<RolesEnum>();

    /**
     * roles_at_base string
     */
    public enum RolesAtBaseEnum {
        DIRECTOR("Director"),

        PERSONNEL_MANAGER("Personnel_Manager"),

        ACCOUNTANT("Accountant"),

        SECURITY_OFFICER("Security_Officer"),

        FACTORY_MANAGER("Factory_Manager"),

        STATION_MANAGER("Station_Manager"),

        AUDITOR("Auditor"),

        HANGAR_TAKE_1("Hangar_Take_1"),

        HANGAR_TAKE_2("Hangar_Take_2"),

        HANGAR_TAKE_3("Hangar_Take_3"),

        HANGAR_TAKE_4("Hangar_Take_4"),

        HANGAR_TAKE_5("Hangar_Take_5"),

        HANGAR_TAKE_6("Hangar_Take_6"),

        HANGAR_TAKE_7("Hangar_Take_7"),

        HANGAR_QUERY_1("Hangar_Query_1"),

        HANGAR_QUERY_2("Hangar_Query_2"),

        HANGAR_QUERY_3("Hangar_Query_3"),

        HANGAR_QUERY_4("Hangar_Query_4"),

        HANGAR_QUERY_5("Hangar_Query_5"),

        HANGAR_QUERY_6("Hangar_Query_6"),

        HANGAR_QUERY_7("Hangar_Query_7"),

        ACCOUNT_TAKE_1("Account_Take_1"),

        ACCOUNT_TAKE_2("Account_Take_2"),

        ACCOUNT_TAKE_3("Account_Take_3"),

        ACCOUNT_TAKE_4("Account_Take_4"),

        ACCOUNT_TAKE_5("Account_Take_5"),

        ACCOUNT_TAKE_6("Account_Take_6"),

        ACCOUNT_TAKE_7("Account_Take_7"),

        DIPLOMAT("Diplomat"),

        CONFIG_EQUIPMENT("Config_Equipment"),

        CONTAINER_TAKE_1("Container_Take_1"),

        CONTAINER_TAKE_2("Container_Take_2"),

        CONTAINER_TAKE_3("Container_Take_3"),

        CONTAINER_TAKE_4("Container_Take_4"),

        CONTAINER_TAKE_5("Container_Take_5"),

        CONTAINER_TAKE_6("Container_Take_6"),

        CONTAINER_TAKE_7("Container_Take_7"),

        RENT_OFFICE("Rent_Office"),

        RENT_FACTORY_FACILITY("Rent_Factory_Facility"),

        RENT_RESEARCH_FACILITY("Rent_Research_Facility"),

        JUNIOR_ACCOUNTANT("Junior_Accountant"),

        CONFIG_STARBASE_EQUIPMENT("Config_Starbase_Equipment"),

        TRADER("Trader"),

        COMMUNICATIONS_OFFICER("Communications_Officer"),

        CONTRACT_MANAGER("Contract_Manager"),

        STARBASE_DEFENSE_OPERATOR("Starbase_Defense_Operator"),

        STARBASE_FUEL_TECHNICIAN("Starbase_Fuel_Technician"),

        FITTING_MANAGER("Fitting_Manager"),

        TERRESTRIAL_COMBAT_OFFICER("Terrestrial_Combat_Officer"),

        TERRESTRIAL_LOGISTICS_OFFICER("Terrestrial_Logistics_Officer");

        private String value;

        RolesAtBaseEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RolesAtBaseEnum fromValue(String text) {
            for (RolesAtBaseEnum b : RolesAtBaseEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("roles_at_base")
    private List<RolesAtBaseEnum> rolesAtBase = new ArrayList<RolesAtBaseEnum>();

    /**
     * roles_at_hq string
     */
    public enum RolesAtHqEnum {
        DIRECTOR("Director"),

        PERSONNEL_MANAGER("Personnel_Manager"),

        ACCOUNTANT("Accountant"),

        SECURITY_OFFICER("Security_Officer"),

        FACTORY_MANAGER("Factory_Manager"),

        STATION_MANAGER("Station_Manager"),

        AUDITOR("Auditor"),

        HANGAR_TAKE_1("Hangar_Take_1"),

        HANGAR_TAKE_2("Hangar_Take_2"),

        HANGAR_TAKE_3("Hangar_Take_3"),

        HANGAR_TAKE_4("Hangar_Take_4"),

        HANGAR_TAKE_5("Hangar_Take_5"),

        HANGAR_TAKE_6("Hangar_Take_6"),

        HANGAR_TAKE_7("Hangar_Take_7"),

        HANGAR_QUERY_1("Hangar_Query_1"),

        HANGAR_QUERY_2("Hangar_Query_2"),

        HANGAR_QUERY_3("Hangar_Query_3"),

        HANGAR_QUERY_4("Hangar_Query_4"),

        HANGAR_QUERY_5("Hangar_Query_5"),

        HANGAR_QUERY_6("Hangar_Query_6"),

        HANGAR_QUERY_7("Hangar_Query_7"),

        ACCOUNT_TAKE_1("Account_Take_1"),

        ACCOUNT_TAKE_2("Account_Take_2"),

        ACCOUNT_TAKE_3("Account_Take_3"),

        ACCOUNT_TAKE_4("Account_Take_4"),

        ACCOUNT_TAKE_5("Account_Take_5"),

        ACCOUNT_TAKE_6("Account_Take_6"),

        ACCOUNT_TAKE_7("Account_Take_7"),

        DIPLOMAT("Diplomat"),

        CONFIG_EQUIPMENT("Config_Equipment"),

        CONTAINER_TAKE_1("Container_Take_1"),

        CONTAINER_TAKE_2("Container_Take_2"),

        CONTAINER_TAKE_3("Container_Take_3"),

        CONTAINER_TAKE_4("Container_Take_4"),

        CONTAINER_TAKE_5("Container_Take_5"),

        CONTAINER_TAKE_6("Container_Take_6"),

        CONTAINER_TAKE_7("Container_Take_7"),

        RENT_OFFICE("Rent_Office"),

        RENT_FACTORY_FACILITY("Rent_Factory_Facility"),

        RENT_RESEARCH_FACILITY("Rent_Research_Facility"),

        JUNIOR_ACCOUNTANT("Junior_Accountant"),

        CONFIG_STARBASE_EQUIPMENT("Config_Starbase_Equipment"),

        TRADER("Trader"),

        COMMUNICATIONS_OFFICER("Communications_Officer"),

        CONTRACT_MANAGER("Contract_Manager"),

        STARBASE_DEFENSE_OPERATOR("Starbase_Defense_Operator"),

        STARBASE_FUEL_TECHNICIAN("Starbase_Fuel_Technician"),

        FITTING_MANAGER("Fitting_Manager"),

        TERRESTRIAL_COMBAT_OFFICER("Terrestrial_Combat_Officer"),

        TERRESTRIAL_LOGISTICS_OFFICER("Terrestrial_Logistics_Officer");

        private String value;

        RolesAtHqEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RolesAtHqEnum fromValue(String text) {
            for (RolesAtHqEnum b : RolesAtHqEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("roles_at_hq")
    private List<RolesAtHqEnum> rolesAtHq = new ArrayList<RolesAtHqEnum>();

    /**
     * roles_at_other string
     */
    public enum RolesAtOtherEnum {
        DIRECTOR("Director"),

        PERSONNEL_MANAGER("Personnel_Manager"),

        ACCOUNTANT("Accountant"),

        SECURITY_OFFICER("Security_Officer"),

        FACTORY_MANAGER("Factory_Manager"),

        STATION_MANAGER("Station_Manager"),

        AUDITOR("Auditor"),

        HANGAR_TAKE_1("Hangar_Take_1"),

        HANGAR_TAKE_2("Hangar_Take_2"),

        HANGAR_TAKE_3("Hangar_Take_3"),

        HANGAR_TAKE_4("Hangar_Take_4"),

        HANGAR_TAKE_5("Hangar_Take_5"),

        HANGAR_TAKE_6("Hangar_Take_6"),

        HANGAR_TAKE_7("Hangar_Take_7"),

        HANGAR_QUERY_1("Hangar_Query_1"),

        HANGAR_QUERY_2("Hangar_Query_2"),

        HANGAR_QUERY_3("Hangar_Query_3"),

        HANGAR_QUERY_4("Hangar_Query_4"),

        HANGAR_QUERY_5("Hangar_Query_5"),

        HANGAR_QUERY_6("Hangar_Query_6"),

        HANGAR_QUERY_7("Hangar_Query_7"),

        ACCOUNT_TAKE_1("Account_Take_1"),

        ACCOUNT_TAKE_2("Account_Take_2"),

        ACCOUNT_TAKE_3("Account_Take_3"),

        ACCOUNT_TAKE_4("Account_Take_4"),

        ACCOUNT_TAKE_5("Account_Take_5"),

        ACCOUNT_TAKE_6("Account_Take_6"),

        ACCOUNT_TAKE_7("Account_Take_7"),

        DIPLOMAT("Diplomat"),

        CONFIG_EQUIPMENT("Config_Equipment"),

        CONTAINER_TAKE_1("Container_Take_1"),

        CONTAINER_TAKE_2("Container_Take_2"),

        CONTAINER_TAKE_3("Container_Take_3"),

        CONTAINER_TAKE_4("Container_Take_4"),

        CONTAINER_TAKE_5("Container_Take_5"),

        CONTAINER_TAKE_6("Container_Take_6"),

        CONTAINER_TAKE_7("Container_Take_7"),

        RENT_OFFICE("Rent_Office"),

        RENT_FACTORY_FACILITY("Rent_Factory_Facility"),

        RENT_RESEARCH_FACILITY("Rent_Research_Facility"),

        JUNIOR_ACCOUNTANT("Junior_Accountant"),

        CONFIG_STARBASE_EQUIPMENT("Config_Starbase_Equipment"),

        TRADER("Trader"),

        COMMUNICATIONS_OFFICER("Communications_Officer"),

        CONTRACT_MANAGER("Contract_Manager"),

        STARBASE_DEFENSE_OPERATOR("Starbase_Defense_Operator"),

        STARBASE_FUEL_TECHNICIAN("Starbase_Fuel_Technician"),

        FITTING_MANAGER("Fitting_Manager"),

        TERRESTRIAL_COMBAT_OFFICER("Terrestrial_Combat_Officer"),

        TERRESTRIAL_LOGISTICS_OFFICER("Terrestrial_Logistics_Officer");

        private String value;

        RolesAtOtherEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RolesAtOtherEnum fromValue(String text) {
            for (RolesAtOtherEnum b : RolesAtOtherEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("roles_at_other")
    private List<RolesAtOtherEnum> rolesAtOther = new ArrayList<RolesAtOtherEnum>();

    public CorporationRolesResponse characterId(Integer characterId) {
        this.characterId = characterId;
        return this;
    }

    /**
     * character_id integer
     * 
     * @return characterId
     **/
    @ApiModelProperty(example = "null", required = true, value = "character_id integer")
    public Integer getCharacterId() {
        return characterId;
    }

    public void setCharacterId(Integer characterId) {
        this.characterId = characterId;
    }

    public CorporationRolesResponse grantableRoles(List<GrantableRolesEnum> grantableRoles) {
        this.grantableRoles = grantableRoles;
        return this;
    }

    public CorporationRolesResponse addGrantableRolesItem(GrantableRolesEnum grantableRolesItem) {
        this.grantableRoles.add(grantableRolesItem);
        return this;
    }

    /**
     * grantable_roles array
     * 
     * @return grantableRoles
     **/
    @ApiModelProperty(example = "null", value = "grantable_roles array")
    public List<GrantableRolesEnum> getGrantableRoles() {
        return grantableRoles;
    }

    public void setGrantableRoles(List<GrantableRolesEnum> grantableRoles) {
        this.grantableRoles = grantableRoles;
    }

    public CorporationRolesResponse grantableRolesAtBase(List<GrantableRolesAtBaseEnum> grantableRolesAtBase) {
        this.grantableRolesAtBase = grantableRolesAtBase;
        return this;
    }

    public CorporationRolesResponse addGrantableRolesAtBaseItem(GrantableRolesAtBaseEnum grantableRolesAtBaseItem) {
        this.grantableRolesAtBase.add(grantableRolesAtBaseItem);
        return this;
    }

    /**
     * grantable_roles_at_base array
     * 
     * @return grantableRolesAtBase
     **/
    @ApiModelProperty(example = "null", value = "grantable_roles_at_base array")
    public List<GrantableRolesAtBaseEnum> getGrantableRolesAtBase() {
        return grantableRolesAtBase;
    }

    public void setGrantableRolesAtBase(List<GrantableRolesAtBaseEnum> grantableRolesAtBase) {
        this.grantableRolesAtBase = grantableRolesAtBase;
    }

    public CorporationRolesResponse grantableRolesAtHq(List<GrantableRolesAtHqEnum> grantableRolesAtHq) {
        this.grantableRolesAtHq = grantableRolesAtHq;
        return this;
    }

    public CorporationRolesResponse addGrantableRolesAtHqItem(GrantableRolesAtHqEnum grantableRolesAtHqItem) {
        this.grantableRolesAtHq.add(grantableRolesAtHqItem);
        return this;
    }

    /**
     * grantable_roles_at_hq array
     * 
     * @return grantableRolesAtHq
     **/
    @ApiModelProperty(example = "null", value = "grantable_roles_at_hq array")
    public List<GrantableRolesAtHqEnum> getGrantableRolesAtHq() {
        return grantableRolesAtHq;
    }

    public void setGrantableRolesAtHq(List<GrantableRolesAtHqEnum> grantableRolesAtHq) {
        this.grantableRolesAtHq = grantableRolesAtHq;
    }

    public CorporationRolesResponse grantableRolesAtOther(List<GrantableRolesAtOtherEnum> grantableRolesAtOther) {
        this.grantableRolesAtOther = grantableRolesAtOther;
        return this;
    }

    public CorporationRolesResponse addGrantableRolesAtOtherItem(GrantableRolesAtOtherEnum grantableRolesAtOtherItem) {
        this.grantableRolesAtOther.add(grantableRolesAtOtherItem);
        return this;
    }

    /**
     * grantable_roles_at_other array
     * 
     * @return grantableRolesAtOther
     **/
    @ApiModelProperty(example = "null", value = "grantable_roles_at_other array")
    public List<GrantableRolesAtOtherEnum> getGrantableRolesAtOther() {
        return grantableRolesAtOther;
    }

    public void setGrantableRolesAtOther(List<GrantableRolesAtOtherEnum> grantableRolesAtOther) {
        this.grantableRolesAtOther = grantableRolesAtOther;
    }

    public CorporationRolesResponse roles(List<RolesEnum> roles) {
        this.roles = roles;
        return this;
    }

    public CorporationRolesResponse addRolesItem(RolesEnum rolesItem) {
        this.roles.add(rolesItem);
        return this;
    }

    /**
     * roles array
     * 
     * @return roles
     **/
    @ApiModelProperty(example = "null", value = "roles array")
    public List<RolesEnum> getRoles() {
        return roles;
    }

    public void setRoles(List<RolesEnum> roles) {
        this.roles = roles;
    }

    public CorporationRolesResponse rolesAtBase(List<RolesAtBaseEnum> rolesAtBase) {
        this.rolesAtBase = rolesAtBase;
        return this;
    }

    public CorporationRolesResponse addRolesAtBaseItem(RolesAtBaseEnum rolesAtBaseItem) {
        this.rolesAtBase.add(rolesAtBaseItem);
        return this;
    }

    /**
     * roles_at_base array
     * 
     * @return rolesAtBase
     **/
    @ApiModelProperty(example = "null", value = "roles_at_base array")
    public List<RolesAtBaseEnum> getRolesAtBase() {
        return rolesAtBase;
    }

    public void setRolesAtBase(List<RolesAtBaseEnum> rolesAtBase) {
        this.rolesAtBase = rolesAtBase;
    }

    public CorporationRolesResponse rolesAtHq(List<RolesAtHqEnum> rolesAtHq) {
        this.rolesAtHq = rolesAtHq;
        return this;
    }

    public CorporationRolesResponse addRolesAtHqItem(RolesAtHqEnum rolesAtHqItem) {
        this.rolesAtHq.add(rolesAtHqItem);
        return this;
    }

    /**
     * roles_at_hq array
     * 
     * @return rolesAtHq
     **/
    @ApiModelProperty(example = "null", value = "roles_at_hq array")
    public List<RolesAtHqEnum> getRolesAtHq() {
        return rolesAtHq;
    }

    public void setRolesAtHq(List<RolesAtHqEnum> rolesAtHq) {
        this.rolesAtHq = rolesAtHq;
    }

    public CorporationRolesResponse rolesAtOther(List<RolesAtOtherEnum> rolesAtOther) {
        this.rolesAtOther = rolesAtOther;
        return this;
    }

    public CorporationRolesResponse addRolesAtOtherItem(RolesAtOtherEnum rolesAtOtherItem) {
        this.rolesAtOther.add(rolesAtOtherItem);
        return this;
    }

    /**
     * roles_at_other array
     * 
     * @return rolesAtOther
     **/
    @ApiModelProperty(example = "null", value = "roles_at_other array")
    public List<RolesAtOtherEnum> getRolesAtOther() {
        return rolesAtOther;
    }

    public void setRolesAtOther(List<RolesAtOtherEnum> rolesAtOther) {
        this.rolesAtOther = rolesAtOther;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationRolesResponse corporationRolesResponse = (CorporationRolesResponse) o;
        return Objects.equals(this.characterId, corporationRolesResponse.characterId)
                && Objects.equals(this.grantableRoles, corporationRolesResponse.grantableRoles)
                && Objects.equals(this.grantableRolesAtBase, corporationRolesResponse.grantableRolesAtBase)
                && Objects.equals(this.grantableRolesAtHq, corporationRolesResponse.grantableRolesAtHq)
                && Objects.equals(this.grantableRolesAtOther, corporationRolesResponse.grantableRolesAtOther)
                && Objects.equals(this.roles, corporationRolesResponse.roles)
                && Objects.equals(this.rolesAtBase, corporationRolesResponse.rolesAtBase)
                && Objects.equals(this.rolesAtHq, corporationRolesResponse.rolesAtHq)
                && Objects.equals(this.rolesAtOther, corporationRolesResponse.rolesAtOther);
    }

    @Override
    public int hashCode() {
        return Objects.hash(characterId, grantableRoles, grantableRolesAtBase, grantableRolesAtHq,
                grantableRolesAtOther, roles, rolesAtBase, rolesAtHq, rolesAtOther);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationRolesResponse {\n");

        sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
        sb.append("    grantableRoles: ").append(toIndentedString(grantableRoles)).append("\n");
        sb.append("    grantableRolesAtBase: ").append(toIndentedString(grantableRolesAtBase)).append("\n");
        sb.append("    grantableRolesAtHq: ").append(toIndentedString(grantableRolesAtHq)).append("\n");
        sb.append("    grantableRolesAtOther: ").append(toIndentedString(grantableRolesAtOther)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
        sb.append("    rolesAtBase: ").append(toIndentedString(rolesAtBase)).append("\n");
        sb.append("    rolesAtHq: ").append(toIndentedString(rolesAtHq)).append("\n");
        sb.append("    rolesAtOther: ").append(toIndentedString(rolesAtOther)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
