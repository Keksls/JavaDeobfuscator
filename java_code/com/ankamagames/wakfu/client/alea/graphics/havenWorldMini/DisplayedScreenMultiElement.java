/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.alea.graphics.havenWorldMini;

import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.wakfu.client.alea.graphics.havenWorldMini.DisplayedScreenMultiElement$ObjectFactory;
import org.apache.log4j.Logger;

public class DisplayedScreenMultiElement
extends DisplayedScreenElement {
    private static final Logger j = Logger.getLogger(DisplayedScreenMultiElement.class);
    private static final agD k = agD.a(0, false, false);
    public static final DisplayedScreenMultiElement$ObjectFactory i = new DisplayedScreenMultiElement$ObjectFactory();
    public EntityGroup l;
    private ccy_2 m;
    public cco_1 n;
    public int o;
    public int p;
    public int q;
    public int r;

    protected DisplayedScreenMultiElement() {
    }

    public void a(cco_1 cco_12) {
        this.n = cco_12;
    }

    public void a(int n, int n2, short s2, int n3) {
        ScreenElement screenElement = (ScreenElement)ScreenElement.a.d();
        screenElement.b(n, n2, s2);
        screenElement.a(k);
        screenElement.b((byte)(n3 + 1));
        this.a(screenElement);
        screenElement.u();
    }

    void a(ccy_2 ccy_22, int n, int n2, int n3, int n4) {
        this.m = ccy_22;
        this.o = n;
        this.p = n2;
        this.q = n3;
        this.r = n4;
    }

    @Override
    public Entity e() {
        return this.l;
    }

    @Override
    public void b() {
        if (this.l != null) {
            this.l.u();
        }
        this.l = (EntityGroup)EntityGroup.a.d();
        this.l.p = this;
        this.c();
        this.a(this.l);
        this.n();
        this.l.d();
    }

    private void n() {
        float f2 = (float)this.d().c() * 10.0f;
        for (int k = 0; k < this.r; ++k) {
            for (int i2 = 0; i2 < this.q; ++i2) {
                short s2 = this.m.b(this.o + i2, this.p + k);
                aPh.a(this.l, s2, i2, k, f2, this.n.e(s2));
            }
        }
        this.m.a(new aPg(this, f2));
    }

    @Override
    public boolean a(int n, int n2) {
        return false;
    }

    @Override
    public void b(float[] fArray) {
        if (this.l == null) {
            return;
        }
        for (Entity entity : this.l.U()) {
            DisplayedScreenMultiElement.a((EntitySprite)entity, fArray);
        }
    }

    @Override
    public void d(float[] fArray) {
        for (Entity entity : this.l.U()) {
            EntitySprite entitySprite = (EntitySprite)entity;
            entitySprite.a(fArray[0], fArray[1], fArray[2], fArray[3]);
            entitySprite.f();
        }
    }

    @Override
    public void m() {
        super.m();
        if (this.l != null) {
            this.l.u();
            this.l = null;
        }
    }
}

