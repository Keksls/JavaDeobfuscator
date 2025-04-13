/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cro
 */
public class cro_0
extends ps_0 {
    private int a;
    private int b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getInt();
        return true;
    }

    @Override
    public int a() {
        return 12702;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }
}

