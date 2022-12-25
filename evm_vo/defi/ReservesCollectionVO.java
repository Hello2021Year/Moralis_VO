package club.edm.pojo.evm_vo.defi;

import lombok.Data;

/**
 * @ClassName: ReservesCollectionVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/12 22:31
 **/

@Data
public class ReservesCollectionVO {

    /*
        合约地址
     */
    private String pairAddress;

    /*
        token 0
     */
     private DefiTokenVO token0;

     /*
        token 1
      */
      private DefiTokenVO token1;

}
