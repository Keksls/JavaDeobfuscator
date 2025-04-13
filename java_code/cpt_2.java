/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from cPt
 */
public class cpt_2
implements fyq {
    private Stack<fyy_0> a = new Stack();
    private fya_0 b;

    @Override
    public fyo a(fya_0 fya_02, fyy_0 fyy_02) {
        this.b = fya_02;
        this.a.push(fyy_02);
        fyy_0 fyy_03 = this.a.peek();
        String string = "container1";
        fso fso2 = fso.checkOut();
        fso2.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fso2);
        }
        fso2.onAttributesInitialized();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_03);
        fid_12.setAlign(frk_0.i);
        fso2.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        String string2 = "container2";
        fso fso3 = fso.checkOut();
        fso3.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fso3);
        }
        fso2.addBasicElement(fso3);
        fso3.onAttributesInitialized();
        String string3 = "animatedElement";
        frO frO2 = new frO();
        frO2.onCheckOut();
        frO2.setElementMap(fyy_03);
        if (fyy_03 != null && string3 != null) {
            fyy_03.a(string3, frO2);
        }
        frO2.setNonBlocking(true);
        fso3.addBasicElement(frO2);
        frO2.onAttributesInitialized();
        frO2.onChildrenAdded();
        fso3.onChildrenAdded();
        fso2.onChildrenAdded();
        return fso2;
    }
}

