/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from PN
 */
public class pn_0
extends PO {
    private int a;

    @Override
    public boolean a(byte[] byArray) {
        if (byArray.length == 0) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        return this.a(byArray, byteBuffer.position());
    }

    public int b() {
        return this.a;
    }

    @Override
    public int a() {
        return 691;
    }
}

