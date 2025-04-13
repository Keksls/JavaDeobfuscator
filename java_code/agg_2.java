/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.nio.ByteBuffer;

/*
 * Renamed from aGg
 */
final class agg_2
extends agf_2 {
    @Override
    public ByteBuffer a(ByteBuf byteBuf) {
        int n = byteBuf.readShort() & 0xFFFF;
        byte[] byArray = new byte[n - 2];
        byteBuf.readBytes(byArray);
        ByteBuffer byteBuffer = ByteBuffer.allocate(n);
        byteBuffer.putShort((short)n);
        byteBuffer.put(byArray);
        byteBuffer.rewind();
        return byteBuffer;
    }
}

