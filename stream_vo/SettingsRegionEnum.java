package club.edm.pojo.vo.stream_vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SettingsRegionEnum {
    // us-east-1,us-west-2,eu-central-1,ap-southeast-1;

    REGION_0("us-east-1"),
    REGION_1("us-west-2"),
    REGION_2("eu-central-1"),
    REGION_3("ap-southeast-1"),
    ;

    private final String region;

}
