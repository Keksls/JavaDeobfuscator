/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctA
 */
public class cta_2
extends csy_2 {
    private enb_1 b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a(byteBuffer);
        this.b = enb_1.b(byteBuffer);
        return true;
    }

    @Override
    public int a() {
        return 12554;
    }

    public enb_1 b() {
        return this.b;
    }
}

