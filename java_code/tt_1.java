/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tt
 */
public class tt_1
extends go_1
implements gs_0 {
    public short c = 0;
    public short d = 0;
    private final fo_1 f = new tu_1(this);
    public static final int e = 4;

    @Override
    public fo_1 a() {
        return this.f;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.c);
        byteBuffer.putShort(this.d);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getShort();
        return true;
    }

    @Override
    public void c() {
        this.c = 0;
        this.d = 0;
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
        stringBuilder.append(string).append("sightRadius=").append(this.c).append('\n');
        stringBuilder.append(string).append("aggroRadius=").append(this.d).append('\n');
    }
}

