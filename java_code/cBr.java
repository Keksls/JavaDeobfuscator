/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 */
import com.google.common.base.Strings;
import java.nio.ByteBuffer;

public class cBr
extends Pw {
    private long a;
    private String b;
    private long c;
    private String e;

    @Override
    public byte[] b() {
        byte[] byArray = Cz.a(this.b);
        byte[] byArray2 = Cz.a(Strings.nullToEmpty((String)this.e));
        ByteBuffer byteBuffer = ByteBuffer.allocate(10 + byArray.length + 8 + 2 + byArray2.length);
        byteBuffer.putLong(this.a);
        byteBuffer.putShort((short)(byArray.length & 0xFF));
        byteBuffer.put(byArray);
        byteBuffer.putLong(this.c);
        byteBuffer.putShort((short)(byArray2.length & 0xFF));
        byteBuffer.put(byArray2);
        return this.a((byte)2, byteBuffer.array());
    }

    @Override
    public int a() {
        return 23661;
    }

    public void a(long l) {
        this.a = l;
    }

    public void a(String string) {
        this.b = string;
    }

    public void b(String string) {
        this.e = string;
    }

    public void b(long l) {
        this.c = l;
    }
}

