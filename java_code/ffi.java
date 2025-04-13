/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Optional;

public class ffi
extends feY {
    static final int i = 28;
    private boolean j = false;
    private exk_2 k;
    private exk_2 l;

    public void h() {
        if (this.k != null) {
            this.j = true;
        }
    }

    public boolean i() {
        return this.j;
    }

    public exk_2 a(boolean bl) {
        if (bl) {
            return this.k;
        }
        return this.l;
    }

    public Optional<ffk> j() {
        if (this.k == null) {
            return Optional.empty();
        }
        return Optional.ofNullable(ffk.a(this.k.aT_()));
    }

    public static boolean a(exk_2 exk_22) {
        if (exk_22 == null) {
            return false;
        }
        if (exk_22.T() == null) {
            return false;
        }
        return ffk.a(exk_22.aT_()) != null;
    }

    public ffj a(exk_2 exk_22, boolean bl) {
        if (exk_22 == null) {
            return ffj.j;
        }
        if (this.k != null) {
            return ffj.b;
        }
        if (!ffi.a(exk_22)) {
            return ffj.c;
        }
        if (bl) {
            this.k = exk_22;
        }
        return ffj.a;
    }

    public ffj a(boolean bl, boolean bl2) {
        if (bl) {
            if (this.j) {
                return ffj.h;
            }
            if (this.l != null) {
                return ffj.e;
            }
            if (this.k == null) {
                return ffj.d;
            }
            if (!this.f()) {
                return ffj.g;
            }
            if (bl2) {
                this.k = null;
            }
            return ffj.a;
        }
        if (this.l == null) {
            return ffj.d;
        }
        if (bl2) {
            this.l = null;
        }
        return ffj.a;
    }

    public ffj a(boolean bl, exk_2 exk_22, boolean bl2) {
        if (bl) {
            if (this.l != null) {
                return ffj.e;
            }
            if (bl2) {
                this.k = exk_22;
            }
        } else {
            if (ffk.a(this.k.aT_()) != ffk.a(exk_22.aT_())) {
                return ffj.k;
            }
            if (this.l != null) {
                return ffj.e;
            }
            if (bl2) {
                this.l = exk_22;
            }
        }
        return ffj.a;
    }

    @Override
    public boolean a(ffq ffq2, int n, int n2) {
        if (this.k == null) {
            return false;
        }
        if (!this.e().contains(ffq2) && this.d(ffq2)) {
            return false;
        }
        return super.a(ffq2, n, n2);
    }

    public boolean d(ffq ffq2) {
        ffs ffs2 = ffq2.at_();
        ArrayList<ffq> arrayList = this.a(ffs2);
        int n = ffs2.f * this.l();
        return arrayList.size() >= n;
    }

    private int l() {
        int n = 0;
        if (this.k != null) {
            ++n;
        }
        if (this.l != null) {
            ++n;
        }
        return n;
    }

    @Override
    protected ys_1 g() {
        ux_1 ux_12 = new ux_1();
        ux_12.a = this.j;
        ux_12.b = this.k != null ? this.k.aT_() : -1;
        ux_12.c = this.k != null ? this.k.a() : -1L;
        ux_12.d = this.l != null ? this.l.aT_() : -1;
        ux_12.e = this.l != null ? this.l.a() : -1L;
        return ux_12;
    }

    private exk_2 a(int n) {
        Object r2 = eyo_1.g().d(n);
        if (r2 != null) {
            exk_2 exk_22 = exk_2.a(r2);
            exk_22.a((short)1);
            return exk_22;
        }
        return null;
    }

    @Override
    protected void a(ys_1 ys_12) {
        exk_2 exk_22;
        Object r2;
        ux_1 ux_12 = (ux_1)ys_12;
        this.j = ux_12.a;
        this.k();
        if (ux_12.b != -1) {
            r2 = eyo_1.g().d(ux_12.b);
            exk_22 = exk_2.a(ux_12.c, r2);
            if (!ffi.a(exk_22)) {
                a.error((Object)("La gemme primaire n'est pas un item de la bonne cat\u00e9gorie (refItemId=" + ux_12.b + "), on la remplace par la gemme par d\u00e9faut"));
                exk_22.release();
                this.k = this.a(ffk.c().a());
            } else {
                this.k = exk_22;
                this.k.a((short)1);
            }
        } else {
            this.k = null;
        }
        if (ux_12.d != -1) {
            if (ux_12.d != ux_12.b) {
                a.error((Object)"Le type de gemme secondaire n'est pas le meme que le type primaire, on r\u00e9initialise cette gemme");
                ux_12.d = ux_12.b;
            }
            if (!ffi.a(exk_22 = exk_2.a(ux_12.e, r2 = eyo_1.g().d(ux_12.d)))) {
                a.error((Object)("La gemme secondaire n'est pas un item de la bonne cat\u00e9gorie (refItemId=" + ux_12.d + "), on la remplace par la gemme par d\u00e9faut"));
                exk_22.release();
                this.l = this.a(this.k.aT_());
            } else {
                this.l = exk_22;
                this.l.a((short)1);
            }
        } else {
            this.l = null;
        }
    }

    @Override
    public boolean a(int n, int n2) {
        if (n >= this.e && n < this.e + 6) {
            return n2 >= this.f && n2 < this.f + 6;
        }
        return false;
    }

    public void k() {
        if (this.k != null) {
            this.k.release();
            this.k = null;
        }
        if (this.l != null) {
            this.l.release();
            this.l = null;
        }
    }
}

