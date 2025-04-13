/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sE
 */
public class se_2
extends go_1
implements gs_0 {
    public boolean c = false;
    public boolean d = false;
    private final fo_1 f = new sf_1(this);
    public static final int e = 2;

    @Override
    public fo_1 a() {
        return this.f;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.c ? (byte)1 : 0);
        byteBuffer.put(this.d ? (byte)1 : 0);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.c = byteBuffer.get() == 1;
        this.d = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public void c() {
        this.c = false;
        this.d = false;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        return 2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("afkState=").append(this.c).append('\n');
        stringBuilder.append(string).append("dndState=").append(this.d).append('\n');
    }
}

