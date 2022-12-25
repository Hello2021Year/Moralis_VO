package club.edm.pojo.stream_vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public enum StreamsStatus {

    //active, paused, error, terminated;
    ACTIVE("active"),
    PAUSED("paused"),
    ERROR("error"),
    TERMINATED("terminated");

    private final String status;

}
