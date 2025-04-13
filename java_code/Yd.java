/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumMap;

public class Yd {
    private int a = 0;
    private float b = 5.0f;
    private float c = 5.0f;
    private float d = 3.0f;
    private float e = 10.0f;
    private float f = 0.0f;
    private float g = 0.5f;
    private final EnumMap<Yf, Integer> h = new EnumMap(Yf.class);

    public int a() {
        return this.a;
    }

    public void a(int n) {
        this.a = n;
    }

    public float b() {
        return this.b;
    }

    public void a(float f2) {
        this.b = f2;
    }

    public float c() {
        return this.c;
    }

    public void b(float f2) {
        this.c = f2;
    }

    public float d() {
        return this.d;
    }

    public void c(float f2) {
        this.d = f2;
    }

    public float e() {
        return this.e;
    }

    public void d(float f2) {
        this.e = f2;
    }

    public float f() {
        return this.f;
    }

    public void e(float f2) {
        this.f = f2;
    }

    public float g() {
        return this.g;
    }

    public void f(float f2) {
        this.g = f2;
    }

    public int a(Yf yf) {
        return this.h.get((Object)yf);
    }

    public void a(Yf yf, int n) {
        this.h.put(yf, n);
    }
}

