/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xm
 */
public class xm_2
extends oq_0
implements gs_0 {
    public static final byte a = 6;
    public static final int b = 0;

    @Override
    public byte a() {
        return 6;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        return true;
    }

    @Override
    public void c() {
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        return 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    @Override
    public final void a(StringBuilder stringBuilder, String string) {
    }
}

