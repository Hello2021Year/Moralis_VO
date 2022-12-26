package club.edm.pojo.vo.stream_vo.addressesTypes;

import club.edm.pojo.vo.stream_vo.AddressVO;
import lombok.Data;

import java.util.List;

/**
 * @ClassName: AddressesResponseVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/22 0:25
 **/

@Data
public class AddressesResponseVO {

    /*
      The cursor to get to the next page
    */
    private String cursor;

    /**
     * 总数
     */
    private float total;

    private List<AddressVO> result;

}
