/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.util.concurrent.Future
 */
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.util.concurrent.Future;

/*
 * Renamed from cCY
 */
class ccy_0
implements ChannelFutureListener {
    final /* synthetic */ ccw_0 a;

    ccy_0(ccw_0 ccw_02) {
        this.a = ccw_02;
    }

    public void a(ChannelFuture channelFuture) {
        if (channelFuture.cause() != null) {
            this.a.h.error((Object)"Error caught on channel during connect: ", channelFuture.cause());
        }
    }

    public /* synthetic */ void operationComplete(Future future) {
        this.a((ChannelFuture)future);
    }
}

