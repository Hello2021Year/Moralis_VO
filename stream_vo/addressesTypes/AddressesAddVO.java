package club.edm.pojo.vo.stream_vo.addressesTypes;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: AddressesAddVO
 * @Description: The address or a list of addresses to be added to the Stream.
 * @author: SUN Pengliang
 * @date: 2022/12/22 0:27
 **/

@Data
public class AddressesAddVO {

    private List<String> address;

}
