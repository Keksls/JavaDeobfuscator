/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import org.apache.log4j.Logger;

/*
 * Renamed from fkh
 */
public abstract class fkh_0
implements fkj_0 {
    private static final Logger a = Logger.getLogger(fkh_0.class);
    public static final int b = -6;
    private static final int d = 4;
    private static final int e = 4;
    protected final long c;
    private int f;
    private int g;
    private int h;
    private int i;
    private short[][] j;
    private final TLongObjectHashMap<esy_2> k = new TLongObjectHashMap();
    private final fkp_0 l = new fkp_0(this.k);

    protected fkh_0(long l, int n, int n2) {
        this.c = l;
        this.a(0, 0, n, n2);
        this.a((short)0);
    }

    protected fkh_0(long l) {
        this(l, 4, 4);
    }

    protected fkh_0(fkh_0 fkh_02) {
        this.c = fkh_02.c;
        this.f = fkh_02.f;
        this.g = fkh_02.g;
        this.h = fkh_02.h;
        this.i = fkh_02.i;
        this.j = (short[][])fkh_02.j.clone();
        int n = fkh_02.j.length;
        for (int k = 0; k < n; ++k) {
            this.j[k] = (short[])fkh_02.j[k].clone();
        }
        this.k.putAll(fkh_02.k);
        this.l.a();
    }

    @Override
    public boolean a(int n, int n2) {
        return this.g().b(n, n2);
    }

    @Override
    public afk_2 g() {
        return new afk_2(this.h() + 2, this.l() - 2, this.i() + 2, this.m() - 8);
    }

    @Override
    public final int h() {
        return this.f;
    }

    @Override
    public final int i() {
        return this.g;
    }

    public final int j() {
        return this.h;
    }

    public final int k() {
        return this.i;
    }

    @Override
    public final int l() {
        return this.f + this.h - 1;
    }

    @Override
    public final int m() {
        return this.g + this.i - 1;
    }

    public final void a(int n, int n2, int n3, int n4) {
        short s2 = fkh_0.g(n3);
        short s3 = fkh_0.h(n4);
        this.j = new short[s2][s3];
        this.h = s2;
        this.i = s3;
        this.f = fkh_0.g(n);
        this.g = fkh_0.h(n2);
    }

    protected final short[][] n() {
        short[][] sArrayArray = new short[this.h][];
        for (int k = 0; k < this.h; ++k) {
            sArrayArray[k] = (short[])this.j[k].clone();
        }
        return sArrayArray;
    }

    protected final void a(short s2) {
        for (int k = 0; k < this.h; ++k) {
            for (int i2 = 0; i2 < this.i; ++i2) {
                this.j[k][i2] = s2;
            }
        }
    }

    public enJ c(short s2, short s3) {
        enJ enJ2 = new enJ(s2, s3);
        this.a(s2, s3, enJ2);
        return enJ2;
    }

    protected final void a(short s2, short s3, fki_0 fki_02) {
        short s4 = fkh_0.g(s2);
        short s5 = fkh_0.h(s3);
        fki_02.a(this.c((int)s4, (int)s5), this.c(s4 + 1, (int)s5), this.c((int)s4, s5 + 1), this.c(s4 + 1, s5 + 1));
        this.b(s2, s3, fki_02);
    }

    public void b(short s2, short s3, fki_0 fki_02) {
        fki_02.a(this.l.a(s2, s3));
    }

    public final boolean d(short s2, short s3) {
        short s4 = fkh_0.g(s2);
        short s5 = fkh_0.h(s3);
        if (s4 < this.h() || s4 > this.l() || s5 < this.i() || s5 > this.m()) {
            return false;
        }
        return this.b(s4, (int)s5) != fkk_0.c || this.b(s4 + 1, (int)s5) != fkk_0.c || this.b(s4, s5 + 1) != fkk_0.c || this.b(s4 + 1, s5 + 1) != fkk_0.c;
    }

    @Override
    public final void a(int n, int n2, short s2) {
        this.j[n - this.f][n2 - this.g] = s2;
    }

    @Override
    public short b(int n, int n2) {
        return this.j[n - this.f][n2 - this.g];
    }

    public void b(short s2, short s3, short s4, short s5, short s6, short s7) {
        short s8 = fkh_0.g(s2);
        short s9 = fkh_0.h(s3);
        this.a((int)s8, (int)s9, s4);
        this.a(s8 + 1, (int)s9, s5);
        this.a((int)s8, s9 + 1, s6);
        this.a(s8 + 1, s9 + 1, s7);
    }

    protected final fkk_0 c(int n, int n2) {
        short s2 = this.b(n, n2);
        return s2 == fkk_0.c ? null : this.b(s2);
    }

    public abstract fkk_0 b(int var1);

    public long o() {
        return this.c;
    }

    @Override
    public void a(esy_2 esy_22) {
        this.b(esy_22.c());
        this.k.put(esy_22.c(), (Object)esy_22);
        this.l.a();
    }

    @Override
    public esy_2 b(long l) {
        esy_2 esy_22 = (esy_2)this.k.remove(l);
        if (esy_22 != null) {
            this.l.a();
        }
        return esy_22;
    }

    public static short c(int n) {
        int n2 = Hw.c((float)n / 9.0f);
        return Hw.c((long)n2);
    }

    public static short d(int n) {
        int n2 = Hw.c((float)n / 9.0f);
        return Hw.c((long)n2);
    }

    public static short e(int n) {
        int n2 = Hw.c((float)n / 2.0f);
        return Hw.c((long)n2);
    }

    public static short f(int n) {
        int n2 = Hw.c((float)n / 2.0f);
        return Hw.c((long)n2);
    }

    public static short g(int n) {
        int n2 = n * 2;
        return Hw.c((long)n2);
    }

    public static short h(int n) {
        int n2 = n * 2;
        return Hw.c((long)n2);
    }

    public static short i(int n) {
        return fkh_0.g(n);
    }

    public static short j(int n) {
        return fkh_0.h(n);
    }

    public static short k(int n) {
        int n2 = fkh_0.g(n) + 1;
        return Hw.c((long)n2);
    }

    public static short l(int n) {
        return fkh_0.h(n);
    }

    public static short m(int n) {
        return fkh_0.g(n);
    }

    public static short n(int n) {
        int n2 = fkh_0.h(n) + 1;
        return Hw.c((long)n2);
    }

    public static short o(int n) {
        int n2 = fkh_0.g(n) + 1;
        return Hw.c((long)n2);
    }

    public static short p(int n) {
        int n2 = fkh_0.h(n) + 1;
        return Hw.c((long)n2);
    }

    @Override
    public esy_2[] e(short s2, short s3) {
        return this.l.a(s2, s3);
    }

    @Override
    public boolean a(TObjectProcedure<esy_2> tObjectProcedure) {
        return this.k.forEachValue(tObjectProcedure);
    }

    public abstract fkh_0 e();

    public esy_2 b(long l, int n) {
        esy_2 esy_22 = (esy_2)this.k.get(l);
        if (esy_22 == null) {
            a.error((Object)("le batiment " + l + " n'existe pas"));
            return null;
        }
        esy_22.b(n);
        return esy_22;
    }

    @Override
    public int p() {
        return 250000;
    }

    @Override
    public /* synthetic */ fkj_0 f() {
        return this.e();
    }
}

