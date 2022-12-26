package club.edm.pojo.vo.stream_vo;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: AbiOutputVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/21 23:17
 **/

@Data
public class AbiOutputVO {

    private String name;

    private String type;

    /**
     * 类型暂时存疑
     */
    private List<AbiOutputVO> components;

    private String internalType;


}
