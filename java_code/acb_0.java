/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 *  com.jogamp.opengl.GLAutoDrawable
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.RenderTreeStencil;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import java.util.HashSet;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from acb
 */
public abstract class acb_0
extends ahg_0
implements aeh_1,
aei_1,
aej_1 {
    static final Logger n = Logger.getLogger(acb_0.class);
    public static final String a = "contents/gfx";
    public static final String b = "contents/sounds";
    protected String c = "contents/gfx";
    protected String d = "contents/sounds";
    private int I;
    private int J;
    protected final ArrayList<ahk_0> e = new ArrayList();
    private boolean K;
    private final aff_1 L = new aff_1(Integer.MIN_VALUE, Integer.MIN_VALUE, (short)Short.MIN_VALUE);
    private final Matrix44 M = Matrix44.a.a();
    protected aug_2 f;
    protected final acs_0 g;
    protected boolean h;
    private boolean N;
    private boolean O;
    protected final azf_2 i = new azf_2(new float[0]);
    protected boolean j;
    private final Matrix44 P = (Matrix44)Matrix44.a.c();
    private final afj_1 Q = new afj_1();
    private yx_0 R;
    private boolean S;
    final acu k = new acu();
    final acu l = new acu();

    public acb_0() {
        this(null, acs_0.b());
        this.o();
    }

    protected acb_0(aug_2 aug_22, acs_0 acs_02) {
        this.a(acw.a());
        this.a(afz_0.d());
        this.a(aik_0.a());
        this.a(aii_0.a());
        this.a(aix_0.a());
        this.a(zd_0.a());
        this.f = aug_22;
        this.g = acs_02;
    }

    @Override
    protected ahm_0 a() {
        return new acc(this, this);
    }

    public final abY b() {
        return (abY)super.s();
    }

    public void a(boolean bl) {
        this.K = bl;
    }

    public void a(String string) {
        this.c = string;
        aca_0.a().a(string);
    }

    public void b(String string) {
        ags.a().a(string);
        ags.a().c();
    }

    public int c() {
        return this.I;
    }

    public int d() {
        return this.J;
    }

    public void a(ahk_0 ahk_02) {
        this.e.add(ahk_02);
    }

    public void b(ahk_0 ahk_02) {
        this.e.remove(ahk_02);
    }

    @Override
    public void e() {
        this.b(true);
        super.e();
    }

    public void f() {
        HashSet<Entity> hashSet = new HashSet<Entity>();
        this.f.a(hashSet);
        for (Entity entity : hashSet) {
            entity.k_();
        }
    }

    public void g() {
        HashSet<Entity> hashSet = new HashSet<Entity>();
        this.f.a(hashSet);
        for (Entity entity : hashSet) {
            entity.u();
        }
        this.f.a();
        super.e();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(boolean bl) {
        this.M.b();
        this.j(false);
        this.a(azf_2.f);
        this.f.a();
        this.h();
        this.g.d();
        this.a(true);
        this.v.clear();
        this.w.clear();
        this.h = false;
        acu acu2 = this.k;
        synchronized (acu2) {
            this.k.a();
        }
    }

    protected void h() {
        acz.a().b();
        afz_0.d().f();
        aik_0.a().d();
        zd_0.a().c();
        aed.a.c();
        ZI.a.a();
        aui_1.a().f();
    }

    @Override
    public void a(GLAutoDrawable gLAutoDrawable) {
        this.N = true;
        super.a(gLAutoDrawable);
        this.i();
    }

    @Override
    public void a(int n, int n2) {
        if (this.D != (float)n || this.E != (float)n2) {
            super.a(n, n2);
        }
        this.z.b(n, n2);
    }

    public void i() {
        if (this.z != null) {
            this.h = false;
        }
    }

    @Override
    public void j() {
        super.j();
        this.h = false;
    }

    private void t() {
        this.f.a();
        int n = this.y.size();
        for (int k = 0; k < n; ++k) {
            this.f.a((Entity)this.y.get(k), 0);
        }
        if (this.f instanceof RenderTreeStencil) {
            ago.a.a((RenderTreeStencil)this.f);
        }
    }

    @Override
    public void a(int n) {
        if (!this.c(n)) {
            return;
        }
        super.a(n);
        abY abY2 = this.b();
        abY2.a(n);
        acb_0.a(abY2);
        this.e(n);
        this.d(this.K);
        this.b(n);
        this.d(n);
        this.k();
        this.t();
        this.v();
        this.u();
        aui_1.a().a(n);
    }

    private static void a(ahq_0 ahq_02) {
        int n = (int)Math.floor(ahq_02.e_());
        int n2 = (int)Math.floor(ahq_02.f_());
        YX.a(n, n2, 2);
    }

    private void e(int n) {
        int n2 = this.e.size();
        for (int k = 0; k < n2; ++k) {
            ahk_0 ahk_02 = this.e.get(k);
            ahk_02.a(this, n);
        }
    }

    private void u() {
        int n = this.w.size();
        for (int k = 0; k < n; ++k) {
            this.f.a((Entity)this.w.get(k));
        }
        this.v.clear();
        this.w.clear();
    }

    protected final void k() {
        int n;
        this.x.resetQuick();
        int n2 = Math.min(this.v.size(), 32766);
        for (n = 0; n < n2; ++n) {
            Entity entity = (Entity)this.v.get(n);
            if (entity.aw() < 0) continue;
            long l = entity.e;
            ahi_0.a(l);
            this.x.add((l << 15) + (long)n);
        }
        this.x.sort();
        this.y.clear();
        n = this.x.size();
        for (int k = 0; k < n; ++k) {
            int n3 = (int)(this.x.getQuick(k) & 0x7FFFL);
            assert (n3 >= 0);
            Entity entity = (Entity)this.v.get(n3);
            this.a(entity);
        }
    }

    protected void a(Entity entity) {
        this.y.add(entity);
    }

    protected final void b(int n) {
        this.g.a(this, n);
        this.a(this.z.e_(), this.z.f_());
    }

    protected final boolean c(int n) {
        if (!this.J()) {
            this.y.clear();
            return false;
        }
        if (this.z == null) {
            return false;
        }
        if (auy_2.a().b()) {
            return false;
        }
        if (auy_2.a().d()) {
            this.z.a(n);
            this.d(this.K);
            return false;
        }
        return true;
    }

    protected void d(int n) {
        aed.a.a(this, n);
    }

    private void v() {
        aex aex2 = aex.c();
        aex2.a();
        avx_2 avx_22 = auj_1.a.a();
        this.a((aui_2)avx_22);
        aex2.a(this.y);
        aex2.a(avx_22.d(), this.z);
        aex2.a(this);
    }

    protected final void a(GL2 gL2) {
        avx_2 avx_22 = auj_1.a.a();
        avx_22.i.a(0);
        axr_2 axr_22 = axr_2.a();
        axr_22.a(true);
        axr_22.a(1.0f);
        axr_22.a(gL2, axp_2.b, Matrix44.b);
        axr_22.a(gL2, this.D());
        this.a((aui_2)avx_22);
        axr_2.a().e();
        aui_1.a().d();
    }

    private void a(aui_2 aui_22) {
        if (!auy_2.a().b()) {
            ahm_0 ahm_02 = this.z();
            float f2 = ahm_02.g();
            float f3 = -ahm_02.g_() * f2;
            float f4 = -ahm_02.h_() * f2;
            this.M.b();
            if (this.O) {
                this.M.b(-f2, f2, 1.0f);
                this.M.a(-f3, f4, 0.0f);
            } else {
                this.M.b(f2, f2, 1.0f);
                this.M.a(f3, f4, 0.0f);
            }
            this.Q.a(afr_2.f, ahm_02.i_());
            this.P.a(this.Q);
            this.M.c(this.P);
        }
        aui_22.b(this.M);
    }

    protected void a(avx_2 avx_22) {
        this.a((aui_2)avx_22);
    }

    @Override
    public void b(GL2 gL2) {
        if (!this.N) {
            return;
        }
        avx_2 avx_22 = auj_1.a.a();
        this.a(gL2);
        this.a(avx_22);
        this.b(avx_22);
        if (this.q()) {
            acd.a((int)this.z.e_(), (int)this.z.f_());
        }
        if (this.r()) {
            acd.b((int)this.z.e_(), (int)this.z.f_());
        }
    }

    protected void b(avx_2 avx_22) {
        aui_1.a().a(this.f, avx_22);
    }

    private void a(abY abY2) {
        boolean bl = this.b(abY2);
        if (this.S == bl) {
            return;
        }
        this.c(bl);
        this.S = bl;
    }

    protected void c(boolean bl) {
    }

    private boolean b(abY abY2) {
        if (abY2.c()) {
            return this.S;
        }
        int n = abY2.B();
        int n2 = abY2.C();
        int n3 = 0;
        if (this.A() != null) {
            n3 = (int)Math.ceil(this.A().L() + 0.5f);
        }
        if (this.L.b(n, n2, n3) && this.g.j()) {
            return this.S;
        }
        this.L.c(n, n2, (short)n3);
        DisplayedScreenElement displayedScreenElement = abY.a(this.g, n, n2, n3);
        if (displayedScreenElement == null) {
            abY2.e();
            return false;
        }
        int n4 = displayedScreenElement.G();
        int n5 = displayedScreenElement.H();
        int n6 = displayedScreenElement.aq();
        abY2.a(n6, displayedScreenElement.i());
        boolean bl = false;
        if (n6 == 0) {
            bl = false;
        } else {
            if (this.R == null || !this.R.a().b(n4, n5)) {
                this.R = yz_0.a(n4, n5);
            }
            if (this.R == null) {
                acb_0.n.error((Object)("pas de map topologique aux coordonn\u00e9es " + n4 + " " + n5));
                return this.S;
            }
            short s2 = displayedScreenElement.I();
            bl = this.R.b(n4, n5, s2);
        }
        return bl;
    }

    public void d(boolean bl) {
        abY abY2 = this.b();
        if (!this.h) {
            this.h = true;
        }
        this.K = false;
        this.a(abY2);
        this.g.a(abY2.n());
    }

    protected void a(float f2, float f3) {
        int n = this.e.size();
        for (int k = 0; k < n; ++k) {
            this.e.get(k).a(this, f2, f3);
        }
        try {
            this.g.a(this);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public ArrayList<DisplayedScreenElement> a(float f2, float f3, float f4, acj acj2) {
        return this.a(f2, f3, f4, acj2, 0.0f, 0.0f);
    }

    public ArrayList<DisplayedScreenElement> a(float f2, float f3, float f4, acj acj2, float f5, float f6) {
        if (this.z == null) {
            return null;
        }
        int n = (int)(this.a(f2) + (float)this.z.o() - f5);
        int n2 = (int)(this.b(f3) + (float)this.z.p() - f6);
        ArrayList<DisplayedScreenElement> arrayList = new ArrayList<DisplayedScreenElement>();
        this.g.a(n, n2, arrayList);
        if (acj2.a()) {
            int n3 = 0;
            while (n3 < arrayList.size()) {
                float f7;
                DisplayedScreenElement displayedScreenElement = arrayList.get(n3);
                float f8 = f7 = displayedScreenElement.b.i().h() == 0 ? 0.55f : 1.0f;
                if (this.a(n, n2, displayedScreenElement) > f7) {
                    arrayList.remove(n3);
                    continue;
                }
                ++n3;
            }
        }
        acj2.a(arrayList, new acp_0(this, f4, n, n2));
        return arrayList;
    }

    private float a(int n, int n2, DisplayedScreenElement displayedScreenElement) {
        int n3 = displayedScreenElement.G();
        int n4 = displayedScreenElement.H();
        float f2 = this.c(n3, n4);
        float f3 = this.a((float)n3, (float)n4, (float)displayedScreenElement.I());
        float f4 = ((float)n - f2) / this.s;
        float f5 = ((float)n2 - f3) / this.t;
        return Math.abs(f4) + Math.abs(f5);
    }

    protected final float a(float f2) {
        if (this.O) {
            return (-f2 + this.D * 0.5f) / this.z.g();
        }
        return (f2 - this.D * 0.5f) / this.z.g();
    }

    protected final float b(float f2) {
        return (this.E * 0.5f - f2) / this.z.g();
    }

    public ArrayList<afv> b(float f2, float f3) {
        if (this.z == null) {
            return null;
        }
        return afz_0.d().a(this.a(f2), this.b(f3));
    }

    @Override
    public abstract boolean a(MouseEvent var1);

    @Override
    public abstract boolean b(MouseEvent var1);

    @Override
    public abstract boolean c(MouseEvent var1);

    @Override
    public abstract boolean d(MouseEvent var1);

    @Override
    public abstract boolean e(MouseEvent var1);

    @Override
    public boolean f(MouseEvent mouseEvent) {
        this.I = mouseEvent.getX();
        this.J = mouseEvent.getY();
        return false;
    }

    @Override
    public boolean g(MouseEvent mouseEvent) {
        this.I = mouseEvent.getX();
        this.J = mouseEvent.getY();
        return false;
    }

    @Override
    public abstract boolean a(MouseWheelEvent var1);

    @Override
    public abstract boolean a(KeyEvent var1);

    @Override
    public abstract boolean b(KeyEvent var1);

    @Override
    public abstract boolean c(KeyEvent var1);

    public String toString() {
        return "zoom=" + this.z.g() + ", " + super.toString();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a(aiG aiG2, @NotNull Entity entity, int n, int n2, int n3, int n4, boolean bl) {
        acu acu2 = this.k;
        synchronized (acu2) {
            int n5 = this.k.a(this.g, n, n2, n3);
            entity.e = ahi_0.a(n, n2, n5, n4);
            DisplayedScreenElement displayedScreenElement = this.k.b(this.g, n, n2, n3);
            aiI.a(aiG2, displayedScreenElement);
            return displayedScreenElement != null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final int a(int n, int n2, int n3) {
        acu acu2 = this.k;
        synchronized (acu2) {
            DisplayedScreenElement displayedScreenElement = this.k.b(this.g, n, n2, n3);
            return displayedScreenElement == null ? 0 : displayedScreenElement.aq();
        }
    }

    @Override
    public abstract boolean a(FocusEvent var1);

    @Override
    public abstract boolean b(FocusEvent var1);

    public void a(azj_2 azj_22) {
        if (this.i.i() == azj_22.i()) {
            return;
        }
        this.i.a(azj_22.i());
        this.j = true;
    }

    public boolean l() {
        return this.g.h();
    }

    public final void m() {
        abY abY2 = this.b();
        this.S = this.b(abY2);
    }

    public acs_0 n() {
        return this.g;
    }

    public final void o() {
        this.f = (aug_2)RenderTreeStencil.a.c();
    }

    public final acb_0 p() {
        this.a(0);
        acb_0 acb_02 = this.a(this.f);
        acb_02.a(this);
        acb_02.f();
        return acb_02;
    }

    protected abstract acb_0 a(aug_2 var1);

    protected void a(acb_0 acb_02) {
        this.M.a(acb_02.M);
        this.N = acb_02.N;
        this.i.a(acb_02.i.a());
        this.j = acb_02.j;
        this.a((int)acb_02.E(), (int)acb_02.F());
        this.y.addAll(acb_02.y);
        this.x.add(acb_02.x.toArray());
    }

    public final void e(boolean bl) {
        acd.a(bl);
    }

    public final boolean q() {
        return acd.a();
    }

    public final void f(boolean bl) {
        acd.b(bl);
    }

    public final boolean r() {
        return acd.b();
    }

    @Override
    public /* synthetic */ ahq_0 s() {
        return this.b();
    }
}

