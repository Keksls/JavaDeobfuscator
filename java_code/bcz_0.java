/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.protobuf.MessageLite
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.handler.codec.protobuf.ProtobufDecoder
 *  org.apache.log4j.Logger
 */
import com.google.gson.Gson;
import com.google.protobuf.MessageLite;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import java.nio.charset.StandardCharsets;
import org.apache.log4j.Logger;

/*
 * Renamed from bcz
 */
public class bcz_0
extends SimpleChannelInboundHandler<ByteBuf> {
    private static final Logger a = Logger.getLogger(bcz_0.class);
    private final bcq_0 b;

    public bcz_0(bcq_0 bcq_02) {
        this.b = bcq_02;
    }

    protected void a(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) {
        String string = byteBuf.toString(StandardCharsets.UTF_8);
        bcO bcO2 = (bcO)new Gson().fromJson(string, bcO.class);
        if (bcO2.a()) {
            channelHandlerContext.pipeline().addAfter("SpinDecoder", "ProtobufDecoder", (ChannelHandler)new ProtobufDecoder((MessageLite)ar_2.o()));
            channelHandlerContext.pipeline().addAfter("ProtobufDecoder", "InterChatMessageDecoder", (ChannelHandler)new bcu_0());
            channelHandlerContext.pipeline().remove("InterChatAvailabilityHandler");
            channelHandlerContext.pipeline().remove((ChannelHandler)this);
            this.b.a(channelHandlerContext);
            this.b.c();
            long l = azu_0.j().n().u();
            bp_2 bp_22 = bn_1.d();
            bp_22.a(l);
            this.b.a((MessageLite)bp_22.e());
            bt_1 bt_12 = br_2.g();
            bt_12.a(l);
            bi_2 bi_22 = bg_2.i();
            bi_22.c(enp_2.a.b(ens_2.B));
            bt_12.a(bi_22);
            this.b.a((MessageLite)bt_12.h());
        } else {
            a.error((Object)("[CHAT] Authentication failed error code=" + bcO2.b()));
        }
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) {
        this.a(channelHandlerContext, (ByteBuf)object);
    }
}

