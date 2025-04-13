/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public abstract class YK<GP extends agk_0<?, ?>>
implements ajp_0 {
    private static final Logger i = Logger.getLogger(YK.class);
    protected static final String a = "userPreferences.properties";
    public static final String b = "gamePreferences";
    public static final String c = "hardwareManager";
    private static final String j = "Initialization-Tasks-%d";
    protected ano_1 d;
    protected ann_1 e;
    private static final byte k = 3;
    protected final acG[] f = new acG[3];
    protected ace_0 g;
    private final List<agw_0> l = new ArrayList<agw_0>();
    private int m;
    protected GP h;
    private ahi n;
    private ExecutorService o;

    protected YK() {
        this.f();
        this.a(this.i());
        this.j();
        adi_2.a().start();
    }

    public abstract ajh_0 a();

    protected void a(ann_1 ann_12) {
        this.e = ann_12;
    }

    public ano_1 b() {
        return this.d;
    }

    public ace_0 c() {
        return this.g;
    }

    public acG[] d() {
        return this.f;
    }

    public final azu_2 e() {
        return this.a().i();
    }

    protected abstract void f();

    protected void g() {
        ((agk_0)this.h()).a(new ajb_1(a));
    }

    public GP h() {
        if (this.h == null) {
            this.a(this.i());
        }
        return this.h;
    }

    protected void a(GP GP) {
        this.h = GP;
    }

    protected abstract GP i();

    public void j() {
        this.g();
        GP GP = this.h();
        if (GP != null) {
            try {
                ((agk_0)GP).h().i();
            }
            catch (IOException iOException) {
                i.error((Object)"Unable to load DefaultPreferenceStore from userPreference file");
            }
            ajg_1.a().a(b, GP);
            ajg_1.a().a(c, axy_2.b);
        }
    }

    public void k() {
        this.o = Executors.newSingleThreadExecutor(new ThreadFactoryBuilder().setNameFormat(j).build());
        if (this.l()) {
            alf_1.a(new ana_1());
            amU.a(new amZ());
        } else {
            alf_1.a(new amY());
            amU.a(new amX());
        }
        this.a().a(this);
    }

    protected abstract boolean l();

    protected void m() {
        this.e.a(this.a());
        this.n();
    }

    public void n() {
    }

    protected abstract ano_1 o();

    protected abstract void a(ano_1 var1);

    protected abstract ahq p();

    protected void a(acb_0 acb_02) {
    }

    protected boolean a(aiy_0 aiy_02, boolean bl) {
        this.a().d();
        this.e().e(bl);
        this.a().a(aiy_02);
        return true;
    }

    protected abstract void q();

    protected abstract void r();

    public void s() {
        try {
            this.u();
            this.v();
        }
        catch (Exception exception) {
            i.error((Object)"Erreur lors du resomePostDiagnosticLoading : ", (Throwable)exception);
            JOptionPane.showMessageDialog(this.a().v(), exception.getMessage() + " (" + exception.getClass().getName() + ")");
        }
    }

    protected final void a(String string) {
        for (int k = 0; k < this.f.length; ++k) {
            this.f[k] = new acG();
            this.f[k].a(string);
        }
    }

    protected void a(boolean bl, boolean bl2) {
        this.d.a(new YL(this, bl, bl2));
    }

    protected void a(azu_2 azu_22, anp_1 anp_12) {
        azu_22.a(auy_2.a(), true);
        this.g = this.p();
        this.a(this.t());
        this.m();
        this.d = this.o();
        this.d.a(anp_12);
        this.a(this.d);
        if (this.d != null) {
            azu_22.a(this.d, true);
            azu_22.a(this.d, true);
            azu_22.a(this.d, false);
            azu_22.a(this.d, false);
        }
        this.a(this.g);
        if (this.g != null) {
            azu_22.a(this.g, false);
            azu_22.a(this.g, false);
            azu_22.a(this.g, false);
            azu_22.a(this.g, false);
            for (int k = 0; k < this.f.length; ++k) {
                this.f[k].a(this.g);
            }
        }
    }

    protected abstract String t();

    protected void a(agw_0 agw_02) {
        this.l.add(agw_02);
    }

    protected abstract void u();

    protected void v() {
        this.m = -1;
        this.a(this.l.size() - 1);
        this.D();
    }

    void D() {
        if (++this.m < this.l.size()) {
            agw_0 agw_02 = this.l.get(this.m);
            if (agw_02 != null) {
                this.a(() -> {
                    try {
                        agw_02.a(this);
                    }
                    catch (Exception exception) {
                        this.a(agw_02, exception);
                    }
                });
            }
        } else {
            this.b(this.m);
            this.w();
        }
    }

    protected void a(@NotNull Runnable runnable) {
        if (this.o == null) {
            throw new IllegalStateException("Initialization task should not be submitted when the game is already started");
        }
        this.o.submit(runnable);
    }

    public void b(agw_0 agw_02) {
        this.a(agw_02, this.m);
        try {
            agw_0 agw_03 = this.l.get(this.m);
            this.c(agw_03);
        }
        catch (RuntimeException runtimeException) {
            i.error((Object)"exception sur onContentInitializerStart", (Throwable)runtimeException);
        }
        this.d.a(new YM(this));
    }

    protected abstract void a(int var1);

    protected abstract void b(int var1);

    protected abstract void c(agw_0 var1);

    protected abstract void a(agw_0 var1, Exception var2);

    protected abstract void a(agw_0 var1, int var2);

    protected void w() {
        if (this.o != null && !this.o.isTerminated()) {
            this.o.shutdown();
        }
    }

    public void x() {
        this.E();
    }

    public void y() {
        this.E();
    }

    private void E() {
        try {
            afz_0.d().f();
        }
        catch (RuntimeException runtimeException) {
            i.error((Object)"Exception lors du nettoyage des mobiles", (Throwable)runtimeException);
        }
        try {
            this.e.a();
        }
        catch (RuntimeException runtimeException) {
            i.error((Object)"Exception lors du nettoyage du TextureManager", (Throwable)runtimeException);
        }
    }

    @Override
    public void z() {
    }

    @Override
    public void A() {
        aiy_0 aiy_02 = this.a().q();
        if (aiy_02 == null) {
            return;
        }
        ((agk_0)this.h()).a((agp_0)agq_0.b, aiy_02.j());
    }

    @Override
    public void a(aiy_0 aiy_02) {
        ((agk_0)this.h()).a((agp_0)agq_0.b, aiy_02.j());
    }

    @Override
    public void b(aiy_0 aiy_02) {
        ((agk_0)this.h()).a((agp_0)agq_0.b, aiy_02.j());
    }

    @Override
    public void c(aiy_0 aiy_02) {
    }

    @Override
    public void a(boolean bl) {
        azu_2 azu_22 = this.e();
        if (azu_22 == null) {
            return;
        }
        azu_22.a(bl);
        axr_2.a().g();
        this.a().g();
    }

    @Override
    public void b(boolean bl) {
        azu_2 azu_22 = this.e();
        if (azu_22 == null) {
            return;
        }
        azu_22.b(!bl);
        axr_2.a().g();
        this.a().g();
    }

    public abstract void B();

    public void c(boolean bl) {
        if (this.C() == bl) {
            return;
        }
        if (this.a() == null) {
            return;
        }
        if (bl) {
            if (this.n == null) {
                this.n = new ahi(this);
                this.a().a(this.n);
            }
            this.n.a();
            this.a(this.n);
        } else if (this.n != null) {
            this.a().p_();
            this.n.a();
            this.n = null;
        }
    }

    protected void a(ahi ahi2) {
        ahi2.a(ahb_0.class);
        ahi2.a(ahf.class);
        ahi2.a(ahd_0.class);
        ahi2.a(ahh.class);
    }

    public boolean C() {
        return this.n != null && this.n.isVisible();
    }
}

