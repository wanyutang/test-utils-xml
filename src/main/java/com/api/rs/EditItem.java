package com.api.rs;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
public class EditItem {

    @JsonProperty("PID")
    private String pid;

    @JsonProperty("AccountPB")
    private String accountPB;

    @JsonProperty("AccountCK")
    private String accountCK;

    @JsonProperty("ApplyDate")
    private String applyDate;

    @JsonProperty("StatusAft")
    private String statusAft;

    @JsonProperty("ResCode")
    private String resCode;

    @JsonProperty("ResCodeTwo")
    private String resCodeTwo;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("AddImgA1")
    private String addImgA1;

    @JsonProperty("AddImgA2")
    private String addImgA2;

    @JsonProperty("AddImgB1")
    private String addImgB1;

    @JsonProperty("AddImgB2")
    private String addImgB2;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("ResidentAddress")
    private String residentAddress;

    @JsonProperty("CommAddress")
    private String commAddress;

    @JsonProperty("CommPhone")
    private String commPhone;

    @JsonProperty("BirthCity")
    private String birthCity;

    @JsonProperty("workCompany")
    private String workCompany;

    @JsonProperty("Occupation")
    private String occupation;

}
