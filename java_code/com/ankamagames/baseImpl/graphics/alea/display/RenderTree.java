/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.baseImpl.graphics.alea.display;

import com.ankamagames.baseImpl.graphics.alea.display.RenderTree$ObjectFactory;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.util.ArrayList;
import java.util.HashSet;

public class RenderTree
extends abh_1
implements aug_2 {
    public static final RenderTree$ObjectFactory a = new RenderTree$ObjectFactory();
    private final ArrayList<Entity> b = new ArrayList(0);
    private final ArrayList<Entity> c = new ArrayList(0);
    private RenderTree d;
    private RenderTree e;
    private Entity f;
    private boolean g;
    private float h;
    private float i;
    private final ArrayList<Entity> j = new ArrayList();
    private static final int k = 1000;
    private static final boolean l = true;

    RenderTree() {
    }

    @Override
    public void a() {
        this.j.clear();
        if (this.d != null) {
            this.d.u();
            this.d = null;
        }
        if (this.e != null) {
            this.e.u();
            this.e = null;
        }
        this.b.clear();
        this.c.clear();
        this.f = null;
    }

    @Override
    public void a(Entity entity, int n) {
        if (this.f == null) {
            this.f = entity;
            this.g = this.b(this.f);
            this.h = this.f.f;
            this.i = this.f.g;
            this.h = Float.MAX_VALUE;
            this.i = Float.MAX_VALUE;
            return;
        }
        if (!this.g) {
            if (this.e == null) {
                if (!this.b(entity)) {
                    this.c.add(entity);
                } else {
                    if (this.e == null) {
                        this.e = (RenderTree)a.d();
                    }
                    this.e.a(entity, n + 1);
                }
            } else {
                this.e.a(entity, n + 1);
            }
            return;
        }
        if (this.c(entity)) {
            if (this.d == null) {
                this.d = (RenderTree)a.d();
            }
            this.d.a(entity, n + 1);
        } else {
            if (this.e == null) {
                this.e = (RenderTree)a.d();
            }
            this.e.a(entity, n + 1);
        }
    }

    public final void a(ArrayList<Entity> arrayList, int n) {
        int n2;
        for (n2 = 0; n2 < this.b.size(); ++n2) {
            arrayList.add(this.b.get(n2));
        }
        if (this.d != null) {
            this.d.a(arrayList, n);
        }
        if (this.f != null) {
            arrayList.add(this.f);
        }
        for (n2 = 0; n2 < this.c.size(); ++n2) {
            arrayList.add(this.c.get(n2));
        }
        if (n > 1000) {
            return;
        }
        if (this.e != null) {
            this.e.a(arrayList, n + 1);
        }
    }

    @Override
    public void a(Entity entity) {
        this.j.add(entity);
    }

    @Override
    public void a(aui_2 aui_22) {
        this.b(aui_22);
        int n = this.j.size();
        for (int k = 0; k < n; ++k) {
            aui_22.a(this.j.get(k));
        }
    }

    @Override
    public void a(HashSet<Entity> hashSet) {
        hashSet.addAll(this.c);
        hashSet.addAll(this.b);
        hashSet.addAll(this.j);
        if (this.d != null) {
            this.d.a(hashSet);
        }
        if (this.e != null) {
            this.e.a(hashSet);
        }
        if (this.f != null) {
            hashSet.add(this.f);
        }
    }

    @Override
    public void n_() {
    }

    @Override
    public void m() {
        this.a();
    }

    private void b(aui_2 aui_22) {
        int n;
        int n2 = this.b.size();
        for (n = 0; n < n2; ++n) {
            this.b.get(n).c(aui_22);
        }
        if (this.d != null) {
            this.d.b(aui_22);
        }
        if (this.f != null) {
            this.f.c(aui_22);
        }
        n = this.c.size();
        for (int k = 0; k < n; ++k) {
            this.c.get(k).c(aui_22);
        }
        if (this.e != null) {
            this.e.b(aui_22);
        }
    }

    private boolean b(Entity entity) {
        return entity.i > 1.0f;
    }

    private boolean c(Entity entity) {
        if (entity.f < this.f.f) {
            return true;
        }
        return entity.g < this.f.g;
    }
}

