package club.edm.pojo.vo2.addressesTypes;

import club.edm.pojo.vo2.Address;
import club.edm.pojo.vo2.HistoryModel;

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
