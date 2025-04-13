/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bLn
 */
public class bln_0
implements ajh_1 {
    public static final String a = "mimiSymbicItem";
    public static final String b = "statItem";
    public static final String d = "skinItem";
    public static final String e = "resultItem";
    private final exk_2 f;
    private exk_2 g;
    private exk_2 h;
    private exk_2 i;

    public bln_0(exk_2 exk_22) {
        this.f = exk_22;
    }

    private void e() {
        if (this.h == null || this.g == null) {
            this.c(null);
            fis_1.a().a("itemDetail", (Object)this.g, "mimiSymbicDialog");
            return;
        }
        this.i = this.g.v();
        int n = bol_1.b(this.h);
        this.i.a(n);
        this.c(this.i);
    }

    public void a(exk_2 exk_22) {
        this.g = exk_22;
        if (this.g == null) {
            this.f();
        }
        fis_1.a().a((ajf_1)this, b);
        fis_1.a().a("itemDetail", (Object)this.g, "mimiSymbicDialog");
        this.e();
    }

    private void f() {
        this.c(null);
        this.b((exk_2)null);
    }

    public void b(exk_2 exk_22) {
        this.h = exk_22;
        fis_1.a().a((ajf_1)this, d);
        this.e();
    }

    private void c(exk_2 exk_22) {
        this.i = exk_22;
        fis_1.a().a((ajf_1)this, e);
        fis_1.a().a("itemDetail", (Object)this.i, "mimiSymbicDialog");
        fis_1.a().a("pet", (Object)null, "mimiSymbicDialog");
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (a.equals(string)) {
            return this.f;
        }
        if (b.equals(string)) {
            return this.g;
        }
        if (d.equals(string)) {
            return this.h;
        }
        if (e.equals(string)) {
            return this.i;
        }
        return null;
    }

    @Override
    public String[] d() {
        return new String[0];
    }

    public exk_2 a() {
        return this.f;
    }

    public exk_2 b() {
        return this.g;
    }

    public exk_2 c() {
        return this.h;
    }
}

