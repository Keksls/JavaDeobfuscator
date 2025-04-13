/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from cxJ
 */
public final class cxj_2 {
    public static final cxj_2 a = new cxj_2();
    private fhe_0 b;
    private fhe_0 c;

    private cxj_2() {
    }

    public void a(fhe_0 fhe_02) {
        this.b = fhe_02;
        this.b.a(cxl_2.a);
        fis_1.a().a("battlegroundView", new bkn_2(this.b));
    }

    public fhe_0 a() {
        return this.b;
    }

    public Optional<fhe_0> b() {
        return Optional.ofNullable(this.b);
    }

    public void b(fhe_0 fhe_02) {
        this.c = fhe_02;
    }

    public Optional<fhe_0> c() {
        return Optional.ofNullable(this.c);
    }

    public void a(bmf_0 bmf_02) {
        fhc_0 fhc_02;
        if (bmf_02 == null) {
            return;
        }
        if (this.c == null) {
            return;
        }
        int n = this.c.f();
        Optional<fhc_0> optional = fhd_0.a.a(n);
        if (optional.isPresent() && (fhc_02 = optional.get()).b() != bmf_02.e()) {
            this.c = null;
        }
    }
}

