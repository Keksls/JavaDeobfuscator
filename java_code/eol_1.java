/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eOL
 */
public class eol_1 {
    protected final acy_2<eoo_1> b = new acy_2();
    private eom_1 a;

    public void a(eom_1 eom_12) {
        this.a = eom_12;
    }

    public void a(eok_1 eok_12) {
        this.a(eok_12, 0, 0);
    }

    public void a(eok_1 eok_12, int n, int n2) {
        eoo_1 eoo_12 = new eoo_1(eok_12);
        this.b.a(eok_12.a(), eoo_12);
        eoo_12.c(n);
        eoo_12.d(n2);
        if (this.a != null) {
            this.a.a(eok_12.a());
        }
    }

    protected eoo_1 a(int n) {
        return this.b.g(n);
    }

    public void a(int n, @NotNull eos_1 eos_12) {
        eoo_1 eoo_12 = this.b.g(n);
        if (eoo_12 != null) {
            eoo_12.a(eos_12);
            if (this.a != null) {
                this.a.a(n, eos_12);
            }
        }
    }

    @Nullable
    public eos_1 b(int n) {
        eoo_1 eoo_12 = this.b.g(n);
        return eoo_12 != null ? eoo_12.j() : null;
    }

    public int c(int n) {
        eoo_1 eoo_12 = this.b.g(n);
        return eoo_12 != null ? eoo_12.k() : 0;
    }

    public int d(int n) {
        eoo_1 eoo_12 = this.b.g(n);
        return eoo_12 != null ? eoo_12.l() : 0;
    }

    public void a() {
        if (this.a != null) {
            this.a.a();
        }
    }

    public void b() {
        if (this.a != null) {
            for (eoo_1 eoo_12 : this.b) {
                this.a.b(eoo_12.a());
            }
        }
        this.b.c();
    }
}

