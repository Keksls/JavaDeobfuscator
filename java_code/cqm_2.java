/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from cQM
 */
public class cqm_2
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
        fvk_02.onAttributesInitialized();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_03);
        fid_12.setAlign(frk_0.i);
        fid_12.setSize(new fjf_2(100.0f, 100.0f));
        fvk_02.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fso fso2 = fso.checkOut();
        fso2.setElementMap(fyy_03);
        fvk_02.addBasicElement(fso2);
        fso2.onAttributesInitialized();
        fsk_0 fsk_02 = new fsk_0();
        fsk_02.onCheckOut();
        fsk_02.setElementMap(fyy_03);
        fdt_1 fdt_12 = new fdt_1();
        fdt_12.a("unloadDialog");
        fsk_02.setOnClick(fdt_12);
        fso2.addBasicElement(fsk_02);
        fsk_02.onAttributesInitialized();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        fsk_02.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fiy_1 fiy_12 = fiy_1.checkOut();
        fiy_12.setElementMap(fyy_03);
        fiy_12.setAttribute("texture");
        fiy_12.setName("splashScreenIconUrl");
        fqv2.addBasicElement(fiy_12);
        fiy_12.onAttributesInitialized();
        fiy_12.onChildrenAdded();
        fqv2.onChildrenAdded();
        fsk_02.onChildrenAdded();
        fso2.onChildrenAdded();
        fvk_02.onChildrenAdded();
        return fvk_02;
    }
}

