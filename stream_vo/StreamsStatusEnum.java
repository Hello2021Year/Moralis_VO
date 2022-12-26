package club.edm.pojo.vo.stream_vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum StreamsStatusEnum {

    //active, paused, error, terminated;
    ACTIVE("active"),
    PAUSED("paused"),
    ERROR("error"),
    TERMINATED("terminated");

    private final String status;

}
