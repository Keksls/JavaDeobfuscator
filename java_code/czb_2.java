/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from czb
 */
public class czb_2
extends ps_0 {
    private int a;

    @Override
    public boolean a(byte[] byArray) {
        if (byArray.length != 4) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        return true;
    }

    @Override
    public int a() {
        return 12396;
    }

    public int b() {
        return this.a;
    }
}

