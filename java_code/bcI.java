/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 */
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class bcI
extends SimpleChannelInboundHandler<ci_1> {
    protected void a(ChannelHandlerContext channelHandlerContext, ci_1 ci_12) {
        long l = azu_0.j().n().u();
        if (l != ci_12.b()) {
            return;
        }
        bl_1 bl_12 = ci_12.d();
        aUS.a.a(bl_12.c().b(), bl_12.c().c(), bl_12.c().e(), bl_12.h());
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) {
        this.a(channelHandlerContext, (ci_1)object);
    }
}

