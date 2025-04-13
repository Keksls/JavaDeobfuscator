/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.util.concurrent.Future
 *  org.apache.log4j.Logger
 */
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.log4j.Logger;

/*
 * Renamed from bcs
 */
public class bcs_0
implements ChannelFutureListener {
    private static final Logger a = Logger.getLogger(bcs_0.class);
    private final Bootstrap b;
    private int c;
    private final AtomicBoolean d = new AtomicBoolean(false);
    private bct_0 e;

    public bcs_0(Bootstrap bootstrap) {
        this.b = bootstrap;
        this.c = bcp_0.a();
    }

    public void a() {
        this.d.set(true);
    }

    public void a(bct_0 bct_02) {
        this.e = bct_02;
    }

    public void b() {
        this.c = bcp_0.a();
    }

    public void a(ChannelFuture channelFuture) {
        if (this.d.get()) {
            this.b.config().group().shutdownGracefully();
            a.info((Object)"[CHAT] Connection closed");
        } else {
            a.warn((Object)String.format("[CHAT] Connection lost, reconnection in %dms", this.c));
            TimeUnit.NANOSECONDS.sleep(TimeUnit.MILLISECONDS.toNanos(this.c));
            this.c = bcp_0.a(this.c);
            this.e.a();
        }
    }

    public /* synthetic */ void operationComplete(Future future) {
        this.a((ChannelFuture)future);
    }
}

