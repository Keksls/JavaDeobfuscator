/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvM
 */
public class cvm_1
extends ps_0 {
    private fhy a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = fhy.a(byteBuffer.get());
        return true;
    }

    @Override
    public int a() {
        return 13011;
    }

    public fhy b() {
        return this.a;
    }
}

