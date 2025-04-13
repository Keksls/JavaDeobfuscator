/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.log4j.Logger
 */
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;

/*
 * Renamed from bct
 */
public class bct_0
implements ChannelFutureListener {
    private static final Logger a = Logger.getLogger(bct_0.class);
    private final Bootstrap b;
    private final bcs_0 c;
    private int d;

    public bct_0(Bootstrap bootstrap, bcs_0 bcs_02) {
        this.b = bootstrap;
        this.c = bcs_02;
        this.c.a(this);
        this.d = bcp_0.a();
    }

    public void a(ChannelFuture channelFuture) {
        if (channelFuture.isSuccess()) {
            this.d = bcp_0.a();
            channelFuture.channel().closeFuture().addListener((GenericFutureListener)this.c);
            return;
        }
        a.warn((Object)String.format("[CHAT] Connection failed, next tentative in %dms", this.d));
        TimeUnit.NANOSECONDS.sleep(TimeUnit.MILLISECONDS.toNanos(this.d));
        this.d = bcp_0.a(this.d);
        this.a();
    }

    public void a() {
        this.b.connect().addListener((GenericFutureListener)this);
    }

    public /* synthetic */ void operationComplete(Future future) {
        this.a((ChannelFuture)future);
    }
}

