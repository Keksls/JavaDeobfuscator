/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine.entity;

import com.ankamagames.framework.graphics.engine.entity.EntitySprite;

public final class EntitySprite$ObjectFactory
extends abi_1<EntitySprite> {
    public EntitySprite$ObjectFactory() {
        super(EntitySprite.class);
    }

    public EntitySprite a() {
        return new EntitySprite();
    }

    @Override
    public /* synthetic */ abh_1 b() {
        return this.a();
    }
}

