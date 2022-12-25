package club.edm.pojo.stream_vo.addressesTypes;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: AddressesAdd
 * @Description: The address or a list of addresses to be added to the Stream.
 * @author: SUN Pengliang
 * @date: 2022/12/22 0:27
 **/

@Data
public class AddressesAdd {

    private List<String> address;

}
