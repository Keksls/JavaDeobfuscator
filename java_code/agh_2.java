/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.nio.ByteBuffer;

/*
 * Renamed from aGh
 */
final class agh_2
extends agf_2 {
    @Override
    public ByteBuffer a(ByteBuf byteBuf) {
        int n = byteBuf.readShort() & 0xFFFF;
        short s2 = byteBuf.readShort();
        byte[] byArray = new byte[n - 4];
        byteBuf.readBytes(byArray);
        ByteBuffer byteBuffer = ByteBuffer.allocate(n);
        byteBuffer.putShort((short)n);
        byteBuffer.putShort(s2);
        byteBuffer.put(byArray);
        byteBuffer.rewind();
        return byteBuffer;
    }
}

