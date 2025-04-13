/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from czJ
 */
public class czj_2
extends Pw {
    private final String a;

    public czj_2(String string) {
        this.a = string;
    }

    @Override
    public byte[] b() {
        byte[] byArray = Cz.a(this.a);
        ByteBuffer byteBuffer = ByteBuffer.allocate(1 + byArray.length);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int a() {
        return 14884;
    }
}

