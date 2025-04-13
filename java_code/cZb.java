/*
 * Decompiled with CFR 0.152.
 */
public class cZb
implements ahr_1 {
    public static final cZb a = new cZb();
    private fbb_2 b = fbb_2.aj;
    private float c;
    private float d;
    private float e;
    private float f;
    private long g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private long p;
    private long q;
    private boolean r;
    private akx_2 s;
    private String t;
    private akr_2[] u;
    private final ans_1 v = new czc_0(this);
    private String w;

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().a(this.v);
            fyb_0 fyb_02 = fpm_0.b().a("focusDialog", cfi_0.a("focusDialog"), 139280L, (short)10000);
            fbd_2 fbd_22 = (fbd_2)fyb_02.getElementMap().a("focus");
            fbd_22.setCenter(this.c, this.d, this.e, this.f);
            fbd_22.setTarget(this.b);
            fbd_22.setColor(this.l, this.m, this.n);
            fbd_22.setAlpha(this.o);
            fbd_22.setFadeInDuration(this.p);
            fbd_22.setFadeOutDuration(this.q);
            fbd_22.setMouseBlocked(this.r);
            fru_0 fru_02 = (fru_0)fyb_02.getElementMap().a("button");
            if (this.w != null) {
                fru_02.setVisible(true);
                fru_02.setText(bae.h().a(this.w, new Object[0]));
            } else {
                fru_02.setVisible(false);
            }
            fpm_0.b().a("wakfu.focus", cgz_0.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.v);
            if (fpm_0.b().q("focusDialog")) {
                fpm_0.b().o("focusDialog");
            }
            fpm_0.b().e("wakfu.focus");
        }
    }

    public void a(float f2, float f3, float f4, float f5) {
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        fyb_0 fyb_02 = fpm_0.b().k("focusDialog");
        if (fyb_02 != null) {
            fbd_2 fbd_22 = (fbd_2)fyb_02.getElementMap().a("focus");
            fbd_22.setCenter(this.c, this.d, this.e, this.f);
        }
    }

    public void a(long l, float f2, float f3, float f4, float f5) {
        this.g = l;
        this.h = f2;
        this.i = f3;
        this.j = f4;
        this.k = f5;
        fyb_0 fyb_02 = fpm_0.b().k("focusDialog");
        if (fyb_02 != null) {
            fbd_2 fbd_22 = (fbd_2)fyb_02.getElementMap().a("focus");
            fbd_22.setMovePosition(this.g, this.h, this.i, this.j, this.k);
        }
    }

    public void a(float f2, float f3, float f4) {
        this.l = f2;
        this.m = f3;
        this.n = f4;
    }

    public void a(float f2) {
        this.o = f2;
    }

    public void b(long l) {
        this.p = l;
    }

    public void c(long l) {
        this.q = l;
    }

    public void a(boolean bl) {
        this.r = bl;
    }

    public void a(fbb_2 fbb_22) {
        this.b = fbb_22;
    }

    public void a(String string) {
        this.w = string;
        fyb_0 fyb_02 = fpm_0.b().k("focusDialog");
        if (fyb_02 != null) {
            fru_0 fru_02 = (fru_0)fyb_02.getElementMap().a("button");
            if (this.w.trim().isEmpty()) {
                fru_02.setVisible(false);
            } else {
                fru_02.setVisible(true);
                fru_02.setText(bae.h().a(this.w, new Object[0]));
            }
        }
    }

    public void a(akx_2 akx_22) {
        this.s = akx_22;
    }

    public void b(String string) {
        this.t = string;
    }

    public void a(akr_2 ... akr_2Array) {
        this.u = akr_2Array;
    }

    public void a() {
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0L;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 0.0f;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0.75f;
        this.p = 0L;
        this.q = 0L;
        this.r = false;
        this.b = fbb_2.aj;
        this.w = null;
        this.t = null;
        this.u = null;
        this.s = null;
    }

    public void c() {
        azu_0.j().b(this);
        if (this.t != null) {
            this.s.a(this.t, this.u, new akq_1[0]);
        }
    }

    @Override
    public boolean a(adt_1 adt_12) {
        return true;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

