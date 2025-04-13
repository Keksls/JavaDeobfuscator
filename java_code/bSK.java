/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public class bSK
implements ajh_1 {
    public static final String a = "currency";
    public static final String b = "currencyId";
    public static final String d = "value";
    public static final String e = "description";
    private final bSO f;
    private final bsz_1 g;

    public bSK(bsz_1 bsz_12, bSO bSO2) {
        this.g = bsz_12;
        this.f = bSO2;
    }

    @Override
    public String[] d() {
        return b_;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.g.c();
        }
        if (string.equals(b)) {
            return this.g.a();
        }
        if (string.equals(d)) {
            return this.f.a(this.g);
        }
        if (string.equals(e)) {
            return this.g.f();
        }
        return null;
    }

    void a() {
        fis_1.a().a((ajf_1)this, d);
    }

    public bsz_1 b() {
        return this.g;
    }

    public String toString() {
        return "WalletEntry{m_currency=" + this.g + "}";
    }
}

