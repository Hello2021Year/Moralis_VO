package club.edm.pojo.evm_vo.tokenApi;

import lombok.Data;

/**
 * @ClassName: NftContractMetadataVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/7 1:26
 **/

@Data
public class NftContractMetadataVO {

    /*
        The address of the token contract
     */
    private String  tokenAddress;

    /*
        The name of the token Contract
     */
    private String  name;

    /*
        timestamp of when the contract was last synced with the node
     */
    private String  syncedAt;

    /*
        The symbol of the NFT contract
     */
    private String  symbol;

    /*
        The type of NFT contract
     */
    private String  contractType;

}
