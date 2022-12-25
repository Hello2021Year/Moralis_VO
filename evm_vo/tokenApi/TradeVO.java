package club.edm.pojo.evm_vo.tokenApi;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: TradeVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/7 0:58
 **/

@Data
public class TradeVO {

    /*
        The transaction hash
     */
    private String  transactionHash;

    /*
        The transaction index
     */
    private String  transactionIndex;

    /*
        The token id(s) traded
     */
    List<String > tokenIds;

    /*
        The address that sold the NFT
     */
    private String  sellerAddress;

    /*
        The address that bought the NFT
     */
    private String  buyerAddress;

    /*
        The address of the contract that traded the NFT
     */

    /*
        The value that was sent in the transaction (ETH/BNB/etc..)
     */
    private String  price;

    /*
        The block timestamp
     */
    private String  blockTimestamp;

    /*
        The blocknumber of the transaction
     */
    private String  blockNumber;

    /*
        The block hash
     */
    private String  blockHash;

}
