/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class csF
extends ps_0 {
    private int a;

    @Override
    public boolean a(byte ... byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        return true;
    }

    public int b() {
        return this.a;
    }

    @Override
    public int a() {
        return 12393;
    }
}

