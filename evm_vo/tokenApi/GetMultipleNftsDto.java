package club.edm.pojo.vo.evm_vo.tokenApi;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: GetMultipleNftsDto
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/13 0:41
 **/

@Data
public class GetMultipleNftsDto {

    /*
        Should normalized metadata be returned?
     */
    private Boolean normalizeMetadata;

    private List<TokenItem> tokens;




}
