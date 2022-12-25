package club.edm.pojo.evm_vo.accountApi;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: NftOwnerVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/7 0:13
 **/

@Data
public class NftOwnerVO {

        /**
         * The address of the contract of the NFT
         */
        private String  tokenAddress;

        /**
         * The token id of the NFT
         */
        private String  tokenId;

        /**
         * The type of NFT contract standard
         */
        private String  contractType;

        /**
         * The address of the owner of the NFT
         */
        private String  ownerOf;

        /**
         * The blocknumber when the amount or owner changed
         */
        private String  blockNumber;

        /**
         * The blocknumber when the NFT was minted
         */
        private String  blockNumberMinted;

        /**
         * The uri to the metadata of the token
         */
        private String  tokenUri;

        /**
         * The metadata of the token
         */
        private String  metadata;

        private List<NormalizedMetadataVO> normalizedMetadata;

        /**
         * The number of this item the user owns (used by ERC1155)
         */
        private String  amount;

        /**
         * The name of the Token contract
         */
        private String  name;

        /**
         * The symbol of the NFT contract
         */
        private String  symbol;

        /**
         * The token hash
         */
        private String  tokenHash;

        /**
         * When the token_uri was last updated
         */
        private String  lastTokenUriSync;

        /**
         * When the metadata was last updated
         */
        private String  lastMetadataSync;

}
