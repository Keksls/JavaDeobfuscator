/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from czi
 */
public class czi_1
extends Pw {
    private eLo a;

    public void a(eLo eLo2) {
        this.a = eLo2;
    }

    @Override
    public byte[] b() {
        eLu eLu2 = new eLu();
        eLu2.a(this.a);
        ByteBuffer byteBuffer = ByteBuffer.allocate(eLu2.g());
        eLu2.a(byteBuffer);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int a() {
        return 1033;
    }
}

