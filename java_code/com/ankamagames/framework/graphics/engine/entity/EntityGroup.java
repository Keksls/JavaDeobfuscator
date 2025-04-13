/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
package com.ankamagames.framework.graphics.engine.entity;

import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup$ObjectFactory;
import com.jogamp.opengl.GL2;
import java.util.ArrayList;

public class EntityGroup
extends Entity {
    private static final int x = 2;
    public static final EntityGroup$ObjectFactory a = new EntityGroup$ObjectFactory();
    protected final ArrayList<Entity> b = new ArrayList(2);

    EntityGroup() {
    }

    @Override
    public void a(float f2) {
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            this.b.get(k).a(f2);
        }
    }

    @Override
    public void c(aui_2 aui_22) {
        if (!this.at()) {
            return;
        }
        this.a(aui_22);
    }

    @Override
    public void a(aui_2 aui_22) {
        int n = this.b.size();
        if (n == 0) {
            return;
        }
        GL2 gL2 = aui_22.e();
        this.q.a(gL2);
        for (int k = 0; k < n; ++k) {
            this.b.get(k).c(aui_22);
        }
        this.r.a(gL2);
    }

    @Override
    public void b(boolean bl) {
        super.b(bl);
        for (Entity entity : this.b) {
            entity.b(bl);
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5) {
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            this.b.get(k).a(f2, f3, f4, f5);
        }
    }

    @Override
    public final ArrayList<Entity> U() {
        return this.b;
    }

    public void a(int n, Entity entity) {
        assert (entity != null) : "It's forbidden to add a null value as a child";
        entity.a(this);
        Entity entity2 = this.b.set(n, entity);
        entity.k_();
        this.T().a(n, entity.D());
        if (entity2 != null) {
            this.T().b(entity2.D());
            entity2.u();
        }
    }

    public final void a(Entity entity) {
        assert (entity != null) : "It's forbidden to add a null value as a child";
        entity.a(this);
        this.b.add(entity);
        entity.k_();
        this.T().a(entity.D());
    }

    public final void b(Entity entity) {
        assert (entity != null) : "null value can't be removed from childList";
        entity.a((EntityGroup)null);
        if (this.b.remove(entity)) {
            entity.u();
        }
        this.T().b(entity.D());
    }

    public final void c() {
        for (int k = this.b.size() - 1; k >= 0; --k) {
            Entity entity = this.b.get(k);
            entity.a((EntityGroup)null);
            entity.u();
        }
        this.b.clear();
        this.T().a();
    }

    @Override
    public void m() {
        this.c();
        super.m();
    }

    public void d() {
        this.l = Integer.MAX_VALUE;
        this.n = Integer.MAX_VALUE;
        this.m = Integer.MIN_VALUE;
        this.o = Integer.MIN_VALUE;
        for (Entity entity : this.b) {
            if (entity.l < this.l) {
                this.l = entity.l;
            }
            if (entity.n < this.n) {
                this.n = entity.n;
            }
            if (entity.m > this.m) {
                this.m = entity.m;
            }
            if (entity.o <= this.o) continue;
            this.o = entity.o;
        }
    }
}

