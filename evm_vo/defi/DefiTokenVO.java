package club.edm.pojo.vo.evm_vo.defi;

import lombok.Data;

/**
 * @ClassName: DefiTokenVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/12 22:34
 **/

@Data
public class DefiTokenVO {
    /*
        example: 0xdac17f958d2ee523a2206206994597c13d831ec7
     */
    private String address;

    /*
        example: Tether USD
     */
    private String name;

    /*
        example: USDT
     */
    private String symbol;

    /*
        example: 6
     */
    private String decimals;

    /*
        example: https://cdn.moralis.io/eth/0xdac17f958d2ee523a2206206994597c13d831ec7.png
     */
    private String logo;

    /*
        example: ee7aa2cdf100649a3521a082116258e862e6971261a39b5cd4e4354fcccbc54d
     */
    private String logo_hash;

    /*
        example: https://cdn.moralis.io/eth/0xdac17f958d2ee523a2206206994597c13d831ec7_thumb.png
     */
    private String thumbnail;

    /*
        example: 4638568
     */
    private String block_number;

    /*
        example: 1
     */
    private Integer validated;

    /*
        example: 2022-01-20T09:39:55.818Z
     */
    private String created_at;

}
