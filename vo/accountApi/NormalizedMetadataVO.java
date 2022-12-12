package club.edm.pojo.vo1.accountApi;

import java.util.List;

/**
 * @ClassName: NormalizedMetadataVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/7 0:12
 **/

public class NormalizedMetadataVO {

    /**
     * The name or title of the NFT
     */
    private String  name;

    /**
     * A detailed description of the NFT
     */
    private String  description;

    /**
     * The URL of the image of the NFT
     */
    private String  image;

    /**
     * A link to additional information.
     */
    private String  externalLink;

    private List<NormalizedMetadataAttributeVO> attributes;	;


}
