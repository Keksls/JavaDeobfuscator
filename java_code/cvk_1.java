/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvk
 */
public class cvk_1
extends ps_0 {
    private exk_2 a;
    private long b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte[] byArray2 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray2);
        this.a = new exk_2();
        this.a.a(ByteBuffer.wrap(byArray2));
        this.b = byteBuffer.getLong();
        return true;
    }

    @Override
    public int a() {
        return 12433;
    }

    public exk_2 b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }
}

