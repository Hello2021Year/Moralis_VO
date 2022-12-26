package club.edm.pojo.vo.evm_vo.contract;

import lombok.Data;

/**
 * @ClassName: ContractSyncedVO
 * @Description: The return code of initiates a sync of a previously non synced Contract.
 * @author: SUN Pengliang
 * @date: 2022/12/12 22:22
 **/

@Data
public class ContractSyncedVO {

    /*
    Contract AddressVO was triggered for index.
     */
    private String  code;
}
