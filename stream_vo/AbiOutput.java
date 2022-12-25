package club.edm.pojo.stream_vo;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: AbiOutput
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/21 23:17
 **/

@Data
public class AbiOutput {

    private String name;

    private String type;

    /**
     * 类型暂时存疑
     */
    private List<AbiOutput> components;

    private String internalType;


}
