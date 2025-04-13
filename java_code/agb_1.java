/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.EventLoopGroup
 *  io.netty.util.concurrent.Future
 */
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.EventLoopGroup;
import io.netty.util.concurrent.Future;

/*
 * Renamed from aGb
 */
class agb_1
implements ChannelFutureListener {
    private final EventLoopGroup a;

    agb_1(EventLoopGroup eventLoopGroup) {
        this.a = eventLoopGroup;
    }

    public void a(ChannelFuture channelFuture) {
        this.a.shutdownGracefully();
    }

    public String toString() {
        return "ShutdownListener{m_group=" + this.a + "}";
    }

    public /* synthetic */ void operationComplete(Future future) {
        this.a((ChannelFuture)future);
    }
}

