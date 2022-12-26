package club.edm.pojo.vo.stream_vo.addressesTypes;
import lombok.Data;

import java.util.List;
/**
 * @ClassName: AddressesRemoveVO
 * @Description: The address or a list of addresses to be removed from the Stream
 * @author: SUN Pengliang
 * @date: 2022/12/22 0:28
 **/

@Data
public class AddressesRemoveVO {

    private List<String> address;
}
