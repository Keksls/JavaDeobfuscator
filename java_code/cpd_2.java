/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cPD
 */
public class cpd_2
implements fyq {
    private Stack<fyy_0> a = new Stack();
    private fya_0 b;

    @Override
    public fyo a(fya_0 fya_02, fyy_0 fyy_02) {
        this.b = fya_02;
        this.a.push(fyy_02);
        fyy_0 fyy_03 = this.a.peek();
        String string = "moderatorChatDialog";
        fvk_0 fvk_02 = new fvk_0();
        fvk_02.onCheckOut();
        fvk_02.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fvk_02);
        }
        fvk_02.setPack(true);
        fvk_02.onAttributesInitialized();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_03);
        fid_12.setAlign(frk_0.j);
        fid_12.setInitValue(true);
        fid_12.setSize(new fjf_2(-2, -2));
        fvk_02.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fic_1 fic_12 = new fic_1();
        fic_12.onCheckOut();
        fic_12.setAdaptToContentSize(true);
        fvk_02.addBasicElement(fic_12);
        fic_12.onAttributesInitialized();
        fic_12.onChildrenAdded();
        fso fso2 = fso.checkOut();
        fso2.setElementMap(fyy_03);
        fso2.setStyle("popup");
        fvk_02.addBasicElement(fso2);
        fso2.onAttributesInitialized();
        fid_1 fid_13 = new fid_1();
        fid_13.onCheckOut();
        fid_13.setElementMap(fyy_03);
        fid_13.setSize(new fjf_2(100.0f, 100.0f));
        fso2.addBasicElement(fid_13);
        fid_13.onAttributesInitialized();
        fid_13.onChildrenAdded();
        fin_2 fin_22 = fin_2.checkOut();
        fin_22.setHorizontal(false);
        fso2.addBasicElement(fin_22);
        fin_22.onAttributesInitialized();
        fin_22.onChildrenAdded();
        fvM fvM2 = new fvM();
        fvM2.onCheckOut();
        fvM2.setElementMap(fyy_03);
        fso2.addBasicElement(fvM2);
        fvM2.onAttributesInitialized();
        fso fso3 = fso.checkOut();
        fso3.setElementMap(fyy_03);
        fso3.setStyle("titleBar");
        fvM2.addBasicElement(fso3);
        fso3.onAttributesInitialized();
        fso fso4 = fso3;
        fqj fqj2 = ((fvE)fso4).getAppearance();
        fqj2.setElementMap(fyy_03);
        fso3.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fqo_0 fqo_02 = new fqo_0();
        fqo_02.onCheckOut();
        fqo_02.setElementMap(fyy_03);
        fqo_02.setInsets(new Insets(3, 20, 3, 20));
        fqj2.addBasicElement(fqo_02);
        fqo_02.onAttributesInitialized();
        fqo_02.onChildrenAdded();
        fqj2.onChildrenAdded();
        fip_2 fip_22 = new fip_2();
        fip_22.onCheckOut();
        fip_22.setElementMap(fyy_03);
        fip_22.setAlign(frs_0.e);
        fso3.addBasicElement(fip_22);
        fip_22.onAttributesInitialized();
        fip_22.onChildrenAdded();
        fsM fsM2 = new fsM();
        fsM2.onCheckOut();
        fsM2.setElementMap(fyy_03);
        fsM2.setNonBlocking(true);
        fsM2.setStyle("StyledBold16White");
        String string2 = "%moderator.chat%";
        string2 = string2.replace("%moderator.chat%", fpm_0.b().c("moderator.chat"));
        fsM2.c(string2);
        fso3.addBasicElement(fsM2);
        fsM2.onAttributesInitialized();
        fsM fsM3 = fsM2;
        fqh_0 fqh_02 = (fqh_0)((fvE)fsM3).getAppearance();
        fqh_02.setElementMap(fyy_03);
        fqh_02.setAlignment(frs_0.e);
        fsM2.addBasicElement(fqh_02);
        fqh_02.onAttributesInitialized();
        fqh_02.onChildrenAdded();
        fsM2.onChildrenAdded();
        fso3.onChildrenAdded();
        fvM2.onChildrenAdded();
        String string3 = "chatView";
        fij_1 fij_12 = new fij_1();
        fij_12.onCheckOut();
        fij_12.setElementMap(fyy_03);
        if (fyy_03 != null && string3 != null) {
            fyy_03.a(string3, fij_12);
        }
        fso2.addBasicElement(fij_12);
        fij_12.onAttributesInitialized();
        fiy_1 fiy_12 = fiy_1.checkOut();
        fiy_12.setElementMap(fyy_03);
        fiy_12.setAttribute("value");
        fiy_12.setField("currentView");
        fiy_12.setLocal(true);
        fiy_12.setName("chat");
        fij_12.addBasicElement(fiy_12);
        fiy_12.onAttributesInitialized();
        fiy_12.onChildrenAdded();
        fij_12.onChildrenAdded();
        fso fso5 = fso.checkOut();
        fso5.setElementMap(fyy_03);
        fso5.setPrefSize(new fjf_2(400, 250));
        fso2.addBasicElement(fso5);
        fso5.onAttributesInitialized();
        fin_2 fin_23 = fin_2.checkOut();
        fin_23.setAlign(frs_0.b);
        fin_23.setHorizontal(false);
        fso5.addBasicElement(fin_23);
        fin_23.onAttributesInitialized();
        fin_23.onChildrenAdded();
        fso fso6 = fso5;
        fqj fqj3 = ((fvE)fso6).getAppearance();
        fqj3.setElementMap(fyy_03);
        fso5.addBasicElement(fqj3);
        fqj3.onAttributesInitialized();
        fqo_0 fqo_03 = new fqo_0();
        fqo_03.onCheckOut();
        fqo_03.setElementMap(fyy_03);
        fqo_03.setInsets(new Insets(5, 5, 5, 5));
        fqj3.addBasicElement(fqo_03);
        fqo_03.onAttributesInitialized();
        fqo_03.onChildrenAdded();
        fqj3.onChildrenAdded();
        fue_0 fue_02 = new fue_0();
        fue_02.onCheckOut();
        fue_02.setElementMap(fyy_03);
        fue_02.setNonBlocking(true);
        fue_02.setVerticalScrollBarBehaviour(fra_0.b);
        fso5.addBasicElement(fue_02);
        fue_02.onAttributesInitialized();
        String string4 = "chatTextView";
        fuk_0 fuk_02 = new fuk_0();
        fuk_02.onCheckOut();
        fuk_02.setElementMap(fyy_03);
        if (fyy_03 != null && string4 != null) {
            fyy_03.a(string4, fuk_02);
        }
        fuk_02.setEnableOnlySelectablePartInteraction(true);
        fuk_02.setNonBlocking(false);
        fdt_1 fdt_12 = new fdt_1();
        fdt_12.a("wakfu.chat:processLinkAction(moderatorChatDialog,chatView)");
        fuk_02.setOnClick(fdt_12);
        fdz_1 fdz_12 = new fdz_1();
        fdz_12.a("wakfu.chat:onMouseExitSelectableText(moderatorChatDialog)");
        fuk_02.setOnMouseExit(fdz_12);
        fda_1 fda_12 = new fda_1();
        fda_12.a("wakfu.chat:processLinkAction(moderatorChatDialog,chatView)");
        fuk_02.setOnMouseMove(fda_12);
        fuk_02.setPrefSize(new fjf_2(0, 100));
        fuk_02.setStyle("white14Bordered");
        fuk_02.setVerticalAlignment(fro_0.b);
        fue_02.addBasicElement(fuk_02);
        fuk_02.onAttributesInitialized();
        fiy_1 fiy_13 = fiy_1.checkOut();
        fiy_13.setElementMap(fyy_03);
        fiy_13.setAttribute("text");
        fiy_13.setField("currentView/history");
        fiy_13.setLocal(true);
        fiy_13.setName("chat");
        fuk_02.addBasicElement(fiy_13);
        fiy_13.onAttributesInitialized();
        fiy_13.onChildrenAdded();
        fuk_0 fuk_03 = fuk_02;
        fqh_0 fqh_03 = (fqh_0)((fvE)fuk_03).getAppearance();
        fqh_03.setElementMap(fyy_03);
        fuk_02.addBasicElement(fqh_03);
        fqh_03.onAttributesInitialized();
        fqm_0 fqm_02 = fqm_0.checkOut();
        fqm_02.setElementMap(fyy_03);
        fqm_02.setInsets(new Insets(0, 1, 0, 0));
        fqh_03.addBasicElement(fqm_02);
        fqm_02.onAttributesInitialized();
        fqm_02.onChildrenAdded();
        fqg_0 fqg_02 = fqg_0.checkOut();
        fqg_02.setElementMap(fyy_03);
        fqg_02.setColor(new azf_2(0.0f, 0.0f, 0.0f, 1.0f));
        fqg_02.setName("text");
        fqh_03.addBasicElement(fqg_02);
        fqg_02.onAttributesInitialized();
        fqg_02.onChildrenAdded();
        fqh_03.onChildrenAdded();
        fuk_02.onChildrenAdded();
        fue_02.onChildrenAdded();
        String string5 = "chatForm";
        fzz fzz2 = new fzz();
        fzz2.onCheckOut();
        fzz2.setElementMap(fyy_03);
        if (fyy_03 != null && string5 != null) {
            fyy_03.a(string5, fzz2);
        }
        this.b.a((fyy_03 != null ? fyy_03.c() : "") + ".chatForm", fzz2);
        fso5.addBasicElement(fzz2);
        fzz2.onAttributesInitialized();
        String string6 = "textEditorRenderableContainer";
        ftj_0 ftj_02 = new ftj_0();
        ftj_02.onCheckOut();
        ftj_02.setElementMap(fyy_03);
        if (fyy_03 != null && string6 != null) {
            fyy_03.a(string6, ftj_02);
        }
        ftj_02.setExpandable(false);
        fzz2.addBasicElement(ftj_02);
        ftj_02.onAttributesInitialized();
        faf_2 faf_22 = new faf_2();
        faf_22.onCheckOut();
        faf_22.setElementMap(fyy_03);
        ftj_02.addBasicElement(faf_22);
        faf_22.onAttributesInitialized();
        fsv_0 fsv_02 = new fsv_0();
        fsv_02.onCheckOut();
        fsv_02.setElementMap(fyy_03);
        fde_1 fde_12 = new fde_1();
        fde_12.a("wakfu.chat:insertItem(chatView)");
        fsv_02.setOnDrop(fde_12);
        faf_22.addBasicElement(fsv_02);
        fsv_02.onAttributesInitialized();
        String string7 = "chatInput";
        fug_0 fug_02 = new fug_0();
        fug_02.onCheckOut();
        fug_02.setElementMap(fyy_03);
        if (fyy_03 != null && string7 != null) {
            fyy_03.a(string7, fug_02);
        }
        fug_02.setAutoHorizontalScrolled(true);
        fug_02.a(225);
        fdm_2 fdm_22 = new fdm_2();
        fdm_22.a("wakfu.chat:processKeyPressed(chatForm,chatView)");
        fug_02.setOnKeyPress(fdm_22);
        fdo_1 fdo_12 = new fdo_1();
        fdo_12.a("wakfu.chat:processKeyTyped(chatForm,chatView)");
        fug_02.setOnKeyType(fdo_12);
        fug_02.setRestrict("[.*&[^<>]]");
        fsv_02.addBasicElement(fug_02);
        fug_02.onAttributesInitialized();
        fug_0 fug_03 = fug_02;
        fqh_0 fqh_04 = (fqh_0)((fvE)fug_03).getAppearance();
        fqh_04.setElementMap(fyy_03);
        fug_02.addBasicElement(fqh_04);
        fqh_04.onAttributesInitialized();
        fqm_0 fqm_03 = fqm_0.checkOut();
        fqm_03.setElementMap(fyy_03);
        fqm_03.setInsets(new Insets(5, 0, 0, 0));
        fqh_04.addBasicElement(fqm_03);
        fqm_03.onAttributesInitialized();
        fqm_03.onChildrenAdded();
        fqh_04.onChildrenAdded();
        fiy_1 fiy_14 = fiy_1.checkOut();
        fiy_14.setElementMap(fyy_03);
        fiy_14.setAttribute("text");
        fiy_14.setField("currentView/input");
        fiy_14.setLocal(true);
        fiy_14.setName("chat");
        fug_02.addBasicElement(fiy_14);
        fiy_14.onAttributesInitialized();
        fiy_14.onChildrenAdded();
        fug_02.onChildrenAdded();
        fsv_02.onChildrenAdded();
        faf_22.onChildrenAdded();
        ftj_02.onChildrenAdded();
        fzz2.onChildrenAdded();
        this.b.f((fyy_03 != null ? fyy_03.c() : "") + ".chatForm");
        fso5.onChildrenAdded();
        fso2.onChildrenAdded();
        fru_0 fru_02 = new fru_0();
        fru_02.onCheckOut();
        fru_02.setElementMap(fyy_03);
        fru_02.setExpandable(false);
        fdt_1 fdt_13 = new fdt_1();
        fdt_13.a("wakfu.moderatorChat:close");
        fru_02.setOnClick(fdt_13);
        fru_02.setStyle("close");
        fvk_02.addBasicElement(fru_02);
        fru_02.onAttributesInitialized();
        fid_1 fid_14 = new fid_1();
        fid_14.onCheckOut();
        fid_14.setElementMap(fyy_03);
        fid_14.setAlign(frk_0.e);
        fid_14.setSize(new fjf_2(-2, -2));
        fid_14.setXOffset(-18);
        fid_14.setYOffset(-16);
        fru_02.addBasicElement(fid_14);
        fid_14.onAttributesInitialized();
        fid_14.onChildrenAdded();
        fru_02.onChildrenAdded();
        fvk_02.onChildrenAdded();
        return fvk_02;
    }
}

