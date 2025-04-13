/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class eEw
extends eaa_0
implements fbh_0 {
    private final int h;
    private final short i;
    private final eEH j;

    public eEw(long l, String string, short s2, byte by, long l2, String string2, eb eb2, int n, short s3, eEH eEH2) {
        super(l, string, s2, by, l2, string2, eb2);
        this.h = n;
        this.i = s3;
        this.j = eEH2;
    }

    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.a);
        byte[] byArray = Cz.a(this.b);
        byteBuffer.putShort((short)byArray.length);
        byteBuffer.put(byArray);
        byteBuffer.putShort(this.c);
        byteBuffer.put(this.d);
        byteBuffer.putLong(this.e);
        byte[] byArray2 = Cz.a(this.f);
        byteBuffer.putShort((short)byArray2.length);
        byteBuffer.put(byArray2);
        byte[] byArray3 = this.g.toByteArray();
        byteBuffer.putShort((short)byArray3.length);
        byteBuffer.put(byArray3);
        byteBuffer.putInt(this.h);
        byteBuffer.putShort(this.i);
        byteBuffer.putInt(this.j.ordinal());
    }

    public static eEw b(ByteBuffer byteBuffer) {
        long l = byteBuffer.getLong();
        byte[] byArray = new byte[byteBuffer.getShort()];
        byteBuffer.get(byArray);
        short s2 = byteBuffer.getShort();
        byte by = byteBuffer.get();
        long l2 = byteBuffer.getLong();
        byte[] byArray2 = new byte[byteBuffer.getShort()];
        byteBuffer.get(byArray2);
        byte[] byArray3 = new byte[byteBuffer.getShort()];
        byteBuffer.get(byArray3);
        eb eb2 = eEw.a(byArray3);
        int n = byteBuffer.getInt();
        short s3 = byteBuffer.getShort();
        eEH eEH2 = eEH.values()[byteBuffer.getInt()];
        return new eEw(l, Cz.a(byArray), s2, by, l2, Cz.a(byArray2), eb2, n, s3, eEH2);
    }

    public int b() {
        byte[] byArray = Cz.a(this.b);
        byte[] byArray2 = Cz.a(this.f);
        return 10 + byArray.length + 2 + 1 + 8 + 2 + byArray2.length + 2 + this.g.getSerializedSize() + 4 + 2 + 4;
    }

    @Override
    public int c() {
        return this.h;
    }

    public short d() {
        return this.i;
    }

    public eEH e() {
        return this.j;
    }
}

