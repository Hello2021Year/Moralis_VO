package club.edm.pojo.stream_vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public enum NativeBalancesType {

    //tx, log, erc20transfer, erc20approval, nfttransfer, internalTx;
    TX("tx"),
    LOG("log"),
    ERC20TRANSFER("erc20transfer"),
    ERC20APPROVAL("erc20approval"),
    NFTTRANSFER("nfttransfer"),
    INTERNALTX("internalTx");

    private final String type;
}
