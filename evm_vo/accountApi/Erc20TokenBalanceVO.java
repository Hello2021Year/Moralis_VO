package club.edm.pojo.evm_vo.accountApi;

/**
 * @ClassName: Erc20TokenBalanceVO
 * @Description: token balances for a specific address.
 * @author: SUN Pengliang
 * @date: 2022/12/6 23:39
 **/

public class Erc20TokenBalanceVO {

    /**
     * The address of the token contract
     */
    private String  tokenAddress;

    /**
     * The name of the token Contract
     */
    private String  name;

    /**
     * The symbol of the NFT contract
     */
    private String  symbol;

    /**
     * The logo of the token
     */
    private String  logo;

    /**
     * The thumbnail of the logo
     */
    private String  thumbnail;

    /**
     * The number of decimals on of the token
     */
    private Integer decimals;

    /**
     * timestamp of when the contract was last synced with the node
     */
    private String  balance;

}
