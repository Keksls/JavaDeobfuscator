/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from eET
 */
public class eet_0 {
    private int a;
    private int b = 0;
    private int c = 2;
    private boolean d = true;
    private boolean e = true;
    private boolean f = false;
    private ArrayList<Long> g;
    private boolean h = false;
    private int i;
    private short j;
    private short k;
    private long l;
    private final hp_0 m = hn_0.f();

    public eet_0() {
        this.g = new ArrayList();
    }

    public int a() {
        return this.b;
    }

    public boolean b() {
        return this.h;
    }

    public ArrayList<Long> c() {
        return this.g;
    }

    public void a(long l) {
        this.g.add(l);
    }

    public int d() {
        return this.a;
    }

    public void a(int n) {
        this.a = n;
    }

    public void b(int n) {
        this.b = n;
    }

    public int e() {
        return this.c;
    }

    public void c(int n) {
        this.c = n;
    }

    public boolean f() {
        return this.d;
    }

    public void a(boolean bl) {
        this.d = bl;
    }

    public boolean g() {
        return this.e;
    }

    public void b(boolean bl) {
        this.e = bl;
    }

    public void c(boolean bl) {
        this.f = bl;
    }

    public boolean h() {
        return this.f;
    }

    public void d(int n) {
        this.i = n;
    }

    public void a(short s2) {
        this.k = s2;
    }

    public void b(short s2) {
        this.j = (short)(this.j + s2);
    }

    public void b(long l) {
        this.l = l;
    }

    public void a(long l, short s2) {
        this.m.b(l, hr_0.q().a(s2).r());
    }

    public hf_0 i() {
        hf_0 hf_02 = hD.z();
        hf_02.a(hw_1.a).a(this.m).b(this.c).b(this.l).c(this.j).d(this.k).c((long)this.i);
        return hf_02;
    }

    public void a(ArrayList<Long> arrayList) {
        this.g = arrayList;
    }

    public void d(boolean bl) {
        this.h = bl;
    }
}

