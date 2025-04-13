/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from cPF
 */
public class cpf_2
implements fyq {
    private Stack<fyy_0> a = new Stack();
    private fya_0 b;

    @Override
    public fyo a(fya_0 fya_02, fyy_0 fyy_02) {
        this.b = fya_02;
        this.a.push(fyy_02);
        fyy_0 fyy_03 = this.a.peek();
        String string = "mru";
        fvb_0 fvb_02 = new fvb_0();
        fvb_02.onCheckOut();
        fvb_02.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fvb_02);
        }
        fvb_02.onAttributesInitialized();
        String string2 = "popup";
        fil_1 fil_12 = new fil_1();
        fil_12.onCheckOut();
        fil_12.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fil_12);
        }
        fil_12.setAlign(frs_0.b);
        fil_12.setHotSpotPosition(frs_0.h);
        fvb_02.addBasicElement(fil_12);
        fil_12.onAttributesInitialized();
        fso fso2 = fso.checkOut();
        fso2.setElementMap(fyy_03);
        fso2.setStyle("popup");
        fil_12.addBasicElement(fso2);
        fso2.onAttributesInitialized();
        String string3 = "popupText";
        fuk_0 fuk_02 = new fuk_0();
        fuk_02.onCheckOut();
        fuk_02.setElementMap(fyy_03);
        if (fyy_03 != null && string3 != null) {
            fyy_03.a(string3, fuk_02);
        }
        fuk_02.setStyle("DefaultWhite");
        fso2.addBasicElement(fuk_02);
        fuk_02.onAttributesInitialized();
        fuk_02.onChildrenAdded();
        fso2.onChildrenAdded();
        fil_12.onChildrenAdded();
        fru_0 fru_02 = new fru_0();
        fru_02.onCheckOut();
        fru_02.setElementMap(fyy_03);
        fvb_02.addBasicElement(fru_02);
        fru_02.onAttributesInitialized();
        fru_02.onChildrenAdded();
        fvb_02.onChildrenAdded();
        return fvb_02;
    }
}

