/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from clf
 */
public class clf_1
extends Pw {
    private final aej_2 a;

    public clf_1(aej_2 aej_22) {
        this.a = aej_22;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(1);
        byteBuffer.put((byte)this.a.l);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13201;
    }
}

