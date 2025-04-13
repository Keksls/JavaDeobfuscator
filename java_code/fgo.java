/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;

public class fgo
implements emy_0 {
    @NotNull
    private wu_0 a = wt_0.c;

    public boolean a() {
        return this.a.d(wc_0.p().a());
    }

    public void a(faX faX2) {
        if (faX2.w() != null && faX2.x() != null) {
            this.a = new wt_0(faX2.w()).a(faX2.x());
            return;
        }
        this.a = wt_0.c;
    }

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        long l2 = byteBuffer.getLong();
        this.a = wt_0.b(l2);
    }

    @Override
    public byte[] d() {
        abx_2 abx_22 = new abx_2(8);
        abx_22.a(this.a.h());
        return abx_22.c();
    }

    @Override
    public end_0 e() {
        return end_0.p;
    }
}

