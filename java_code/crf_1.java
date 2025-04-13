/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from cRf
 */
public class crf_1
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
        fso2.onAttributesInitialized();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_03);
        fid_12.setAlign(frk_0.i);
        fid_12.setSize(new fjf_2(200, 200));
        fso2.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fsm_0 fsm_02 = new fsm_0();
        fsm_02.onCheckOut();
        fsm_02.setElementMap(fyy_03);
        fsm_02.setAngle(14.5f);
        fsm_02.setProximity(0.5f);
        fso2.addBasicElement(fsm_02);
        fsm_02.onAttributesInitialized();
        fsm_02.onChildrenAdded();
        fso2.onChildrenAdded();
        return fso2;
    }
}

