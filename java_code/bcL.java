/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 */
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class bcL
extends SimpleChannelInboundHandler<cz_1> {
    protected void a(ChannelHandlerContext channelHandlerContext, cz_1 cz_12) {
        if (cz_12.b() == azu_0.j().n().u()) {
            return;
        }
        aUS.a.a(cz_12.b(), bcL.a(cz_12.d()));
    }

    private static auu_0 a(cx_1 cx_12) {
        switch (cx_12) {
            case b: {
                return auu_0.b;
            }
            case c: {
                return auu_0.c;
            }
            case d: 
            case a: {
                return auu_0.a;
            }
        }
        return auu_0.a;
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) {
        this.a(channelHandlerContext, (cz_1)object);
    }
}

