/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine.material;

import com.ankamagames.framework.graphics.engine.material.Material$ObjectFactory;

public final class Material
extends abh_1 {
    private static final int e = 0;
    private static final int f = 4;
    private static final int g = 4;
    private static final int h = 3;
    private static final int i = 7;
    public static final Material a;
    public static final Material b;
    public static final Material c;
    private static final float[] j;
    private static final abb_2 k;
    private static float[] l;
    public static final Material$ObjectFactory d;
    private final Object m = new Object();
    private int n;
    private final float[] o = new float[4];
    private final float[] p = new float[3];

    Material() {
    }

    @Deprecated
    public float[] a() {
        this.a(this.o);
        return this.o;
    }

    @Deprecated
    public float[] b() {
        this.f(this.p);
        return this.p;
    }

    public void a(Material material) {
        System.arraycopy(l, material.n, l, this.n, 7);
    }

    public void a(float[] fArray) {
        System.arraycopy(l, 0 + this.n, fArray, 0, 4);
    }

    public boolean b(float[] fArray) {
        int n = 0 + this.n;
        return l[n] == fArray[0] && l[n + 1] == fArray[1] && l[n + 2] == fArray[2] && l[n + 3] == fArray[3];
    }

    public void c(float[] fArray) {
        System.arraycopy(l, 0 + this.n, fArray, 0, 4);
    }

    public void d(float[] fArray) {
        System.arraycopy(fArray, 0, l, 0 + this.n, 4);
    }

    public void e(float[] fArray) {
        System.arraycopy(fArray, 0, l, 0 + this.n, 3);
    }

    public void a(float f2, float f3, float f4, float f5) {
        int n = 0 + this.n;
        Material.l[n] = f2;
        Material.l[n + 1] = f3;
        Material.l[n + 2] = f4;
        Material.l[n + 3] = f5;
    }

    public void a(float f2, float f3, float f4) {
        int n;
        int n2 = n = 0 + this.n;
        l[n2] = l[n2] * f2;
        int n3 = n + 1;
        l[n3] = l[n3] * f3;
        int n4 = n + 2;
        l[n4] = l[n4] * f4;
    }

    public void f(float[] fArray) {
        System.arraycopy(l, 4 + this.n, fArray, 0, 3);
    }

    public boolean g(float[] fArray) {
        int n = 4 + this.n;
        return l[n] == fArray[0] && l[n + 1] == fArray[1] && l[n + 2] == fArray[2];
    }

    public void h(float[] fArray) {
        System.arraycopy(l, 4 + this.n, fArray, 0, 3);
    }

    public void i(float[] fArray) {
        System.arraycopy(fArray, 0, l, 4 + this.n, 3);
    }

    public void b(float f2, float f3, float f4) {
        int n = 4 + this.n;
        Material.l[n] = f2;
        Material.l[n + 1] = f3;
        Material.l[n + 2] = f4;
    }

    public boolean b(Material material) {
        if (material.n == this.n) {
            return true;
        }
        int n = this.n;
        int n2 = material.n;
        for (int k = 0; k < 7; ++k) {
            if (l[k + n] == l[k + n2]) continue;
            return false;
        }
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void n_() {
        Object object = this.m;
        synchronized (object) {
            int n = k.a();
            if (n == -1) {
                Material.c();
                n = k.a();
            }
            this.n = n * 7;
            System.arraycopy(j, 0, l, this.n, 7);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void m() {
        Object object = this.m;
        synchronized (object) {
            k.a(this.n / 7);
        }
    }

    private static void c() {
        k.b(k.e() + 1000);
        float[] fArray = l;
        l = new float[7 * k.e()];
        System.arraycopy(fArray, 0, l, 0, fArray.length);
    }

    static {
        j = new float[]{1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f};
        k = new abb_2(15000);
        l = new float[7 * k.e()];
        d = new Material$ObjectFactory();
        a = (Material)d.c();
        a.a(1.0f, 1.0f, 1.0f, 1.0f);
        a.b(1.0f, 1.0f, 1.0f);
        b = (Material)d.c();
        b.a(1.0f, 1.0f, 1.0f, 1.0f);
        b.b(0.0f, 0.0f, 0.0f);
        c = (Material)d.c();
        c.a(0.0f, 0.0f, 0.0f, 1.0f);
        c.b(0.0f, 0.0f, 0.0f);
    }
}

