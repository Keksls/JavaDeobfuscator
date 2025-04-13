/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelOption
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioSocketChannel
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 *  javax.inject.Inject
 *  javax.inject.Provider
 *  org.apache.log4j.Logger
 */
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Provider;
import org.apache.log4j.Logger;

/*
 * Renamed from cCW
 */
public final class ccw_0
implements cco_0 {
    private static final String b = "127.0.0.1";
    public static final int a = 20;
    private final AtomicBoolean c = new AtomicBoolean();
    final ScheduledExecutorService d;
    private final azs_0 e;
    final Provider<List<ChannelHandler>> f;
    private Bootstrap g;
    final Logger h = Logger.getLogger(ccw_0.class);

    @Inject
    public ccw_0(azs_0 azs_02, Provider<List<ChannelHandler>> provider) {
        this.f = provider;
        this.d = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors(), new ThreadFactoryBuilder().setNameFormat("Updater-Com-%d").build());
        this.e = azs_02;
    }

    private Bootstrap c() {
        return (Bootstrap)((Bootstrap)((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)new NioEventLoopGroup())).channel(NioSocketChannel.class)).option(ChannelOption.TCP_NODELAY, (Object)true)).option(ChannelOption.SO_KEEPALIVE, (Object)true)).handler((ChannelHandler)new ccx_0(this));
    }

    @Override
    public void a() {
        if (!this.e()) {
            return;
        }
        try {
            this.g = this.c();
        }
        catch (Exception exception) {
            this.h.error((Object)"Unable to configure bootstrap to communicate with updater: ", (Throwable)exception);
            return;
        }
        this.d();
    }

    void d() {
        if (!this.e()) {
            return;
        }
        int n = this.e.a("UPDATER_COMMUNICATION_PORT", 0);
        this.h.info((Object)("Trying to establish connection to updater communication service on port " + n));
        ChannelFuture channelFuture = this.g.connect(b, n);
        channelFuture.addListener((GenericFutureListener)new ccy_0(this));
    }

    private boolean e() {
        if (this.c.get()) {
            return false;
        }
        if (this.e.a("UPDATER_COMMUNICATION_PORT", 0) == 0) {
            this.h.warn((Object)"Updater communication service is not currently configured: Service is unactivated.");
            return false;
        }
        return true;
    }

    @Override
    public void b() {
        this.c.set(true);
        if (this.g == null) {
            return;
        }
        Future future = this.g.group().shutdownGracefully();
        try {
            future.sync();
        }
        catch (InterruptedException interruptedException) {
            this.h.error((Object)"Exception during shutting down gracefully", (Throwable)interruptedException);
        }
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }

    ChannelHandler f() {
        return new ccz_0(this);
    }
}

