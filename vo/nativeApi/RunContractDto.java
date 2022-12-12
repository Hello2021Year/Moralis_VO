package club.edm.pojo.vo1.nativeApi;

import java.util.List;

/**
 * @ClassName: RunContractDto
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/13 0:47
 **/

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
