/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 */
import com.google.common.base.Charsets;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class emT {
    public static final Comparator<emn_0> a = new emU();
    public static final Comparator<emW> b = new emV();

    private emT() {
    }

    public static emS a(Optional<emn_0> optional, int n) {
        Optional optional2 = optional.isPresent() ? optional.get().a(n) : Optional.empty();
        return optional2.isPresent() ? ((emW)optional2.get()).b() : emS.a;
    }

    public static byte[] a(emn_0 emn_02) {
        ByteBuf byteBuf = Unpooled.buffer();
        byteBuf.writeLong(emn_02.b());
        String string = emn_02.c();
        byte[] byArray = string.getBytes(Charsets.UTF_8);
        byteBuf.writeInt(byArray.length);
        byteBuf.writeBytes(byArray);
        List<emW> list = emn_02.d();
        byteBuf.writeInt(list.size());
        for (emW emW2 : list) {
            byteBuf.writeInt(emW2.a());
            byteBuf.writeInt(emW2.b().a());
        }
        return byteBuf.array();
    }

    public static emn_0 a(byte[] byArray) {
        ByteBuf byteBuf = Unpooled.wrappedBuffer((byte[])byArray);
        long l = byteBuf.readLong();
        byte[] byArray2 = new byte[byteBuf.readInt()];
        byteBuf.readBytes(byArray2);
        String string = new String(byArray2, Charsets.UTF_8);
        emn_0 emn_02 = new emn_0(l, string);
        int n = byteBuf.readInt();
        for (int k = 0; k < n; ++k) {
            emW emW2 = new emW(byteBuf.readInt(), emS.a(byteBuf.readInt()));
            emn_02.a(emW2);
        }
        return emn_02;
    }
}

