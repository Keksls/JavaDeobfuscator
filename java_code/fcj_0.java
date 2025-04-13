/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from fcJ
 */
public class fcj_0
extends fbu_0 {
    final /* synthetic */ fci_0 a;

    protected fcj_0(fci_0 fci_02) {
        this.a = fci_02;
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.a.c = byteBuffer.getShort();
        this.a.h = byteBuffer.getInt();
        this.a.i = byteBuffer.getInt();
        this.a.g = byteBuffer.getShort();
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.a.c);
        byteBuffer.putInt(this.a.h);
        byteBuffer.putInt(this.a.i);
        byteBuffer.putShort(this.a.g);
    }

    @Override
    public int bg_() {
        return 12;
    }
}

