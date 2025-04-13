/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwv
 */
public class cwv_2
extends ps_0 {
    private boolean a;

    public boolean b() {
        return this.a;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get() != 0;
        return true;
    }

    @Override
    public int a() {
        return 12966;
    }
}

