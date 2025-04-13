/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rV
 */
public class rv_1
extends go_1
implements gs_0 {
    public boolean c = false;
    public int d = 0;
    public int e = 0;
    public short f = 0;
    public long g = 0L;
    private final fo_1 i = new rw_1(this);
    public static final int h = 19;

    @Override
    public fo_1 a() {
        return this.i;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.c ? (byte)1 : 0);
        byteBuffer.putInt(this.d);
        byteBuffer.putInt(this.e);
        byteBuffer.putShort(this.f);
        byteBuffer.putLong(this.g);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.c = byteBuffer.get() == 1;
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getInt();
        this.f = byteBuffer.getShort();
        this.g = byteBuffer.getLong();
        return true;
    }

    @Override
    public void c() {
        this.c = false;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0L;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        return 19;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("valid=").append(this.c).append('\n');
        stringBuilder.append(string).append("x=").append(this.d).append('\n');
        stringBuilder.append(string).append("y=").append(this.e).append('\n');
        stringBuilder.append(string).append("z=").append(this.f).append('\n');
        stringBuilder.append(string).append("instanceId=").append(this.g).append('\n');
    }
}

