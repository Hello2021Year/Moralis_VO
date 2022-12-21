package club.edm.pojo.vo2.streamsTypes;

import club.edm.pojo.vo2.StreamsModel;

import java.util.List;

/**
 * @ClassName: StreamsResponse
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/22 0:16
 **/

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
