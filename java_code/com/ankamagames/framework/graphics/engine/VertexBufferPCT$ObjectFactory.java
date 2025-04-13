/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine;

import com.ankamagames.framework.graphics.engine.VertexBufferPCT;

public final class VertexBufferPCT$ObjectFactory
extends abi_1<VertexBufferPCT> {
    public VertexBufferPCT$ObjectFactory() {
        super(VertexBufferPCT.class);
    }

    public VertexBufferPCT a() {
        return new VertexBufferPCT();
    }

    public VertexBufferPCT a(int n) {
        VertexBufferPCT vertexBufferPCT = (VertexBufferPCT)this.c();
        vertexBufferPCT.b(n);
        return vertexBufferPCT;
    }

    public VertexBufferPCT b(int n) {
        VertexBufferPCT vertexBufferPCT = (VertexBufferPCT)this.d();
        vertexBufferPCT.b(n);
        vertexBufferPCT.p();
        return vertexBufferPCT;
    }

    @Override
    public /* synthetic */ abh_1 b() {
        return this.a();
    }
}

