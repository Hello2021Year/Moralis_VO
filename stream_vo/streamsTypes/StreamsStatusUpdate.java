package club.edm.pojo.vo2.streamsTypes;

import club.edm.pojo.vo2.StreamsStatus;

/**
 * @ClassName: StreamsStatusUpdate
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/22 0:23
 **/

public class StreamsStatusUpdate {
    /*
        The stream status: [active] The Stream is healthy and processing blocks [paused] The Stream is paused and is not processing blocks [error] The Stream has encountered an error and is not processing blocks
     */
    private StreamsStatus status;

}