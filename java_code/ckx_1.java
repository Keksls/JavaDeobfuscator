/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageLite
 */
import com.google.protobuf.MessageLite;

/*
 * Renamed from ckx
 */
public class ckx_1
extends Pw {
    private byte a;
    private short b;
    private MessageLite c;

    public ckx_1(byte by, short s2, MessageLite messageLite) {
        this.a = by;
        this.b = s2;
        this.c = messageLite;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.b(this.c.toByteArray());
        return this.a(this.a, abx_22.c());
    }

    public void a(byte by) {
        this.a = by;
    }

    public void a(short s2) {
        this.b = s2;
    }

    public void a(MessageLite messageLite) {
        this.c = messageLite;
    }

    @Override
    public int a() {
        return this.b;
    }
}

