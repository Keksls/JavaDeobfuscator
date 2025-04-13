/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Qh
 */
public class qh_0
extends PO {
    protected byte a;

    public byte b() {
        return this.a;
    }

    @Override
    public boolean a(byte[] byArray) {
        if (byArray.length == 0) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get();
        return this.a(byArray, byteBuffer.position());
    }

    @Override
    public int a() {
        return 746;
    }
}

