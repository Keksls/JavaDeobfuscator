/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelPipeline
 *  io.netty.channel.socket.SocketChannel
 */
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import java.util.List;

/*
 * Renamed from cCX
 */
class ccx_0
extends ChannelInitializer<SocketChannel> {
    final /* synthetic */ ccw_0 a;

    ccx_0(ccw_0 ccw_02) {
        this.a = ccw_02;
    }

    public void a(SocketChannel socketChannel) {
        ChannelPipeline channelPipeline = socketChannel.pipeline();
        for (ChannelHandler channelHandler : (List)this.a.f.get()) {
            channelPipeline.addLast(new ChannelHandler[]{channelHandler});
        }
        channelPipeline.addLast(new ChannelHandler[]{this.a.f()});
    }

    public /* synthetic */ void initChannel(Channel channel) {
        this.a((SocketChannel)channel);
    }
}

