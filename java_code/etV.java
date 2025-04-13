/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class etV
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private aoq_1 b;
    private aoq_1 c;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public etV(ArrayList<aot_2> arrayList) {
        short s2 = this.a(arrayList);
        if (s2 == 0) {
            this.c = (aoq_1)arrayList.get(0);
            this.b = null;
        }
        if (s2 == 1) {
            this.b = null;
            this.c = null;
        }
        if (s2 == 2) {
            this.b = (aoq_1)arrayList.get(1);
            this.c = (aoq_1)arrayList.get(0);
        }
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        elm_0 elm_02 = erQ.b(object4);
        if (elm_02 == null) {
            throw new aob_1("On compte les monstres hors combat");
        }
        short s2 = (short)(this.b == null ? -1L : this.b.a(object, object2, object3, object4));
        byte by = (byte)(this.c == null ? -1L : this.c.a(object, object2, object3, object4));
        long l = elm_02.a(s2, by);
        return this.e() * l;
    }

    @Override
    public Enum c() {
        return eyO.g;
    }

    static {
        a.add(esa_0.l);
        a.add(esa_0.i);
        a.add(new aov_1[]{aov_1.b, aov_1.b});
    }
}

