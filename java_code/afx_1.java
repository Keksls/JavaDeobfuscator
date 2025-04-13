/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelOption
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioSocketChannel
 *  io.netty.util.concurrent.GenericFutureListener
 */
import io.netty.bootstrap.Bootstrap;
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
 * Renamed from aFX
 */
public final class afx_1 {
    private static final int a = 0;
    private static final int b = 1;
    private final String c;
    private final int d;

    public afx_1(String string, int n) {
        this.c = string;
        this.d = n;
    }

    public boolean a(boolean bl, boolean bl2) {
        NioEventLoopGroup nioEventLoopGroup = new NioEventLoopGroup(0, (ThreadFactory)new afy_1(this.c, this.d));
        Bootstrap bootstrap = new Bootstrap();
        ((Bootstrap)((Bootstrap)((Bootstrap)bootstrap.group((EventLoopGroup)nioEventLoopGroup)).remoteAddress(this.c, this.d).channel(NioSocketChannel.class)).option(ChannelOption.SO_KEEPALIVE, (Object)true)).handler((ChannelHandler)Gy.a().a(afs_1.class));
        Object object = bl2 ? new afz_1(bootstrap) : new agb_1((EventLoopGroup)nioEventLoopGroup);
        return bl ? afx_1.a(bootstrap, object) : afx_1.b(bootstrap, object);
    }

    private static boolean a(Bootstrap bootstrap, ChannelFutureListener channelFutureListener) {
        ChannelFuture channelFuture = bootstrap.connect();
        channelFuture.await(1L, TimeUnit.SECONDS);
        if (!channelFuture.isSuccess()) {
            bootstrap.group().shutdownGracefully();
            return false;
        }
        channelFuture.channel().closeFuture().addListener((GenericFutureListener)channelFutureListener);
        return true;
    }

    static boolean b(Bootstrap bootstrap, ChannelFutureListener channelFutureListener) {
        aga_1 aga_12 = new aga_1(bootstrap, channelFutureListener);
        aga_12.a();
        return true;
    }

    public String toString() {
        return "ProtobufConnection{, m_host='" + this.c + "', m_port=" + this.d + "}";
    }
}

