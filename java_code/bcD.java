/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 *  org.jetbrains.annotations.NotNull
 */
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.jetbrains.annotations.NotNull;

public class bcD
extends SimpleChannelInboundHandler<m_0> {
    protected void a(ChannelHandlerContext channelHandlerContext, m_0 m_02) {
        aUm aUm2 = new aUm(m_02.c().j().b(), m_02.c().g());
        aUm2.a(aup_0.m);
        long l = azu_0.j().n().u();
        boolean bl = m_02.c().j().b() == l;
        String string = bcD.a(m_02.c(), bl);
        aUm2.a(string);
        aul_0.a().a(aUm2, string, bl);
    }

    @NotNull
    private static String a(j j2, boolean bl) {
        if (bl) {
            return aUS.a.a(j2.d()).orElse("<UNDEFINED>");
        }
        return aUS.a(j2.j().c(), j2.j().e());
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) {
        this.a(channelHandlerContext, (m_0)object);
    }
}

