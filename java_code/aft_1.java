/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.bootstrap.BootstrapConfig
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelOption
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioSocketChannel
 *  io.netty.util.concurrent.GenericFutureListener
 */
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.bootstrap.Bootstrap;
import io.netty.bootstrap.BootstrapConfig;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.concurrent.GenericFutureListener;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from aFT
 */
public final class aft_1 {
    private static final int a = 5;
    private final String b;
    private final int c;
    private final afr_1 d;
    private int e;

    public aft_1(afr_1 afr_12, String string, int n) {
        this.b = string;
        this.c = n;
        this.d = afr_12;
    }

    public boolean a(boolean bl, boolean bl2) {
        ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("Net-Cnx-" + this.b + ":" + this.c + ">%d").build();
        NioEventLoopGroup nioEventLoopGroup = new NioEventLoopGroup(this.e, threadFactory);
        Bootstrap bootstrap = new Bootstrap();
        ((Bootstrap)((Bootstrap)((Bootstrap)bootstrap.group((EventLoopGroup)nioEventLoopGroup)).remoteAddress(this.b, this.c).channel(NioSocketChannel.class)).option(ChannelOption.SO_KEEPALIVE, (Object)true)).handler((ChannelHandler)this.d);
        Object object = bl2 ? new afu_1(bootstrap) : new afw_1((EventLoopGroup)nioEventLoopGroup);
        return bl ? aft_1.a(bootstrap, object) : aft_1.b(bootstrap, object);
    }

    private static boolean a(Bootstrap bootstrap, ChannelFutureListener channelFutureListener) {
        ChannelFuture channelFuture = bootstrap.connect();
        channelFuture.await(5L, TimeUnit.SECONDS);
        if (!channelFuture.isSuccess()) {
            BootstrapConfig bootstrapConfig = bootstrap.config();
            EventLoopGroup eventLoopGroup = bootstrapConfig.group();
            eventLoopGroup.shutdownGracefully();
            return false;
        }
        channelFuture.channel().closeFuture().addListener((GenericFutureListener)channelFutureListener);
        return true;
    }

    static boolean b(Bootstrap bootstrap, ChannelFutureListener channelFutureListener) {
        afv_1 afv_12 = new afv_1(bootstrap, channelFutureListener);
        afv_12.a();
        return true;
    }

    public void a(int n) {
        this.e = n;
    }

    public String toString() {
        return "ClientConnection{, m_host='" + this.b + "', m_port=" + this.c + "}";
    }
}

