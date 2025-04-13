/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/*
 * Renamed from FP
 */
public final class fp_0 {
    public static final int a = -1;
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 4;
    private static final int e = 8;
    private static final int f = 16;
    private static final int g = 32;
    private static final int h = 64;
    private static final int i = 128;
    private byte j;
    private float k;
    private float l;
    private String[] m;
    private fo_0[] n;
    private FS[] o;
    private FR[] p;
    private fq_0 q;

    public fp_0() {
        this.o();
    }

    public float[] a() {
        return this.q == null ? fq_0.a : this.q.c();
    }

    public int a(String string) {
        if (this.q == null) {
            return -1;
        }
        return this.q.a(string);
    }

    public fo_0 b(String string) {
        return this.n == null ? null : (fo_0)Arrays.stream(this.n).filter(fo_02 -> fo_02 != null && fo_02.b() != null && fo_02.b().equals(string)).findFirst().orElse(null);
    }

    public String a(int n) {
        return this.m[n];
    }

    public fo_0[] b() {
        return this.n;
    }

    public String[] c() {
        return this.m;
    }

    public FS[] d() {
        return this.o;
    }

    public float e() {
        return this.k;
    }

    public float f() {
        return this.l;
    }

    public boolean g() {
        return (this.j & 1) != 0;
    }

    public boolean h() {
        return (this.j & 2) != 0;
    }

    public boolean i() {
        return (this.j & 8) != 0;
    }

    public boolean j() {
        return (this.j & 4) != 0;
    }

    public boolean k() {
        return (this.j & 0x10) == 0;
    }

    public boolean l() {
        return (this.j & 0x20) == 32;
    }

    public boolean m() {
        return (this.j & 0x40) != 0;
    }

    public boolean n() {
        return (this.j & 0x80) != 0;
    }

    public void o() {
        this.j = 0;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
    }

    public void a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.j = (byte)(this.j | 2);
        this.m = list.toArray(new String[list.size()]);
    }

    public void b(List<FS> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.j = (byte)(this.j | 4);
        this.o = new FS[list.size()];
        list.toArray(this.o);
    }

    public void c(List<FR> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.j = (byte)(this.j | 0x40);
        this.p = new FR[list.size()];
        list.toArray(this.p);
    }

    public void a(float f2) {
        if (f2 != 1.0f) {
            this.j = (byte)(this.j | 1);
            this.k = f2;
        }
    }

    public void b(float f2) {
        if (f2 != 1.0f) {
            this.j = (byte)(this.j | 8);
            this.l = f2;
        }
    }

    public void a(boolean bl) {
        this.j = bl ? (byte)(this.j | 0x10) : (byte)(this.j & 0xFFFFFFEF);
    }

    public void p() {
        this.j = (byte)(this.j | 0x20);
    }

    public FR[] q() {
        return this.p;
    }

    public void a(Map<String, Byte> map) {
        if (map.isEmpty()) {
            return;
        }
        this.j = (byte)(this.j | 0x80);
        this.q = new fq_0();
        this.q.a(map);
    }

    public void a(float[] fArray) {
        if (fArray == null) {
            return;
        }
        this.j = (byte)(this.j | 0x80);
        this.q = new fq_0();
        this.q.a(fArray);
    }

    public byte r() {
        return this.j;
    }

    public void a(byte by) {
        this.j = by;
    }

    public void a(String[] stringArray) {
        this.m = stringArray;
    }

    public void a(fo_0[] fo_0Array) {
        this.n = fo_0Array;
    }

    public FS[] s() {
        return this.o;
    }

    public void a(FS[] fSArray) {
        this.o = fSArray;
    }

    public FR[] t() {
        return this.p;
    }

    public void a(FR[] fRArray) {
        this.p = fRArray;
    }

    public fq_0 u() {
        return this.q;
    }

    public void a(fq_0 fq_02) {
        this.q = fq_02;
    }
}

