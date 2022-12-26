package club.edm.pojo.vo.stream_vo;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: AbiInputVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/21 23:15
 **/

@Data
public class AbiInputVO {

    private String name;

    private String type;

    private Boolean indexed;

    /**
     * 类型存疑,看example 按照List处理
     */
    private List<AbiInputVO> components;

    private String internalType;

}
