package club.edm.pojo.stream_vo;

import java.util.List;

/**
 * @ClassName: AbiInput
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/21 23:15
 **/

public class AbiInput {

    private String name;

    private String type;

    private Boolean indexed;

    /**
     * 类型存疑
     */
    private List<AbiInput> components;

    private String internalType;

}
