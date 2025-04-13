/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from cSj
 */
public class csj_2
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
        fdt_12.a("wakfu.videoCinematic:onClick");
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
        fvp fvp2 = fvp.checkOut();
        fvp2.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fvp2);
        }
        fso2.addBasicElement(fvp2);
        fvp2.onAttributesInitialized();
        fid_1 fid_13 = new fid_1();
        fid_13.onCheckOut();
        fid_13.setElementMap(fyy_03);
        fid_13.setAlign(frk_0.i);
        fid_13.setSize(new fjf_2(100.0f, 100.0f));
        fvp2.addBasicElement(fid_13);
        fid_13.onAttributesInitialized();
        fid_13.onChildrenAdded();
        fvp2.onChildrenAdded();
        fuk_0 fuk_02 = new fuk_0();
        fuk_02.onCheckOut();
        fuk_02.setElementMap(fyy_03);
        fuk_02.setNonBlocking(true);
        fuk_02.setStyle("systemMessage");
        fuk_02.c("Buffering : 0%");
        fso2.addBasicElement(fuk_02);
        fuk_02.onAttributesInitialized();
        fid_1 fid_14 = new fid_1();
        fid_14.onCheckOut();
        fid_14.setElementMap(fyy_03);
        fid_14.setAlign(frk_0.o);
        fid_14.setSize(new fjf_2(-2, -2));
        fid_14.setYOffset(50);
        fuk_02.addBasicElement(fid_14);
        fid_14.onAttributesInitialized();
        fid_14.onChildrenAdded();
        fiy_1 fiy_12 = fiy_1.checkOut();
        fiy_12.setElementMap(fyy_03);
        fiy_12.setAttribute("text");
        fiy_12.setField("bufferingDesc");
        fiy_12.setName("video");
        fuk_02.addBasicElement(fiy_12);
        fiy_12.onAttributesInitialized();
        fiy_12.onChildrenAdded();
        fuk_0 fuk_03 = fuk_02;
        fqh_0 fqh_02 = (fqh_0)((fvE)fuk_03).getAppearance();
        fqh_02.setElementMap(fyy_03);
        fuk_02.addBasicElement(fqh_02);
        fqh_02.onAttributesInitialized();
        fiy_1 fiy_13 = fiy_1.checkOut();
        fiy_13.setElementMap(fyy_03);
        fiy_13.setAttribute("modulationColor");
        fiy_13.setField("modulationColor");
        fiy_13.setName("video");
        fqh_02.addBasicElement(fiy_13);
        fiy_13.onAttributesInitialized();
        fiy_13.onChildrenAdded();
        fqh_02.onChildrenAdded();
        fuk_02.onChildrenAdded();
        fso2.onChildrenAdded();
        return fso2;
    }
}

