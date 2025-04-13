/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bxB
 */
public class bxb_1
implements ajh_1,
bhx_1,
fwo {
    private static final String a = "furniture";
    private static final String b = "usable";
    private static final String d = "furnitureBackgroundStyle";
    private static final String[] e = new String[]{"furniture"};
    private final bjw_1 f;

    public bxb_1(bjw_1 bjw_12) {
        this.f = bjw_12;
    }

    @Override
    public String[] d() {
        return e;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.f;
        }
        if (string.equals(b)) {
            return this.b();
        }
        if (string.equals(d)) {
            return this.b() != false ? null : bhx_0.c.a();
        }
        return null;
    }

    public Boolean b() {
        apc_2 apc_22 = this.f.a(exz_1.a);
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return Boolean.FALSE;
        }
        if (enp_2.a.h(ens_2.aH).contains(this.f.n())) {
            return Boolean.FALSE;
        }
        return apc_22 == null || apc_22.b(bmr_12, bmr_12.P_(), exk_2.a(this.f), bmr_12.Q_());
    }

    @Override
    public bjw_1 a() {
        return this.f;
    }

    @Override
    public String getFilterableStringValue() {
        return this.f.e();
    }
}

