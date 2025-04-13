/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.protobuf.MessageLite
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelPipeline
 *  io.netty.channel.socket.SocketChannel
 *  io.netty.handler.codec.protobuf.ProtobufDecoder
 *  io.netty.handler.codec.protobuf.ProtobufEncoder
 *  io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder
 *  io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender
 */
import com.google.inject.Inject;
import com.google.protobuf.MessageLite;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;
import java.util.Set;

/*
 * Renamed from aFS
 */
public class afs_1
extends ChannelInitializer<SocketChannel> {
    private final nl_1 a;

    @Inject
    public afs_1(nl_1 nl_12) {
        this.a = nl_12;
    }

    public void a(SocketChannel socketChannel) {
        ChannelPipeline channelPipeline = socketChannel.pipeline();
        channelPipeline.addLast(new ChannelHandler[]{new ProtobufVarint32FrameDecoder()});
        channelPipeline.addLast(new ChannelHandler[]{new ProtobufDecoder((MessageLite)nf_1.i())});
        channelPipeline.addLast(new ChannelHandler[]{new nj_1(this.a.a())});
        channelPipeline.addLast(new ChannelHandler[]{new ProtobufVarint32LengthFieldPrepender()});
        channelPipeline.addLast(new ChannelHandler[]{new ProtobufEncoder()});
        channelPipeline.addLast(new ChannelHandler[]{new nk_1(this.a.a())});
        Set<ChannelHandler> set = this.a.b();
        for (ChannelHandler channelHandler : set) {
            channelPipeline.addLast(new ChannelHandler[]{channelHandler});
        }
    }

    public String toString() {
        return "ProtobufInitializer{m_provider=" + this.a + "}";
    }

    public /* synthetic */ void initChannel(Channel channel) {
        this.a((SocketChannel)channel);
    }
}

