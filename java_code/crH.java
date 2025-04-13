/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class crH
extends ps_0 {
    private long a;
    private rx_0 b;
    private rz_0 c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        byte by = byteBuffer.get();
        byte by2 = byteBuffer.get();
        if (by == 0) {
            this.b = erl_2.a(by2);
        } else if (by == 1) {
            this.b = eoz_1.a(by2);
        }
        this.c = rz_0.a(byteBuffer.get());
        return true;
    }

    @Override
    public int a() {
        return 13004;
    }

    public long b() {
        return this.a;
    }

    public rx_0 c() {
        return this.b;
    }

    public rz_0 d() {
        return this.c;
    }
}

