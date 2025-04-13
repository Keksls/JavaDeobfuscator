/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from exJ
 */
public final class exj_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private final long b;
    private boolean f = true;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public exj_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = ((aoq_1)arrayList.get(0)).a(null, null, null, null);
        if (arrayList.size() == 2) {
            String string = ((apd_2)arrayList.get(1)).b();
            if (string.equalsIgnoreCase("caster")) {
                this.f = false;
            }
        } else {
            this.f = true;
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        Su su = erQ.c(object);
        Su su2 = erQ.c(object2);
        if (object == null) {
            return -1;
        }
        Object object5 = this.f ? object2 : object;
        if (object5 instanceof sz_0) {
            sr_0 sr_02 = ((sz_0)object5).am();
            if (sr_02 == null) {
                return -1;
            }
            if (sr_02.A() == this.b && su2 == su) {
                return 0;
            }
            return -1;
        }
        if (object5 == null) {
            for (sr_0 sr_03 : ((elm_0)object4).i().f()) {
                if (sr_03.A() != this.b || erQ.c(sr_03) != su) continue;
                return 0;
            }
            return -1;
        }
        elm_0 elm_02 = erQ.b(object4);
        if (object2 instanceof aff_1 && elm_02 != null) {
            for (sr_0 sr_04 : elm_02.i().f()) {
                aff_1 aff_12 = (aff_1)object2;
                if (sr_04.A() != this.b || !sr_04.c(aff_12.d(), aff_12.e(), aff_12.f()) || erQ.c(sr_04) != su) continue;
                return 0;
            }
            return -1;
        }
        return -2;
    }

    @Override
    public Enum c() {
        return eyO.cV;
    }

    static {
        a.add(new aov_1[]{aov_1.b});
        a.add(new aov_1[]{aov_1.b, aov_1.a});
    }
}

