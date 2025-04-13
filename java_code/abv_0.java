/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from abV
 */
public class abv_0 {
    final String a;

    public abv_0(String string, azj_2 azj_22, ays_2 ays_22, aim aim2) {
        this.a = string;
        aif_0 aif_02 = ays_22 == null ? aii_0.a().a(string, aim2) : aii_0.a().a(string, ays_22, aim2);
        aif_02.a(azj_22);
    }

    public abv_0(String string, float[] fArray, ays_2 ays_22, aim aim2) {
        this(string, new azf_2(fArray), ays_22, aim2);
    }

    public abv_0(String string, azj_2 azj_22) {
        this(string, azj_22, null, aim.b);
    }

    public abv_0(String string, float[] fArray) {
        this(string, fArray, null, aim.b);
    }

    public final void a(int n, int n2, short s2) {
        this.b().b(n, n2, s2);
    }

    private aif_0 b() {
        return aii_0.a().d(this.a);
    }

    public final void a() {
        this.b().f();
    }

    public final boolean a(aff_1 aff_12) {
        return this.b(aff_12.d(), aff_12.e(), aff_12.f());
    }

    public final boolean b(int n, int n2, short s2) {
        return this.b().a(n, n2, s2);
    }

    public final void a(String string, aim aim2) {
        ays_2 ays_22 = abv_0.a(string);
        this.b().a(ays_22, aim2);
    }

    public final void a(azj_2 azj_22) {
        this.b().a(azj_22);
    }

    public final void a(float[] fArray) {
        this.b().a(fArray);
    }

    public final void c(int n, int n2, short s2) {
        this.b().c(n, n2, s2);
    }

    public static ays_2 a(String string) {
        String string2 = gi_0.k(string);
        return ayu_2.a().b((aui_2)auj_1.a.a(), (long)auc_1.d(string2), string, false);
    }

    public final void a(int n) {
        this.b().b = n;
    }
}

