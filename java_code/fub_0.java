/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
import com.jogamp.opengl.GL2;

/*
 * Renamed from fuB
 */
class fub_0
extends axt_2 {
    private boolean c = true;
    final /* synthetic */ fut_0 a;

    fub_0(fut_0 fut_02) {
        this.a = fut_02;
    }

    @Override
    public void a(GL2 gL2) {
        if (this.c) {
            this.a.A.setScreenPosition(this.a.A.getScreenX(), this.a.A.getScreenY());
            azt_1 azt_12 = this.a.A.getScissor(null);
            azt_12.a(this.a.C.getSize());
            azt_12.a(azt_12.d(), (int)((double)azt_12.e() + this.a.D));
            fpm_0.b().j().a(azt_12);
            fdn_2.a().a(azt_12);
            azt_1 azt_13 = fdn_2.a().c();
            axr_2.a().e(true);
            axr_2.a().a(azt_13.d(), azt_13.e(), azt_13.c() + 1, azt_13.b() + 1);
        } else {
            this.a.A.setScreenPosition(-1, -1);
            fdn_2.a().d();
            azt_1 azt_14 = fdn_2.a().c();
            if (azt_14 != null) {
                axr_2.a().e(true);
                axr_2.a().a(azt_14.d(), azt_14.e(), azt_14.c() + 1, azt_14.b() + 1);
            }
        }
        this.c = !this.c;
    }
}

