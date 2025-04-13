/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class csE
extends ps_0 {
    private int a;
    private eEA b;

    @Override
    public boolean a(byte ... byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        this.b = eEA.values()[byteBuffer.getInt()];
        return true;
    }

    public int b() {
        return this.a;
    }

    public eEA c() {
        return this.b;
    }

    @Override
    public int a() {
        return 12297;
    }
}

