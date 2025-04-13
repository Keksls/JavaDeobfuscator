/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from cRc
 */
public class crc_1
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
        fid_12.setSize(new fjf_2(90.0f, 90.0f));
        fso2.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        String string = "text";
        fuk_0 fuk_02 = new fuk_0();
        fuk_02.onCheckOut();
        fuk_02.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fuk_02);
        }
        fuk_02.setMultiline(true);
        fuk_02.setNonBlocking(true);
        fuk_02.setStyle("systemMessage");
        fso2.addBasicElement(fuk_02);
        fuk_02.onAttributesInitialized();
        fuk_02.onChildrenAdded();
        fso2.onChildrenAdded();
        return fso2;
    }
}

