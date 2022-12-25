package club.edm.pojo.evm_vo.accountApi;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: TransactionCollectionVO
 * @Description: collection of native transactions.
 * @author: SUN Pengliang
 * @date: 2022/12/6 23:25
 **/

@Data
public class TransactionCollectionVO {

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

    private List<TransactionVO> transactionVO;


}
