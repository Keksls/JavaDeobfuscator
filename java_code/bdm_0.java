/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bDM
 */
class bdm_0
extends fo_1 {
    final /* synthetic */ bDL d;

    bdm_0(bDL bDL2) {
        this.d = bDL2;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("On ne serialize pas ces infos dans le client");
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        zv_1 zv_12 = new zv_1();
        zv_12.b(byteBuffer);
        this.d.u = zv_12.a;
    }
}

