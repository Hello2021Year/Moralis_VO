package club.edm.pojo.stream_vo;

import lombok.Data;

/**
 * @ClassName: UUID
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/21 22:54
 **/
@Data
public class UUID {

    /**
     * pattern: [0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-4[0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}
     * Stringified UUIDv4. See RFC 4112
     */
    private String UUID;


}
