/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from anW
 */
public abstract class anw_1
extends adt_1 {
    private int a;
    private boolean b;
    private byte c;
    private short d;
    private int e;
    private long f;
    private double g;
    private float h;
    private String i;
    private Object j;

    public anw_1(adv_1 adv_12) {
        this.a(adv_12);
    }

    @Override
    public void a_(int n) {
        this.a = n;
    }

    @Override
    public int a() {
        return this.a;
    }

    public byte b() {
        return this.c;
    }

    public void a(byte by) {
        this.c = by;
    }

    public int c() {
        return this.e;
    }

    public void b(int n) {
        this.e = n;
    }

    public long d() {
        return this.f;
    }

    public void a(long l) {
        this.f = l;
    }

    public short e() {
        return this.d;
    }

    public void a(short s2) {
        this.d = s2;
    }

    public double f() {
        return this.g;
    }

    public void a(double d2) {
        this.g = d2;
    }

    public float g() {
        return this.h;
    }

    public void a(float f2) {
        this.h = f2;
    }

    public String h() {
        return this.i;
    }

    public void a(String string) {
        this.i = string;
    }

    public boolean i() {
        return this.b;
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    public void a(Object object) {
        this.j = object;
    }

    public <T> T j() {
        return (T)this.j;
    }
}

