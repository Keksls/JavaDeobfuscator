/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cno
 */
public class cno_0
extends Pw {
    private String a;

    public void a(String string) {
        this.a = string;
    }

    @Override
    public byte[] b() {
        byte[] byArray = Cz.a(this.a);
        ByteBuffer byteBuffer = ByteBuffer.allocate(2 + byArray.length);
        byteBuffer.putShort((short)byArray.length);
        byteBuffer.put(byArray);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13084;
    }
}

