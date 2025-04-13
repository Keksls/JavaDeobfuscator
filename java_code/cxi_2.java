/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxI
 */
public class cxi_2
extends ps_0 {
    private boolean a;
    private int b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get() == 1;
        this.b = byteBuffer.getInt();
        return true;
    }

    @Override
    public int a() {
        return 12918;
    }

    public boolean b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }
}

