/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cBw
 */
public final class cbw_0
extends Pw {
    private String a;

    @Override
    public byte[] b() {
        byte[] byArray = Cz.a(this.a);
        int n = 1 + byArray.length;
        ByteBuffer byteBuffer = ByteBuffer.allocate(n);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        return this.a((byte)2, byteBuffer.array());
    }

    @Override
    public int a() {
        return 23765;
    }

    public void a(String string) {
        this.a = string;
    }

    @Override
    public String toString() {
        return "WhoisRequestMessage{m_characterName='" + this.a + "'}";
    }
}

