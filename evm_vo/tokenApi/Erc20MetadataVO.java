package club.edm.pojo.evm_vo.tokenApi;

/**
 * @ClassName: Erc20MetadataVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/7 0:54
 **/

public class Erc20MetadataVO {

    /**
     * The address of the token contract
     */
    private String  address;

    /**
     * The name of the token Contract
     */
    private String  name;

    /**
     * The symbol of the NFT contract
     */
    private String  symbol;

    /**
     * The number of decimals on of the token
     */
    private String  decimals;

    /*
        The logo of the token
     */
    private String  logo;

    /*
        The logo hash
     */
    private String  logoHash;

    /*
        The thumbnail of the logo
     */
     private String  thumbNail;

     private String  blockNumber;

     private String  validated;

}
