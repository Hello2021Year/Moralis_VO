package club.edm.pojo.stream_vo.streamsTypes;

import club.edm.pojo.stream_vo.StreamsModel;
import lombok.Data;

import java.util.List;

/**
 * @ClassName: StreamsResponse
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/22 0:16
 **/

@Data
public class StreamsResponse {

    /*
        Array of project Streams
     */
    private List<StreamsModel> result;

    /*
        Cursor for fetching next page
     */
    private String cursor;

    /*
        Total count of streams on the project
     */
    private Double total;

}
