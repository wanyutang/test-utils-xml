package com.api.res;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Table11Rs {
    
    @JsonProperty("Account")
    private String account;

    @JsonProperty("ApplyDate")
    private String applyDate;

    @JsonProperty("AuditStatus")
    private String auditStatus;

    @JsonProperty("Note")
    private String note;

}
