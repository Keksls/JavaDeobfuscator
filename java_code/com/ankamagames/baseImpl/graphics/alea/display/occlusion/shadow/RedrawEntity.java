/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.baseImpl.graphics.alea.display.occlusion.shadow;

import com.ankamagames.framework.graphics.engine.entity.Entity;

public class RedrawEntity
extends Entity {
    final Entity a;
    final azj_2 b;

    public RedrawEntity(Entity entity, azj_2 azj_22) {
        assert (entity.av());
        this.a = entity;
        this.b = azj_22;
        this.b(true);
    }

    @Override
    public void a(float f2) {
    }

    @Override
    public boolean at() {
        return this.a.at();
    }

    @Override
    public boolean a() {
        return this.a.a();
    }

    @Override
    public int b() {
        return this.a.b();
    }

    @Override
    public void a(float f2, float f3, float f4, float f5) {
    }

    @Override
    public void a(aui_2 aui_22) {
        this.a.a(new aef_0(true));
        this.a.b(aey.b);
        aug_1 aug_12 = this.a.N();
        int n = this.a.P();
        ava_1 ava_12 = this.a.O();
        this.a.a(new azf_2(0.5f, 0.0f, 0.0f, 1.0f));
        this.a.a(aui_1.a().b(), aup_1.r, null);
        this.a.a(aui_22);
        this.a.a(aug_12, n, ava_12);
        this.a.a(azf_2.o);
    }
}

