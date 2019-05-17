package me.nutsjian.springboot.newbie.condition;

import lombok.Data;

import java.util.List;

@Data
public class MetadataGetCondition {
    private String metadataId;
    private String json;


    private String reportId;
    private String accessToken;
    private List<String> dimensions;
    private List<String> measures;
}
