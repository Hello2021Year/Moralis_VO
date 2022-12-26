package club.edm.pojo.vo.evm_vo.tokenApi;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: TradeCollectionVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/7 1:03
 **/

@Data
public class TradeCollectionVO {

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

        private List<TradeVO> result;

}
