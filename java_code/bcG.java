/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 */
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class bcG
extends SimpleChannelInboundHandler<cs_1> {
    protected void a(ChannelHandlerContext channelHandlerContext, cs_1 cs_12) {
        long l = azu_0.j().n().u();
        if (l != cs_12.b()) {
            return;
        }
        bl_1 bl_12 = cs_12.d();
        aUS.a.a(bl_12.c().b(), bl_12.c().c(), bl_12.c().e(), bl_12.h());
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) {
        this.a(channelHandlerContext, (cs_1)object);
    }
}

