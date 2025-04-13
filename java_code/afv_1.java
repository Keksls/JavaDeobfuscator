/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 */
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from aFV
 */
class afv_1
implements ChannelFutureListener {
    private final Bootstrap a;
    private final ChannelFutureListener b;
    private long c = System.nanoTime();

    afv_1(Bootstrap bootstrap, ChannelFutureListener channelFutureListener) {
        this.a = bootstrap;
        this.b = channelFutureListener;
    }

    public void a(ChannelFuture channelFuture) {
        if (channelFuture.isSuccess()) {
            channelFuture.channel().closeFuture().addListener((GenericFutureListener)this.b);
            return;
        }
        long l = System.nanoTime() - this.c;
        TimeUnit.NANOSECONDS.sleep(TimeUnit.SECONDS.toNanos(5L) - l);
        this.a();
    }

    void a() {
        this.c = System.nanoTime();
        this.a.connect().addListener((GenericFutureListener)this);
    }

    public String toString() {
        return "RetryListener{m_bootStrap=" + this.a + ", m_start=" + this.c + "}";
    }

    public /* synthetic */ void operationComplete(Future future) {
        this.a((ChannelFuture)future);
    }
}

