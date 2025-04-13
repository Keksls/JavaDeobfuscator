/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class cSN
implements fzu {
    private static final Logger a = Logger.getLogger(cSN.class);
    private final ack_2<abz_0> b = new ack_2();
    private final ack_2<cUM> c = new ack_2();
    private final ack_2<cSS[]> d = new ack_2();
    private short e = 0;
    private int f = 0;
    private fvb_0 g = null;

    public void a() {
        this.g = fpm_0.b().r();
        this.g.addEventListener(frd_0.K, this, true);
        this.g.addEventListener(frd_0.N, this, false);
        if (this.c != null && this.c.d() > 0) {
            this.g.setRadius(this.c.c(this.c.d() - 1).aL());
        } else {
            this.g.setRadius(0);
        }
        abz_0 abz_02 = null;
        Object var2_2 = null;
        for (short s2 = 0; s2 < this.b.d(); s2 = (short)(s2 + 1)) {
            cSS[] cSSArray;
            int n = 0;
            cUM cUM2 = this.c.e(s2);
            if (cUM2 != null) {
                cSSArray = cUM2.aI();
                if (cSSArray == null) continue;
                if (abz_02 == null) {
                    abz_02 = this.b.e(s2);
                }
                for (int k = 0; k < cSSArray.length; ++k) {
                    cSS cSS2 = cSSArray[k];
                    cSS2.a(cUM2);
                    int n2 = 0;
                    try {
                        n2 = cSS2.p() ? 1 : 0;
                    }
                    catch (Exception exception) {
                        a.error((Object)("Exception lev\u00e9e en d\u00e9terminant si l'action " + cSS2.getClass().getSimpleName() + " est usable"), (Throwable)exception);
                    }
                    int n3 = 0;
                    try {
                        n3 = cSS2.c() ? 1 : 0;
                    }
                    catch (Exception exception) {
                        a.error((Object)("Exception lev\u00e9e en d\u00e9terminant si l'action " + cSS2.getClass().getSimpleName() + " est runnable"), (Throwable)exception);
                    }
                    if (n2 == 0 || n3 == 0) continue;
                    if (n % 8 == 0) {
                        this.g.a();
                    }
                    ++n;
                    this.g.a(null, cSS2.u(), cSS2.h(), null, cSS2.s(), cSS2.m(), new cSO(this, cSS2), cSS2.d());
                }
                continue;
            }
            cSSArray = this.d.e(s2);
            if (cSSArray == null) continue;
            abz_0 abz_03 = this.b.e(s2);
            for (cSS cSS3 : cSSArray) {
                if (!cSS3.p() || !cSS3.c()) continue;
                if (abz_02 == null) {
                    abz_02 = abz_03;
                }
                if (n % 8 == 0) {
                    this.g.a();
                }
                ++n;
                this.g.a(null, cSS3.u(), cSS3.h(), null, cSS3.s(), cSS3.m(), new cSP(this, cSS3), cSS3.d());
            }
        }
        if (this.g.getGroupSize() > 0) {
            cdw_0.n().c(600072L);
            var2_2 = null;
            if (var2_2 != null) {
                fpm_0.b().a(this.g, var2_2.x, var2_2.y);
            } else {
                fpm_0.b().a(this.g);
            }
        }
        if (abz_02 != null && abz_02.aE()) {
            aNC.b(abz_02);
        }
    }

    public void a(cUM cUM2, abz_0 abz_02) {
        cSS[] cSSArray = cUM2.aI();
        if (cSSArray == null || cSSArray.length == 0) {
            return;
        }
        this.b.a(this.e, abz_02);
        this.c.a(this.e, cUM2);
        this.e = (short)(this.e + 1);
    }

    public void a(cSS[] cSSArray, abz_0 abz_02) {
        this.b.a(this.e, abz_02);
        this.d.a(this.e, cSSArray);
        this.e = (short)(this.e + 1);
    }

    public final int b() {
        return this.c.d();
    }

    public final cUM a(int n) {
        return this.c.c(n);
    }

    public final boolean c() {
        return this.c.d() > 0 || this.d.d() > 0;
    }

    public void d() {
        if (this.g != null) {
            this.g.destroySelfFromParent();
            this.g = null;
            this.e();
        }
    }

    private void e() {
        dan.a().a((cSN)null);
        for (short s2 = 0; s2 < this.b.d(); s2 = (short)(s2 + 1)) {
            abz_0 abz_02 = this.b.e(s2);
            if (abz_02 == null) continue;
            abz_02.ad();
        }
    }

    @Override
    public boolean run(fzs fzs2) {
        if (fzs2.f() == frd_0.K) {
            abz_0 abz_02;
            fcs_1 fcs_12 = (fcs_1)fzs2;
            if (fcs_12.j() < this.b.d() && (abz_02 = this.b.e((short)fcs_12.j())) != null && abz_02.aE()) {
                aNC.b(abz_02);
            }
            if ((abz_02 = this.b.e((short)this.f)) != null) {
                abz_02.ad();
            }
            this.f = fcs_12.j();
        }
        if (fzs2.f() == frd_0.N) {
            this.e();
        }
        return true;
    }
}

