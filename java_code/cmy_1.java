/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from cMY
 */
public class cmy_1
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
        fso2.setPrefSize(new fjf_2(200, 200));
        fso2.onAttributesInitialized();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_03);
        fid_12.setSize(new fjf_2(200, 200));
        fso2.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fic_1 fic_12 = new fic_1();
        fic_12.onCheckOut();
        fso2.addBasicElement(fic_12);
        fic_12.onAttributesInitialized();
        frO frO2 = new frO();
        frO2.onCheckOut();
        frO2.setElementMap(fyy_03);
        frO2.setNonBlocking(true);
        frO2.setOffsetY(-80.0f);
        frO2.setPrefSize(new fjf_2(200, 200));
        frO2.setScale(2.5f);
        fic_12.addBasicElement(frO2);
        frO2.onAttributesInitialized();
        fid_1 fid_13 = new fid_1();
        fid_13.onCheckOut();
        fid_13.setElementMap(fyy_03);
        fid_13.setSize(new fjf_2(200, 200));
        frO2.addBasicElement(fid_13);
        fid_13.onAttributesInitialized();
        fid_13.onChildrenAdded();
        fiy_1 fiy_12 = fiy_1.checkOut();
        fiy_12.setElementMap(fyy_03);
        fiy_12.setAttribute("filePath");
        fiy_12.setLocal(true);
        fiy_12.setName("filePath");
        frO2.addBasicElement(fiy_12);
        fiy_12.onAttributesInitialized();
        fiy_12.onChildrenAdded();
        fiy_1 fiy_13 = fiy_1.checkOut();
        fiy_13.setElementMap(fyy_03);
        fiy_13.setAttribute("animName");
        fiy_13.setLocal(true);
        fiy_13.setName("animName");
        frO2.addBasicElement(fiy_13);
        fiy_13.onAttributesInitialized();
        fiy_13.onChildrenAdded();
        fiy_1 fiy_14 = fiy_1.checkOut();
        fiy_14.setElementMap(fyy_03);
        fiy_14.setAttribute("direction");
        fiy_14.setLocal(true);
        fiy_14.setName("direction");
        frO2.addBasicElement(fiy_14);
        fiy_14.onAttributesInitialized();
        fiy_14.onChildrenAdded();
        frO2.onChildrenAdded();
        fic_12.onChildrenAdded();
        fso2.onChildrenAdded();
        return fso2;
    }
}

