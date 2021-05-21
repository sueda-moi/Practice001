
public interface Demo01Service {


    List<Map<String, Object>> getSummary(String drawingNo, String revNo);


    Demo01TableDto getCommon(String drawingNo, String revNo);

}
