package club.edm.pojo.evm_vo.tokenApi;

import lombok.Data;

/**
 * @ClassName: NativeErc20PriceVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/7 1:04
 **/

@Data
public class NativeErc20PriceVO {

    /*
        The native price of the token
     */
    private String  value;

    /*
        The number of decimals of the token
     */
    private String  decicmals;

    /*
        The Name of the token
     */
    private String  name;

    /*
        The Symbol of the token
     */
    private String  symbol;

}
