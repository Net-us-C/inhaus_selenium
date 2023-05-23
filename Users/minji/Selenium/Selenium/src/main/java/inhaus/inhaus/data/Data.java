package inhaus.inhaus.data;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class Data {
    String place = "운동장(축구장)";
    int month = 0;
    int day = 0;
    String content = "";
    String start_time = "";
    String end_time = "";


}
