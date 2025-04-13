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
 * Renamed from aGd
 */
class agd_2
implements ChannelFutureListener {
    private final EventLoopGroup a;
    private final EventLoopGroup b;

    agd_2(EventLoopGroup eventLoopGroup, EventLoopGroup eventLoopGroup2) {
        this.a = eventLoopGroup;
        this.b = eventLoopGroup2;
    }

    public void a(ChannelFuture channelFuture) {
        this.a.shutdownGracefully();
        this.b.shutdownGracefully();
    }

    public String toString() {
        return "ShutdownListener{m_bossGroup=" + this.a + ", m_workerGroup=" + this.b + "}";
    }

    public /* synthetic */ void operationComplete(Future future) {
        this.a((ChannelFuture)future);
    }
}

