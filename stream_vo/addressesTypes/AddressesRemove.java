package club.edm.pojo.stream_vo.addressesTypes;
import lombok.Data;

import java.util.List;
/**
 * @ClassName: AddressesRemove
 * @Description: The address or a list of addresses to be removed from the Stream
 * @author: SUN Pengliang
 * @date: 2022/12/22 0:28
 **/

@Data
public class AddressesRemove {

    private List<String> address;
}
