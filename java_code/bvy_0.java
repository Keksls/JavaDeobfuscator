/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from bVY
 */
class bvy_0
implements eux_2<bmr_1> {
    final /* synthetic */ bvx_0 a;

    bvy_0(bvx_0 bvx_02) {
        this.a = bvx_02;
    }

    @Override
    public void a(bmr_1 bmr_12) {
    }

    @Override
    public void b(bmr_1 bmr_12) {
        if (!bmr_12.cX()) {
            return;
        }
        bvp_0 bvp_02 = new bvp_0(bmr_12);
        this.a.b(bvp_02);
        try {
            bvp_02.i();
        }
        catch (IOException iOException) {
            bvx_0.e.warn((Object)String.format("Error occurred on load of AccountPreferenceStore for hero : %s", bmr_12.a_()), (Throwable)iOException);
        }
    }

    @Override
    public void c(bmr_1 bmr_12) {
        if (!bmr_12.cX()) {
            return;
        }
        this.a.a(bmr_12.a_(), (bvp_0)null);
    }

    @Override
    public void d(bmr_1 bmr_12) {
    }

    @Override
    public /* synthetic */ void a(epq_2 epq_22) {
        this.d((bmr_1)epq_22);
    }

    @Override
    public /* synthetic */ void b(epq_2 epq_22) {
        this.c((bmr_1)epq_22);
    }

    @Override
    public /* synthetic */ void c(epq_2 epq_22) {
        this.b((bmr_1)epq_22);
    }

    @Override
    public /* synthetic */ void d(epq_2 epq_22) {
        this.a((bmr_1)epq_22);
    }
}

