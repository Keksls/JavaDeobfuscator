/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class fcf
extends fco_0 {
    private final String j;
    private short k = 0;
    private boolean l = false;

    public fcf(long l, String string, String string2, short s2, short s3, byte by, boolean bl, long l2, String string3, int n, float f2, eb eb2) {
        super(l, string, s3, by, l2, string3, n, f2, eb2);
        this.j = string2;
        this.k = s2;
        this.l = bl;
    }

    public String b() {
        return this.j;
    }

    public short c() {
        return this.k;
    }

    public void a(short s2) {
        this.k = s2;
    }

    public void a(boolean bl) {
        this.l = bl;
    }

    public boolean d() {
        return this.l;
    }

    public String toString() {
        return "{Candidate " + this.a + " " + this.b + "}";
    }

    public void a(ByteBuffer byteBuffer) {
        this.a(byteBuffer, false);
    }

    public void b(ByteBuffer byteBuffer) {
        this.a(byteBuffer, true);
    }

    public void a(ByteBuffer byteBuffer, boolean bl) {
        byteBuffer.putLong(this.a);
        byte[] byArray = Cz.a(this.b);
        byteBuffer.putShort((short)byArray.length);
        byteBuffer.put(byArray);
        byte[] byArray2 = Cz.a(this.j);
        byteBuffer.putShort((short)byArray2.length);
        byteBuffer.put(byArray2);
        byteBuffer.putShort(bl ? this.k : (short)0);
        byteBuffer.putShort(this.c);
        byteBuffer.put(this.d);
        byteBuffer.put((byte)(this.l ? 1 : 0));
        byteBuffer.putLong(this.e);
        byte[] byArray3 = Cz.a(this.j());
        byteBuffer.putShort((short)byArray3.length);
        byteBuffer.put(byArray3);
        byteBuffer.putInt(this.h);
        byteBuffer.putFloat(this.i);
        byte[] byArray4 = this.g.toByteArray();
        byteBuffer.putShort((short)byArray4.length);
        byteBuffer.put(byArray4);
    }

    public static fcf c(ByteBuffer byteBuffer) {
        long l = byteBuffer.getLong();
        byte[] byArray = new byte[byteBuffer.getShort()];
        byteBuffer.get(byArray);
        byte[] byArray2 = new byte[byteBuffer.getShort()];
        byteBuffer.get(byArray2);
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        byte by = byteBuffer.get();
        boolean bl = byteBuffer.get() == 1;
        long l2 = byteBuffer.getLong();
        byte[] byArray3 = new byte[byteBuffer.getShort()];
        byteBuffer.get(byArray3);
        int n = byteBuffer.getInt();
        float f2 = byteBuffer.getFloat();
        byte[] byArray4 = new byte[byteBuffer.getShort()];
        byteBuffer.get(byArray4);
        eb eb2 = fcf.a(byArray4);
        return new fcf(l, Cz.a(byArray), Cz.a(byArray2), s2, s3, by, bl, l2, Cz.a(byArray3), n, f2, eb2);
    }

    public int e() {
        byte[] byArray = Cz.a(this.b());
        byte[] byArray2 = Cz.a(this.f());
        byte[] byArray3 = Cz.a(this.j());
        return 10 + byArray2.length + 2 + byArray.length + 2 + byArray3.length + 8 + 2 + 2 + 1 + 1 + 4 + 4 + 2 + this.g.getSerializedSize();
    }
}

