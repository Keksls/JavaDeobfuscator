/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public abstract class fcX
extends fbu_0 {
    protected wu_0 c;
    protected wx_0 d;
    protected wx_0 e;
    protected boolean f;
    final /* synthetic */ fcm_0 g;

    public fcX(fcm_0 fcm_02) {
        this.g = fcm_02;
    }

    protected abstract void a();

    @Override
    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.g.g != null ? this.g.g.g() : ww_0.g.g());
        byteBuffer.putLong(this.g.h != null ? this.g.h.g() : ww_0.g.g());
        byteBuffer.putLong(this.g.f != null ? this.g.f.h() : 0L);
        byteBuffer.put(this.g.e ? (byte)1 : 0);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        try {
            this.d = ww_0.a(byteBuffer.getLong());
            this.e = ww_0.a(byteBuffer.getLong());
            this.c = wt_0.b(byteBuffer.getLong());
            this.f = byteBuffer.get() == 1;
            this.a();
        }
        catch (Exception exception) {
            fcm_0.b.error((Object)"Exception during unSerialize NationPoliticHandler", (Throwable)exception);
        }
    }

    @Override
    public int bg_() {
        return 25;
    }
}

