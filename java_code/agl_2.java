/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandler$Sharable
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInboundHandlerAdapter
 *  org.apache.log4j.Logger
 */
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.apache.log4j.Logger;

/*
 * Renamed from aGl
 */
@ChannelHandler.Sharable
public class agl_2
extends ChannelInboundHandlerAdapter {
    private static final Logger a = Logger.getLogger(agl_2.class);

    private static String a(ChannelHandlerContext channelHandlerContext, String string) {
        String string2 = channelHandlerContext.channel().toString();
        return string2 + " " + string;
    }

    public void channelActive(ChannelHandlerContext channelHandlerContext) {
        a.info((Object)agl_2.a(channelHandlerContext, "Channel active"));
        channelHandlerContext.fireChannelActive();
    }

    public void channelInactive(ChannelHandlerContext channelHandlerContext) {
        a.info((Object)agl_2.a(channelHandlerContext, "Channel inActive"));
        channelHandlerContext.fireChannelInactive();
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) {
        a.error((Object)agl_2.a(channelHandlerContext, "Channel exception caught : " + throwable.getMessage()));
    }
}

