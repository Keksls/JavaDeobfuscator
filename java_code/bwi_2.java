/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bWI
 */
public class bwi_2
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "amount";
    public static final String d = "amountValue";
    private final fgo_0 e;
    private final fgP<bMn> f;

    public bwi_2(fgo_0 fgo_02, fgP<bMn> fgP2) {
        this.e = fgo_02;
        this.f = fgP2;
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return bae.h().a("protector.wallet.context.name." + this.e.d, new Object[0]);
        }
        if (string.equals(b)) {
            return this.f.b(this.e) + "\u00a7";
        }
        if (string.equals(d)) {
            return this.f.b(this.e);
        }
        return null;
    }

    public fgo_0 a() {
        return this.e;
    }

    public fgP<bMn> b() {
        return this.f;
    }

    void c() {
        fis_1.a().a((ajf_1)this, b, d);
    }
}

