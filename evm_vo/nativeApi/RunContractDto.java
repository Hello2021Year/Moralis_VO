package club.edm.pojo.vo.evm_vo.nativeApi;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: RunContractDto
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/13 0:47
 **/

@Data
public class RunContractDto {

    /*
        the contract abi
     */
    private List<String> abi;

    /*
       The params for the given function
     */
    private List<String> params;
}
