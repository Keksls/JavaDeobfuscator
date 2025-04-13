/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandler$Sharable
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from aGk
 */
@ChannelHandler.Sharable
public class agk_2
extends MessageToByteEncoder<adt_1> {
    private static final Logger a = LoggerFactory.getLogger(agk_2.class);

    protected void a(ChannelHandlerContext channelHandlerContext, adt_1 adt_12, ByteBuf byteBuf) {
        if (!(adt_12 instanceof adp_2)) {
            a.error("Wrong message are provided to current {}, expected ? extends {} implement {} but receive {} without implementation of {}. WTF !", new Object[]{((Object)((Object)this)).getClass(), adt_1.class, adp_2.class, adt_12.getClass(), adp_2.class});
            return;
        }
        byte[] byArray = ((adp_2)((Object)adt_12)).b();
        ij_2.d(adt_12.a()).update(byArray.length);
        byteBuf.writeBytes(byArray);
    }

    protected /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) {
        this.a(channelHandlerContext, (adt_1)object, byteBuf);
    }
}

