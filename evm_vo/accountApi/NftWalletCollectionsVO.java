package club.edm.pojo.vo1.accountApi;

import java.util.List;

/**
 * @ClassName: NftWalletCollectionsVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/7 0:32
 **/

public class NftWalletCollectionsVO {

    /**
     * The syncing status of the address [SYNCING/SYNCED]
     */
    private String  status;

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

    /**
     * The cursor to get to the next page
     */
    private String  cursor;

    private List<NftCollectionVO> result;

}
