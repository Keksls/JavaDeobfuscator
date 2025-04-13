/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine.transformer;

import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer$ObjectFactory;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import java.util.ArrayList;

public class BatchTransformer
extends abh_1 {
    public static final BatchTransformer$ObjectFactory a = new BatchTransformer$ObjectFactory();
    private static final Matrix44 c = (Matrix44)Matrix44.a.c();
    private final ArrayList<ayv_2> d = new ArrayList(2);
    private Matrix44 e;
    private boolean f;
    private final ArrayList<BatchTransformer> g = new ArrayList(1);
    private BatchTransformer h;

    BatchTransformer() {
    }

    public void a(int n) {
        this.c(n).b();
        this.e();
    }

    public void a(int n, float f2, float f3) {
        ayv_2 ayv_22 = this.c(n);
        if (ayv_22.c() == f2 && ayv_22.d() == f3) {
            return;
        }
        ayv_22.a(f2, f3, 0.0f);
        this.e();
    }

    public void b(int n, float f2, float f3) {
        ayv_2 ayv_22 = this.c(n);
        if (ayv_22.e() == f2 && ayv_22.f() == f3) {
            return;
        }
        ayv_22.b(f2, f3, 1.0f);
        this.e();
    }

    public final void a(BatchTransformer batchTransformer) {
        this.a(this.g.size(), batchTransformer);
    }

    public final void a(int n, BatchTransformer batchTransformer) {
        assert (batchTransformer != null) : "Child can't be null";
        batchTransformer.k_();
        batchTransformer.c(this);
        this.g.add(n, batchTransformer);
    }

    public final void b(BatchTransformer batchTransformer) {
        assert (batchTransformer != null) : "Child can't be null";
        batchTransformer.c(null);
        if (this.g.remove(batchTransformer)) {
            batchTransformer.u();
        }
    }

    public final void b(int n) {
        assert (n > 0 && n < this.g.size()) : "Index out of bound";
        this.b(this.g.get(n));
    }

    public final void a() {
        int n = this.g.size();
        for (int k = 0; k < n; ++k) {
            BatchTransformer batchTransformer = this.g.get(k);
            batchTransformer.c(null);
            batchTransformer.u();
        }
        this.g.clear();
    }

    public final void a(ayv_2 ayv_22) {
        this.d.add(ayv_22);
        this.e();
    }

    public final void a(int n, ayv_2 ayv_22) {
        this.d.add(n, ayv_22);
        this.e();
    }

    public final ayv_2 c(int n) {
        return this.d.get(n);
    }

    public final void b(int n, ayv_2 ayv_22) {
        this.d.set(n, ayv_22);
        this.e();
    }

    public final void b() {
        this.h = null;
        this.a();
        this.d.clear();
        this.e();
    }

    public final Matrix44 c() {
        if (!this.f) {
            return this.e;
        }
        int n = this.d.size();
        if (n == 0) {
            this.e.b();
        } else if (n > 4) {
            this.e.a(this.d.get(n - 2).a(), this.d.get(n - 1).a());
            for (int k = n - 3; k >= 0; --k) {
                c.a(this.e);
                this.e.a(this.d.get(k).a(), c);
            }
        } else {
            switch (n) {
                case 1: {
                    this.e.a(this.d.get(0).a());
                    break;
                }
                case 2: {
                    this.e.a(this.d.get(0).a(), this.d.get(1).a());
                    break;
                }
                case 3: {
                    this.e.a(this.d.get(0).a(), this.d.get(1).a(), this.d.get(2).a());
                    break;
                }
                case 4: {
                    this.e.a(this.d.get(0).a(), this.d.get(1).a(), this.d.get(2).a(), this.d.get(3).a());
                }
            }
        }
        if (this.h != null) {
            if (this.e.e()) {
                this.e.a(this.h.c());
            } else {
                this.e.c(this.h.c());
            }
        }
        this.f();
        return this.e;
    }

    @Override
    public void n_() {
        if (this.e == null) {
            this.e = (Matrix44)Matrix44.a.d();
        }
        this.e();
    }

    @Override
    public void m() {
        int n = this.g.size();
        this.a();
        if (n > 1) {
            this.g.trimToSize();
        }
        int n2 = this.d.size();
        this.d.clear();
        if (n2 > 2) {
            this.d.trimToSize();
        }
        this.h = null;
        this.e.u();
        this.e = null;
    }

    private void c(BatchTransformer batchTransformer) {
        this.h = batchTransformer;
        this.e();
    }

    public void e() {
        if (this.f) {
            return;
        }
        this.f = true;
        int n = this.g.size();
        for (int k = 0; k < n; ++k) {
            this.g.get(k).e();
        }
    }

    private void f() {
        this.f = false;
        assert (this.h == null || !this.h.f);
    }
}

