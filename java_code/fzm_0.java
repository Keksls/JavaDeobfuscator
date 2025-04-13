/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fzM
 */
public class fzm_0 {
    private final String a;
    private final fzn_0 b;
    private final ArrayList<fzp_0> c;

    public fzm_0(String string, fzn_0 fzn_02) {
        this.a = string;
        this.b = fzn_02;
        this.c = new ArrayList();
    }

    public String a() {
        return this.a;
    }

    public fzn_0 b() {
        return this.b;
    }

    public int c() {
        return this.b.a();
    }

    public int d() {
        return this.b.b();
    }

    public boolean e() {
        return this.b.k();
    }

    public void f() {
        this.a(this.b.l(), null);
    }

    public void g() {
        fzs_0.a().a(this);
        fpm_0.b().b(this);
        fpm_0.b().a(this.a, false);
    }

    public void a(int n, String string) {
        this.g();
        for (fzp_0 fzp_02 : this.c) {
            fzp_02.messageBoxClosed(n, string);
        }
    }

    public void a(fzp_0 fzp_02) {
        this.c.add(fzp_02);
    }

    public void b(fzp_0 fzp_02) {
        this.c.remove(fzp_02);
    }
}

