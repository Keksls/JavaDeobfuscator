/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qE
 */
public class qe_1
extends go_1
implements gs_0 {
    public int c = 0;
    private final fo_1 e = new qf_2(this);
    public static final int d = 4;

    @Override
    public fo_1 a() {
        return this.e;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.c);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.c = byteBuffer.getInt();
        return true;
    }

    @Override
    public void c() {
        this.c = 0;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        return 4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("hp=").append(this.c).append('\n');
    }
}

