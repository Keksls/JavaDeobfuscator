/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInboundHandlerAdapter
 */
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from cCZ
 */
class ccz_0
extends ChannelInboundHandlerAdapter {
    final /* synthetic */ ccw_0 a;

    ccz_0(ccw_0 ccw_02) {
        this.a = ccw_02;
    }

    public void channelActive(ChannelHandlerContext channelHandlerContext) {
        this.a.h.info((Object)"Connection to updater communication service established.");
        super.channelActive(channelHandlerContext);
    }

    public void channelUnregistered(ChannelHandlerContext channelHandlerContext) {
        this.a.h.info((Object)"Connection lost with updater communication service, scheduling reconnection within 20 seconds");
        this.a.d.schedule(new cDa(this), 20L, TimeUnit.SECONDS);
        super.channelUnregistered(channelHandlerContext);
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) {
        this.a.h.error((Object)"Error caught on channel: ", throwable);
        if (channelHandlerContext.channel().isOpen()) {
            channelHandlerContext.channel().close().sync();
        }
    }
}

