/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 *  org.apache.log4j.Logger
 */
package com.ankamagames.baseImpl.graphics.alea.display;

import com.ankamagames.baseImpl.graphics.alea.display.RenderTreeStencil$ObjectFactory;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import java.util.ArrayList;
import java.util.HashSet;
import org.apache.log4j.Logger;

public class RenderTreeStencil
extends abh_1
implements aug_2 {
    public static final RenderTreeStencil$ObjectFactory a = new RenderTreeStencil$ObjectFactory();
    protected static final Logger b = Logger.getLogger(RenderTreeStencil.class);
    private Entity c;
    private final ArrayList<RenderTreeStencil> d = new ArrayList(1);
    private final ArrayList<RenderTreeStencil> e = new ArrayList(1);
    private final ArrayList<RenderTreeStencil> f = new ArrayList(1);
    private final ArrayList<Entity> g = new ArrayList();
    private static short h = 1;
    private RenderTreeStencil i;
    private final ArrayList<Entity> j = new ArrayList();

    @Override
    public void a() {
        this.j.clear();
        this.h();
    }

    @Override
    public void a(Entity entity, int n) {
        if (this.c == null) {
            this.c = entity;
            return;
        }
        RenderTreeStencil renderTreeStencil = (RenderTreeStencil)a.d();
        renderTreeStencil.c = entity;
        this.a(renderTreeStencil);
    }

    @Override
    public void a(Entity entity) {
        this.j.add(entity);
    }

    @Override
    public void a(aui_2 aui_22) {
        axr_2.a().e(false);
        aui_22.b();
        this.b(aui_22);
        int n = this.j.size();
        for (int k = 0; k < n; ++k) {
            aui_22.a(this.j.get(k));
        }
    }

    @Override
    public void a(HashSet<Entity> hashSet) {
        hashSet.addAll(this.g);
        hashSet.addAll(this.j);
        if (this.i != null) {
            this.i.a(hashSet);
        }
        if (this.c != null) {
            hashSet.add(this.c);
        }
    }

    @Override
    public void n_() {
    }

    @Override
    public void m() {
        this.a();
    }

    private void h() {
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.c = null;
        this.j.clear();
        if (this.i != null) {
            this.i.h();
            this.i.u();
            this.i = null;
        }
        h = (short)254;
    }

    private void b(aui_2 aui_22) {
        RenderTreeStencil renderTreeStencil;
        int n;
        Object object;
        int n2;
        if (this.c == null) {
            return;
        }
        GL2 gL2 = aui_22.e();
        int n3 = this.d.size();
        axu_2 axu_22 = axu_2.a();
        if (n3 != 0) {
            axv_2 axv_22 = new axv_2();
            axv_22.a(-2);
            axv_22.a(true);
            axv_22.b(7681);
            axv_22.a(512, 2, -1);
            axv_22.b(false);
            axu_22.a((GL)gL2, axv_22);
            for (n2 = 0; n2 < n3; ++n2) {
                object = this.d.get(n2);
                aui_22.a(((RenderTreeStencil)object).c);
                n = ((RenderTreeStencil)object).f.size();
                for (int k = 0; k < n; ++k) {
                    renderTreeStencil = ((RenderTreeStencil)object).f.get(k);
                    aui_22.a(renderTreeStencil.c);
                }
            }
            axv_22 = new axv_2();
            axv_22.a(true);
            axv_22.a(0);
            axv_22.a(517, 2, -1);
            axv_22.b(7680);
            axv_22.b(true);
            axu_22.a((GL)gL2, axv_22);
            aui_22.a(this.c);
            axu_22.a((GL)gL2, 2);
        } else {
            int n4 = this.e.size();
            if (n4 != 0) {
                aui_22.a(this.c);
                n2 = this.f.size();
                object = new axv_2();
                ((axv_2)object).a(true);
                ((axv_2)object).a(-2);
                ((axv_2)object).b(7681);
                ((axv_2)object).a(512, h, -1);
                ((axv_2)object).b(false);
                axu_22.a((GL)gL2, (axv_2)object);
                aui_22.a(this.c);
                for (n = 0; n < n2; ++n) {
                    aui_22.a(this.f.get((int)n).c);
                }
                object = new axv_2();
                ((axv_2)object).a(false);
                ((axv_2)object).a(-2);
                ((axv_2)object).b(7681);
                ((axv_2)object).a(512, 0, -1);
                ((axv_2)object).b(false);
                axu_22.a((GL)gL2, (axv_2)object);
                for (n = 0; n < n4; ++n) {
                    int n5;
                    int n6 = -1;
                    renderTreeStencil = this.e.get(n);
                    int n7 = renderTreeStencil.d.size();
                    for (n5 = 0; n5 < n7; ++n5) {
                        if (renderTreeStencil.d.get(n5) != this) continue;
                        n6 = n5 + 1;
                        break;
                    }
                    if (n6 == -1) continue;
                    for (n5 = n6; n5 < n7; ++n5) {
                        RenderTreeStencil renderTreeStencil2 = renderTreeStencil.d.get(n5);
                        aui_22.a(renderTreeStencil2.c);
                        int n8 = renderTreeStencil2.f.size();
                        for (int k = 0; k < n8; ++k) {
                            aui_22.a(renderTreeStencil2.f.get((int)k).c);
                        }
                    }
                }
                object = new axv_2();
                ((axv_2)object).a(true);
                ((axv_2)object).a(0);
                ((axv_2)object).b(7680);
                ((axv_2)object).a(514, h, -2);
                ((axv_2)object).b(true);
                axu_22.a((GL)gL2, (axv_2)object);
                for (n = 0; n < n4; ++n) {
                    RenderTreeStencil renderTreeStencil3 = this.e.get(n);
                    aui_22.a(renderTreeStencil3.c);
                }
                if ((h = (short)(h - 2)) <= 2) {
                    h = (short)254;
                }
                axu_22.a((GL)gL2, 3);
            } else {
                aui_22.a(this.c);
            }
        }
        int n9 = this.g.size();
        for (n2 = 0; n2 < n9; ++n2) {
            this.g.get(n2).c(aui_22);
        }
        if (this.i != null) {
            this.i.b(aui_22);
        }
    }

    private void a(RenderTreeStencil renderTreeStencil) {
        Entity entity = renderTreeStencil.c;
        if (this.c.i > 1.0f && !(entity.i > 1.0f) && RenderTreeStencil.a(entity, this.c, this.c.i) && RenderTreeStencil.a(entity, this.c)) {
            int n = this.d.size();
            for (int k = 0; k < n; ++k) {
                RenderTreeStencil renderTreeStencil2 = this.d.get(k);
                if (renderTreeStencil2.c.f != entity.f || renderTreeStencil2.c.g != entity.g) continue;
                renderTreeStencil.f.addAll(renderTreeStencil2.f);
                renderTreeStencil.f.add(renderTreeStencil2);
                renderTreeStencil2.f.clear();
                renderTreeStencil2.e.remove(this);
                this.d.remove(k);
                break;
            }
            renderTreeStencil.e.add(this);
            this.d.add(renderTreeStencil);
        }
        if (this.i == null) {
            if (entity.i > 1.0f || renderTreeStencil.d.size() != 0 || renderTreeStencil.e.size() != 0) {
                this.i = renderTreeStencil;
            } else {
                this.g.add(entity);
                renderTreeStencil.u();
            }
        } else {
            this.i.a(renderTreeStencil);
        }
    }

    private static boolean a(Entity entity, Entity entity2, float f2) {
        if (Math.abs(entity.f - entity2.f) >= f2) {
            return false;
        }
        return !(Math.abs(entity.g - entity2.g) >= f2);
    }

    private static boolean a(Entity entity, Entity entity2) {
        if (entity.f == entity2.f && entity.g == entity2.g) {
            return entity.h < entity2.h + entity2.j;
        }
        return entity.h + entity.j <= entity2.h;
    }

    public Entity b() {
        return this.c;
    }

    public RenderTreeStencil c() {
        return this.i;
    }

    public ArrayList<RenderTreeStencil> d() {
        return this.f;
    }

    public ArrayList<RenderTreeStencil> e() {
        return this.e;
    }

    public ArrayList<RenderTreeStencil> f() {
        return this.d;
    }

    public ArrayList<Entity> g() {
        return this.g;
    }
}

