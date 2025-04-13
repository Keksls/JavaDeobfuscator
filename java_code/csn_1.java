/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csN
 */
public class csn_1
extends ps_0 {
    private int a;
    private boolean b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int a() {
        return 13784;
    }

    public int b() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }
}

