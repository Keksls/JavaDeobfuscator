/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class ais {
    protected static Logger a = Logger.getLogger(ais.class);
    private int b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private static final int k = 1;
    private static final int l = 100;
    private static final int m = 50;
    private final aiB n = new aiC(1, 1);
    private final aiB o = new aiC(100, 50);
    private ait p = aiu.a;

    public void a(aiu aiu2) {
        this.p = aiu2;
    }

    public void a(float f2) {
        this.d = f2;
    }

    protected float a() {
        return this.d;
    }

    public void b(float f2) {
        this.c = f2;
    }

    public void a(float f2, float f3) {
        this.g = this.i = f2;
        this.e = this.i;
        this.h = this.j = f3;
        this.f = this.j;
    }

    public void a(int n) {
        this.g = this.i = (float)n;
        this.e = this.i;
    }

    public void b(int n) {
        this.h = this.j = (float)n;
        this.f = this.j;
    }

    public void b(float f2, float f3) {
        this.e = f2;
        this.f = f3;
        this.b = 0;
    }

    public void c(float f2, float f3) {
        this.g = f2;
        this.h = f3;
        this.b = 0;
    }

    public float b() {
        return this.g;
    }

    public float c() {
        return this.h;
    }

    public float d() {
        return this.i;
    }

    public float e() {
        return this.j;
    }

    public boolean a(int n, float f2, boolean bl) {
        this.n.a(f2);
        this.o.a(f2);
        return this.a(n, bl);
    }

    protected boolean a(int n, boolean bl) {
        afd_1 afd_12;
        float f2 = this.g - this.i;
        float f3 = this.h - this.j;
        afd_1 afd_13 = afd_12 = bl ? this.n.a(f2, f3) : this.o.a(f2, f3);
        if (afd_12 == null) {
            this.e = this.i;
            this.f = this.j;
            return false;
        }
        float f4 = this.i;
        float f5 = this.j;
        this.b += n;
        float f6 = (float)this.b * this.c / 1000.0f;
        if (f6 > 1.0f) {
            this.i = this.g;
            this.j = this.h;
        } else {
            float f7 = this.g - afd_12.a();
            float f8 = this.h - afd_12.b();
            this.a(f7, f8, f6);
        }
        return !Hw.c(f4, this.i, 1.0E-4f) || !Hw.c(f5, this.j, 1.0E-4f);
    }

    private void a(float f2, float f3, float f4) {
        this.i = this.p.a(this.e, this.i, f2, f4);
        this.j = this.p.a(this.f, this.j, f3, f4);
    }
}

