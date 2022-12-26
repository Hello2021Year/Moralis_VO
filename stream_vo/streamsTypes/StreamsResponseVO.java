package club.edm.pojo.vo.stream_vo.streamsTypes;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: StreamsResponseVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/22 0:16
 **/

@Data
public class StreamsResponseVO {

    /*
        Array of project Streams
     */
    private List<StreamsModelVO> result;

    /*
        Cursor for fetching next page
     */
    private String cursor;

    /*
        Total count of streams on the project
     */
    private Double total;

}
