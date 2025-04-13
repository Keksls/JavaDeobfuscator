/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class euK
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private aoq_1 b;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public boolean a() {
        return true;
    }

    public euK(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        if (arrayList.size() == 1) {
            this.b = (aoq_1)arrayList.get(0);
        }
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        int n;
        Object object5;
        if (this.b == null) {
            object5 = erQ.a(object, object2, object4, object3);
            if (object5 == null) {
                throw new aob_1("Impossible de r\u00e9cup\u00e9rer d'utilisateur pour ce crit\u00e8re");
            }
            n = ((epq_2)object5).bO();
        } else {
            n = (int)this.b.a(object, object2, object3, object4);
        }
        object5 = fgT.a.a(n);
        if (object5 == null) {
            throw new aob_1("Impossible de r\u00e9cup\u00e9rer le territoire " + n);
        }
        fgy_0 fgy_02 = ((fgv_0)object5).h();
        if (fgy_02 == null) {
            throw new aob_1("Impossible de r\u00e9cup\u00e9rer le protecteur du territoire " + n);
        }
        return super.e() * (long)fgy_02.F();
    }

    @Override
    public Enum c() {
        return eyO.aT;
    }

    static {
        a.add(new aov_1[]{aov_1.b});
        a.add(aov_1.j);
    }
}

