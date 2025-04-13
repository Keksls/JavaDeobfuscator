/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelPipeline
 *  io.netty.channel.socket.SocketChannel
 *  io.netty.handler.codec.LengthFieldBasedFrameDecoder
 *  io.netty.handler.ssl.SslContext
 *  io.netty.handler.ssl.SslContextBuilder
 *  io.netty.handler.ssl.SslHandler
 *  io.netty.handler.timeout.IdleStateHandler
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.SslHandler;
import io.netty.handler.timeout.IdleStateHandler;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bcr
 */
public class bcr_0
extends ChannelInitializer<SocketChannel> {
    private static final Logger f = Logger.getLogger(bcr_0.class);
    private static final int g = 4;
    private static final int h = 0x100000;
    private static final int i = 30;
    public static final String a = "SpinDecoder";
    public static final String b = "AuthenticationHandler";
    public static final String c = "ProtobufDecoder";
    public static final String d = "InterChatMessageDecoder";
    public static final String e = "InterChatAvailabilityHandler";
    private final bcq_0 j;
    private final String k;

    public bcr_0(bcq_0 bcq_02, @NotNull String string) {
        this.j = bcq_02;
        this.k = string;
    }

    protected void a(SocketChannel socketChannel) {
        ChannelPipeline channelPipeline = socketChannel.pipeline();
        SslHandler sslHandler = this.a().newHandler(socketChannel.alloc());
        channelPipeline.addLast(new ChannelHandler[]{sslHandler});
        channelPipeline.addLast(new ChannelHandler[]{new bcA()});
        channelPipeline.addLast(new ChannelHandler[]{new LengthFieldBasedFrameDecoder(0x100000, 0, 4, -4, 4)});
        channelPipeline.addLast(a, (ChannelHandler)new bcv_0());
        channelPipeline.addLast(new ChannelHandler[]{new bcy_0()});
        channelPipeline.addLast(new ChannelHandler[]{new bcx_0()});
        channelPipeline.addLast(new ChannelHandler[]{new bcw_0()});
        channelPipeline.addLast(new ChannelHandler[]{new IdleStateHandler(0, 30, 0)});
        channelPipeline.addLast(new ChannelHandler[]{new bcC()});
        channelPipeline.addLast(e, (ChannelHandler)new bcB());
        channelPipeline.addLast(b, (ChannelHandler)new bcz_0(this.j));
        channelPipeline.addLast(new ChannelHandler[]{new bcD()});
        channelPipeline.addLast(new ChannelHandler[]{new bcL()});
        channelPipeline.addLast(new ChannelHandler[]{new bcJ()});
        channelPipeline.addLast(new ChannelHandler[]{new bcF()});
        channelPipeline.addLast(new ChannelHandler[]{new bcE()});
        channelPipeline.addLast(new ChannelHandler[]{new bcG()});
        channelPipeline.addLast(new ChannelHandler[]{new bcI()});
        channelPipeline.addLast(new ChannelHandler[]{new bcH()});
    }

    private SslContext a() {
        if (afo_1.a(this.k)) {
            return SslContextBuilder.forClient().build();
        }
        f.info((Object)("Insecure SSL context used for host " + this.k));
        return afo_1.b();
    }

    protected /* synthetic */ void initChannel(Channel channel) {
        this.a((SocketChannel)channel);
    }
}

