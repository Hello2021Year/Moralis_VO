package club.edm.pojo.vo.evm_vo.version;

import lombok.Data;

/**
 * @ClassName: EndPointWeightsVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/12 22:46
 **/

@Data
public class EndPointWeightsVO {

    /*
        endpoint
     */
    private String endpoint;

    /*
        The path to the endpoint
     */
    private String path;

    /*
        The number of hits the requests counts for ratelimiting
     */
    private String rateLimitWeight;

    /*
        The number of hits the requests counts for billing
     */
    private String price;


}
