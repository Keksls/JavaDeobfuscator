/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TByteArrayList
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.list.array.TByteArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bwR
 */
abstract class bwr_0
implements bwq_0 {
    static final Logger f = Logger.getLogger(bwr_0.class);
    private final bwy_1 g = new bwy_1();
    @NotNull
    final bwh_0 a;
    @NotNull
    final bmr_1 b;
    Byte c;
    blx_1 d;
    boolean e = false;
    private boolean h;
    private static final int i = 20;
    private boolean j;

    bwr_0(@NotNull bwh_0 bwh_02, @NotNull bmr_1 bmr_12) {
        this.a = bwh_02;
        this.b = bmr_12;
    }

    @Override
    public final ema_1 ag_() {
        ema_1 ema_12 = this.k();
        if (ema_12 != ema_1.a) {
            return ema_12;
        }
        ema_1 ema_13 = this.j();
        if (ema_13 != ema_1.a) {
            return ema_13;
        }
        return this.b();
    }

    @Override
    public final ema_1 ah_() {
        this.e = true;
        try {
            ema_1 ema_12 = this.ag_();
            return ema_12;
        }
        finally {
            this.e = false;
        }
    }

    @Override
    public final void c() {
        this.h = true;
    }

    abstract ema_1 b();

    void a(@NotNull blx_1 blx_12) {
        this.d = blx_12;
        if (this.c == null) {
            this.c = this.d.Y();
        }
    }

    ema_1 e() {
        bws_0 bws_02;
        ema_1 ema_12 = this.g.a(this.a, this.c).a();
        if (ema_12 != ema_1.a) {
            return ema_12;
        }
        ema_1 ema_13 = this.l();
        if (ema_13 != ema_1.a) {
            return ema_13;
        }
        if (!this.h && (bws_02 = new bws_0(this)).a()) {
            this.j = true;
            return ema_1.a;
        }
        return this.g();
    }

    ema_1 f() {
        ema_1 ema_12 = this.h();
        if (ema_12 != ema_1.a) {
            return ema_12;
        }
        return this.i();
    }

    private ema_1 g() {
        if (!this.e) {
            boolean bl = ((bvx_0)ans_0.D().h()).a(bWe.G);
            cmw_0 cmw_02 = new cmw_0(this.d.a_(), bl);
            azu_0.j().K().c(cmw_02);
        }
        return ema_1.a;
    }

    private ema_1 h() {
        TByteArrayList tByteArrayList = new TByteArrayList();
        for (byte by = 0; by < this.a.af_().c(); by = (byte)(by + 1)) {
            if (this.g.a(this.a, by).a() != ema_1.a || tByteArrayList.contains(by)) continue;
            tByteArrayList.add(by);
        }
        if (tByteArrayList.size() != 1) {
            return ema_1.G;
        }
        this.c = tByteArrayList.getQuick(0);
        return ema_1.a;
    }

    private ema_1 i() {
        Collection collection = this.a.j();
        for (blx_1 blx_12 : collection) {
            if (blx_12.Y() != this.c.byteValue()) continue;
            this.d = blx_12;
            ema_1 ema_12 = this.e();
            if (ema_12 != ema_1.a) continue;
            return ema_12;
        }
        return ema_1.G;
    }

    private ema_1 j() {
        if (this.b.ak()) {
            return ema_1.b;
        }
        if (this.b.b(erl_2.g) > 0) {
            return ema_1.k;
        }
        if (this.b.cW()) {
            return ema_1.F;
        }
        if (bvz_2.a.a()) {
            return ema_1.D;
        }
        if (azu_0.j().k().dn()) {
            return ema_1.E;
        }
        if (this.a instanceof bvw_2 && this.a.af_() == emr_2.v) {
            bvw_2 bvw_22 = (bvw_2)this.a;
            blx_1 blx_12 = bvw_22.x();
            blx_1 blx_13 = bvw_22.y();
            if (!(blx_12 instanceof bnh_1) || !(blx_13 instanceof bnh_1)) {
                return ema_1.z;
            }
            fhD fhD2 = this.b.ba();
            fhD fhD3 = blx_12.ba();
            fhD fhD4 = blx_13.ba();
            if (fhD3 != fhD.a && fhD4 != fhD.a && fhD2 == fhD.a) {
                return ema_1.w;
            }
        }
        return ema_1.a;
    }

    private ema_1 k() {
        elp_0 elp_02 = this.a.e();
        if (elp_02 != elp_0.b && elp_02 != elp_0.d) {
            return ema_1.q;
        }
        return ema_1.a;
    }

    private ema_1 l() {
        if (!this.d.ak()) {
            return ema_1.n;
        }
        if (this.d.b(erl_2.k) > 0) {
            return ema_1.m;
        }
        int n = this.a(20);
        if (n != 0) {
            return ema_1.C;
        }
        return ema_1.a;
    }

    private int a(int n) {
        biI biI2 = this.b.bv();
        int n2 = biI2.be();
        int n3 = biI2.bf();
        short s2 = biI2.bg();
        int n4 = this.d.G();
        int n5 = this.d.H();
        short s3 = this.d.I();
        ut_0 ut_02 = new ut_0();
        ut_02.b = n * n;
        ut_02.f = true;
        ut_02.a = false;
        ut_02.m = false;
        ut_02.n = false;
        ut_02.o = false;
        yy_0 yy_02 = new yy_0();
        yz_0.a(n2, n3, n4, n5, yy_02);
        uq_0 uq_02 = uq_0.a();
        uq_02.a(n2, n3, s2);
        uq_02.b(n4, n5, s3);
        uq_02.a((int)biI2.af(), biI2.X(), biI2.aU());
        uq_02.a(ut_02);
        uq_02.a(yy_02);
        int n6 = uq_02.g();
        uq_02.release();
        if (n6 == -1) {
            return 1026;
        }
        if (n6 >= n) {
            return 1042;
        }
        return 0;
    }

    @Override
    public boolean d() {
        return this.j;
    }
}

