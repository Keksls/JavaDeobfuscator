/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class fcU
extends fbu_0 {
    final /* synthetic */ fcm_0 a;

    fcU(fcm_0 fcm_02) {
        this.a = fcm_02;
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.a.l.a(fcu_0.a);
        if (byteBuffer.get() == 0) {
            return;
        }
        fcq_0 fcq_02 = fcq_0.b(byteBuffer);
        this.a.l.a(fcq_02);
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        fcq_0 fcq_02 = this.a.l.c();
        if (fcq_02 == null) {
            byteBuffer.put((byte)0);
            return;
        }
        byteBuffer.put((byte)1);
        fcq_02.a(byteBuffer);
    }

    @Override
    public int bg_() {
        fcq_0 fcq_02 = this.a.l.c();
        return 1 + (fcq_02 != null ? fcq_02.e() : 0);
    }
}

