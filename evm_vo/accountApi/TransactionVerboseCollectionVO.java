package club.edm.pojo.evm_vo.accountApi;

import club.edm.pojo.evm_vo.nativeApi.BlockTransactionVO;
import lombok.Data;

import java.util.List;

/**
 * @ClassName: TransactionVerboseCollectionVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/6 23:36
 **/

@Data
public class TransactionVerboseCollectionVO {

    /**
     *The page of the current result
     */
    private Integer page;

    /**
     * The number of results per page
     */
    private Integer pageSize;

    private List<BlockTransactionVO> result;

}
