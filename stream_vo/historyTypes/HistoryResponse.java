package club.edm.pojo.stream_vo.historyTypes;

import club.edm.pojo.stream_vo.HistoryModel;
import lombok.Data;

import java.util.List;

/**
 * @ClassName: HistoryResponse
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/21 23:31
 **/

@Data
public class HistoryResponse {
    /*
      The cursor to get to the next page
    */
    private String cursor;

    /**
     * 总数
     */
    private float total;

    private List<HistoryModel> result;


}
