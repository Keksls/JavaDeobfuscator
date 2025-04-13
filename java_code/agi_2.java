/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.nio.ByteBuffer;

/*
 * Renamed from aGi
 */
final class agi_2
extends agf_2 {
    @Override
    public ByteBuffer a(ByteBuf byteBuf) {
        int n = byteBuf.readInt() & Integer.MAX_VALUE;
        short s2 = byteBuf.readShort();
        byte[] byArray = new byte[n - 6];
        byteBuf.readBytes(byArray);
        ByteBuffer byteBuffer = ByteBuffer.allocate(n);
        byteBuffer.putInt(n);
        byteBuffer.putShort(s2);
        byteBuffer.put(byArray);
        byteBuffer.rewind();
        return byteBuffer;
    }
}

