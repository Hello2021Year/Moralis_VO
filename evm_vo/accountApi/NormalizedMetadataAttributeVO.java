package club.edm.pojo.vo.evm_vo.accountApi;

import lombok.Data;

/**
 * @ClassName: NormalizedMetadataAttributeVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/7 0:19
 **/

@Data
public class NormalizedMetadataAttributeVO {

    /**
     * The trait title or descriptor
     */
    private String  traitType;

    /**
     * The value of the attribute
     */
    private String  value;

    /**
     * The type the attribute value should be displayed as
     */
    private String  displayType;

    /**
     * For numeric values, the upper range
     */
    private Integer number;

    /**
     * The number of possible values for this trait
     */
    private Integer traitCount;

    /**
     * Order the trait should appear in the attribute list.
     */
    private Integer order;

}
