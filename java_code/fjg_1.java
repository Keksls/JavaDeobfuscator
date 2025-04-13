/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fJG
 */
public class fjg_1 {
    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private long g;
    private String h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l = true;
    private boolean m;
    private boolean n;
    private Object o;
    private fjh_1 p;
    private fjh_1 q;
    private fjh_1 r;
    private String s;
    private float[] t;

    public fjg_1(float f2, float f3, float f4, long l, String string, fjh_1 fjh_12, float[] fArray) {
        this(f2, f3, f4, l, string, null, fjh_12, fArray);
    }

    public fjg_1(float f2, float f3, float f4, long l, String string, Object object, fjh_1 fjh_12, float[] fArray) {
        this(f2, f3, f4, l, string, object, fjh_12, fArray, false, false);
    }

    public fjg_1(float f2, float f3, float f4, long l, String string, Object object, fjh_1 fjh_12, String string2, float[] fArray) {
        this(f2, f3, f4, l, string, object, fjh_12, null, string2, fArray, false, false);
    }

    public fjg_1(float f2, float f3, float f4, long l, String string, Object object, fjh_1 fjh_12, float[] fArray, boolean bl, boolean bl2) {
        this(f2, f3, f4, l, string, object, fjh_12, null, fArray, bl, bl2);
    }

    public fjg_1(float f2, float f3, float f4, long l, String string, Object object, fjh_1 fjh_12, fjh_1 fjh_13, float[] fArray, boolean bl, boolean bl2) {
        this(f2, f3, f4, l, string, object, fjh_12, fjh_13, null, fArray, bl, bl2);
    }

    public fjg_1(float f2, float f3, float f4, long l, String string, Object object, fjh_1 fjh_12, fjh_1 fjh_13, String string2, float[] fArray, boolean bl, boolean bl2) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = l;
        this.h = string;
        this.o = object;
        this.p = fjh_12;
        this.q = fjh_13;
        this.s = string2;
        this.t = fArray;
        this.i = bl;
        this.j = bl2;
    }

    public float a() {
        return this.a;
    }

    public void a(float f2) {
        this.a = f2;
    }

    public float b() {
        return this.b;
    }

    public void b(float f2) {
        this.b = f2;
    }

    public float c() {
        return this.c;
    }

    public void c(float f2) {
        this.c = f2;
    }

    public long d() {
        return this.g;
    }

    public void a(long l) {
        this.g = l;
    }

    public String e() {
        if (this.h != null) {
            return this.h;
        }
        return null;
    }

    public void a(String string) {
        this.h = string;
    }

    public fjh_1 f() {
        return this.p;
    }

    public fjh_1 g() {
        return this.q;
    }

    public fjh_1 h() {
        return this.r;
    }

    public void a(fjh_1 fjh_12) {
        this.p = fjh_12;
    }

    public void b(fjh_1 fjh_12) {
        this.q = fjh_12;
    }

    public void c(fjh_1 fjh_12) {
        this.r = fjh_12;
    }

    public float[] i() {
        return this.t;
    }

    public void a(float[] fArray) {
        this.t = fArray;
    }

    public Object j() {
        return this.o;
    }

    public void a(Object object) {
        this.o = object;
    }

    public float k() {
        return this.e;
    }

    public float l() {
        return this.d;
    }

    public float m() {
        return this.f;
    }

    public void a(float f2, float f3, float f4) {
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public boolean n() {
        return this.i;
    }

    public void a(boolean bl) {
        this.i = bl;
    }

    public void b(boolean bl) {
        this.j = bl;
    }

    public boolean o() {
        return this.j;
    }

    public boolean p() {
        return this.k;
    }

    public void c(boolean bl) {
        this.k = bl;
    }

    public boolean q() {
        return this.m;
    }

    public void d(boolean bl) {
        this.m = bl;
    }

    public boolean r() {
        return this.n;
    }

    public void e(boolean bl) {
        this.n = bl;
    }

    public String s() {
        return this.s;
    }

    public void b(String string) {
        this.s = string;
    }

    public boolean t() {
        return this.l;
    }

    public void f(boolean bl) {
        this.l = bl;
    }

    public boolean d(float f2) {
        return Math.abs(this.d - this.a) >= f2 || Math.abs(this.e - this.b) >= f2;
    }
}

