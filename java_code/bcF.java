/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 */
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import java.util.Optional;

public class bcF
extends SimpleChannelInboundHandler<co_1> {
    protected void a(ChannelHandlerContext channelHandlerContext, co_1 co_12) {
        if (co_12.b() == azu_0.j().n().u()) {
            return;
        }
        if (co_12.e() <= 0) {
            return;
        }
        bg_2 bg_22 = co_12.a(0);
        int n = bg_22.b();
        Optional<aur_0> optional = aur_0.a(n);
        optional.ifPresent(aur_02 -> aUS.a.a(co_12.b(), (aur_0)((Object)aur_02)));
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) {
        this.a(channelHandlerContext, (co_1)object);
    }
}

