/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cLU
 */
public class clu_2
implements fyq {
    private Stack<fyy_0> a = new Stack();
    private fya_0 b;

    @Override
    public fyo a(fya_0 fya_02, fyy_0 fyy_02) {
        this.b = fya_02;
        this.a.push(fyy_02);
        fyy_0 fyy_03 = this.a.peek();
        fvk_0 fvk_02 = new fvk_0();
        fvk_02.onCheckOut();
        fvk_02.setElementMap(fyy_03);
        fvk_02.setMovable(true);
        fvk_02.onAttributesInitialized();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_03);
        fid_12.setAlign(frk_0.h);
        fid_12.setInitValue(true);
        fid_12.setXOffset(20);
        fvk_02.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        String string = "challengeInputContainer";
        fso fso2 = fso.checkOut();
        fso2.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fso2);
        }
        fso2.setNonBlocking(true);
        fso2.setPack(true);
        fso2.setStyle("spellInventory");
        fvk_02.addBasicElement(fso2);
        fso2.onAttributesInitialized();
        fiy_1 fiy_12 = fiy_1.checkOut();
        fiy_12.setElementMap(fyy_03);
        fiy_12.setAttribute("visible");
        fiy_12.setName("waitingForInputChallenge");
        fso2.addBasicElement(fiy_12);
        fiy_12.onAttributesInitialized();
        far_2 far_22 = new far_2();
        far_22.onCheckOut();
        far_22.setElementMap(fyy_03);
        fiy_12.addBasicElement(far_22);
        far_22.onAttributesInitialized();
        fab_2 fab_22 = new fab_2();
        fab_22.onCheckOut();
        fab_22.setElementMap(fyy_03);
        far_22.addBasicElement(fab_22);
        fab_22.onAttributesInitialized();
        fab_22.onChildrenAdded();
        far_22.onChildrenAdded();
        fiy_12.onChildrenAdded();
        String string2 = "challenge";
        fij_1 fij_12 = new fij_1();
        fij_12.onCheckOut();
        fij_12.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fij_12);
        }
        fso2.addBasicElement(fij_12);
        fij_12.onAttributesInitialized();
        fiy_1 fiy_13 = fiy_1.checkOut();
        fiy_13.setElementMap(fyy_03);
        fiy_13.setAttribute("value");
        fiy_13.setName("waitingForInputChallenge");
        fij_12.addBasicElement(fiy_13);
        fiy_13.onAttributesInitialized();
        fiy_13.onChildrenAdded();
        fij_12.onChildrenAdded();
        fvM fvM2 = new fvM();
        fvM2.onCheckOut();
        fvM2.setElementMap(fyy_03);
        fso2.addBasicElement(fvM2);
        fvM2.onAttributesInitialized();
        fvM fvM3 = fvM2;
        fqj fqj2 = ((fvE)fvM3).getAppearance();
        fqj2.setElementMap(fyy_03);
        fvM2.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fqo_0 fqo_02 = new fqo_0();
        fqo_02.onCheckOut();
        fqo_02.setElementMap(fyy_03);
        fqo_02.setInsets(new Insets(10, 10, 10, 10));
        fqj2.addBasicElement(fqo_02);
        fqo_02.onAttributesInitialized();
        fqo_02.onChildrenAdded();
        fqj2.onChildrenAdded();
        fso fso3 = fso.checkOut();
        fso3.setElementMap(fyy_03);
        fvM2.addBasicElement(fso3);
        fso3.onAttributesInitialized();
        fih_2 fih_22 = new fih_2();
        fih_22.onCheckOut();
        fso3.addBasicElement(fih_22);
        fih_22.onAttributesInitialized();
        fsM fsM2 = new fsM();
        fsM2.onCheckOut();
        fsM2.setElementMap(fyy_03);
        fsM2.setNonBlocking(true);
        fsM2.setStyle("white");
        String string3 = "%challenge.question%";
        string3 = string3.replace("%challenge.question%", fpm_0.b().c("challenge.question"));
        fsM2.c(string3);
        fih_22.addBasicElement(fsM2);
        fsM2.onAttributesInitialized();
        fii_2 fii_22 = fii_2.checkOut();
        fii_22.setElementMap(fyy_03);
        fii_22.setData(frg_0.b);
        fsM2.addBasicElement(fii_22);
        fii_22.onAttributesInitialized();
        fii_22.onChildrenAdded();
        fsM2.onChildrenAdded();
        String string4 = "textEditor";
        fug_0 fug_02 = new fug_0();
        fug_02.onCheckOut();
        fug_02.setElementMap(fyy_03);
        if (fyy_03 != null && string4 != null) {
            fyy_03.a(string4, fug_02);
        }
        fug_02.setFocused(true);
        fug_02.a(10);
        fdm_2 fdm_22 = new fdm_2();
        fdm_22.a("wakfu.challenge:parseInput(textEditor,challenge)");
        fug_02.setOnKeyPress(fdm_22);
        fug_02.setPrefSize(new fjf_2(80, 0));
        fug_02.setRestrict("[0-9]+");
        fug_02.setStyle("dark");
        fih_22.addBasicElement(fug_02);
        fug_02.onAttributesInitialized();
        fii_2 fii_23 = fii_2.checkOut();
        fii_23.setElementMap(fyy_03);
        fii_23.setData(frg_0.a);
        fug_02.addBasicElement(fii_23);
        fii_23.onAttributesInitialized();
        fii_23.onChildrenAdded();
        fug_0 fug_03 = fug_02;
        fqh_0 fqh_02 = (fqh_0)((fvE)fug_03).getAppearance();
        fqh_02.setElementMap(fyy_03);
        fqh_02.setAlign(frs_0.f);
        fug_02.addBasicElement(fqh_02);
        fqh_02.onAttributesInitialized();
        fqm_0 fqm_02 = fqm_0.checkOut();
        fqm_02.setElementMap(fyy_03);
        fqm_02.setInsets(new Insets(8, 5, 5, 0));
        fqh_02.addBasicElement(fqm_02);
        fqm_02.onAttributesInitialized();
        fqm_02.onChildrenAdded();
        fqh_02.onChildrenAdded();
        fug_02.onChildrenAdded();
        fru_0 fru_02 = new fru_0();
        fru_02.onCheckOut();
        fru_02.setElementMap(fyy_03);
        fdt_1 fdt_12 = new fdt_1();
        fdt_12.a("wakfu.challenge:parseInput(textEditor,challenge)");
        fru_02.setOnClick(fdt_12);
        fru_02.setStyle("smallValid");
        fih_22.addBasicElement(fru_02);
        fru_02.onAttributesInitialized();
        fii_2 fii_24 = fii_2.checkOut();
        fii_24.setElementMap(fyy_03);
        fii_24.setData(frg_0.d);
        fru_02.addBasicElement(fii_24);
        fii_24.onAttributesInitialized();
        fii_24.onChildrenAdded();
        fru_0 fru_03 = fru_02;
        fqd_0 fqd_02 = (fqd_0)((fvE)fru_03).getAppearance();
        fqd_02.setElementMap(fyy_03);
        fru_02.addBasicElement(fqd_02);
        fqd_02.onAttributesInitialized();
        fqm_0 fqm_03 = fqm_0.checkOut();
        fqm_03.setElementMap(fyy_03);
        fqm_03.setInsets(new Insets(3, 5, 0, 5));
        fqd_02.addBasicElement(fqm_03);
        fqm_03.onAttributesInitialized();
        fqm_03.onChildrenAdded();
        fqd_02.onChildrenAdded();
        fru_02.onChildrenAdded();
        fih_22.onChildrenAdded();
        fso3.onChildrenAdded();
        fvM2.onChildrenAdded();
        fso2.onChildrenAdded();
        fvk_02.onChildrenAdded();
        return fvk_02;
    }
}

