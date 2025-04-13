/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 *  org.apache.log4j.Logger
 */
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.apache.log4j.Logger;

public class bcE
extends SimpleChannelInboundHandler<bw_2> {
    private static final Logger a = Logger.getLogger(bcE.class);

    protected void a(ChannelHandlerContext channelHandlerContext, bw_2 bw_22) {
        if (bw_22.d() < 1) {
            return;
        }
        bw_22.b().forEach(bl_12 -> aUS.a.a(bl_12.c().b(), bl_12.c().c(), bl_12.c().e(), bl_12.h()));
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) {
        this.a(channelHandlerContext, (bw_2)object);
    }
}

