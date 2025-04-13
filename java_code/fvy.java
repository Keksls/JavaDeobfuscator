/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class fvy
extends fvc_0
implements YT,
afk_0<afe_0> {
    private static final Logger g = Logger.getLogger(fvy.class);
    public static final String TAG = "wakfuBubble";
    private static final int h = 5;
    private static final int i = 60;
    public static final String a = "text";
    public static final String b = "container";
    public static final String c = "coloredContainer";
    public static final String d = "image";
    public static int e = Integer.MIN_VALUE;
    private ful_0 r;
    private boolean s;
    private boolean t = true;
    private boolean u = false;
    private boolean v = true;
    private boolean w = false;
    private boolean x = false;
    private fvu_0 y;
    private afe_0 z;
    private fvB A;
    private float B = 1.0f;
    private boolean C;
    private azj_2 D;

    public void c() {
        this.a(true, true);
    }

    public void a(boolean bl, boolean bl2) {
        this.a(true, bl, bl2, false);
    }

    public void a(boolean bl, boolean bl2, boolean bl3) {
        this.a(true, bl, bl2, bl3);
    }

    public void a(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.r = (ful_0)this.getElementMap().a(a);
        if (!this.u || this.v != bl) {
            this.v = bl;
            this.a();
        }
        this.s = bl2;
        this.C = bl3;
        this.x = bl4;
    }

    protected void a() {
        if (this.y != null && this.y.a() != null) {
            this.y.a().b(this);
        }
        this.setAlign(this.v ? frs_0.a : frs_0.c);
        if (this.j != null) {
            this.a(this.j, this.j.i(), this.j.j(), 0);
        }
        this.invalidate();
        this.u = true;
    }

    protected void b() {
        this.y.a().a(this);
    }

    public String setText(String string) {
        return this.setText(string, 1.0f);
    }

    public String setText(String string, float f2) {
        assert (this.r != null);
        abo_2<fvu_0, String> abo_22 = fvu_0.a(string);
        if (!abo_22.a().equals((Object)this.y)) {
            this.y = abo_22.a();
            this.b();
            this.a();
        }
        string = abo_22.b().trim();
        this.r.c(string);
        this.setDuration((int)((float)zh_0.a(string) * f2));
        if (this.x) {
            this.a(true);
        }
        this.bi_();
        this.j();
        return string;
    }

    public void setTarget(aby_0 aby_02) {
        this.setTarget((abu)aby_02);
        if (aby_02 != null) {
            this.a(aby_02.aC());
        }
    }

    public void setTarget(abu abu2) {
        if (abu2 == this.j) {
            return;
        }
        if (this.j != null && this.j instanceof abu) {
            ((abu)this.j).b(this);
        }
        super.setTarget(abu2);
        if (abu2 != null) {
            abu2.a(this);
            this.setTargetIsVisible(abu2.at());
        }
    }

    public void setBubbleObserver(afe_0 afe_02) {
        this.z = afe_02;
        ((afv)this.z).a(this);
    }

    private void a(aej_2 aej_22) {
        boolean bl = fvy.isRightDirection(aej_22);
        if (bl != this.v) {
            this.v = bl;
            this.a();
        }
    }

    @Override
    public void f() {
        if (this.x) {
            this.a(false);
        } else {
            this.d();
        }
    }

    public void d() {
        this.w = false;
        this.A = null;
        if (this.s) {
            this.i();
        } else {
            this.setBubbleIsVisible(false);
        }
        if (this.z != null) {
            this.z.c(this);
        }
    }

    public void setBubbleIsVisible(boolean bl) {
        if (this.t == bl) {
            return;
        }
        this.t = bl;
        this.bi_();
    }

    @Override
    protected void bi_() {
        boolean bl;
        boolean bl2 = bl = this.k && this.t;
        if (this.m_visible == bl) {
            return;
        }
        this.setVisible(bl);
        if (bl) {
            this.j();
        }
    }

    private void j() {
        fsn_0 fsn_02 = this.getParentOfType(fsn_0.class);
        if (fsn_02 == null) {
            return;
        }
        fsn_02.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
    }

    @Override
    public afe_1 getComputedPosition(int n, int n2, int n3) {
        afe_1 afe_12 = super.getPositionWithOutOfScreen(n, n2, n3);
        int n4 = afe_12.a();
        int n5 = afe_12.b();
        int n6 = this.l.g();
        if (this.w && (n6 == -1 || this.l.n() < n6 / 2) || this.y == fvu_0.c && this.l.n() < 500) {
            n4 += Hw.b(-3, 3);
            n5 += Hw.b(-3, 3);
        }
        afe_12.b(n4, n5);
        return afe_12;
    }

    @Override
    public void a(YQ yQ, int n, int n2, int n3) {
        this.bi_();
        this.a(this.z);
        super.a(yQ, n, n2, 0);
    }

    public void setShakingBubble(boolean bl) {
        this.w = bl;
    }

    public void setDuration(int n) {
        this.l.g(n);
    }

    public void g() {
        this.l.f(0);
        this.bi_();
    }

    public int getAdviserId() {
        return this.l.i();
    }

    public boolean isToRight() {
        return this.v;
    }

    public azj_2 getColor() {
        return this.D;
    }

    public void setColor(azj_2 azj_22) {
        this.D = azj_22;
        this.h();
    }

    public void h() {
        fso fso2 = (fso)this.getElementMap().a(c);
        fso2.setVisible(this.D != null);
        fso2.getAppearance().setModulationColor(this.D);
    }

    public void i() {
        if (this.getElementMap() != null) {
            fpm_0.b().o(this.getElementMap().c());
        }
    }

    @Override
    public void a(boolean bl, YU yU) {
        this.setTargetIsVisible(bl);
    }

    public static boolean isRightDirection(aej_2 aej_22) {
        switch (aej_22) {
            case g: 
            case h: 
            case a: 
            case b: 
            case c: {
                return false;
            }
            case e: 
            case f: 
            case d: {
                return true;
            }
        }
        return false;
    }

    @Override
    public float getWorldX() {
        if (this.j != null) {
            return this.j.J();
        }
        return 0.0f;
    }

    @Override
    public float getWorldY() {
        if (this.j != null) {
            return this.j.K();
        }
        return 0.0f;
    }

    @Override
    public float getAltitude() {
        if (this.j != null) {
            return this.j.L();
        }
        return 0.0f;
    }

    public int getDuration() {
        return this.l.g();
    }

    @Override
    public void removedFromWidgetTree() {
        super.removedFromWidgetTree();
        if (this.j != null && this.j instanceof abu) {
            ((abu)this.j).b(this);
        }
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.u = false;
    }

    private void a(boolean bl) {
        fyy_0 fyy_02 = this.getElementMap();
        ArrayList<fqt> arrayList = new ArrayList<fqt>();
        if (fyy_02 == null) {
            return;
        }
        fvE fvE2 = (fvE)fyy_02.a(d);
        if (fvE2 != null) {
            arrayList.add(fvE2.getAppearance());
        }
        if ((fvE2 = (fvE)fyy_02.a(b)) != null) {
            arrayList.add(fvE2.getAppearance());
        }
        if ((fvE2 = (fvE)fyy_02.a(a)) != null) {
            arrayList.add(fvE2.getAppearance());
        }
        if (fvE2 != null) {
            azf_2 azf_22 = new azf_2(bl ? azf_2.b.i() : azf_2.e.i());
            azf_2 azf_23 = new azf_2(bl ? azf_2.e.i() : azf_2.b.i());
            fjo_2 fjo_22 = new fjo_2(azf_22, azf_23, arrayList, 0, 500, 1, fjw_2.b);
            if (!bl) {
                fjo_22.a(new fvz_0(this, fjo_22));
            }
            fvE2.addTween(fjo_22);
        }
    }

    public void a(afe_0 afe_02, int n, int n2, short s2) {
        this.a(afe_02);
    }

    private void a(afe_0 afe_02) {
        if (afe_02 == null || this.y == null || this.j == null) {
            return;
        }
        int n = afe_02.ap().b(this.j.G(), this.j.H(), this.j.I());
        fvB fvB2 = n > this.y.b() ? fvB.a : fvB.b;
        if (fvB2 != this.A) {
            if (this.C || this.y == fvu_0.d) {
                this.a(fvB2);
            }
            this.A = fvB2;
        }
    }

    private void a(fvB fvB2) {
        ful_0 ful_02 = (ful_0)this.getElementMap().a(a);
        if (this.A != null) {
            ful_02.setZoomTween(fvB2.a(), 500);
        } else {
            ful_02.setZoom(fvB2.a());
        }
    }

    @Override
    public /* synthetic */ void cellPositionChanged(ahh_0 ahh_02, int n, int n2, short s2) {
        this.a((afe_0)ahh_02, n, n2, s2);
    }
}

