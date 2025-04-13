/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 */
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public abstract class Pw
extends po_0
implements adp_2 {
    public static final int d = 5;

    public byte[] a(byte by, byte[] byArray) {
        int n = 5 + byArray.length;
        ByteBuf byteBuf = Unpooled.buffer((int)n);
        byteBuf.writeShort(n);
        byteBuf.writeByte((int)by);
        byteBuf.writeShort(this.a());
        byteBuf.writeBytes(byArray);
        return byteBuf.array();
    }
}

