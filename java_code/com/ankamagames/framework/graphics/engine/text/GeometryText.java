/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine.text;

import com.ankamagames.framework.graphics.engine.geometry.Geometry;
import java.util.ArrayList;

public abstract class GeometryText
extends Geometry {
    protected ayn_2 d;
    protected final azf_2 e;
    protected ArrayList<char[]> f;
    protected int g;
    protected final aft_2 h = new aft_2(0.0f, 0.0f, 0.0f, 1.0f);
    protected float i = 0.0f;
    protected float j = 0.0f;
    protected float k;
    protected float l;
    protected float m = 1.0f;

    public GeometryText() {
        this.e = new azf_2(azf_2.f);
    }

    public void a(gk_0 gk_02) {
        assert (false) : "Currently not implemented";
    }

    public void a(arf_1 arf_12) {
        assert (false) : "Currently not implemented";
    }

    public abstract int a(String var1);

    public abstract int b(String var1);

    public abstract afe_1 c(String var1);

    public float c() {
        return this.m;
    }

    public void b(float f2) {
        this.m = f2;
    }

    public float e() {
        return this.k;
    }

    public void c(float f2) {
        this.k = f2;
    }

    public float f() {
        return this.l;
    }

    public void d(float f2) {
        this.l = f2;
    }

    public void a(ayn_2 ayn_22) {
        this.d = ayn_22;
    }

    public final void a(int n) {
        this.e.a(n);
    }

    @Override
    public final void a(float f2, float f3, float f4, float f5) {
        this.e.a(f2, f3, f4, f5);
    }

    public final azf_2 g() {
        return this.e;
    }

    public final void a(ArrayList<char[]> arrayList) {
        this.f = arrayList;
    }

    public final void b(int n) {
        this.g = n;
    }

    public final void a(aft_2 aft_22) {
        this.h.a((aeg_2)aft_22);
    }

    public final float h() {
        return this.i;
    }

    public final void e(float f2) {
        this.i = f2;
    }

    public final float j() {
        return this.j;
    }

    public final void f(float f2) {
        this.j = f2;
    }

    public final void a(float f2, float f3) {
        this.i = f2;
        this.j = f3;
    }
}

