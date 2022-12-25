package club.edm.pojo.evm_vo.tokenApi;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: NftMetadataVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/7 1:14
 **/

@Data
public class NftMetadataVO {

        /*
            The token id of the NFT
         */
        private String  tokenId;

        /*
            The address of the contract of the NFT
         */
        private String  tokenAddress;

        /*
            The uri to the metadata of the token
         */
        private String  tokenUri;

        /*
            The metadata of the token
         */
        private String  metadata;

        private Integer isValid;

        private Integer syncing;

        private Integer frozen;

        private Integer resyncing;

        /*
            The type of NFT contract standard
         */
        private String  contractType;

        private String  tokenHash;

        private String  batchId;

        private String  metadataName;

        private String  metadataDescription;

        private String  metadataAtrributes;

        private String  blockNumberMinted;

        private List<String > openseaLookup;

        private String  minterAddress;

        private String  transactionMinted;

        private List<String> frozenLogIndex;

        private List<String > imported;

        /*
           When the token_uri was last updated
         */
        private String  lastTokenUriSync;
        /*
            When the metadata was last updated
         */
        private String  lastMetadataSync;


        private String  createdAt;

        private String  updateAt;
}
