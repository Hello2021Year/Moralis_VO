package club.edm.pojo.vo1.nativeApi;

/**
 * @ClassName: BlockDateVO
 * @Description: The closest block of the provided date.
 * @author: SUN Pengliang
 * @date: 2022/12/6 22:26
 **/

public class BlockDateVO {

    /*
     The date of the block
     */
     private String  date;

    /*
    The block number
    */
    private Long block;

    /**
     * The timestamp of the block
     */
    private Long blockTimestamp;

    /**
     * The block hash
     */
    private String  blockHash;

    /**
     * The block hash of the parent block
     */
    private String  parentHash;


}
