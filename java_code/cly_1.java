/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from cLy
 */
public class cly_1
implements fyq {
    private Stack<fyy_0> a = new Stack();
    private fya_0 b;

    @Override
    public fyo a(fya_0 fya_02, fyy_0 fyy_02) {
        this.b = fya_02;
        this.a.push(fyy_02);
        fyy_0 fyy_03 = this.a.peek();
        fuq_0 fuq_02 = new fuq_0();
        fuq_02.onCheckOut();
        fuq_02.setElementMap(fyy_03);
        fuq_02.setNonBlocking(true);
        fuq_02.onAttributesInitialized();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_03);
        fid_12.setAlign(frk_0.i);
        fid_12.setSize(new fjf_2(32, 32));
        fuq_02.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        String string = "animatedElementViewer";
        frO frO2 = new frO();
        frO2.onCheckOut();
        frO2.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, frO2);
        }
        frO2.setDirection(2);
        frO2.setNonBlocking(true);
        frO2.setPrefSize(new fjf_2(32, 32));
        frO2.setScale(1.5f);
        fuq_02.addBasicElement(frO2);
        frO2.onAttributesInitialized();
        frO2.onChildrenAdded();
        fuq_02.onChildrenAdded();
        return fuq_02;
    }
}

