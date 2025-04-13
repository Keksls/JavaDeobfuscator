/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class exr
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private aoq_1 b;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public boolean b() {
        return true;
    }

    public exr(ArrayList<aot_2> arrayList) {
        this.b = (aoq_1)arrayList.get(0);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        short s2 = (short)this.b.a(object, object2, object3, object4);
        Object object5 = object;
        if (object5 != null) {
            Object object6;
            int n = 0;
            if (object5 instanceof epq_2) {
                object6 = ((epq_2)object5).aa_();
                if (object6 != null) {
                    n = ((fgy_0)object6).F();
                }
            } else if (object5 instanceof fgy_0) {
                n = ((fgy_0)object5).F();
            }
            object6 = eEt.a.a(s2);
            if (object6 == null) {
                return -1;
            }
            if (((eej_0)object6).b().isEmpty()) {
                return -1;
            }
            eEv eEv2 = ((eej_0)object6).h();
            if (eEv2 == null) {
                return -1;
            }
            eEw eEw2 = eEv2.h().get(0);
            return eEw2.c() == n ? 0 : -1;
        }
        throw new aob_1("On essaie de r\u00e9cup\u00e9rer la un r\u00e9sultat de nation dans un ladder sur une cible qui n'est pas un protecteur");
    }

    @Override
    public Enum c() {
        return eyO.ds;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.b};
        a.add(aov_1Array);
    }
}

