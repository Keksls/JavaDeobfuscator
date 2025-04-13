/*
 * Decompiled with CFR 0.152.
 */
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ye {
    private final int a;
    private float b;
    private float c;
    private float d;
    private final float[] e = new float[6];
    private final Random f = new SecureRandom();
    private float g;
    private float h;
    private ArrayList<Yi> i;
    private float j;
    private float k;
    private Yf l;

    public Ye(int n) {
        this.a = n;
    }

    public void a(Yi yi, Yb yb) {
        if (this.i == null) {
            this.i = new ArrayList();
        } else if (this.i.contains(yi)) {
            return;
        }
        this.i.add(yi);
        float f2 = yb.f();
        float f3 = yb.e();
        float f4 = yi.a();
        this.k = Hw.b(this.k + f4, f3 - this.c, f2 - this.d);
        this.j += yi.b();
    }

    public void b(Yi yi, Yb yb) {
        if (this.i == null) {
            this.i = new ArrayList();
        } else if (this.i.contains(yi)) {
            return;
        }
        this.i.clear();
        this.k = 0.0f;
        this.j = 0.0f;
        this.i.add(yi);
        float f2 = yb.f();
        float f3 = yb.e();
        float f4 = yi.a();
        this.k = Hw.b(this.k + f4, f3 - this.c, f2 - this.d);
        this.j += yi.b();
    }

    public ArrayList<Yi> a() {
        return this.i;
    }

    public int b() {
        return this.a;
    }

    public float c() {
        return this.b;
    }

    public void a(float f2) {
        this.b = f2;
    }

    public float d() {
        return this.c;
    }

    public void b(float f2) {
        this.c = f2;
    }

    public float e() {
        return this.d;
    }

    public void c(float f2) {
        this.d = f2;
    }

    public Yf f() {
        return this.l;
    }

    public void a(Yf yf) {
        this.l = yf;
    }

    public float g() {
        return this.g;
    }

    public void d(float f2) {
        this.g = f2;
    }

    public float h() {
        return this.h;
    }

    public float i() {
        return this.j;
    }

    public float j() {
        return this.k;
    }

    public void a(float f2, float f3) {
        for (int k = 0; k < this.e.length; ++k) {
            float f4 = f2 + this.f.nextFloat() * (f3 - f2) + this.j;
            this.e[k] = Hw.b(f4, f2, f3);
        }
    }

    protected void e(float f2) {
        int n = (int)Math.floor(f2 * (float)(this.e.length - 1));
        this.h = this.e[n];
    }

    public String toString() {
        return "CycleWeather{m_cycle=" + this.a + ", m_windForce=" + this.b + ", m_tMin=" + this.c + ", m_tMax=" + this.d + ", m_winds=" + Arrays.toString(this.e) + ", m_currentTemperature=" + this.g + ", m_currentWind=" + this.h + ", m_modifiers=" + this.i + ", m_modifierWind=" + this.j + ", m_modifierTemperature=" + this.k + "}";
    }
}

