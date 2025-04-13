/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxT
 */
public class cxt_2
extends ps_0 {
    private long a;
    private String b;
    private short c;
    private byte d;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        byte[] byArray2 = new byte[byteBuffer.get()];
        byteBuffer.get(byArray2);
        this.b = Cz.a(byArray2);
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.get();
        return true;
    }

    public long b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public short d() {
        return this.c;
    }

    public byte e() {
        return this.d;
    }

    @Override
    public int a() {
        return 22799;
    }
}

