
public interface Demo01Repository {


    List<Demo01Q10100trDwgRevSmrTableDto> getSummary(@Param("drawingNo") String drawingNo,
            @Param("revNo") String revNo);


    Demo01TableDto getCommon(@Param("drawingNo") String drawingNo, @Param("revNo") String revNo);

}
