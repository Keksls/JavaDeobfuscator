/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class eQh {
    private final eQf a;

    public eQh(eQf eQf2) {
        this.a = eQf2;
    }

    public void a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a.a(byteBuffer.getLong());
    }

    public byte[] a() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a.a());
        return abx_22.c();
    }
}

