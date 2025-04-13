/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.common.nio.Buffers
 */
package com.ankamagames.framework.graphics.engine;

import com.ankamagames.framework.graphics.engine.VertexBufferPCT$ObjectFactory;
import com.jogamp.common.nio.Buffers;
import java.nio.FloatBuffer;

public final class VertexBufferPCT
extends abh_1 {
    public static final int a = 2;
    public static final int b = 4;
    public static final int c = 2;
    public static final VertexBufferPCT$ObjectFactory d = new VertexBufferPCT$ObjectFactory();
    private float[] f;
    private float[] g;
    private float[] h;
    private int i;
    private int j;
    private int k;
    private FloatBuffer l;
    private FloatBuffer m;
    private FloatBuffer n;
    private int o;
    private int p;

    VertexBufferPCT() {
    }

    void b(int n) {
        this.p = 0;
        this.o = 0;
        this.c(n);
        assert (n <= auf_2.b.a());
    }

    private void c(int n) {
        this.p = n;
        int n2 = 4 * this.p;
        this.l = Buffers.newDirectFloatBuffer((int)(n2 * 2));
        this.m = Buffers.newDirectFloatBuffer((int)(n2 * 4));
        this.n = Buffers.newDirectFloatBuffer((int)(n2 * 2));
    }

    public void a() {
        this.o = 0;
    }

    public FloatBuffer b() {
        this.l.rewind();
        return this.l;
    }

    public FloatBuffer c() {
        this.m.rewind();
        return this.m;
    }

    public FloatBuffer d() {
        this.n.rewind();
        return this.n;
    }

    public void e() {
        this.l.rewind();
    }

    public void a(float[] fArray) {
        this.l.put(fArray);
    }

    public void b(float[] fArray) {
        this.l.rewind();
        this.l.put(fArray);
    }

    public void a(float[] fArray, int n) {
        assert (n <= fArray.length);
        this.l.position(this.o * 2);
        this.l.put(fArray, 0, n);
    }

    public void b(float[] fArray, int n) {
        this.l.rewind();
        this.l.put(fArray, 0, n);
    }

    public void c(float[] fArray, int n) {
        assert (n <= fArray.length);
        this.m.position(this.o * 4);
        this.m.put(fArray, 0, n);
    }

    public void f() {
        this.m.rewind();
    }

    public void c(float[] fArray) {
        this.m.put(fArray);
    }

    public void d(float[] fArray) {
        this.m.rewind();
        this.m.put(fArray);
    }

    public void d(float[] fArray, int n) {
        this.m.rewind();
        this.m.put(fArray, 0, n);
    }

    public void e(float[] fArray, int n) {
        assert (n <= fArray.length);
        this.n.position(this.o * 2);
        this.n.put(fArray, 0, n);
    }

    public void e(float[] fArray) {
        this.n.rewind();
        this.n.put(fArray);
    }

    public void f(float[] fArray, int n) {
        this.n.rewind();
        this.n.put(fArray, 0, n);
    }

    public void a(int n, float f2, float f3, float f4, float f5) {
        this.m.position(n * 4);
        this.m.put(f2);
        this.m.put(f3);
        this.m.put(f4);
        this.m.put(f5);
    }

    public void a(int n, float[] fArray) {
        this.m.position(n * 4);
        this.m.put(fArray);
    }

    public void f(float[] fArray) {
        this.m.rewind();
        this.m.put(fArray);
    }

    public void g() {
        this.n.rewind();
    }

    public void g(float[] fArray) {
        this.n.put(fArray);
    }

    public void a(int n, float f2, float f3) {
        this.n.position(n * 2);
        this.n.put(f2);
        this.n.put(f3);
    }

    public void b(int n, float f2, float f3) {
        this.l.position(n * 2);
        this.l.put(f2);
        this.l.put(f3);
    }

    public void h() {
        this.l.limit(this.o * 2);
        this.m.limit(this.o * 4);
        this.n.limit(this.o * 2);
        this.p = this.o;
    }

    public void a(int n) {
        assert (this.o <= this.p);
        this.o = n;
    }

    public int j() {
        return this.o;
    }

    public int k() {
        return this.p;
    }

    @Override
    public void n_() {
        this.p = 0;
        this.o = 0;
    }

    @Override
    public void m() {
        this.m = null;
        this.l = null;
        this.n = null;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public void n() {
        if (this.f == null) {
            assert (this.g == null);
            assert (this.h == null);
            this.f = new float[this.p * 2];
            this.g = new float[this.p * 4];
            this.h = new float[this.p * 2];
        }
        this.o = 0;
        this.l.rewind();
        this.m.rewind();
        this.n.rewind();
        this.i = 0;
        this.j = 0;
        this.k = 0;
    }

    public void a(float f2, float f3, float f4, float f5, float[] fArray) {
        this.a(f2, f3, f4, f5, fArray[0], fArray[1], fArray[2], fArray[3]);
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f[this.i++] = f2;
        this.f[this.i++] = f3;
        this.g[this.j++] = f6;
        this.g[this.j++] = f7;
        this.g[this.j++] = f8;
        this.g[this.j++] = f9;
        this.h[this.k++] = f4;
        this.h[this.k++] = f5;
        ++this.o;
        assert (this.o <= this.p);
    }

    public void o() {
        this.l.put(this.f, 0, this.i);
        this.m.put(this.g, 0, this.j);
        this.n.put(this.h, 0, this.k);
        assert (this.l.position() % 2 == 0);
        assert (this.l.position() / 2 == this.o);
        assert (this.m.position() % 4 == 0);
        assert (this.m.position() / 4 == this.o);
        assert (this.n.position() % 2 == 0);
        assert (this.n.position() / 2 == this.o);
    }

    public void p() {
        this.l.rewind();
        this.m.rewind();
        this.n.rewind();
        this.o = 0;
    }

    public void a(VertexBufferPCT vertexBufferPCT) {
        int n = vertexBufferPCT.o;
        assert (this.o + n <= this.p);
        vertexBufferPCT.l.flip();
        this.l.put(vertexBufferPCT.l);
        vertexBufferPCT.m.flip();
        this.m.put(vertexBufferPCT.m);
        vertexBufferPCT.n.flip();
        this.n.put(vertexBufferPCT.n);
        this.o += n;
    }
}

