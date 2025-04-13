/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  io.netty.bootstrap.ServerBootstrap
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelOption
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioServerSocketChannel
 *  io.netty.handler.logging.LogLevel
 *  io.netty.handler.logging.LoggingHandler
 *  io.netty.util.concurrent.GenericFutureListener
 */
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.util.concurrent.GenericFutureListener;
import java.util.concurrent.ThreadFactory;

/*
 * Renamed from aGc
 */
public class agc_2 {
    private static final int a = 0;
    private static final int b = 1024;
    private final int c;
    private final afr_1 d;

    public agc_2(afr_1 afr_12, int n) {
        this.c = n;
        this.d = afr_12;
    }

    public void a() {
        ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("Net-Listen-Boss-" + this.c + ">%d").build();
        NioEventLoopGroup nioEventLoopGroup = new NioEventLoopGroup(0, threadFactory);
        ThreadFactory threadFactory2 = new ThreadFactoryBuilder().setNameFormat("Net-Listen-Worker-" + this.c + ">%d").build();
        NioEventLoopGroup nioEventLoopGroup2 = new NioEventLoopGroup(0, threadFactory2);
        ServerBootstrap serverBootstrap = new ServerBootstrap();
        ((ServerBootstrap)((ServerBootstrap)serverBootstrap.group((EventLoopGroup)nioEventLoopGroup, (EventLoopGroup)nioEventLoopGroup2).channel(NioServerSocketChannel.class)).handler((ChannelHandler)new LoggingHandler(LogLevel.INFO))).childHandler((ChannelHandler)this.d).option(ChannelOption.SO_BACKLOG, (Object)1024);
        ChannelFuture channelFuture = serverBootstrap.bind(this.c).sync().channel().closeFuture();
        channelFuture.addListener((GenericFutureListener)new agd_2((EventLoopGroup)nioEventLoopGroup, (EventLoopGroup)nioEventLoopGroup2));
    }

    public String toString() {
        return "TelnetServer{m_port=" + this.c + "}";
    }
}

