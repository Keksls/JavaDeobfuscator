/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from evy
 */
public class evy_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private aoq_1 b;
    private boolean f = false;

    public evy_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        if (arrayList.size() == 2) {
            aot_2 aot_22 = arrayList.remove(0);
            String string = ((apd_2)aot_22).b();
            if (string.equalsIgnoreCase("target")) {
                this.f = true;
            } else if (string.equalsIgnoreCase("caster")) {
                this.f = false;
            }
        }
        this.b = (aoq_1)arrayList.get(0);
    }

    public int b() {
        if (this.b.b() && this.b.a()) {
            return (int)this.b.a(null, null, null, null);
        }
        return -1;
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.b(this.f, object, object2, object4, object3);
        if (eqq_12 == null) {
            return -1;
        }
        if (!(eqq_12 instanceof Su)) {
            return -1;
        }
        Su su = (Su)((Object)eqq_12);
        byte by = (byte)this.b();
        eoz_1 eoz_12 = eoz_1.a(by);
        if (eoz_12 == null) {
            e.warn((Object)("unable to find property " + by));
            return -1;
        }
        return su.a(eoz_12) ? 0 : -1;
    }

    @Override
    public Enum c() {
        return eyO.dp;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.b};
        a.add(aov_1Array);
        aov_1Array = new aov_1[]{aov_1.a, aov_1.b};
        a.add(aov_1Array);
    }
}

