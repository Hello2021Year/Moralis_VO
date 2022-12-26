package club.edm.pojo.vo.stream_vo.historyTypes;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: HistoryResponseVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/21 23:31
 **/

@Data
public class HistoryResponseVO {
    /*
      The cursor to get to the next page
    */
    private String cursor;

    /**
     * 总数
     */
    private Double total;

    private List<HistoryModelVO> result;


}
