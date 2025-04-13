/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public abstract class fcb<R extends gs_0>
extends fbu_0 {
    @Override
    public final void a(ByteBuffer byteBuffer) {
        R r2 = this.c();
        this.a(r2);
        r2.a(byteBuffer);
    }

    @Override
    public final void a(ByteBuffer byteBuffer, int n) {
        R r2 = this.c();
        r2.a(byteBuffer, n);
        this.b(r2);
    }

    @Override
    public final int bg_() {
        R r2 = this.c();
        this.a(r2);
        return r2.b();
    }

    protected abstract R c();

    protected abstract void a(R var1);

    protected abstract void b(R var1);
}

