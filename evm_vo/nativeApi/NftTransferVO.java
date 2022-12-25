package club.edm.pojo.evm_vo.nativeApi;

import lombok.Data;

/**
 * @ClassName: NftTransferVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/6 22:51
 **/

@Data
public class NftTransferVO {

    /**
     * The address of the contract of the NFT
     */
    private String  tokenAddress;

    /**
     * The token id of the NFT
     */
    private String  tokenId;

    /**
     * The address that sent the NFT
     */
    private String  fromAddress;

    /**
     * The address that recieved the NFT
     */
    private String  toAddress;

    /**
     * The value that was sent in the transaction (ETH/BNB/etc..)
     */
    private String  value;

    /**
     * The number of tokens transferred
     */
    private String  amount;

    /**
     * The type of NFT contract standard
     */
    private String  contractType;

    /**
     * The block number of the transaction
     */
    private String  blockNumber;

    /**
     * The block timestamp
     */
    private String  blockTimestamp;

    /**
     * The block hash of the transaction
     */
    private String  blockHash;

    /**
     * The transaction hash
     */
    private String  transactionHash;

    /**
     * The transaction type
     */
    private String  transactionType;

    /**
     * The transaction index
     */
    private Integer transactionIndex;

    /**
     * The log index
     */
    private Integer logIndex;

    /**
     * The operator present only for ERC1155 Transfers
     */
    private String  operator;


}
