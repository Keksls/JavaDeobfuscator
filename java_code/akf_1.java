/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aKF
 */
public class akf_1
implements ht_1,
hu_1 {
    private final String b;
    private final String c;
    private final akg_2 d;
    private final boolean e;

    public akf_1(String string, String string2, akg_2 akg_22, boolean bl) {
        assert (akg_22 != null);
        this.b = string;
        this.c = string2;
        this.d = akg_22;
        this.e = bl;
    }

    public akf_1(String string, akg_2 akg_22, boolean bl) {
        assert (akg_22 != null);
        this.b = string;
        this.c = "";
        this.d = akg_22;
        this.e = bl;
    }

    @Override
    public final String b() {
        return this.b;
    }

    @Override
    public String c() {
        return this.c;
    }

    @Override
    public final boolean d() {
        return this.e;
    }

    public final akg_2 e() {
        return this.d;
    }

    @Override
    public /* synthetic */ hv_1 a() {
        return this.e();
    }
}

