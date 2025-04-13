/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from cSl
 */
public class csl_2
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
        fso2.setNonBlocking(false);
        fdt_1 fdt_12 = new fdt_1();
        fdt_12.a("wakfu.videoLoading:onClick");
        fso2.setOnClick(fdt_12);
        fso2.onAttributesInitialized();
        fic_1 fic_12 = new fic_1();
        fic_12.onCheckOut();
        fso2.addBasicElement(fic_12);
        fic_12.onAttributesInitialized();
        fic_12.onChildrenAdded();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_03);
        fid_12.setAlign(frk_0.i);
        fid_12.setSize(new fjf_2(100.0f, 100.0f));
        fso2.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fso fso3 = fso2;
        fqj fqj2 = ((fvE)fso3).getAppearance();
        fqj2.setElementMap(fyy_03);
        fso2.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fbf_1 fbf_12 = new fbf_1();
        fbf_12.onCheckOut();
        fbf_12.setElementMap(fyy_03);
        fbf_12.setColor(new azf_2(0.0f, 0.0f, 0.0f, 1.0f));
        fqj2.addBasicElement(fbf_12);
        fbf_12.onAttributesInitialized();
        fbf_12.onChildrenAdded();
        fqj2.onChildrenAdded();
        String string = "video";
        fso fso4 = fso.checkOut();
        fso4.setElementMap(fyy_03);
        fso2.addBasicElement(fso4);
        fso4.onAttributesInitialized();
        fid_1 fid_13 = new fid_1();
        fid_13.onCheckOut();
        fid_13.setElementMap(fyy_03);
        fid_13.setAlign(frk_0.q);
        fid_13.setSize(new fjf_2(110, 110));
        fso4.addBasicElement(fid_13);
        fid_13.onAttributesInitialized();
        fid_13.onChildrenAdded();
        String string2 = "animatedElementViewer";
        frO frO2 = new frO();
        frO2.onCheckOut();
        frO2.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, frO2);
        }
        frO2.setAnimName("AnimVideoLoading");
        frO2.setFilePath("animVideoLoading.anm");
        frO2.setOffsetX(0.0f);
        frO2.setOffsetY(0.0f);
        frO2.setScale(1.0f);
        fso4.addBasicElement(frO2);
        frO2.onAttributesInitialized();
        fiy_1 fiy_12 = fiy_1.checkOut();
        fiy_12.setElementMap(fyy_03);
        fiy_12.setAttribute("animName");
        fiy_12.setName("isNewWorldReady");
        frO2.addBasicElement(fiy_12);
        fiy_12.onAttributesInitialized();
        far_2 far_22 = new far_2();
        far_22.onCheckOut();
        far_22.setElementMap(fyy_03);
        far_22.setElseValue("AnimVideoLoading");
        far_22.setValue("AnimVideoLoaded");
        fiy_12.addBasicElement(far_22);
        far_22.onAttributesInitialized();
        fai_1 fai_12 = new fai_1();
        fai_12.onCheckOut();
        fai_12.setElementMap(fyy_03);
        far_22.addBasicElement(fai_12);
        fai_12.onAttributesInitialized();
        fai_12.onChildrenAdded();
        far_22.onChildrenAdded();
        fiy_12.onChildrenAdded();
        frO2.onChildrenAdded();
        fso4.onChildrenAdded();
        fso2.onChildrenAdded();
        return fso2;
    }
}

