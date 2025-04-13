/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine.entity;

import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import java.util.ArrayList;

public abstract class Entity
extends abh_1
implements auh_2 {
    private static final axt_2 a = new axt_2();
    private static final axt_2 b = new axt_2();
    protected static aug_1 d = null;
    public long e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public Object p;
    protected axt_2 q;
    protected axt_2 r;
    protected aug_1 s;
    protected int t;
    protected ava_1 u;
    private EntityGroup c;
    private boolean x;
    private BatchTransformer y;
    public static aut_2 v = null;

    public void b(byte by) {
        this.i = by;
    }

    public boolean at() {
        return this.x;
    }

    public void b(boolean bl) {
        this.x = bl;
    }

    public final Entity C() {
        return this.c;
    }

    public final BatchTransformer D() {
        return this.y;
    }

    @Override
    public void c(aui_2 aui_22) {
        if (this.c() || !this.x) {
            return;
        }
        if (this.aw() < 0) {
            return;
        }
        if (this.s != null) {
            d = this.s;
            this.s.a(this.t);
            this.s.a(aui_22, this, this.u);
        } else {
            if (d != null) {
                d.c();
                d = null;
            }
            this.a(aui_22);
        }
    }

    public abstract void a(float var1);

    public abstract void a(aui_2 var1);

    public final Matrix44 E() {
        return this.D().c();
    }

    public axt_2 F() {
        return this.r;
    }

    public axt_2 M() {
        return this.q;
    }

    public final void a(axt_2 axt_22) {
        this.q = axt_22;
    }

    public final void b(axt_2 axt_22) {
        this.r = axt_22;
    }

    public final aug_1 N() {
        return this.s;
    }

    public final ava_1 O() {
        return this.u;
    }

    public final int P() {
        return this.t;
    }

    public void a(aug_1 aug_12, int n, ava_1 ava_12) {
        this.s = aug_12;
        this.t = n;
        this.u = ava_12;
    }

    public final void Q() {
        this.a(aui_1.a().b(), aup_1.d, aup_1.H);
    }

    public final void R() {
        this.a(aui_1.a().b(), aup_1.d, aup_1.I);
    }

    protected final boolean S() {
        return this.s == null || this.s.d();
    }

    @Override
    public void n_() {
        this.e = 0L;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0;
        this.l = Integer.MAX_VALUE;
        this.m = Integer.MIN_VALUE;
        this.n = Integer.MAX_VALUE;
        this.o = Integer.MIN_VALUE;
        this.q = a;
        this.r = b;
        this.t = aup_1.d;
        assert (this.y == null);
        this.y = (BatchTransformer)BatchTransformer.a.d();
        this.x = true;
    }

    @Override
    public void m() {
        this.q = null;
        this.r = null;
        this.s = null;
        this.u = null;
        if (this.c != null) {
            this.c.b(this);
            this.c = null;
        }
        this.y.u();
        this.y = null;
    }

    protected final void a(EntityGroup entityGroup) {
        this.c = entityGroup;
    }

    protected final BatchTransformer T() {
        return this.y;
    }

    public ArrayList<Entity> U() {
        return null;
    }

    @Override
    public boolean a(VertexBufferPCT vertexBufferPCT) {
        return true;
    }

    @Override
    public void a(axr_2 axr_22) {
    }

    @Override
    public int b() {
        return 7;
    }

    @Override
    public boolean a() {
        return this.x && this.aw() >= 0;
    }

    @Override
    public void b(aui_2 aui_22) {
        throw new UnsupportedOperationException("");
    }

    public final void a(azj_2 azj_22) {
        this.a(azj_22.q(), azj_22.r(), azj_22.s(), azj_22.p());
    }

    public abstract void a(float var1, float var2, float var3, float var4);

    private boolean c() {
        if (v == null) {
            return false;
        }
        return v.a(this.p);
    }
}

