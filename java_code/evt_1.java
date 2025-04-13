/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from eVt
 */
public class evt_1
implements UG {
    private final int a;
    private final int b;
    private final aej_2 c;
    private final int[] d;
    private final short e;
    private final apc_2 f;
    private final int g;
    private final short h;
    private final int i;
    private final short j;
    private final boolean k;
    private final short l;
    private final boolean m;
    private boolean n;
    private fjC o;
    private boolean p;
    private int q;
    private final int r;

    public boolean b() {
        return this.m;
    }

    public boolean e() {
        return this.n;
    }

    public int f() {
        return this.b;
    }

    public int g() {
        return this.g;
    }

    public short h() {
        return this.h;
    }

    public int i() {
        return this.i;
    }

    public short j() {
        return this.j;
    }

    public boolean k() {
        return this.k;
    }

    public short l() {
        return this.l;
    }

    public evt_1(int n, int n2, int n3, int n4, int n5, short s2, aej_2 aej_22, apc_2 apc_22, int n6, short s3, int n7, short s4, boolean bl, short s5, boolean bl2, int n8) {
        this.a = n;
        this.b = n2;
        this.c = aej_22;
        this.d = new int[]{n3, n4, n5};
        this.e = s2;
        this.f = apc_22;
        this.g = n6;
        this.h = s3;
        this.i = n7;
        this.j = s4;
        this.k = bl;
        this.l = s5;
        this.m = bl2;
        this.q = 2;
        this.r = n8;
    }

    public evt_1(evt_1 evt_12) {
        this.a = evt_12.a;
        this.b = evt_12.b;
        this.c = evt_12.c;
        this.d = Arrays.copyOf(evt_12.d, evt_12.d.length);
        this.e = evt_12.e;
        this.f = evt_12.f;
        this.g = evt_12.g;
        this.h = evt_12.h;
        this.i = evt_12.i;
        this.j = evt_12.j;
        this.k = evt_12.k;
        this.l = evt_12.l;
        this.m = evt_12.m;
        this.q = evt_12.q;
        this.p = evt_12.p;
        this.r = evt_12.r;
    }

    public int[] m() {
        return this.d;
    }

    public short n() {
        return this.e;
    }

    public aej_2 o() {
        return this.c;
    }

    @Override
    public int a() {
        return this.a;
    }

    @Override
    public apc_2 d() {
        return this.f;
    }

    @Override
    public short c() {
        return 100;
    }

    public void a(fjC fjC2) {
        this.n = true;
        this.o = fjC2;
    }

    public void a(boolean bl) {
        this.n = bl;
    }

    public boolean p() {
        return this.n;
    }

    public fjC q() {
        return this.o;
    }

    public boolean r() {
        return this.p;
    }

    public void b(boolean bl) {
        this.p = bl;
    }

    public int s() {
        return this.q;
    }

    public void a(int n) {
        this.q = n;
    }

    public int t() {
        return this.r;
    }
}

