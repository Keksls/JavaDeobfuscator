/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cqW
 */
public class cqw_0
extends ps_0 {
    private long a;
    private ael_2 b;

    @Override
    public boolean a(byte[] byArray) {
        if (byArray.length < 19) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = ael_2.a(byteBuffer);
        return this.b != null;
    }

    @Override
    public int a() {
        return 13506;
    }

    public long b() {
        return this.a;
    }

    public ael_2 c() {
        return this.b;
    }
}

