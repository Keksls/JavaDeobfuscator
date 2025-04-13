/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eyr
 */
public final class eyr_0
extends esi_0 {
    private static final ArrayList<aov_1[]> c = new ArrayList();
    public static final String a = "forTeam";
    public static final String b = "forOwner";
    private final String e;
    private final String f;

    @Override
    protected List<aov_1[]> i() {
        return c;
    }

    public eyr_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.e = ((apd_2)arrayList.get(0)).b();
        this.f = ((apd_2)arrayList.get(1)).b();
    }

    @Override
    public long a(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        elm_0<?> elm_02 = erQ.a(object, object4);
        if (elm_02 == null) {
            return 0L;
        }
        long l = 0L;
        for (sr_0 sr_02 : elm_02.i().f()) {
            if (!this.a(sr_02, object, object2, object3, object4)) continue;
            ++l;
        }
        return this.e() * l;
    }

    private boolean a(sr_0 sr_02, Object object, Object object2, Object object3, Object object4) {
        if (sr_02.w() != ele_0.q.a()) {
            return false;
        }
        eqq_1 eqq_12 = erQ.a(this.e, object, object2, object4, object3);
        if (this.f.equalsIgnoreCase(a) && eqq_12 != null) {
            return sr_02.Y() == eqq_12.Y();
        }
        if (this.f.equalsIgnoreCase(b) && eqq_12 != null) {
            return sr_02.v() != null && sr_02.v().a_() == eqq_12.a_();
        }
        return false;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public Enum c() {
        return eyO.fV;
    }

    static {
        c.add(new aov_1[]{aov_1.a, aov_1.a});
    }
}

