/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctl
 */
public class ctl_2
extends ps_0 {
    private byte a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get();
        return true;
    }

    @Override
    public int a() {
        return 13869;
    }

    public byte b() {
        return this.a;
    }
}

