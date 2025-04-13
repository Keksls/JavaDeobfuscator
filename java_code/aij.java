/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.isometric.highlight.HighLightEntity;

class aij
extends aik {
    static final /* synthetic */ boolean a;

    aij() {
    }

    public boolean a(HighLightEntity highLightEntity) {
        if (!a && this.b == null) {
            throw new AssertionError();
        }
        this.b.c(highLightEntity, true);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((HighLightEntity)object);
    }

    static {
        a = !aii_0.class.desiredAssertionStatus();
    }
}

