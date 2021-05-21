
@Service
public class Demo01ServiceImpl extends BaseServiceImpl implements Demo01Service {


    private Demo01Repository Demo01Repository;


    public <Map<String, Object>> getSummary(String drawingNo, String revNo) {

        List<Demo01Q10100trDwgRevSmrTableDto> summary = Demo01Repository.getSummary(drawingNo, revNo);
        List<Map<String, Object>> listTable = new ArrayList<Map<String, Object>>();
        if (Objects.nonNull(summary)) {
            summary.forEach(item -> {
                listTable.add(createValueMap("revWritePage", item.getRevWritePage(), "pageSeq", item.getPageSeq(),
                        "revContentsSummary", item.getRevContentsSummary()));
            });
            return listTable;
        }
        return listTable;
    }


    public Demo01TableDto getCommon(String drawingNo, String revNo) {

        Demo01TableDto common = Demo01Repository.getCommon(drawingNo, revNo);
        if (Objects.nonNull(common)) {


            StringBuffer itemNo = new StringBuffer();


            if (Objects.isNull(common.getCreateUser()) || common.getCreateUser().isEmpty()) {
                common.setCreateUser("");
            } else {
                try {
                    common.setCreateUser(imUserManager.getUserName(common.getCreateUser()));
                } catch (Exception e) {
                    StackTraceElement[] ste = e.getStackTrace();
                    for (StackTraceElement stackTraEle : ste) {
                        // TODO: 2021/5/21
                    }
                }
            }

            if (Objects.isNull(common.getRevUser()) || common.getRevUser().isEmpty()) {
                common.setRevUser("");
            } else {
                try {
                    common.setRevUser(imUserManager.getUserName(common.getRevUser()));
                } catch (Exception e) {
                    StackTraceElement[] ste = e.getStackTrace();
                    for (StackTraceElement stackTraEle : ste) {
                        // TODO: 2021/5/21
                    }
                }
            }

            if (Objects.isNull(common.getCheckUser()) || common.getCheckUser().isEmpty()) {
                common.setCheckUser("");
            } else {
                try {
                    common.setCheckUser(imUserManager.getUserName(common.getCheckUser()));
                } catch (Exception e) {
                    StackTraceElement[] ste = e.getStackTrace();
                    for (StackTraceElement stackTraEle : ste) {
                        // TODO: 2021/5/21
                    }
                }
            }

            return common;
        }
        return common;
    }


    public String getFormatDate(Date date) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        if (date != null) {
            String str = sdf.format(date);
            return str;
        }
        return null;
    }

    public Map<String, Object> createValueMap(Object... objArray) {

        Map<String, Object> map = new HashMap<String, Object>();
        int size = objArray.length;
        for (int i = 0; i < size; i++) {
            if ((i + 1) % 2 == 1) {
                map.put(objArray[i].toString(), objArray[i + 1]);
            }
        }
        return map;
    }

}
