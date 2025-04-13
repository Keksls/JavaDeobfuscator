/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelPipeline
 *  io.netty.channel.socket.SocketChannel
 *  io.netty.handler.ssl.SslContext
 */
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.ssl.SslContext;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/*
 * Renamed from aFR
 */
public class afr_1
extends ChannelInitializer<SocketChannel> {
    private static final agl_2 a = new agl_2();
    private static final agk_2 b = new agk_2();
    private static final agj_2 c = new agj_2();
    private final agf_2 d;
    private final Supplier<agm_2> e;
    private final SslContext f;
    private final List<adc_2<?>> g = new ArrayList();

    public afr_1(agf_2 agf_22, Supplier<agm_2> supplier, SslContext sslContext) {
        this.d = agf_22;
        this.e = supplier;
        this.f = sslContext;
    }

    public void a(adc_2<?> adc_22) {
        this.g.add(adc_22);
    }

    public void a(SocketChannel socketChannel) {
        Object object;
        ChannelPipeline channelPipeline = socketChannel.pipeline();
        if (this.f != null) {
            object = this.f.newHandler(socketChannel.alloc());
            channelPipeline.addLast(new ChannelHandler[]{object});
        }
        object = new age_2(this.d, this.g);
        channelPipeline.addLast(new ChannelHandler[]{object});
        channelPipeline.addLast(new ChannelHandler[]{c});
        channelPipeline.addLast(new ChannelHandler[]{b});
        agm_2 agm_22 = this.e.get();
        channelPipeline.addLast(new ChannelHandler[]{a});
        channelPipeline.addLast(new ChannelHandler[]{agm_22});
    }

    public String toString() {
        return "ServerInitializer{m_decoders=" + this.g.size() + "}";
    }

    public /* synthetic */ void initChannel(Channel channel) {
        this.a((SocketChannel)channel);
    }
}

