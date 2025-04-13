/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from ayp
 */
public class ayp_1 {
    private final String a;
    private final ArrayList<ayb_1> b = new ArrayList();

    public ayp_1(String string) {
        this.a = string;
    }

    public void a(String string, String string2, int n, int n2, int n3) {
        ayb_1 ayb_12 = new ayb_1();
        ayb_12.a((CharSequence)string);
        ayb_12.a(string2);
        ayb_12.a(n);
        ayb_12.b(n2);
        ayb_12.c(n3);
        this.b.add(ayb_12);
    }

    public String a() {
        ayb_1 ayb_12 = this.g();
        return ayb_12 == null ? null : ayb_12.a();
    }

    private ayb_1 g() {
        Ow ow = Oy.d() != null ? Oy.d().f() : Ow.b;
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            ayb_1 ayb_12 = this.b.get(k);
            if (!ayb_12.a(ow)) continue;
            return ayb_12;
        }
        return null;
    }

    public int b() {
        ayb_1 ayb_12 = this.g();
        return ayb_12 == null ? 0 : ayb_12.b();
    }

    public int c() {
        ayb_1 ayb_12 = this.g();
        return ayb_12 == null ? 0 : ayb_12.c();
    }

    public int d() {
        ayb_1 ayb_12 = this.g();
        return ayb_12 == null ? 0 : ayb_12.d();
    }

    public String e() {
        return this.a;
    }

    public boolean f() {
        return this.b.isEmpty();
    }
}

