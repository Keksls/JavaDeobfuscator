/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ReplayingDecoder
 */
import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Renamed from aGe
 */
public class age_2
extends ReplayingDecoder<Void> {
    private final agf_2 a;
    private final List<adc_2<?>> b = new ArrayList();

    public age_2(agf_2 agf_22, Collection<adc_2<?>> collection) {
        this.a = agf_22;
        this.b.addAll(collection);
    }

    public boolean a(adc_2<?> adc_22) {
        return this.b.add(adc_22);
    }

    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) {
        ByteBuffer byteBuffer = this.a.a(byteBuf);
        ArrayList arrayList = Lists.newArrayList(this.b);
        adt_1 adt_12 = null;
        for (int k = 0; k < arrayList.size() && adt_12 == null; ++k) {
            adc_2 adc_22 = (adc_2)arrayList.get(k);
            byteBuffer.rewind();
            adt_12 = adc_22.b(byteBuffer);
        }
        if (adt_12 == null) {
            throw new UnsupportedOperationException("Unable to decode message");
        }
        ij_2.c(adt_12.a()).update(byteBuffer.position());
        list.add(adt_12);
    }

    public String toString() {
        return "ServerMessageDecoder{m_decoders=" + this.b.size() + "}";
    }
}

