package io.metersphere.streaming.base.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class LoadTest implements Serializable {
    private String id;

    private String projectId;

    private String name;

    private String description;

    private String scenarioDefinition;

    private Long createTime;

    private Long updateTime;

    private String status;

    private String testResourcePoolId;

    private static final long serialVersionUID = 1L;
}