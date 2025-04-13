/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.MessageLiteOrBuilder
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageEncoder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Renamed from Nk
 */
public class nk_1
extends MessageToMessageEncoder<MessageLiteOrBuilder> {
    private final HashMap<MessageLite, Long> a = new HashMap();

    public nk_1(Map<Long, MessageLite> map) {
        for (Map.Entry<Long, MessageLite> entry : map.entrySet()) {
            this.a.put(entry.getValue(), entry.getKey());
        }
    }

    protected void a(ChannelHandlerContext channelHandlerContext, MessageLiteOrBuilder messageLiteOrBuilder, List<Object> list) {
        MessageLite messageLite;
        if (!this.a.containsKey(messageLiteOrBuilder.getDefaultInstanceForType())) {
            throw new IllegalStateException("Trying to encode message which is not on defined protos : " + messageLiteOrBuilder);
        }
        if (messageLiteOrBuilder instanceof MessageLite) {
            messageLite = (MessageLite)messageLiteOrBuilder;
        } else if (messageLiteOrBuilder instanceof MessageLite.Builder) {
            messageLite = ((MessageLite.Builder)messageLiteOrBuilder).build();
        } else {
            throw new IllegalStateException("Trying to encode message which is neither MessageLite nor MessageLite.Builder : " + messageLiteOrBuilder);
        }
        byte[] byArray = messageLite.toByteArray();
        nh_1 nh_12 = nf_1.g().a(this.a.get(messageLite.getDefaultInstanceForType())).a(ByteString.copyFrom((byte[])byArray));
        nf_1 nf_12 = nh_12.h();
        list.add(nf_12);
    }

    protected /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, List list) {
        this.a(channelHandlerContext, (MessageLiteOrBuilder)object, list);
    }
}

