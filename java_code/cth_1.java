/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctH
 */
public class cth_1
extends csy_2 {
    private int b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a(byteBuffer);
        this.b = byteBuffer.getInt();
        return true;
    }

    @Override
    public int a() {
        return 13609;
    }

    public int b() {
        return this.b;
    }
}

