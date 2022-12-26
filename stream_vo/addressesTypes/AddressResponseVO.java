package club.edm.pojo.vo.stream_vo.addressesTypes;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: AddressResponseVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/22 0:26
 **/

@Data
public class AddressResponseVO {

    private String streamId;

    /*
    不确定类型
     */
    private List<String> address;


}
