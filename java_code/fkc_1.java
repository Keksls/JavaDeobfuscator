/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fKc
 */
public class fkc_1
extends fkb_1<fvE> {
    private boolean b = false;
    private boolean c = false;
    private boolean d = false;
    private boolean e = false;

    public fkc_1(fvE fvE2) {
        super(fvE2);
    }

    @Override
    protected void a(String string, String string2) {
        int n;
        int n2;
        String string3;
        String string4;
        anq_1 anq_12 = fpm_0.b().k();
        if (anq_12 == null) {
            return;
        }
        ajb_1 ajb_12 = anq_12.a(string);
        if (ajb_12 == null) {
            return;
        }
        if (this.b) {
            string4 = fkm_1.a(string, string2, "x");
            string3 = fkm_1.a(string, string2, "y");
            n2 = ((fvE)this.a).getX();
            n = ((fvE)this.a).getY();
            if (ajb_12.l(string4)) {
                n2 = ajb_12.q(string4);
            }
            if (ajb_12.l(string3)) {
                n = ajb_12.q(string3);
            }
            ((fvE)this.a).setPosition(n2, n);
        }
        if (this.c) {
            string4 = fkm_1.a(string, string2, "width");
            string3 = fkm_1.a(string, string2, "height");
            n2 = ((fvE)this.a).getWidth();
            n = ((fvE)this.a).getHeight();
            if (ajb_12.l(string4)) {
                n2 = ajb_12.q(string4);
            }
            if (ajb_12.l(string3)) {
                n = ajb_12.q(string3);
            }
            ((fvE)this.a).setSize(n2, n);
        }
    }

    @Override
    protected void b(String string, String string2) {
        String string3;
        String string4;
        ajb_1 ajb_12 = fpm_0.b().k().a(string);
        if (ajb_12 == null) {
            return;
        }
        if (((fvE)this.a).getWidth() == 0 && ((fvE)this.a).getHeight() == 0) {
            return;
        }
        if (this.b && this.d) {
            string4 = fkm_1.a(string, string2, "x");
            string3 = fkm_1.a(string, string2, "y");
            ajb_12.a(string4, ((fvE)this.a).getX());
            ajb_12.a(string3, ((fvE)this.a).getY());
        }
        if (this.c && this.e) {
            string4 = fkm_1.a(string, string2, "width");
            string3 = fkm_1.a(string, string2, "height");
            ajb_12.a(string4, ((fvE)this.a).getWidth());
            ajb_12.a(string3, ((fvE)this.a).getHeight());
        }
    }

    public void c(String string, String string2) {
        ajb_1 ajb_12 = fpm_0.b().k().a(string);
        if (ajb_12 == null) {
            return;
        }
        String string3 = fkm_1.a(string, string2, "x");
        String string4 = fkm_1.a(string, string2, "y");
        String string5 = fkm_1.a(string, string2, "width");
        String string6 = fkm_1.a(string, string2, "height");
        ajb_12.d(string3);
        ajb_12.d(string4);
        ajb_12.d(string5);
        ajb_12.d(string6);
    }

    @Override
    public void c() {
        fjm_1.a().b(this);
    }

    @Override
    public void d() {
        fjm_1.a().a(this);
    }

    @Override
    public boolean e() {
        fyy_0 fyy_02 = ((fvE)this.a).getElementMap();
        if (fyy_02 == null) {
            return false;
        }
        String string = fyy_02.c();
        String string2 = ((fvE)this.a).getId();
        if (string == null) {
            return false;
        }
        ajb_1 ajb_12 = fpm_0.b().k().a(string);
        if (ajb_12 == null) {
            return false;
        }
        String string3 = fkm_1.a(string, string2, "x");
        String string4 = fkm_1.a(string, string2, "y");
        String string5 = fkm_1.a(string, string2, "width");
        String string6 = fkm_1.a(string, string2, "height");
        return ajb_12.l(string3) || ajb_12.l(string4) || ajb_12.l(string5) || ajb_12.l(string6);
    }

    public boolean f() {
        return this.b;
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    public boolean g() {
        return this.c;
    }

    public void b(boolean bl) {
        this.c = bl;
    }

    public void h() {
        this.d = true;
    }

    public void i() {
        this.e = true;
    }
}

