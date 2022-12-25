package club.edm.pojo.evm_vo.tokenApi;

import java.util.List;

/**
 * @ClassName: NftMetadataCollectionVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/7 1:23
 **/

public class NftMetadataCollectionVO {

        /**
         * The total number of matches for this query
         */
        private Integer total;

        /**
         * The page of the current result
         */
        private Integer page;

        /**
         * The number of results per page
         */
        private Integer pageSize;

        private List<NftMetadataVO> result;


}
