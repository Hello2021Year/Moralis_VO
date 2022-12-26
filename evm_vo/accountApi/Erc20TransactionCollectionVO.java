package club.edm.pojo.vo.evm_vo.accountApi;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: Erc20TransactionCollectionVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/7 0:04
 **/

@Data
public class Erc20TransactionCollectionVO {

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

   private List<Erc20TransactionVO> result;
}
