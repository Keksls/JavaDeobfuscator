/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctQ
 */
public class ctq_1
extends csy_2 {
    private int b = -1;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a(byteBuffer);
        this.b = byteBuffer.getInt();
        return true;
    }

    @Override
    public int a() {
        return 12015;
    }

    public int b() {
        return this.b;
    }
}

