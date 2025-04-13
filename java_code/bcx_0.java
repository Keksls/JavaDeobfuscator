/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageLite
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageEncoder
 */
import com.google.protobuf.MessageLite;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import java.util.List;

/*
 * Renamed from bcx
 */
public class bcx_0
extends MessageToMessageEncoder<MessageLite> {
    protected void a(ChannelHandlerContext channelHandlerContext, MessageLite messageLite, List<Object> list) {
        ax_1 ax_12 = av_2.e();
        ax_12.a(am_2.a(messageLite.getDefaultInstanceForType()));
        ax_12.a(messageLite.toByteString());
        ab_2 ab_22 = az_1.g();
        ab_22.a(Math.abs(Long.valueOf(abd_1.c()).intValue()));
        ab_22.a(ax_12);
        at_1 at_12 = ar_2.m();
        at_12.a(ab_22);
        bcR bcR2 = new bcR(0);
        bcR2.a(at_12.n().toByteArray());
        list.add(bcR2);
    }

    protected /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, List list) {
        this.a(channelHandlerContext, (MessageLite)object, list);
    }
}

