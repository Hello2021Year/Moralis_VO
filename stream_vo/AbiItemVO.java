package club.edm.pojo.vo.stream_vo;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: AbiItemVO
 * @Description: The abi to parse the log object of the contract
 * @author: SUN Pengliang
 * @date: 2022/12/21 23:18
 **/

@Data
public class AbiItemVO {

    private Boolean anonymous;

    private Boolean constant;

    private List<AbiInputVO> inputs;

    private String name;

    private List<AbiOutputVO> outputs;

    private Boolean payable;

    private String stateMutability;

    private String type;

    private Double gas;

}
