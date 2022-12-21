package club.edm.pojo.vo2.Partial_streamsTypes;

import club.edm.pojo.vo2.AbiItem;
import club.edm.pojo.vo2.StreamTrigger;

import java.util.List;

/**
 * @ClassName: StreamsModelCreate_
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/22 0:21
 **/

public class StreamsModelCreate_ {

    /*
     Webhook URL where moralis will send the POST request.
    */
    private String webhookUrl;

    /*
        A description for this stream
     */
    private String description;

    /*
        A user-provided tag that will be send along the webhook, the user can use this tag to identify the specific stream if multiple streams are present
     */
    private String tag;

    /*
        An Array of topic0's in string-signature format ex: ['FunctionName(address,uint256)']
     */
    private List<String> topic0;

    /*
        Include events for all addresses (only applied when abi and topic0 is provided)
     */
    private Boolean allAddress;

    /*
        Include or not native transactions defaults to false (only applied when type:contract)
     */
    private Boolean includeNativeTxs;

    /*
        Include or not logs of contract interactions defaults to false
     */
    private Boolean includeContractLogs;

    /*
        Include or not include internal transactions defaults to false
     */
    private Boolean includeInternalTxs;
    /*
        Include native balances for each address in the webhook
     */
    private List<club.edm.pojo.vo2.getNativeBalances> getNativeBalances;

    private List<AbiItem> abi;

    private List<club.edm.pojo.vo2.advancedOptions> advancedOptions;

    private List<String> chainIds;

    /*
        Indicator if it is a demo stream
     */
    private Boolean demo;

    private List<StreamTrigger> triggers;

}
