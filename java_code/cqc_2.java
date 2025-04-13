/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from cQC
 */
public class cqc_2
implements fyq {
    private Stack<fyy_0> a = new Stack();
    private fya_0 b;

    @Override
    public fyo a(fya_0 fya_02, fyy_0 fyy_02) {
        this.b = fya_02;
        this.a.push(fyy_02);
        fyy_0 fyy_03 = this.a.peek();
        fso fso2 = fso.checkOut();
        fso2.setElementMap(fyy_03);
        fso2.setNonBlocking(true);
        fso2.setStyle("popup");
        fso2.onAttributesInitialized();
        fso fso3 = fso2;
        fqj fqj2 = ((fvE)fso3).getAppearance();
        fqj2.setElementMap(fyy_03);
        fqj2.setModulationColor(new azf_2(1.0f, 1.0f, 1.0f, 0.6f));
        fso2.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fqj2.onChildrenAdded();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_03);
        fid_12.setAlign(frk_0.e);
        fid_12.setXOffset(-50);
        fid_12.setYOffset(-5);
        fso2.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fin_2 fin_22 = fin_2.checkOut();
        fin_22.setHorizontal(false);
        fso2.addBasicElement(fin_22);
        fin_22.onAttributesInitialized();
        fin_22.onChildrenAdded();
        fsM fsM2 = new fsM();
        fsM2.onCheckOut();
        fsM2.setElementMap(fyy_03);
        fsM2.setStyle("popupInformation");
        String string = "%timedSession.remaining%";
        string = string.replace("%timedSession.remaining%", fpm_0.b().c("timedSession.remaining"));
        fsM2.c(string);
        fso2.addBasicElement(fsM2);
        fsM2.onAttributesInitialized();
        fsM2.onChildrenAdded();
        String string2 = "text";
        fsM fsM3 = new fsM();
        fsM3.onCheckOut();
        fsM3.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fsM3);
        }
        fsM3.setNonBlocking(true);
        fsM3.setStyle("whitebold");
        fso2.addBasicElement(fsM3);
        fsM3.onAttributesInitialized();
        fid_1 fid_13 = new fid_1();
        fid_13.onCheckOut();
        fid_13.setElementMap(fyy_03);
        fid_13.setAlign(frk_0.i);
        fsM3.addBasicElement(fid_13);
        fid_13.onAttributesInitialized();
        fid_13.onChildrenAdded();
        fsM fsM4 = fsM3;
        fqh_0 fqh_02 = (fqh_0)((fvE)fsM4).getAppearance();
        fqh_02.setElementMap(fyy_03);
        fqh_02.setAlignment(frs_0.e);
        fsM3.addBasicElement(fqh_02);
        fqh_02.onAttributesInitialized();
        fqh_02.onChildrenAdded();
        fiy_1 fiy_12 = fiy_1.checkOut();
        fiy_12.setElementMap(fyy_03);
        fiy_12.setAttribute("text");
        fiy_12.setField("remainingTimeField");
        fiy_12.setName("sessionTimer");
        fsM3.addBasicElement(fiy_12);
        fiy_12.onAttributesInitialized();
        fiy_12.onChildrenAdded();
        fsM3.onChildrenAdded();
        fso2.onChildrenAdded();
        return fso2;
    }
}

