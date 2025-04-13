/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.util.concurrent.Future
 */
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from aFU
 */
class afu_1
implements ChannelFutureListener {
    private final Bootstrap a;

    afu_1(Bootstrap bootstrap) {
        this.a = bootstrap;
    }

    public void a(ChannelFuture channelFuture) {
        TimeUnit.NANOSECONDS.sleep(TimeUnit.SECONDS.toNanos(5L));
        aft_1.b(this.a, this);
    }

    public String toString() {
        return "ShutdownListener{m_bootstrap=" + this.a + "}";
    }

    public /* synthetic */ void operationComplete(Future future) {
        this.a((ChannelFuture)future);
    }
}

