package club.edm.pojo.evm_vo.nativeApi;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: NftTransferCollectionVO
 * @Description: nft transfer
 * @author: SUN Pengliang
 * @date: 2022/12/6 22:50
 **/

@Data
public class NftTransferCollectionVO {

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

    private List<NftTransferVO> result;

    /**
     * Indicator if the block exists
     */
    private Boolean BooleanExists;

    /**
     * Indicator if the block is fully indexed
     */
    private Boolean indexComplete;


}
