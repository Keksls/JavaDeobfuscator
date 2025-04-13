/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class bqM
extends eBh
implements bqK {
    public bqM(euw_1 euw_12) {
        super(euw_12);
    }

    @Override
    public void a(byte[] byArray) {
        this.e.clear();
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.d.b(byteBuffer.getLong());
        int n = byteBuffer.getShort();
        for (int k = 0; k < n; ++k) {
            this.e.put(byteBuffer.getInt(), byteBuffer.getInt());
        }
    }
}

