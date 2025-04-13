/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 */
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class bcH
extends SimpleChannelInboundHandler<cw_2> {
    protected void a(ChannelHandlerContext channelHandlerContext, cw_2 cw_22) {
        long l = azu_0.j().n().u();
        if (l != cw_22.b()) {
            return;
        }
        aUS.a.a(cw_22.c());
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) {
        this.a(channelHandlerContext, (cw_2)object);
    }
}

