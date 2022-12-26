package club.edm.pojo.vo.evm_vo.accountApi;

import lombok.Data;

/**
 * @ClassName: NftCollectionVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/7 0:48
 **/

@Data
public class NftCollectionVO {

    /**
     * The address of the contract of the NFT
     */
    private String  tokenAddress;

    /**
     * The type of NFT contract standard
     */
    private String  contractType;

    /**
     * The name of the Token contract
     */
    private String  name;

    /**
     * The symbol of the NFT contract
     */
    private String  symbol;


}
