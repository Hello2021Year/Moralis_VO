package club.edm.pojo.stream_vo.addressesTypes;

import club.edm.pojo.stream_vo.Address;

import java.util.List;

/**
 * @ClassName: AddressesResponse
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/22 0:25
 **/

public class AddressesResponse {

    /*
      The cursor to get to the next page
    */
    private String cursor;

    /**
     * 总数
     */
    private float total;

    private List<Address> result;


}
