/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 */
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class bcJ
extends SimpleChannelInboundHandler<ct_2> {
    protected void a(ChannelHandlerContext channelHandlerContext, ct_2 ct_22) {
        if (ct_22.b() == azu_0.j().n().u()) {
            return;
        }
        aUS.a.a(ct_22.b(), bcJ.a(ct_22));
    }

    private static aut_0 a(ct_2 ct_22) {
        switch (ct_22.d()) {
            case a: {
                return aut_0.a;
            }
            case b: 
            case c: {
                return aut_0.b;
            }
        }
        return aut_0.b;
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) {
        this.a(channelHandlerContext, (ct_2)object);
    }
}

