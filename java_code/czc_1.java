/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from czC
 */
public class czc_1
extends Pw {
    private final String a;

    public czc_1(String string) {
        this.a = string;
    }

    @Override
    public byte[] b() {
        byte[] byArray = Cz.a(this.a);
        ByteBuffer byteBuffer = ByteBuffer.allocate(4 + byArray.length);
        byteBuffer.putInt(byArray.length);
        byteBuffer.put(byArray);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int a() {
        return 15302;
    }
}

