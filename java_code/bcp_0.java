/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelOption
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioSocketChannel
 *  io.netty.handler.logging.LogLevel
 *  io.netty.handler.logging.LoggingHandler
 *  io.netty.util.concurrent.DefaultThreadFactory
 *  org.apache.log4j.Logger
 */
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.util.concurrent.DefaultThreadFactory;
import java.util.concurrent.ThreadFactory;
import org.apache.log4j.Logger;

/*
 * Renamed from bcp
 */
public class bcp_0 {
    private static final Logger c = Logger.getLogger(bcp_0.class);
    public static final String a = "inter-chat";
    private static final int d = 1000;
    private static final int e = 4000;
    private static final int f = 120000;
    public static final int b = 2;
    private final String g;
    private final int h;
    private final ChannelHandler i;

    public bcp_0(ChannelHandler channelHandler, String string, int n) {
        this.g = string;
        this.h = n;
        this.i = channelHandler;
    }

    public boolean a(bcq_0 bcq_02) {
        NioEventLoopGroup nioEventLoopGroup = new NioEventLoopGroup(2, (ThreadFactory)new DefaultThreadFactory(a));
        Bootstrap bootstrap = new Bootstrap();
        ((Bootstrap)((Bootstrap)((Bootstrap)((Bootstrap)bootstrap.group((EventLoopGroup)nioEventLoopGroup)).remoteAddress(this.g, this.h).channel(NioSocketChannel.class)).option(ChannelOption.SO_KEEPALIVE, (Object)true)).handler((ChannelHandler)new LoggingHandler(LogLevel.INFO))).handler(this.i);
        bcs_0 bcs_02 = new bcs_0(bootstrap);
        bcq_02.a(bcs_02);
        bct_0 bct_02 = new bct_0(bootstrap, bcs_02);
        bct_02.a();
        return true;
    }

    public static int a() {
        return Hw.b(1000, 4000);
    }

    public static int a(int n) {
        return Math.min(n * 2, 120000);
    }
}

