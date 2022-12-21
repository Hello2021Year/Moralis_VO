package club.edm.pojo.vo1.tokenApi;

import java.util.List;

/**
 * @ClassName: Erc20PriceVO
 * @Description: price denominated in the blockchains native token and USD for a given token contract address
 * @author: SUN Pengliang
 * @date: 2022/12/7 1:07
 **/

public class Erc20PriceVO {

    private List<NativeErc20PriceVO> nativePrice;

    /*
        The price in USD for the token
     */
    private Double usdPrice;

    /*
        The address of the exchange used to calculate the price
     */
    private String  exchangeAddress;

    /*
        The name of the exchange used for calculating the price
     */
    private String  exchangeName;

}
