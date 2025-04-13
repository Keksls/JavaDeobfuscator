/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Collections;

public class bMb
implements afb_0,
afk_0<afe_0>,
afy_0 {
    private static final ut_0 a = new ut_0();
    private static final int b = 25;
    private static final int c = 400;
    private static final int d = 300;
    private static final yy_0 e;
    private final biE f;
    private final boolean g;

    public bMb(biE biE2) {
        this.f = biE2;
        this.g = false;
    }

    public bMb(biE biE2, boolean bl) {
        this.f = biE2;
        this.g = bl;
    }

    public void a(afe_0 afe_02, int n, int n2, short s2) {
        apl_1 apl_12 = afe_02.bb();
        if (apl_12 != null) {
            return;
        }
        this.a(afe_02, apl_12, n, n2, s2);
    }

    @Override
    public void pathStarted(afe_0 afe_02, apl_1 apl_12) {
        if (apl_12 == null) {
            return;
        }
        int[] nArray = apl_12.d();
        if (nArray == null) {
            return;
        }
        int n = nArray[0];
        int n2 = nArray[1];
        short s2 = (short)nArray[2];
        this.a(afe_02, apl_12, n, n2, s2);
    }

    @Override
    public void pathEnded(afe_0 afe_02, int n, int n2, short s2) {
        afe_02.c(this);
        this.a(afe_02, afe_02.bb(), n, n2, s2);
    }

    private void a(afe_0 afe_02, apl_1 apl_12, int n, int n2, short s2) {
        int n3 = this.f.G();
        int n4 = this.f.H();
        int n5 = n3 - n;
        int n6 = n4 - n2;
        aff_1 aff_12 = bMb.a(n, n2, s2);
        if (n5 * n5 + n6 * n6 > 300) {
            this.f.b(aff_12.d(), (float)aff_12.e(), (float)aff_12.f());
            return;
        }
        e.F();
        uq_0 uq_02 = uq_0.a();
        bMb.a.a = this.g;
        bMb.a.h = this.g;
        bMb.a.m = false;
        bMb.a.n = false;
        bMb.a.o = true;
        bMb.a.p = false;
        uq_02.a(a);
        uq_02.a((int)this.f.af(), this.f.X(), this.f.aU());
        uq_02.a(e);
        if (yz_0.e(this.f.G(), this.f.H(), (int)this.f.I())) {
            uq_02.a(n, n2, s2);
        } else {
            uq_02.a(this.f.G(), this.f.H(), this.f.I());
        }
        yz_0.a(n3, n4, aff_12.d(), aff_12.e(), e);
        uq_02.b(aff_12.d(), aff_12.e(), aff_12.f());
        uq_02.g();
        apl_1 apl_13 = uq_02.e();
        uq_02.release();
        if (apl_13.b()) {
            ado_1.a().a(new bMc(apl_13, this.f), this.f.bk().a(this.f) / 2, 1);
        } else if (apl_12 != null) {
            afe_02.b(this);
        } else {
            this.f.b(aff_12.d(), (float)aff_12.e(), (float)aff_12.f());
        }
    }

    public static aff_1 a(int n, int n2, short s2) {
        aej_2[] aej_2Array = aej_2.e();
        Collections.shuffle(Arrays.asList(aej_2Array));
        int n3 = n;
        int n4 = n2;
        short s3 = s2;
        boolean bl = true;
        int n5 = aej_2Array.length;
        for (int k = 0; k < n5 && bl; ++k) {
            aej_2 aej_22 = aej_2Array[k];
            n3 = n + aej_22.m;
            n4 = n2 + aej_22.n;
            yx_0 yx_02 = yz_0.a(n3, n4);
            if (yx_02 == null || (s3 = yz_0.b(n3, n4, s2)) == Short.MIN_VALUE || Math.abs(s2 - s3) > 6 || yx_02.c(n3, n4, s3) || yx_02.g(n3, n4, s3)) continue;
            bl = false;
        }
        if (bl) {
            n3 = n;
            n4 = n2;
            s3 = s2;
        }
        return new aff_1(n3, n4, s3);
    }

    @Override
    public /* synthetic */ void cellPositionChanged(ahh_0 ahh_02, int n, int n2, short s2) {
        this.a((afe_0)ahh_02, n, n2, s2);
    }

    static {
        bMb.a.c = 25;
        bMb.a.b = 400;
        bMb.a.f = false;
        e = new yy_0();
    }
}

