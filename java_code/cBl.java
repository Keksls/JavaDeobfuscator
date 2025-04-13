/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cBl
extends ps_0 {
    private fhD a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = fhD.a(byteBuffer.get());
        return false;
    }

    public fhD b() {
        return this.a;
    }

    @Override
    public int a() {
        return 15619;
    }
}

