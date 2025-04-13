/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageLite
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageDecoder
 */
import com.google.protobuf.MessageLite;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Renamed from Nj
 */
public class nj_1
extends MessageToMessageDecoder<nf_1> {
    private final HashMap<Long, MessageLite> a;

    public nj_1(Map<Long, MessageLite> map) {
        this.a = new HashMap<Long, MessageLite>(map);
    }

    protected void a(ChannelHandlerContext channelHandlerContext, nf_1 nf_12, List<Object> list) {
        MessageLite messageLite = this.a.get(nf_12.c());
        if (messageLite == null) {
            return;
        }
        MessageLite messageLite2 = messageLite.newBuilderForType().mergeFrom(nf_12.e()).build();
        list.add(messageLite2);
    }

    protected /* synthetic */ void decode(ChannelHandlerContext channelHandlerContext, Object object, List list) {
        this.a(channelHandlerContext, (nf_1)object, list);
    }
}

