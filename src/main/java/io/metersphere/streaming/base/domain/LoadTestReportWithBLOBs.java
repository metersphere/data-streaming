package io.metersphere.streaming.base.domain;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class LoadTestReportWithBLOBs extends LoadTestReport implements Serializable {
    private String description;

    private String loadConfiguration;

    private String jmxContent;

    private static final long serialVersionUID = 1L;
}