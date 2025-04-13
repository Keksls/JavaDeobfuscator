/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.LinkedList;
import org.apache.log4j.Logger;

public class ddB
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(ddB.class);
    private static final ddB b = new ddB();
    private blw_0 c;
    private fzu d;
    private final ArrayList<ddd_0> e = new ArrayList();
    private final LinkedList<ddC> f = new LinkedList();

    public static ddB a() {
        return b;
    }

    public void c() {
        fis_1.a().a("petBubbleMessage", (Object)null);
        if (this.d != null) {
            this.d.run(null);
            this.d = null;
        }
    }

    public fzu d() {
        return this.d;
    }

    public void a(fzu fzu2) {
        if (this.d != null) {
            a.error((Object)"[LD/GD] Attention ! On vient d'\u00e9craser un listener non consum\u00e9 sur le dialogue du g\u00e9lutin !");
        }
        this.d = fzu2;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 17540: {
                dfc dfc2 = (dfc)adt_12;
                String string = dfc2.h();
                boolean bl = dfc2.i();
                this.a(string, bl, dfc2.d(), bly_0.a(dfc2.c()));
                return false;
            }
            case 17097: {
                this.e();
                return false;
            }
            case 16551: {
                cdw_0.n().c(600195L);
                brk_2 brk_22 = (brk_2)fis_1.a().e("tutorialMessageView");
                dhf_0 dhf_02 = (dhf_0)adt_12;
                brk_2 brk_23 = new brk_2(dhf_02.p(), dhf_02.k(), dhf_02.o(), dhf_02.q(), dhf_02.r());
                if (brk_22 != null && brk_22.equals(brk_23)) {
                    return false;
                }
                fis_1.a().a("tutorialMessageView", brk_23);
                if (brk_22 != null) {
                    this.a(brk_22);
                }
                this.b(brk_23);
                return false;
            }
            case 19914: {
                brk_2 brk_24 = (brk_2)fis_1.a().e("tutorialMessageView");
                fis_1.a().a("tutorialMessageView", (Object)null);
                if (brk_24 != null) {
                    this.a(brk_24);
                }
                return false;
            }
        }
        return true;
    }

    private void a(brk_2 brk_22) {
        int n = brk_22.b();
        if (n != -1) {
            bua_0.a.a(new bvb_1(n));
        }
        for (int k = this.e.size() - 1; k >= 0; --k) {
            this.e.get(k).a(brk_22);
        }
        this.g();
    }

    private void g() {
        fyy_0 fyy_02 = fpm_0.b().h().d("tutorialMessageDialog");
        fso fso2 = (fso)fyy_02.a("particleContainer");
        fso2.getAppearance().j();
    }

    private void b(brk_2 brk_22) {
        for (int k = this.e.size() - 1; k >= 0; --k) {
            this.e.get(k).b(brk_22);
        }
        this.h();
    }

    private void h() {
        fyy_0 fyy_02 = fpm_0.b().h().d("tutorialMessageDialog");
        fso fso2 = (fso)fyy_02.a("particleContainer");
        fso2.getAppearance().j();
        fbx_1 fbx_12 = new fbx_1();
        fbx_12.onCheckOut();
        fbx_12.setFile("6001057.xps");
        fbx_12.setAlignment(frs_0.a);
        fbx_12.setFollowBorders(true);
        fbx_12.setSpeed(1000.0f);
        fbx_12.setTurnNumber(1);
        fso2.getAppearance().add(fbx_12);
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            ddC ddC2;
            fis_1.a().a("petBubbleMessage", (Object)null);
            fis_1.a().a("tutorialMessageView", (Object)null);
            this.c = new blw_0();
            fpm_0.b().a("wakfu.petDialog", cJi.class);
            while ((ddC2 = this.f.poll()) != null) {
                this.c.a(ddC2);
            }
            fpm_0.b().a("tutorialMessageDialog", cfi_0.a("tutorialMessageDialog"), 139280L, (short)10000);
            cgu_2.a().a(this);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.e.clear();
            this.c.b();
            this.c = null;
            this.d = null;
            fpm_0.b().e("wakfu.petDialog");
            fpm_0.b().o("tutorialMessageDialog");
            cgu_2.a().b(this);
        }
    }

    public void a(String string, boolean bl, long l, bly_0 bly_02) {
        if (this.c == null) {
            this.f.add(new ddC(string, bl, l, bly_02));
            return;
        }
        this.c.a(new ddC(string, bl, l, bly_02));
    }

    public void e() {
        this.c.a();
    }

    public blw_0 f() {
        return this.c;
    }

    public boolean a(ddd_0 ddd_02) {
        return this.e.add(ddd_02);
    }

    public boolean b(ddd_0 ddd_02) {
        return this.e.remove(ddd_02);
    }
}

