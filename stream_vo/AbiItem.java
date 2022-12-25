package club.edm.pojo.stream_vo;

import java.util.List;

/**
 * @ClassName: AbiItem
 * @Description: The abi to parse the log object of the contract
 * @author: SUN Pengliang
 * @date: 2022/12/21 23:18
 **/

public class AbiItem {

    private Boolean anonymous;

    private Boolean constant;

    private List<AbiInput> inputs;

    private String name;

    private List<AbiOutput> outputs;

    private Boolean payable;

    private String stateMutability;

    private String type;

    private Double gas;

}
