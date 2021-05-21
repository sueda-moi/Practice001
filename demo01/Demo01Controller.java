
package product.app.Demo01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;


@Controller
@RequestMapping("product/Demo01")
public class Demo01Controller extends ProductBaseController {


    private static final String SCREEN_ID = "Demo01";


    private static final String SCREEN_NAME = MessageUtil.getMessage(SCREEN_ID + ".screenName");


    @Inject
    private Demo01Service detailService;



    @RequestMapping("init")
    @Authz
    public String init(final Model model, final Demo01Form form) throws JsonProcessingException {


        String drawingNo = form.getDrawingNo();

        String revNo = form.getRevNo();


        Demo01TableDto common = detailService.getCommon(drawingNo, revNo);
        if (Objects.isNull(common)) {
            form.setDrawingTitle("");
            form.setIssuedDate("");
            form.setDrawingCls("");
            form.setItemNo("");
            form.setReferenceDwgNo("");
            form.setTradingDate("");
            form.setRegulationJun("");
            form.setCreateUser("");
            form.setRevUser("");
            form.setCheckUser("");
            form.setCommonDataJson(ParseUtil.toJson(new Demo01TableDto()));
        } else {

            form.setDrawingTitle(common.getDrawingTitle());
            form.setIssuedDate(common.getFormattedDrawingDate());
            form.setDrawingCls(common.getDrawingCls());
            form.setItemNo(common.getItemNo());
            form.setReferenceDwgNo(common.getReferenceDwgNo());
            form.setTradingDate(common.getFormattedPickDate());
            form.setRegulationJun(common.getRegulationJun());
            form.setCreateUser(common.getCreateUser());
            form.setRevUser(common.getRevUser());
            form.setCheckUser(common.getCheckUser());
            String commonJson = ParseUtil.toJson(common);
            form.setCommonDataJson(commonJson);
        }

        List<Map<String, Object>> summary = detailService.getSummary(drawingNo, revNo);
        if (Objects.isNull(summary) || summary.size() == 0) {
            form.setErrorMessage(MessageUtil.getMessage("A00V005E",
                    new String[] { MessageUtil.getMessage("Demo01.data.summary") }));
            model.addAttribute("listTable", new ArrayList<Map<String, Object>>());
            model.addAttribute("Demo01Form", form);
        } else {
            model.addAttribute("listTable", summary);
            model.addAttribute("Demo01Form", form);
        }
        return "/product/Demo01.jsp";
    }


    public String getScreenID() {

        return SCREEN_ID;
    }


    public String getScreenName() {

        return SCREEN_NAME;
    }

}
